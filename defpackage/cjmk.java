package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cjmk implements cjms {
    private final asrc a;
    private final cjdp b;
    private final cjdq c;
    private final cjis d;

    public cjmk(asrc asrcVar, cjdp cjdpVar, cjdq cjdqVar, cjis cjisVar) {
        this.b = cjdpVar;
        this.c = cjdqVar;
        this.d = cjisVar;
        this.a = asrcVar;
    }

    @Override // defpackage.cjms
    public final /* bridge */ /* synthetic */ aubl a(Object obj) {
        cjjb cjjbVar = ((cjgt) obj).d;
        if (cjjbVar == null) {
            cjjbVar = cjjb.a;
        }
        return cjdi.a(cjjbVar);
    }

    @Override // defpackage.cjms
    public final /* bridge */ /* synthetic */ eiju b(Object obj) {
        return this.a.b((auch) obj);
    }

    @Override // defpackage.cjms
    public final /* bridge */ /* synthetic */ eiju c(Object obj) {
        cjis cjisVar = this.d;
        return eiju.g(fcrw.a(cjisVar.a.a(cjiv.b(), cjisVar.b), (cjgx) obj));
    }

    @Override // defpackage.cjms
    public final /* bridge */ /* synthetic */ Optional d(Object obj) {
        cjgt cjgtVar = (cjgt) obj;
        cjgr cjgrVar = cjgtVar.e;
        if (cjgrVar == null) {
            cjgrVar = cjgr.a;
        }
        int iA = cjgq.a(cjgrVar.c);
        if (iA == 0 || iA != 3) {
            return Optional.empty();
        }
        cjgr cjgrVar2 = cjgtVar.e;
        if (cjgrVar2 == null) {
            cjgrVar2 = cjgr.a;
        }
        cjjr cjjrVar = cjgrVar2.e;
        if (cjjrVar == null) {
            cjjrVar = cjjr.a;
        }
        return Optional.of(cjjrVar.c);
    }

    @Override // defpackage.cjms
    public final /* bridge */ /* synthetic */ Object e(Object obj) {
        return this.c.apply((cjgt) obj);
    }

    @Override // defpackage.cjms
    public final /* bridge */ /* synthetic */ Object f(Object obj) {
        return this.b.apply((auce) obj);
    }

    @Override // defpackage.cjms
    public final /* bridge */ /* synthetic */ Object g(Object obj) {
        aucg aucgVar = (aucg) auch.a.createBuilder();
        aubg aubgVar = (aubg) aubl.a.createBuilder();
        aubk aubkVar = aubk.PENDING;
        aubgVar.copyOnWrite();
        aubl aublVar = (aubl) aubgVar.instance;
        aublVar.c = aubkVar.f;
        aublVar.b |= 1;
        aucgVar.copyOnWrite();
        auch auchVar = (auch) aucgVar.instance;
        aubl aublVar2 = (aubl) aubgVar.build();
        aublVar2.getClass();
        auchVar.c = aublVar2;
        auchVar.b |= 1;
        evqs evqsVar = ((auce) obj).h;
        aucgVar.copyOnWrite();
        auch auchVar2 = (auch) aucgVar.instance;
        evqsVar.getClass();
        auchVar2.b |= 4;
        auchVar2.e = evqsVar;
        return (auch) aucgVar.build();
    }

    @Override // defpackage.cjms
    public final /* bridge */ /* synthetic */ String h(Object obj) {
        return "RcsConversationId: ".concat(String.valueOf(((auce) obj).c));
    }

    @Override // defpackage.cjms
    public final String i() {
        return "createGroup";
    }

    @Override // defpackage.cjms
    public final /* bridge */ /* synthetic */ Object j(Object obj) {
        aucg aucgVar = (aucg) auch.a.createBuilder();
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
        aucgVar.copyOnWrite();
        auch auchVar = (auch) aucgVar.instance;
        aubl aublVar3 = (aubl) aubgVar.build();
        aublVar3.getClass();
        auchVar.c = aublVar3;
        auchVar.b |= 1;
        evqs evqsVar = ((auce) obj).h;
        aucgVar.copyOnWrite();
        auch auchVar2 = (auch) aucgVar.instance;
        evqsVar.getClass();
        auchVar2.b |= 4;
        auchVar2.e = evqsVar;
        return (auch) aucgVar.build();
    }
}
