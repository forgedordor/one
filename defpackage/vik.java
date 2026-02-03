package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class vik implements fdae {
    final /* synthetic */ vio a;
    final /* synthetic */ zqw b;

    public vik(vio vioVar, zqw zqwVar) {
        this.a = vioVar;
        this.b = zqwVar;
    }

    @Override // defpackage.fdae
    public final /* bridge */ /* synthetic */ Object invoke() {
        ajlt ajltVar = (ajlt) fcva.X(this.b.a);
        vio vioVar = this.a;
        if (vioVar.c.b(vioVar.a)) {
            vioVar.b.F(ajltVar.b());
            xtq xtqVar = vioVar.e;
            if (ajltVar.a() == ajls.b && ((cqey) xtqVar.c.a()).f() == cqgk.UNAVAILABLE) {
                auvw.k(xtqVar.d, null, null, new xtp(xtqVar, null), 3);
                ((ains) xtqVar.e.b()).c("Bugle.UI.Conversations.DataWarning.Downloading.Shown");
            }
        } else {
            vioVar.d.a();
        }
        return fctx.a;
    }
}
