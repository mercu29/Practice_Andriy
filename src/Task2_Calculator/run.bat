@echo off
title Java Room Application Runner
echo Compiling RoomApplication.java...
javac RoomApplication.java

if %errorlevel% neq 0 (
    echo.
    echo [ERROR] Compilation failed! Check your code.
    pause
    exit /b
)

echo Running Application...
echo.
java RoomApplication

echo.
echo Application finished.
pause