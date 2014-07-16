#!/usr/local/bin/python

import sys, os, string, re, getopt, time

#############################################
#extend account
#############################################

def findexp(login):
        exp_files = os.popen4("shuser -l "+login+" | grep 'expiry-date:'")
        exp_output = exp_files[1].readlines()
        exp_str = exp_output[0]
        datere = re.compile('[0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]')
        datem = datere.search(exp_str)
        if datem:
                datef = datem.group()
                datelist = string.split(datef, '-')
                int_date = []
                for strnum in datelist:
                        int_date.append(int(strnum))
                return int_date
        else:
                return 0

def checkexp(login):
        com_files = os.popen4("shuser -l "+login+" | grep 'extend'")
        com_output = com_files[1].readlines()
        if com_output != []:
                return com_output[0]
        else:
                return 0

def changeexp(login):
       month_num = time.strftime("%m", time.localtime())
       year_num = time.strftime("%Y", time.localtime())
       year_num_int = int(year_num)
       month_name = 'April'
       expiry_date = ''+year_num+'-04-30'
       if month_num > '02' and month_num < '08':
              expiry_date = ''+year_num+'-09-30'
              month_name = 'September'
       if month_num > '07':
              year_num_int += 1
              year_num = str(year_num_int)
              expiry_date = ''+year_num+'-04-30'
       change_output = os.popen4('chuser -l '+login+' -e '+expiry_date+'')
       if change_output[1].readlines() != []:
               raise ChangeFail
       else:




               os.system('comment -l '+login+' -add "Expiry date extended to '+month_name+' 30 '+year_num+'"')

def get_inst(r_input):
        if r_input in ["y","n"]:
                return r_input
        else:
                print 'y or n'
                get_inst(rawinput('->'))

#############################################
#Main(), uses getopt to parse command line
#arguments and then act on them
#############################################
def main():
        login = ""
        ChangeFail = ""
        try:
                opts, args = getopt.getopt(sys.argv[1:], "l")
                if (len(args) == 0):
                        print 'Usage: extend -l username'
                for opt, arg in opts:
                        if (opt == "-l"):
                                if (len(args) == 0):
                                        print 'No login supplied'
                                        print 'Usage: extend -l username'
                                        break
                                if (len(opts) == 1):
                                        login = args[0]
                                        exp_exist = checkexp(login) 
                                        if (exp_exist != 0):
                                                print 'This account has the comment\n'+exp_exist+'Do you wish to continue? (y/n)'
                                                instr = get_inst(raw_input('-> '))
                                                if instr == 'n':
                                                        print 'Terminated'
                                                        sys.exit()
                                        try:
                                                changeexp(login)
                                                print 'Change successful.'
                                                print 'New date is'
                                                for dmy in findexp(login):
                                                        print dmy
                                        except ChangeFail:
                                                print 'Change failed.'
                                                print 'Terminated'
                                                sys.exit()  
        except getopt.GetoptError:
                print '\nIncorrect argument used\n'
                sys.exit()


#############################################
#Execute the script
#############################################
main()
