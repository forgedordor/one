package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.droidguard.internal.DroidGuardInitReply;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dcqj {
    public static dcqw a(Context context, dcrf dcrfVar, DroidGuardInitReply droidGuardInitReply) throws IOException {
        dcqv dcqvVarC = dcqv.c(context, dcrfVar, fbaq.a.get().a());
        Parcelable parcelable = droidGuardInitReply.b;
        ParcelFileDescriptor parcelFileDescriptor = droidGuardInitReply.a;
        if (parcelable == null || parcelFileDescriptor == null) {
            if (parcelFileDescriptor == null) {
                return null;
            }
            parcelFileDescriptor.close();
            return null;
        }
        try {
            String string = ((Bundle) parcelable).getString("h");
            if (string == null) {
                throw new dcqt("Missing key");
            }
            dcql dcqlVar = new dcql(string);
            ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStream = new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor);
            try {
                dcqw dcqwVarA = dcqvVarC.a(dcqlVar, parcelable, autoCloseInputStream);
                dcrfVar.c(10, dcre.FINE);
                try {
                    Object obj = dcqwVarA.a;
                    Object objInvoke = obj.getClass().getDeclaredMethod("init", null).invoke(obj, null);
                    ejyb.e(objInvoke);
                    ((Boolean) objInvoke).booleanValue();
                    dcrfVar.c(11, dcre.FINE);
                    try {
                        Object obj2 = dcqwVarA.a;
                        obj2.getClass().getDeclaredMethod("close", null).invoke(obj2, null);
                        dcrfVar.c(12, dcre.FINE);
                        autoCloseInputStream.close();
                        parcelFileDescriptor.close();
                        return dcqwVarA;
                    } catch (Exception e) {
                        throw new dcqt(e);
                    }
                } catch (Exception e2) {
                    throw new dcqt(e2);
                }
            } finally {
            }
        } catch (Throwable th) {
            try {
                parcelFileDescriptor.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
