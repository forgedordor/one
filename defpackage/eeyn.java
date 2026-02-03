package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import com.google.android.play.core.appupdate.protocol.IAppUpdateService;
import java.util.ArrayList;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eeyn {
    public static final eeza a = new eeza("AppUpdateService");
    private static final Intent f = new Intent("com.google.android.play.core.install.BIND_UPDATE_SERVICE").setPackage("com.android.vending");
    eezy b;
    public final String c;
    public final Context d;
    public final eeyp e;

    public eeyn(Context context, eeyp eeypVar) {
        this.c = context.getPackageName();
        this.d = context;
        this.e = eeypVar;
        if (efac.a(context)) {
            this.b = new eezy(efaa.a(context), a, "AppUpdateService", f, new eezu() { // from class: eeyh
                @Override // defpackage.eezu
                public final Object a(IBinder iBinder) {
                    return IAppUpdateService.Stub.asInterface(iBinder);
                }
            });
        }
    }

    public static int a(Bundle bundle) {
        return bundle.getInt("error.code", -2);
    }

    public static Bundle b() {
        Bundle bundle = new Bundle();
        bundle.putInt("playcore.version.code", 20200);
        return bundle;
    }

    public static defn c() {
        a.b("onError(%d)", -9);
        return degc.b(new eeyv(-9));
    }

    public static HashSet d(ArrayList arrayList) {
        HashSet hashSet = new HashSet();
        if (arrayList != null) {
            hashSet.addAll(arrayList);
        }
        return hashSet;
    }
}
