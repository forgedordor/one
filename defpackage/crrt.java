package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class crrt implements efaq {
    public kog a;
    public efaj b;

    @Override // defpackage.efaq
    public final void d(String str, efap efapVar) {
        eieu eieuVarK = eiiy.k("ConnectedRcsServiceFactory#handleServiceConnectFailed");
        try {
            this.a.c(new crsk(str, efapVar));
            eieuVarK.close();
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.efaq
    public final void e(String str) {
        eksp ekspVar = crru.b;
        ((eksl) ekspVar.n().h("com/google/android/apps/messaging/shared/util/rcs/ConnectedRcsServiceFactory$ServiceListener", "handleServiceConnected", 63, "ConnectedRcsServiceFactory.java")).t("handleServiceConnected() start for serviceClassName %s", str);
        eieu eieuVarK = eiiy.k("ConnectedRcsServiceFactory#handleServiceConnected");
        try {
            efaj efajVar = this.b;
            if (efajVar != null) {
                this.a.b(efajVar);
                ((eksl) ekspVar.n().h("com/google/android/apps/messaging/shared/util/rcs/ConnectedRcsServiceFactory$ServiceListener", "handleServiceConnected", 69, "ConnectedRcsServiceFactory.java")).t("handleServiceConnected() completer.set rcsService %s", this.b);
            } else {
                ((eksl) ekspVar.n().h("com/google/android/apps/messaging/shared/util/rcs/ConnectedRcsServiceFactory$ServiceListener", "handleServiceConnected", 71, "ConnectedRcsServiceFactory.java")).t("handleServiceConnected() rcsService is Null for serviceClassName %s", str);
            }
            eieuVarK.close();
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.efaq
    public final void f(String str) {
        eieu eieuVarK = eiiy.k("ConnectedRcsServiceFactory#handleServiceDisconnected");
        try {
            this.b = null;
            eieuVarK.close();
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
