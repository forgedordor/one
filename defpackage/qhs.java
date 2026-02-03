package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.util.Log;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qhs extends qhp {
    public final ConnectivityManager e;
    private final qhr f;

    public qhs(Context context, qmg qmgVar) {
        super(context, qmgVar);
        Object systemService = this.a.getSystemService("connectivity");
        systemService.getClass();
        this.e = (ConnectivityManager) systemService;
        this.f = new qhr(this);
    }

    @Override // defpackage.qhp
    public final /* bridge */ /* synthetic */ Object b() {
        return qht.a(this.e);
    }

    @Override // defpackage.qhp
    public final void d() {
        try {
            qas.c().a(qht.a, "Registering network callback");
            ConnectivityManager connectivityManager = this.e;
            qhr qhrVar = this.f;
            qhrVar.getClass();
            connectivityManager.registerDefaultNetworkCallback(qhrVar);
        } catch (IllegalArgumentException e) {
            qas.c();
            Log.e(qht.a, "Received exception while registering network callback", e);
        } catch (SecurityException e2) {
            qas.c();
            Log.e(qht.a, "Received exception while registering network callback", e2);
        }
    }

    @Override // defpackage.qhp
    public final void e() {
        try {
            qas.c().a(qht.a, "Unregistering network callback");
            ConnectivityManager connectivityManager = this.e;
            qhr qhrVar = this.f;
            qhrVar.getClass();
            connectivityManager.unregisterNetworkCallback(qhrVar);
        } catch (IllegalArgumentException e) {
            qas.c();
            Log.e(qht.a, "Received exception while unregistering network callback", e);
        } catch (SecurityException e2) {
            qas.c();
            Log.e(qht.a, "Received exception while unregistering network callback", e2);
        }
    }
}
