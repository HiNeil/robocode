/**
 * Copyright (c) 2001-2019 Mathew A. Nelson and Robocode contributors
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * https://robocode.sourceforge.io/license/epl-v10.html
 */
// ------------------------------------------------------------------------------
//  <autogenerated>
//      This code was generated by jni4net. See http://jni4net.sourceforge.net/ 
// 
//      Changes to this file may cause incorrect behavior and will be lost if 
//      the code is regenerated.
//  </autogenerated>
// ------------------------------------------------------------------------------

package net.sf.robocode.repository;

@net.sf.jni4net.attributes.ClrTypeInfo
public final class IRobotSpecItem_ {
    
    //<generated-static>
    private static system.Type staticType;
    
    public static system.Type typeof() {
        return net.sf.robocode.repository.IRobotSpecItem_.staticType;
    }
    
    private static void InitJNI(net.sf.jni4net.inj.INJEnv env, system.Type staticType) {
        net.sf.robocode.repository.IRobotSpecItem_.staticType = staticType;
    }
    //</generated-static>
}

//<generated-proxy>
@net.sf.jni4net.attributes.ClrProxy
class __IRobotSpecItem extends system.Object implements net.sf.robocode.repository.IRobotSpecItem {
    
    protected __IRobotSpecItem(net.sf.jni4net.inj.INJEnv __env, long __handle) {
            super(__env, __handle);
    }
    
    @net.sf.jni4net.attributes.ClrMethod("(Ljava/lang/Object;)I")
    public native int compareTo(java.lang.Object par0);
    
    @net.sf.jni4net.attributes.ClrMethod("()Z")
    public native boolean isValid();
    
    @net.sf.jni4net.attributes.ClrMethod("()Ljava/lang/String;")
    public native java.lang.String getVersion();
    
    @net.sf.jni4net.attributes.ClrMethod("()Z")
    public native boolean isTeam();
    
    @net.sf.jni4net.attributes.ClrMethod("()Z")
    public native boolean isInJAR();
    
    @net.sf.jni4net.attributes.ClrMethod("(Z)V")
    public native void setValid(boolean par0);
    
    @net.sf.jni4net.attributes.ClrMethod("()Ljava/lang/String;")
    public native java.lang.String getDescription();
    
    @net.sf.jni4net.attributes.ClrMethod("()Ljava/lang/String;")
    public native java.lang.String getAuthorName();
    
    @net.sf.jni4net.attributes.ClrMethod("()Ljava/net/URL;")
    public native java.net.URL getWebpage();
    
    @net.sf.jni4net.attributes.ClrMethod("()Z")
    public native boolean getIncludeSource();
    
    @net.sf.jni4net.attributes.ClrMethod("()Z")
    public native boolean getIncludeData();
    
    @net.sf.jni4net.attributes.ClrMethod("()Z")
    public native boolean isSourceIncluded();
    
    @net.sf.jni4net.attributes.ClrMethod("()Ljava/lang/String;")
    public native java.lang.String getRootPath();
    
    @net.sf.jni4net.attributes.ClrMethod("()Ljava/net/URL;")
    public native java.net.URL getItemURL();
    
    @net.sf.jni4net.attributes.ClrMethod("()Z")
    public native boolean isDevelopmentVersion();
    
    @net.sf.jni4net.attributes.ClrMethod("()Ljava/lang/String;")
    public native java.lang.String getRobocodeVersion();
    
    @net.sf.jni4net.attributes.ClrMethod("()Ljava/lang/String;")
    public native java.lang.String getFullPackage();
    
    @net.sf.jni4net.attributes.ClrMethod("()Ljava/lang/String;")
    public native java.lang.String getRelativePath();
    
    @net.sf.jni4net.attributes.ClrMethod("()Ljava/lang/String;")
    public native java.lang.String getRootPackage();
    
    @net.sf.jni4net.attributes.ClrMethod("()Ljava/lang/String;")
    public native java.lang.String getFullClassNameWithVersion();
    
    @net.sf.jni4net.attributes.ClrMethod("()Ljava/lang/String;")
    public native java.lang.String getUniqueFullClassName();
    
    @net.sf.jni4net.attributes.ClrMethod("()Ljava/lang/String;")
    public native java.lang.String getUniqueFullClassNameWithVersion();
    
    @net.sf.jni4net.attributes.ClrMethod("()Ljava/lang/String;")
    public native java.lang.String getUniqueShortClassNameWithVersion();
    
    @net.sf.jni4net.attributes.ClrMethod("()Ljava/lang/String;")
    public native java.lang.String getUniqueVeryShortClassNameWithVersion();
    
    @net.sf.jni4net.attributes.ClrMethod("()Ljava/lang/String;")
    public native java.lang.String getFullClassName();
    
    @net.sf.jni4net.attributes.ClrMethod("()Ljava/lang/String;")
    public native java.lang.String getShortClassName();
    
    @net.sf.jni4net.attributes.ClrMethod("()Ljava/lang/Object;")
    public native robocode.control.RobotSpecification createRobotSpecification();
    
    @net.sf.jni4net.attributes.ClrMethod("(Ljava/io/OutputStream;Ljava/lang/Object;)V")
    public native void storeProperties(java.io.OutputStream par0, net.sf.robocode.repository.RobotProperties par1);
}
//</generated-proxy>
