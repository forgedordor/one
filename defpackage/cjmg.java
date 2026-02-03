package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cjmg implements cjms {
    private final asrc a;
    private final cjcg b;
    private final cjch c;
    private final cjis d;

    public cjmg(asrc asrcVar, cjcg cjcgVar, cjch cjchVar, cjis cjisVar) {
        this.b = cjcgVar;
        this.c = cjchVar;
        this.d = cjisVar;
        this.a = asrcVar;
    }

    @Override // defpackage.cjms
    public final /* bridge */ /* synthetic */ aubl a(Object obj) {
        cjjb cjjbVar = ((cjgd) obj).d;
        if (cjjbVar == null) {
            cjjbVar = cjjb.a;
        }
        return cjdi.a(cjjbVar);
    }

    @Override // defpackage.cjms
    public final /* bridge */ /* synthetic */ eiju b(Object obj) {
        return this.a.a((aubf) obj);
    }

    @Override // defpackage.cjms
    public final /* bridge */ /* synthetic */ eiju c(Object obj) {
        cjis cjisVar = this.d;
        return eiju.g(fcrw.a(cjisVar.a.a(cjiv.a(), cjisVar.b), (cjgh) obj));
    }

    @Override // defpackage.cjms
    public final /* bridge */ /* synthetic */ Optional d(Object obj) {
        cjgd cjgdVar = (cjgd) obj;
        cjgr cjgrVar = cjgdVar.e;
        if (cjgrVar == null) {
            cjgrVar = cjgr.a;
        }
        int iA = cjgq.a(cjgrVar.c);
        if (iA == 0 || iA != 3) {
            return Optional.empty();
        }
        cjgr cjgrVar2 = cjgdVar.e;
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
        return this.c.apply((cjgd) obj);
    }

    @Override // defpackage.cjms
    public final /* bridge */ /* synthetic */ Object f(Object obj) {
        return this.b.apply((aubd) obj);
    }

    @Override // defpackage.cjms
    public final /* bridge */ /* synthetic */ Object g(Object obj) {
        aube aubeVar = (aube) aubf.a.createBuilder();
        aubg aubgVar = (aubg) aubl.a.createBuilder();
        aubk aubkVar = aubk.PENDING;
        aubgVar.copyOnWrite();
        aubl aublVar = (aubl) aubgVar.instance;
        aublVar.c = aubkVar.f;
        aublVar.b |= 1;
        aubeVar.copyOnWrite();
        aubf aubfVar = (aubf) aubeVar.instance;
        aubl aublVar2 = (aubl) aubgVar.build();
        aublVar2.getClass();
        aubfVar.c = aublVar2;
        aubfVar.b |= 1;
        evqs evqsVar = ((aubd) obj).e;
        aubeVar.copyOnWrite();
        aubf aubfVar2 = (aubf) aubeVar.instance;
        evqsVar.getClass();
        aubfVar2.b |= 2;
        aubfVar2.d = evqsVar;
        return (aubf) aubeVar.build();
    }

    @Override // defpackage.cjms
    public final /* bridge */ /* synthetic */ String h(Object obj) {
        audu auduVar = ((aubd) obj).c;
        if (auduVar == null) {
            auduVar = audu.a;
        }
        return "RcsConversationId: ".concat(String.valueOf(auduVar.c));
    }

    @Override // defpackage.cjms
    public final String i() {
        return "addUserToGroup";
    }

    @Override // defpackage.cjms
    public final /* bridge */ /* synthetic */ Object j(Object obj) {
        aube aubeVar = (aube) aubf.a.createBuilder();
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
        aubeVar.copyOnWrite();
        aubf aubfVar = (aubf) aubeVar.instance;
        aubl aublVar3 = (aubl) aubgVar.build();
        aublVar3.getClass();
        aubfVar.c = aublVar3;
        aubfVar.b |= 1;
        evqs evqsVar = ((aubd) obj).e;
        aubeVar.copyOnWrite();
        aubf aubfVar2 = (aubf) aubeVar.instance;
        evqsVar.getClass();
        aubfVar2.b |= 2;
        aubfVar2.d = evqsVar;
        return (aubf) aubeVar.build();
    }
}
