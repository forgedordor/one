package defpackage;

import android.content.Context;
import android.telephony.TelephonyManager;
import j$.util.Objects;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dhkx {
    private static volatile dhkx a;
    private final dhkv b;

    protected dhkx(Context context) {
        this.b = dhkv.g(context);
    }

    public static dhkx a(Context context) {
        if (a == null) {
            synchronized (dhkx.class) {
                if (a == null) {
                    a = new dhkx(context);
                }
            }
        }
        return a;
    }

    public final boolean b(String str, int i) throws dhkf, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        try {
            Method declaredMethod = TelephonyManager.class.getDeclaredMethod("checkCarrierPrivilegesForPackage", String.class);
            declaredMethod.setAccessible(true);
            Object objInvoke = declaredMethod.invoke(this.b.e(i), str);
            if (Objects.isNull(objInvoke)) {
                throw new NoSuchMethodException("Unexpected null returned by checkCarrierPrivilegesForPackage");
            }
            return ((Integer) objInvoke).intValue() == 1;
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            throw new NoSuchMethodException("No checkCarrierPrivilegesForPackage method in TelephonyManager");
        } catch (SecurityException e) {
            throw new dhkf(e);
        }
    }
}
