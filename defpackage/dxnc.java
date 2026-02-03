package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Looper;
import com.google.firebase.iid.FirebaseInstanceId;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dxnc implements dxmz {
    private static final eksp a = eksp.c("GnpSdk");
    private final Context b;
    private final dxgy c;
    private final dxlo d;

    public dxnc(Context context, dxgy dxgyVar, dxlo dxloVar) {
        context.getClass();
        dxloVar.getClass();
        this.b = context;
        this.c = dxgyVar;
        this.d = dxloVar;
    }

    private final SharedPreferences d() {
        SharedPreferences sharedPreferences = this.b.getSharedPreferences("com.google.android.libraries.notifications.GCM", 0);
        sharedPreferences.getClass();
        return sharedPreferences;
    }

    private final FirebaseInstanceId e() {
        Context context = this.b;
        dxlo dxloVar = this.d;
        FirebaseInstanceId firebaseInstanceIdB = dxloVar.b(dxlp.a(context, dxloVar, this.c));
        firebaseInstanceIdB.getClass();
        return firebaseInstanceIdB;
    }

    private final synchronized void f(String str) {
        d().edit().putString("reg_id", str).apply();
    }

    @Override // defpackage.dxmz
    public final synchronized dxft a() {
        ecem.b();
        String str = ((dxgw) this.c).b;
        if (str == null) {
            throw new IllegalArgumentException("Project ID must not be null when trying to reset registration token");
        }
        try {
            FirebaseInstanceId firebaseInstanceIdE = e();
            FirebaseInstanceId.k(firebaseInstanceIdE.d);
            if (Looper.getMainLooper() == Looper.myLooper()) {
                throw new IOException("MAIN_THREAD");
            }
            String strJ = FirebaseInstanceId.j("");
            String strF = firebaseInstanceIdE.f();
            esgf esgfVar = firebaseInstanceIdE.f;
            Bundle bundle = new Bundle();
            bundle.putString("delete", "1");
            firebaseInstanceIdE.e(esgf.b(esgfVar.a(strF, str, strJ, bundle)));
            FirebaseInstanceId.a.c(firebaseInstanceIdE.g(), str, strJ);
            f(null);
            try {
                c();
            } catch (dxna e) {
                ((eksl) ((eksl) a.j()).g(e)).q("Exception thrown when trying to get token after deletion.");
                return new dxnb(e, 45, true);
            }
        } catch (Throwable th) {
            ((eksl) ((eksl) a.j()).g(th)).q("Exception thrown when trying to delete token.");
            return new dxnb(th, 44, false);
        }
        return new dxfx(fctx.a);
    }

    @Override // defpackage.dxmz
    public final synchronized String b() {
        return d().getString("reg_id", null);
    }

    @Override // defpackage.dxmz
    public final synchronized String c() {
        String strI;
        ecem.b();
        String str = ((dxgw) this.c).b;
        if (str == null) {
            throw new IllegalArgumentException("Project ID must not be null when trying to get registration token");
        }
        try {
            strI = e().i(str, "");
            if (strI == null || strI.length() == 0) {
                throw new dxna();
            }
            if (!fdbq.f(strI, b())) {
                a.o().q("New registration ID doesn't match the previously stored one.");
                f(strI);
            }
        } catch (Throwable th) {
            if (!(th instanceof IOException) && !(th instanceof AssertionError) && !(th instanceof NullPointerException)) {
                throw th;
            }
            ((eksl) ((eksl) a.j()).g(th)).q("Exception during register with IID.");
            throw new dxna(th);
        }
        return strI;
    }
}
