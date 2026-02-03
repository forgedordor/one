package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cjmw implements cjms {
    private final asrc a;
    private final cjen b;
    private final cjeo c;
    private final cjis d;

    public cjmw(asrc asrcVar, cjen cjenVar, cjeo cjeoVar, cjis cjisVar) {
        this.b = cjenVar;
        this.c = cjeoVar;
        this.d = cjisVar;
        this.a = asrcVar;
    }

    @Override // defpackage.cjms
    public final /* bridge */ /* synthetic */ aubl a(Object obj) {
        cjjb cjjbVar = ((cjjy) obj).d;
        if (cjjbVar == null) {
            cjjbVar = cjjb.a;
        }
        return cjdi.a(cjjbVar);
    }

    @Override // defpackage.cjms
    public final /* bridge */ /* synthetic */ eiju b(Object obj) {
        return this.a.g((augk) obj);
    }

    @Override // defpackage.cjms
    public final /* bridge */ /* synthetic */ eiju c(Object obj) {
        cjis cjisVar = this.d;
        return eiju.g(fcrw.a(cjisVar.a.a(cjiv.c(), cjisVar.b), (cjkc) obj));
    }

    @Override // defpackage.cjms
    public final /* bridge */ /* synthetic */ Optional d(Object obj) {
        cjjy cjjyVar = (cjjy) obj;
        cjgr cjgrVar = cjjyVar.e;
        if (cjgrVar == null) {
            cjgrVar = cjgr.a;
        }
        int iA = cjgq.a(cjgrVar.c);
        if (iA == 0 || iA != 3) {
            return Optional.empty();
        }
        cjgr cjgrVar2 = cjjyVar.e;
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
        return this.c.apply((cjjy) obj);
    }

    @Override // defpackage.cjms
    public final /* bridge */ /* synthetic */ Object f(Object obj) {
        return this.b.apply((augi) obj);
    }

    @Override // defpackage.cjms
    public final /* bridge */ /* synthetic */ Object g(Object obj) {
        augj augjVar = (augj) augk.a.createBuilder();
        aubg aubgVar = (aubg) aubl.a.createBuilder();
        aubk aubkVar = aubk.PENDING;
        aubgVar.copyOnWrite();
        aubl aublVar = (aubl) aubgVar.instance;
        aublVar.c = aubkVar.f;
        aublVar.b |= 1;
        augjVar.copyOnWrite();
        augk augkVar = (augk) augjVar.instance;
        aubl aublVar2 = (aubl) aubgVar.build();
        aublVar2.getClass();
        augkVar.c = aublVar2;
        augkVar.b |= 1;
        evqs evqsVar = ((augi) obj).e;
        augjVar.copyOnWrite();
        augk augkVar2 = (augk) augjVar.instance;
        evqsVar.getClass();
        augkVar2.b |= 2;
        augkVar2.d = evqsVar;
        return (augk) augjVar.build();
    }

    @Override // defpackage.cjms
    public final /* bridge */ /* synthetic */ String h(Object obj) {
        audu auduVar = ((augi) obj).c;
        if (auduVar == null) {
            auduVar = audu.a;
        }
        return "RcsConversationId: ".concat(String.valueOf(auduVar.c));
    }

    @Override // defpackage.cjms
    public final String i() {
        return "removeUserFromGroup";
    }

    @Override // defpackage.cjms
    public final /* bridge */ /* synthetic */ Object j(Object obj) {
        augj augjVar = (augj) augk.a.createBuilder();
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
        augjVar.copyOnWrite();
        augk augkVar = (augk) augjVar.instance;
        aubl aublVar3 = (aubl) aubgVar.build();
        aublVar3.getClass();
        augkVar.c = aublVar3;
        augkVar.b |= 1;
        evqs evqsVar = ((augi) obj).e;
        augjVar.copyOnWrite();
        augk augkVar2 = (augk) augjVar.instance;
        evqsVar.getClass();
        augkVar2.b |= 2;
        augkVar2.d = evqsVar;
        return (augk) augjVar.build();
    }
}
