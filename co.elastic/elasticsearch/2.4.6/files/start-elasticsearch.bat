@echo off
call ./set-env.cmd

start %SOFTWARE_DIR%\elasticsearch-2.4.6\bin\elasticsearch.bat
