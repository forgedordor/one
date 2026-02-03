package defpackage;

import android.os.Parcel;
import android.os.Process;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class llq {
    public static final Exception a(String str, Exception exc) {
        int i;
        Object objInvoke;
        try {
            Method method = Class.forName("android.os.SystemProperties").getMethod("get", String.class, String.class);
            method.getClass();
            try {
                Parcel parcelObtain = Parcel.obtain();
                parcelObtain.getClass();
                Process.myUserHandle().writeToParcel(parcelObtain, 0);
                parcelObtain.setDataPosition(0);
                i = parcelObtain.readInt();
            } catch (Throwable unused) {
                Log.d("DirectBootExceptionUtil", "Error when reading current user id. Selected default user id `0`.");
                i = 0;
            }
            objInvoke = method.invoke(null, a.e(i, "sys.user.", ".ce_available"), "false");
            objInvoke.getClass();
        } catch (Throwable th) {
            fcsw.a(exc, th);
        }
        if (!fdbq.f((String) objInvoke, "true")) {
            if (str != null) {
                File file = new File(str, "siblingTestFile.txt");
                if (file.exists()) {
                    file.delete();
                }
                try {
                    try {
                        file.createNewFile();
                    } catch (IOException unused2) {
                        exc = new llr(exc);
                    }
                    return exc;
                } finally {
                    file.delete();
                }
            }
        }
        return exc;
    }
}
