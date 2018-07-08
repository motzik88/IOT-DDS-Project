@@@ PROJECT CREATED WITH RTI @@@
 find .idl file with compnents creation code to create project using RTI
 in every sub-project there is the most relevant file named like so: "_nameApp.java" that was changed from the subscriber / publisher     
 initiated by rti.
 for example, in Dashboard project the file "_DashboardApp.java" is the file you most want to check out. it was changed from the subscriber initiated by rti, as the subscriber in the dashboard case is the more relevant part.  


Applications Logic Description
Temperature Sensor
• The sensor shall send a temperature reading at 20 Hz.
• For the sake of simplicity, the temperature shall be a random value between 10-60
degrees (integer).

Actuators
• The actuator shall send its current status upon change [Working, Degraded, Stopped].
• Within the status message, the actuator shall also provide its unique ID (integer).
o For the sake of simplicity, the ID of the actuator shall be provided as an input for
the actuator application.
states of actuators: 
working (if rcieved start command || normal temarature indication)
degraded (exreme temperature)
stopped (recieved stop command)


Start/Stop Button
• Sends a Starts/Stops command (default is Start) according to the users input.
• For the sake of simplicity:
o A stop command shall be sent every 20 seconds.
o 5 seconds after the stop command, a start command shall be sent.

Dashboard
• The dashboard shall display the last temperature reading every 1 seconds and only if it
is an extreme temperature (<20 or >40).
• The dashboard shall display the status of each actuator (upon change).

