package defpackage;

import android.net.ConnectivityManager;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ynf extends fcyz implements fdat {
    final /* synthetic */ ynh a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ynf(ynh ynhVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = ynhVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ynf) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        ynh ynhVar = this.a;
        ConnectivityManager connectivityManager = ynhVar.b;
        boolean z = false;
        if (connectivityManager.isDefaultNetworkActive() && connectivityManager.getActiveNetwork() != null) {
            z = true;
        }
        ynhVar.d.set(z);
        connectivityManager.registerDefaultNetworkCallback(ynhVar.e, ynhVar.c);
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new ynf(this.a, fcxyVar);
    }
}
