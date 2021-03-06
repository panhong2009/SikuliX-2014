@echo off
SETLOCAL ENABLEEXTENSIONS
set SJAR=sikulix

if not defined SIKULIX_HOME goto NOHOME
if EXIST "%SIKULIX_HOME%%SJAR%.jar" goto YESHOME
if not EXIST "%SIKULIX_HOME%\%SJAR%.jar" goto BADHOME
set SJAR=\sikulix

:BADHOME
echo +++ SIKULIX_HOME specified but not useable %SIKULIX_HOME%

:NOHOME
set SIKULIX_HOME=%~dp0

:YESHOME
set PARMS=-Xms64M -Xmx512M -Dfile.encoding=UTF-8 -Dsikuli.FromCommandLine

if not defined JAVA_HOME goto CHECKJAVA
IF EXIST "%JAVA_HOME%\bin\java.exe" goto JAVA_OK
echo +++ JAVA_HOME specified but not useable %JAVA_HOME%
echo +++ looking for Java in standard places

:CHECKJAVA
set PROGRAMS=%ProgramFiles%
if defined ProgramFiles(x86) set PROGRAMS32=%ProgramFiles(x86)%

IF not EXIST "%PROGRAMS%\Java\jre7" goto JAVA6
set JAVA_HOME=%PROGRAMS%\Java\jre7
goto JAVA_OK

:JAVA6
IF not EXIST "%PROGRAMS%\Java\jre6" goto JAVANO
set JAVA_HOME=%PROGRAMS%\Java\jre6
goto JAVA_OK

:JAVANO
if not defined PROGRAMS32 goto JAVANO32

IF not EXIST "%PROGRAMS32%\Java\jre7" goto JAVA632
set JAVA_HOME=%PROGRAMS32%\Java\jre7
goto JAVA_OK

:JAVA632
IF not EXIST "%PROGRAMS32%\Java\jre6" goto JAVANO32
set JAVA_HOME=%PROGRAMS32%\Java\jre6
goto JAVA_OK

:JAVANO32
echo +++ Java not found in standard places %PROGRAMS% or %PROGRAMS32%
echo +++ JAVA_HOME not specified
goto STOPIT

:JAVA_OK
echo +++ running this Java
set SIKULI_COMMAND=%*
"%JAVA_HOME%\bin\java.exe" -version
PATH=%SIKULIX_HOME%libs;%PATH%
echo +++ trying to run SikuliX
echo +++ using: %PARMS% -jar %SIKULIX_HOME%%SJAR%.jar %SIKULI_COMMAND%
"%JAVA_HOME%\bin\java.exe" %PARMS% -jar "%SIKULIX_HOME%%SJAR%.jar" %SIKULI_COMMAND%
GOTO FINALLY

:STOPIT
echo.+++ ended with some errors
:FINALLY
ENDLOCAL