package defpackage;

import java.lang.reflect.Method;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class drxr implements drly {
    public static final ekrg a = ekrg.c("com/google/android/libraries/inputmethod/systemproperty/SystemProperties");
    public static final drxr b = new drxr();
    public final csq c = new csq();
    public final Method d;

    private drxr() throws NoSuchMethodException, SecurityException {
        Method method;
        try {
            method = Class.forName("android.os.SystemProperties").getMethod("get", String.class);
        } catch (Exception e) {
            ((ekrd) ((ekrd) ((ekrd) a.j()).g(e)).h("com/google/android/libraries/inputmethod/systemproperty/SystemProperties", "<init>", '9', "SystemProperties.java")).q("Cannot find android.os.SystemProperties#get(String)");
            method = null;
        }
        this.d = method;
        drlx.a.a(this);
    }
}
