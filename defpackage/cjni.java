package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cjni implements cjms {
    private final asrc a;
    private final cjew b;
    private final cjex c;
    private final cjis d;

    public cjni(asrc asrcVar, cjew cjewVar, cjex cjexVar, cjis cjisVar) {
        this.b = cjewVar;
        this.c = cjexVar;
        this.d = cjisVar;
        this.a = asrcVar;
    }

    @Override // defpackage.cjms
    public final /* bridge */ /* synthetic */ aubl a(Object obj) {
        cjjb cjjbVar = ((cjlw) obj).d;
        if (cjjbVar == null) {
            cjjbVar = cjjb.a;
        }
        return cjdi.a(cjjbVar);
    }

    @Override // defpackage.cjms
    public final /* bridge */ /* synthetic */ eiju b(Object obj) {
        return this.a.k((auis) obj);
    }

    @Override // defpackage.cjms
    public final /* bridge */ /* synthetic */ eiju c(Object obj) {
        cjis cjisVar = this.d;
        return eiju.g(fcrw.a(cjisVar.a.a(cjiv.h(), cjisVar.b), (cjma) obj));
    }

    @Override // defpackage.cjms
    public final /* bridge */ /* synthetic */ Optional d(Object obj) {
        cjlw cjlwVar = (cjlw) obj;
        cjgr cjgrVar = cjlwVar.e;
        if (cjgrVar == null) {
            cjgrVar = cjgr.a;
        }
        int iA = cjgq.a(cjgrVar.c);
        if (iA == 0 || iA != 3) {
            return Optional.empty();
        }
        cjgr cjgrVar2 = cjlwVar.e;
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
        return this.c.apply((cjlw) obj);
    }

    @Override // defpackage.cjms
    public final /* bridge */ /* synthetic */ Object f(Object obj) {
        return this.b.apply((auip) obj);
    }

    @Override // defpackage.cjms
    public final /* bridge */ /* synthetic */ Object g(Object obj) {
        auir auirVar = (auir) auis.a.createBuilder();
        aubg aubgVar = (aubg) aubl.a.createBuilder();
        aubk aubkVar = aubk.PENDING;
        aubgVar.copyOnWrite();
        aubl aublVar = (aubl) aubgVar.instance;
        aublVar.c = aubkVar.f;
        aublVar.b |= 1;
        auirVar.copyOnWrite();
        auis auisVar = (auis) auirVar.instance;
        aubl aublVar2 = (aubl) aubgVar.build();
        aublVar2.getClass();
        auisVar.c = aublVar2;
        auisVar.b |= 1;
        evqs evqsVar = ((auip) obj).e;
        auirVar.copyOnWrite();
        auis auisVar2 = (auis) auirVar.instance;
        evqsVar.getClass();
        auisVar2.b |= 2;
        auisVar2.d = evqsVar;
        return (auis) auirVar.build();
    }

    @Override // defpackage.cjms
    public final /* bridge */ /* synthetic */ String h(Object obj) {
        audu auduVar = ((auip) obj).c;
        if (auduVar == null) {
            auduVar = audu.a;
        }
        return "RcsConversationId: ".concat(String.valueOf(auduVar.c));
    }

    @Override // defpackage.cjms
    public final String i() {
        return "updateGroup";
    }

    @Override // defpackage.cjms
    public final /* bridge */ /* synthetic */ Object j(Object obj) {
        auir auirVar = (auir) auis.a.createBuilder();
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
        auirVar.copyOnWrite();
        auis auisVar = (auis) auirVar.instance;
        aubl aublVar3 = (aubl) aubgVar.build();
        aublVar3.getClass();
        auisVar.c = aublVar3;
        auisVar.b |= 1;
        evqs evqsVar = ((auip) obj).e;
        auirVar.copyOnWrite();
        auis auisVar2 = (auis) auirVar.instance;
        evqsVar.getClass();
        auisVar2.b |= 2;
        auisVar2.d = evqsVar;
        return (auis) auirVar.build();
    }
}
