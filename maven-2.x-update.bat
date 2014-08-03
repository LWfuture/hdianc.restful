set JAVA_HOME=X:\MiddleWares\JVM\Sun\jdk1.6.x
rem set JAVA_HOME=X:\MiddleWares\JVM\IBM\ibm_jdk60

set JVM=%JAVA_HOME%\bin\javaw.exe
set M2_HOME=X:\Development_Tools\Building-Utils\apache-maven-2.1.x
set M2_REPO=D:\Shared_Sources\repositories\maven2
set SVN_HOME=X:\CASE_Tools\SCM\svn-win32-1.4.5

set Path=%JAVA_HOME%\bin;%M2_HOME%\bin;%SVN_HOME%\bin;%Path%

cd.
call mvn dependency:resolve
pause