call X:\MiddleWares\JVM\Sun\jdk1.6.x-set-vars.bat

set M2_HOME=X:\Development_Tools\Building-Utils\apache-maven-2.2.x
set M2_REPO=D:\Shared_Sources\repositories\maven2
set SVN_HOME=X:\CASE_Tools\SCM\svn-win32-1.5.x

set Path=%M2_HOME%\bin;%SVN_HOME%\bin;%Path%

cd.
call mvn eclipse:m2eclipse
pause