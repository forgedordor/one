package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class chso extends fcyz implements fdat {
    int a;
    final /* synthetic */ chsp b;
    final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public chso(chsp chspVar, int i, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = chspVar;
        this.c = i;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((chso) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        String str;
        String str2;
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            cmlb cmlbVar = (cmlb) this.b.b.b();
            int i2 = this.c;
            this.a = 1;
            obj = cmlbVar.m(i2, this);
            if (obj == fcylVar) {
                return fcylVar;
            }
        }
        chsp chspVar = this.b;
        int i3 = this.c;
        cmmh cmmhVar = (cmmh) obj;
        ellg ellgVar = (ellg) ellh.a.createBuilder();
        ellgVar.getClass();
        elgr.g(ellf.RCS_LOCAL_IDENTITY_EVENT, ellgVar);
        enyf enyfVar = (enyf) enyh.a.createBuilder();
        enyfVar.getClass();
        enyfVar.copyOnWrite();
        enyh enyhVar = (enyh) enyfVar.instance;
        enyhVar.c = 1;
        enyhVar.b |= 1;
        enyfVar.copyOnWrite();
        enyh enyhVar2 = (enyh) enyfVar.instance;
        enyhVar2.b |= 2;
        enyhVar2.d = i3;
        enyfVar.copyOnWrite();
        enyh enyhVar3 = (enyh) enyfVar.instance;
        enyhVar3.b |= 16;
        enyhVar3.g = cmmhVar != null;
        String str3 = "";
        if (cmmhVar != null) {
            str = cmmhVar.p;
            if (str == null) {
            }
            str.getClass();
            enyfVar.copyOnWrite();
            enyh enyhVar4 = (enyh) enyfVar.instance;
            enyhVar4.b |= 4;
            enyhVar4.e = str;
            chzn chznVar = (chzn) chspVar.c.b();
            if (cmmhVar != null && (str2 = cmmhVar.c) != null) {
                str3 = str2;
            }
            enwr enwrVarB = chznVar.b(str3);
            enwrVarB.getClass();
            enyfVar.copyOnWrite();
            enyh enyhVar5 = (enyh) enyfVar.instance;
            enyhVar5.f = enwrVarB.N;
            enyhVar5.b |= 8;
            evsn evsnVarBuild = enyfVar.build();
            evsnVarBuild.getClass();
            ellgVar.copyOnWrite();
            ellh ellhVar = (ellh) ellgVar.instance;
            ellhVar.cb = (enyh) evsnVarBuild;
            ellhVar.h |= 1024;
            evsf builder = elgr.a(ellgVar).toBuilder();
            builder.getClass();
            ((aimb) chspVar.a.b()).a().h((ellg) builder, aioj.LOG_SPEC_RCS_LOCAL_IDENTITY_EVENTS);
            return fctx.a;
        }
        cmmhVar = null;
        str = "";
        str.getClass();
        enyfVar.copyOnWrite();
        enyh enyhVar42 = (enyh) enyfVar.instance;
        enyhVar42.b |= 4;
        enyhVar42.e = str;
        chzn chznVar2 = (chzn) chspVar.c.b();
        if (cmmhVar != null) {
            str3 = str2;
        }
        enwr enwrVarB2 = chznVar2.b(str3);
        enwrVarB2.getClass();
        enyfVar.copyOnWrite();
        enyh enyhVar52 = (enyh) enyfVar.instance;
        enyhVar52.f = enwrVarB2.N;
        enyhVar52.b |= 8;
        evsn evsnVarBuild2 = enyfVar.build();
        evsnVarBuild2.getClass();
        ellgVar.copyOnWrite();
        ellh ellhVar2 = (ellh) ellgVar.instance;
        ellhVar2.cb = (enyh) evsnVarBuild2;
        ellhVar2.h |= 1024;
        evsf builder2 = elgr.a(ellgVar).toBuilder();
        builder2.getClass();
        ((aimb) chspVar.a.b()).a().h((ellg) builder2, aioj.LOG_SPEC_RCS_LOCAL_IDENTITY_EVENTS);
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new chso(this.b, this.c, fcxyVar);
    }
}
