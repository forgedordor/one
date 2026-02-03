package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cjmz implements cjms {
    private final asrc a;
    private final cjep b;
    private final cjeq c;
    private final cjis d;

    public cjmz(asrc asrcVar, cjep cjepVar, cjeq cjeqVar, cjis cjisVar) {
        this.a = asrcVar;
        this.b = cjepVar;
        this.c = cjeqVar;
        this.d = cjisVar;
    }

    @Override // defpackage.cjms
    public final /* bridge */ /* synthetic */ aubl a(Object obj) {
        cjjb cjjbVar = ((cjkm) obj).d;
        if (cjjbVar == null) {
            cjjbVar = cjjb.a;
        }
        return cjdi.a(cjjbVar);
    }

    @Override // defpackage.cjms
    public final /* bridge */ /* synthetic */ eiju b(Object obj) {
        return this.a.h((augq) obj);
    }

    @Override // defpackage.cjms
    public final /* bridge */ /* synthetic */ eiju c(Object obj) {
        cjis cjisVar = this.d;
        return eiju.g(fcrw.a(cjisVar.a.a(cjiv.d(), cjisVar.b), (cjkq) obj));
    }

    @Override // defpackage.cjms
    public final /* bridge */ /* synthetic */ Optional d(Object obj) {
        cjgr cjgrVar = ((cjkm) obj).e;
        if (cjgrVar == null) {
            cjgrVar = cjgr.a;
        }
        int iA = cjgq.a(cjgrVar.c);
        if (iA == 0 || iA != 3) {
            return Optional.empty();
        }
        cjjr cjjrVar = cjgrVar.e;
        if (cjjrVar == null) {
            cjjrVar = cjjr.a;
        }
        return Optional.of(cjjrVar.c);
    }

    @Override // defpackage.cjms
    public final /* bridge */ /* synthetic */ Object e(Object obj) {
        return this.c.apply((cjkm) obj);
    }

    @Override // defpackage.cjms
    public final /* bridge */ /* synthetic */ Object f(Object obj) {
        return this.b.apply((augo) obj);
    }

    @Override // defpackage.cjms
    public final /* bridge */ /* synthetic */ Object g(Object obj) {
        augp augpVar = (augp) augq.a.createBuilder();
        evqs evqsVar = ((augo) obj).f;
        augpVar.copyOnWrite();
        augq augqVar = (augq) augpVar.instance;
        evqsVar.getClass();
        augqVar.b |= 2;
        augqVar.d = evqsVar;
        aubg aubgVar = (aubg) aubl.a.createBuilder();
        aubk aubkVar = aubk.PENDING;
        aubgVar.copyOnWrite();
        aubl aublVar = (aubl) aubgVar.instance;
        aublVar.c = aubkVar.f;
        aublVar.b |= 1;
        augpVar.copyOnWrite();
        augq augqVar2 = (augq) augpVar.instance;
        aubl aublVar2 = (aubl) aubgVar.build();
        aublVar2.getClass();
        augqVar2.c = aublVar2;
        augqVar2.b |= 1;
        return (augq) augpVar.build();
    }

    @Override // defpackage.cjms
    public final /* bridge */ /* synthetic */ String h(Object obj) {
        return "RcsMessageId: ".concat(String.valueOf(((augo) obj).d));
    }

    @Override // defpackage.cjms
    public final String i() {
        return "revokeMessage";
    }

    @Override // defpackage.cjms
    public final /* bridge */ /* synthetic */ Object j(Object obj) {
        augp augpVar = (augp) augq.a.createBuilder();
        evqs evqsVar = ((augo) obj).f;
        augpVar.copyOnWrite();
        augq augqVar = (augq) augpVar.instance;
        evqsVar.getClass();
        augqVar.b |= 2;
        augqVar.d = evqsVar;
        aubg aubgVar = (aubg) aubl.a.createBuilder();
        aubk aubkVar = aubk.FAILED_PERMANENTLY;
        aubgVar.copyOnWrite();
        aubl aublVar = (aubl) aubgVar.instance;
        aublVar.c = aubkVar.f;
        aublVar.b |= 1;
        aubi aubiVar = aubi.TRANSPORT_INTERNAL_ERROR;
        aubgVar.copyOnWrite();
        aubl aublVar2 = (aubl) aubgVar.instance;
        aublVar2.d = aubiVar.v;
        aublVar2.b |= 2;
        augpVar.copyOnWrite();
        augq augqVar2 = (augq) augpVar.instance;
        aubl aublVar3 = (aubl) aubgVar.build();
        aublVar3.getClass();
        augqVar2.c = aublVar3;
        augqVar2.b |= 1;
        return (augq) augpVar.build();
    }
}
