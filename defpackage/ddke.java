package defpackage;

import android.app.BroadcastOptions;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.dynamite.DynamiteModule;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ddke implements ddkf {
    private static final Object a = new Object();
    private static DynamiteModule b = null;
    private static boolean c = false;

    public ddke(Context context) {
    }

    private static void b(Context context, boolean z) {
        synchronized (a) {
            if (c) {
                return;
            }
            Intent intentPutExtra = new Intent("com.google.android.gms.learning.REQUEST_FULL_FEATURE").setPackage("com.google.android.gms").putExtra("requester_package", context.getPackageName()).putExtra("module_loaded_successfully", z);
            if (Build.VERSION.SDK_INT < 34) {
                context.sendBroadcast(intentPutExtra);
            } else {
                context.sendBroadcast(intentPutExtra, null, BroadcastOptions.makeBasic().setShareIdentityEnabled(true).toBundle());
            }
        }
    }

    @Override // defpackage.ddkf
    public final IInterface a(Context context, String str, ddkh ddkhVar) throws ddkg {
        DynamiteModule dynamiteModule;
        try {
            synchronized (a) {
                if (b == null) {
                    try {
                        b = DynamiteModule.d(context, DynamiteModule.a, "com.google.android.gms.brella_dynamite");
                        b(context, true);
                    } catch (dcvv e) {
                        b(context, false);
                        c = true;
                        throw e;
                    }
                }
                dynamiteModule = b;
            }
            IBinder iBinderC = dynamiteModule.c(str);
            IInterface iInterfaceA = iBinderC == null ? null : ddkhVar.a(iBinderC);
            if (iInterfaceA != null) {
                return iInterfaceA;
            }
            throw new ddkg("null impl for ".concat(str));
        } catch (dcvv e2) {
            throw new ddkg("Couldn't load impl " + str + ": " + e2.getMessage(), e2);
        }
    }
}
