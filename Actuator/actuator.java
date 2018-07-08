

/*
WARNING: THIS FILE IS AUTO-GENERATED. DO NOT MODIFY.

This file was generated from .idl using "rtiddsgen".
The rtiddsgen tool is part of the RTI Connext distribution.
For more information, type 'rtiddsgen -help' at a command shell
or consult the RTI Connext manual.
*/

import com.rti.dds.infrastructure.*;
import com.rti.dds.infrastructure.Copyable;
import java.io.Serializable;
import com.rti.dds.cdr.CdrHelper;

public class actuator   implements Copyable, Serializable{

    public int status= 0;
    public int Uid= 0;
    public int tempInput= 0;
    public int buttonInput= 0;

    public actuator() {

    }
    public actuator (actuator other) {

        this();
        copy_from(other);
    }

    public static Object create() {

        actuator self;
        self = new  actuator();
        self.clear();
        return self;

    }

    public void clear() {

        status= 0;
        Uid= 0;
        tempInput= 0;
        buttonInput= 0;
    }

    public boolean equals(Object o) {

        if (o == null) {
            return false;
        }        

        if(getClass() != o.getClass()) {
            return false;
        }

        actuator otherObj = (actuator)o;

        if(status != otherObj.status) {
            return false;
        }
        if(Uid != otherObj.Uid) {
            return false;
        }
        if(tempInput != otherObj.tempInput) {
            return false;
        }
        if(buttonInput != otherObj.buttonInput) {
            return false;
        }

        return true;
    }

    public int hashCode() {
        int __result = 0;
        __result += (int)status;
        __result += (int)Uid;
        __result += (int)tempInput;
        __result += (int)buttonInput;
        return __result;
    }

    /**
    * This is the implementation of the <code>Copyable</code> interface.
    * This method will perform a deep copy of <code>src</code>
    * This method could be placed into <code>actuatorTypeSupport</code>
    * rather than here by using the <code>-noCopyable</code> option
    * to rtiddsgen.
    * 
    * @param src The Object which contains the data to be copied.
    * @return Returns <code>this</code>.
    * @exception NullPointerException If <code>src</code> is null.
    * @exception ClassCastException If <code>src</code> is not the 
    * same type as <code>this</code>.
    * @see com.rti.dds.infrastructure.Copyable#copy_from(java.lang.Object)
    */
    public Object copy_from(Object src) {

        actuator typedSrc = (actuator) src;
        actuator typedDst = this;

        typedDst.status = typedSrc.status;
        typedDst.Uid = typedSrc.Uid;
        typedDst.tempInput = typedSrc.tempInput;
        typedDst.buttonInput = typedSrc.buttonInput;

        return this;
    }

    public String toString(){
        return toString("", 0);
    }

    public String toString(String desc, int indent) {
        StringBuffer strBuffer = new StringBuffer();        

        if (desc != null) {
            CdrHelper.printIndent(strBuffer, indent);
            strBuffer.append(desc).append(":\n");
        }

        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("status: ").append(status).append("\n");  
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("Uid: ").append(Uid).append("\n");  
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("tempInput: ").append(tempInput).append("\n");  
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("buttonInput: ").append(buttonInput).append("\n");  

        return strBuffer.toString();
    }

}
