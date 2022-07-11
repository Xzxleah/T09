# T09

To execute the code from a CLI (or CMD on windows):
1. Linux or MacOS<br />
(a) export MPJ_HOME=/<path-to-folder>/mpj-v0_44<br />
(b) javac -cp $MPJ_HOME/lib/mpj.jar *.java<br />
(c) $MPJ_HOME/bin/mpjrun.sh -np 4 MPJAndRMIDemo<br />
2. Windows (run CMD "as admin")<br />
(a) SET MPJ_HOME=C:\<path-to-folder>\mpj-v0_44<br />
(b) javac -cp %MPJ_HOME%\lib\mpj.jar *.java<br />
(c) MPJ_HOME\bin\mpjrun.bat -np 2 MPJAndRMIDemo<br />
