package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final /* synthetic */ class egwp extends fdbo implements fdau {
    public static final egwp a = new egwp();

    public egwp() {
        super(3, egwq.class, "reduceLocal", "reduceLocal(Lcom/google/apps/tiktok/coroutines/flow/LocalSnapshot;Lcom/google/apps/tiktok/coroutines/flow/LocalReadState;Z)Lcom/google/apps/tiktok/coroutines/flow/LocalSnapshot;", 1);
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        egxh egxhVar = (egxh) obj;
        egxa egxaVar = (egxa) obj2;
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        egxhVar.getClass();
        egxaVar.getClass();
        if (egxaVar instanceof egwz) {
            if (egxhVar instanceof egxc) {
                return new egxe(null);
            }
            if (egxhVar instanceof egxb) {
                return new egxe(((egxb) egxhVar).a);
            }
            if (egxhVar instanceof egxe) {
                return new egxe(((egxe) egxhVar).a);
            }
            if (egxhVar instanceof egxd) {
                return new egxf(((egxd) egxhVar).a, null);
            }
            if (egxhVar instanceof egxg) {
                egxg egxgVar = (egxg) egxhVar;
                return new egxf(egxgVar.a, egxgVar.b);
            }
            if (!(egxhVar instanceof egxf)) {
                throw new fctg();
            }
            egxf egxfVar = (egxf) egxhVar;
            return new egxf(egxfVar.a, egxfVar.b);
        }
        if (!(egxaVar instanceof egwy)) {
            throw new fctg();
        }
        eguz eguzVar = ((egwy) egxaVar).a;
        if (eguzVar instanceof eguy) {
            return zBooleanValue ? new egxf(((eguy) eguzVar).a, null) : new egxd(((eguy) eguzVar).a);
        }
        if (!(eguzVar instanceof egux)) {
            throw new fctg();
        }
        if (egxhVar instanceof egxc) {
            throw new egxj("Advanced from Idle to a failure with no intermediate state.");
        }
        if (egxhVar instanceof egxb) {
            throw new egxj("Advanced from Failed to another failure with no intermediate state.");
        }
        if (egxhVar instanceof egxe) {
            return zBooleanValue ? new egxe(((egxe) egxhVar).a) : new egxb(new egxi(((egux) eguzVar).a));
        }
        if (egxhVar instanceof egxd) {
            throw new egxj("Advanced from Read to a failure with no intermediate state.");
        }
        if (egxhVar instanceof egxg) {
            throw new egxj("Advanced from StaleRead to a failure with no intermediate state.");
        }
        if (!(egxhVar instanceof egxf)) {
            throw new fctg();
        }
        if (!zBooleanValue) {
            return new egxg(((egxf) egxhVar).a, new egxi(((egux) eguzVar).a));
        }
        egxf egxfVar2 = (egxf) egxhVar;
        return new egxf(egxfVar2.a, egxfVar2.b);
    }
}
