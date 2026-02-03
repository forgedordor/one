package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cjnc implements cjms {
    private final asrc a;
    private final cjer b;
    private final cjes c;
    private final cjis d;

    public cjnc(asrc asrcVar, cjer cjerVar, cjes cjesVar, cjis cjisVar) {
        this.a = asrcVar;
        this.b = cjerVar;
        this.c = cjesVar;
        this.d = cjisVar;
    }

    @Override // defpackage.cjms
    public final /* bridge */ /* synthetic */ aubl a(Object obj) {
        cjjb cjjbVar = ((cjlc) obj).e;
        if (cjjbVar == null) {
            cjjbVar = cjjb.a;
        }
        return cjdi.a(cjjbVar);
    }

    @Override // defpackage.cjms
    public final /* bridge */ /* synthetic */ eiju b(Object obj) {
        return this.a.i((augz) obj);
    }

    @Override // defpackage.cjms
    public final /* bridge */ /* synthetic */ eiju c(Object obj) {
        cjis cjisVar = this.d;
        return eiju.g(fcrw.a(cjisVar.a.a(cjiv.f(), cjisVar.b), (cjlg) obj));
    }

    @Override // defpackage.cjms
    public final /* bridge */ /* synthetic */ Optional d(Object obj) {
        cjgr cjgrVar = ((cjlc) obj).g;
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
        return this.c.apply((cjlc) obj);
    }

    @Override // defpackage.cjms
    public final /* bridge */ /* synthetic */ Object f(Object obj) {
        return this.b.apply((augw) obj);
    }

    @Override // defpackage.cjms
    public final /* bridge */ /* synthetic */ Object g(Object obj) {
        augy augyVar = (augy) augz.a.createBuilder();
        aubg aubgVar = (aubg) aubl.a.createBuilder();
        aubk aubkVar = aubk.PENDING;
        aubgVar.copyOnWrite();
        aubl aublVar = (aubl) aubgVar.instance;
        aublVar.c = aubkVar.f;
        aublVar.b |= 1;
        augyVar.copyOnWrite();
        augz augzVar = (augz) augyVar.instance;
        aubl aublVar2 = (aubl) aubgVar.build();
        aublVar2.getClass();
        augzVar.c = aublVar2;
        augzVar.b |= 1;
        evqs evqsVar = ((augw) obj).l;
        augyVar.copyOnWrite();
        augz augzVar2 = (augz) augyVar.instance;
        evqsVar.getClass();
        augzVar2.b |= 2;
        augzVar2.d = evqsVar;
        return (augz) augyVar.build();
    }

    @Override // defpackage.cjms
    public final /* bridge */ /* synthetic */ String h(Object obj) {
        return "RcsMessageId: ".concat(String.valueOf(((augw) obj).h));
    }

    @Override // defpackage.cjms
    public final String i() {
        return "sendMessage";
    }

    @Override // defpackage.cjms
    public final /* bridge */ /* synthetic */ Object j(Object obj) {
        augy augyVar = (augy) augz.a.createBuilder();
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
        augyVar.copyOnWrite();
        augz augzVar = (augz) augyVar.instance;
        aubl aublVar3 = (aubl) aubgVar.build();
        aublVar3.getClass();
        augzVar.c = aublVar3;
        augzVar.b |= 1;
        evqs evqsVar = ((augw) obj).l;
        augyVar.copyOnWrite();
        augz augzVar2 = (augz) augyVar.instance;
        evqsVar.getClass();
        augzVar2.b |= 2;
        augzVar2.d = evqsVar;
        return (augz) augyVar.build();
    }
}
