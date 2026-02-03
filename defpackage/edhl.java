package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class edhl implements lxk {
    private final edmq a;
    private final edmk b;

    public edhl(edmq edmqVar, edmk edmkVar) {
        this.b = edmkVar;
        this.a = edmqVar;
    }

    @Override // defpackage.lxk
    public final lxd a(Class cls) {
        if (!cls.isAssignableFrom(edhk.class)) {
            throw new IllegalArgumentException("Unknown model class ".concat(cls.toString()));
        }
        edmq edmqVar = this.a;
        edgc edgcVar = (edgc) edmqVar.a.b();
        edgcVar.getClass();
        eosc eoscVar = (eosc) edmqVar.b.b();
        eoscVar.getClass();
        etul etulVar = (etul) edmqVar.c.b();
        etulVar.getClass();
        edhj edhjVar = (edhj) edmqVar.d.b();
        edhjVar.getClass();
        edgi edgiVar = (edgi) edmqVar.e.b();
        edgiVar.getClass();
        edmp edmpVar = new edmp(edgcVar, eoscVar, etulVar, edhjVar, edgiVar);
        edmk edmkVar = this.b;
        eosc eoscVar2 = (eosc) edmkVar.a.b();
        eoscVar2.getClass();
        dvdf dvdfVar = (dvdf) edmkVar.b.b();
        dvdfVar.getClass();
        eddo eddoVar = (eddo) edmkVar.c.b();
        eddoVar.getClass();
        edhj edhjVar2 = (edhj) edmkVar.d.b();
        edhjVar2.getClass();
        eddp eddpVar = (eddp) edmkVar.e.b();
        eddpVar.getClass();
        return (lxd) cls.cast(new edhc(edmpVar, new edmj(eoscVar2, dvdfVar, eddoVar, edhjVar2, eddpVar)));
    }

    @Override // defpackage.lxk
    public final /* synthetic */ lxd b(Class cls, lyp lypVar) {
        return lxj.c(this, cls);
    }

    @Override // defpackage.lxk
    public final /* synthetic */ lxd c(fddy fddyVar, lyp lypVar) {
        return lxj.a(this, fddyVar, lypVar);
    }
}
