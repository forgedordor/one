package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class yky implements fdae {
    public final /* synthetic */ ylw a;
    public final /* synthetic */ ajlt b;
    public final /* synthetic */ anlb c;

    public /* synthetic */ yky(ylw ylwVar, ajlt ajltVar, anlb anlbVar) {
        this.a = ylwVar;
        this.b = ajltVar;
        this.c = anlbVar;
    }

    @Override // defpackage.fdae
    public final Object invoke() {
        ylw ylwVar = this.a;
        zqm zqmVar = ylwVar.c;
        ajlt ajltVar = this.b;
        boolean z = true;
        if (zqmVar.e()) {
            zqmVar.d(ajltVar, false, null);
        } else {
            anlb anlbVar = this.c;
            if (ykm.i(anlbVar)) {
                ylwVar.h.a(ajltVar, anlbVar);
            } else {
                z = false;
            }
        }
        return Boolean.valueOf(z);
    }
}
