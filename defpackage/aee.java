package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Build;
import android.os.ext.SdkExtensions;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aee {
    public static final ResolveInfo a(Context context) {
        return context.getPackageManager().resolveActivity(new Intent("androidx.activity.result.contract.action.PICK_IMAGES"), 1114112);
    }

    public static final String b(aej aejVar) {
        aejVar.getClass();
        if (aejVar instanceof aeg) {
            return "image/*";
        }
        if (aejVar instanceof aei) {
            return "video/*";
        }
        if (aejVar instanceof aeh) {
            throw null;
        }
        if (aejVar instanceof aef) {
            return null;
        }
        throw new fctg();
    }

    public static final boolean c() {
        if (Build.VERSION.SDK_INT >= 33) {
            return true;
        }
        return Build.VERSION.SDK_INT >= 30 && SdkExtensions.getExtensionVersion(30) >= 2;
    }
}
