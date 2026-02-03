package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zat {
    private final fcsu a;

    public zat(fcsu fcsuVar) {
        fcsuVar.getClass();
        this.a = fcsuVar;
    }

    public final void a(int i, int i2, boolean z) {
        ailn ailnVarA = ((aimb) this.a.b()).a();
        ellg ellgVar = (ellg) ellh.a.createBuilder();
        ellf ellfVar = ellf.DOUBLE_TAP_REACT_PROMOTION_EVENT;
        ellgVar.copyOnWrite();
        ellh ellhVar = (ellh) ellgVar.instance;
        ellhVar.j = ellfVar.f11do;
        ellhVar.b |= 1;
        enoy enoyVar = (enoy) enoz.a.createBuilder();
        enoyVar.copyOnWrite();
        enoz enozVar = (enoz) enoyVar.instance;
        enozVar.c = i - 1;
        enozVar.b |= 1;
        enoyVar.copyOnWrite();
        enoz enozVar2 = (enoz) enoyVar.instance;
        enozVar2.b |= 2;
        enozVar2.d = i2;
        enoyVar.copyOnWrite();
        enoz enozVar3 = (enoz) enoyVar.instance;
        enozVar3.b |= 4;
        enozVar3.e = z;
        ellgVar.copyOnWrite();
        ellh ellhVar2 = (ellh) ellgVar.instance;
        enoz enozVar4 = (enoz) enoyVar.build();
        enozVar4.getClass();
        ellhVar2.bZ = enozVar4;
        ellhVar2.h |= 256;
        ailnVarA.j(ellgVar, aioj.LOG_SPEC_DOUBLE_TAP_REACT_PROMOTION_EVENTS);
    }
}
