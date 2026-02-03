package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cnbn extends cnab {
    static final ejvr a = new cnbl();
    static final ejvr b = new cnbm();

    @Override // defpackage.cnab
    public final void b(eqcs eqcsVar, aubg aubgVar) {
        eqcs eqcsVar2 = eqcs.a;
        if (eqcq.a(eqcsVar)) {
            aubk aubkVar = aubk.FAILED_TRANSIENTLY;
            aubgVar.copyOnWrite();
            aubl aublVar = (aubl) aubgVar.instance;
            aubl aublVar2 = aubl.a;
            aublVar.c = aubkVar.f;
            aublVar.b |= 1;
            return;
        }
        aubk aubkVar2 = aubk.FAILED_PERMANENTLY;
        aubgVar.copyOnWrite();
        aubl aublVar3 = (aubl) aubgVar.instance;
        aubl aublVar4 = aubl.a;
        aublVar3.c = aubkVar2.f;
        aublVar3.b |= 1;
    }
}
