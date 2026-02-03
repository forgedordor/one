package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cjnf implements cjms {
    private final asrc a;
    private final cjeu b;
    private final cjev c;
    private final cjis d;

    public cjnf(asrc asrcVar, cjeu cjeuVar, cjev cjevVar, cjis cjisVar) {
        this.b = cjeuVar;
        this.c = cjevVar;
        this.d = cjisVar;
        this.a = asrcVar;
    }

    @Override // defpackage.cjms
    public final /* bridge */ /* synthetic */ aubl a(Object obj) {
        cjjb cjjbVar = ((cjlo) obj).d;
        if (cjjbVar == null) {
            cjjbVar = cjjb.a;
        }
        return cjdi.a(cjjbVar);
    }

    @Override // defpackage.cjms
    public final /* bridge */ /* synthetic */ eiju b(Object obj) {
        return this.a.j((auik) obj);
    }

    @Override // defpackage.cjms
    public final /* bridge */ /* synthetic */ eiju c(Object obj) {
        cjis cjisVar = this.d;
        return eiju.g(fcrw.a(cjisVar.a.a(cjiv.g(), cjisVar.b), (cjls) obj));
    }

    @Override // defpackage.cjms
    public final /* bridge */ /* synthetic */ Optional d(Object obj) {
        cjlo cjloVar = (cjlo) obj;
        cjgr cjgrVar = cjloVar.e;
        if (cjgrVar == null) {
            cjgrVar = cjgr.a;
        }
        int iA = cjgq.a(cjgrVar.c);
        if (iA == 0 || iA != 3) {
            return Optional.empty();
        }
        cjgr cjgrVar2 = cjloVar.e;
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
        return this.c.apply((cjlo) obj);
    }

    @Override // defpackage.cjms
    public final /* bridge */ /* synthetic */ Object f(Object obj) {
        return this.b.apply((auii) obj);
    }

    @Override // defpackage.cjms
    public final /* bridge */ /* synthetic */ Object g(Object obj) {
        auij auijVar = (auij) auik.a.createBuilder();
        aubg aubgVar = (aubg) aubl.a.createBuilder();
        aubk aubkVar = aubk.PENDING;
        aubgVar.copyOnWrite();
        aubl aublVar = (aubl) aubgVar.instance;
        aublVar.c = aubkVar.f;
        aublVar.b |= 1;
        auijVar.copyOnWrite();
        auik auikVar = (auik) auijVar.instance;
        aubl aublVar2 = (aubl) aubgVar.build();
        aublVar2.getClass();
        auikVar.c = aublVar2;
        auikVar.b |= 1;
        evqs evqsVar = ((auii) obj).d;
        auijVar.copyOnWrite();
        auik auikVar2 = (auik) auijVar.instance;
        evqsVar.getClass();
        auikVar2.b |= 2;
        auikVar2.d = evqsVar;
        return (auik) auijVar.build();
    }

    @Override // defpackage.cjms
    public final /* bridge */ /* synthetic */ String h(Object obj) {
        audu auduVar = ((auii) obj).c;
        if (auduVar == null) {
            auduVar = audu.a;
        }
        return "RcsConversationId: ".concat(String.valueOf(auduVar.c));
    }

    @Override // defpackage.cjms
    public final String i() {
        return "triggerGroupNotification";
    }

    @Override // defpackage.cjms
    public final /* bridge */ /* synthetic */ Object j(Object obj) {
        auij auijVar = (auij) auik.a.createBuilder();
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
        auijVar.copyOnWrite();
        auik auikVar = (auik) auijVar.instance;
        aubl aublVar3 = (aubl) aubgVar.build();
        aublVar3.getClass();
        auikVar.c = aublVar3;
        auikVar.b |= 1;
        evqs evqsVar = ((auii) obj).d;
        auijVar.copyOnWrite();
        auik auikVar2 = (auik) auijVar.instance;
        evqsVar.getClass();
        auikVar2.b |= 2;
        auikVar2.d = evqsVar;
        return (auik) auijVar.build();
    }
}
