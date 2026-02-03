package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aujt implements auju {
    private final fcsu a;
    private final fcsu b;
    private final fcsu c;
    private final aujg d;

    public aujt(fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, aujg aujgVar) {
        fcsuVar.getClass();
        fcsuVar2.getClass();
        fcsuVar3.getClass();
        this.a = fcsuVar;
        this.b = fcsuVar2;
        this.c = fcsuVar3;
        this.d = aujgVar;
    }

    @Override // defpackage.auju
    public final auji a(auga augaVar) {
        augaVar.getClass();
        if (augaVar == auga.RECOVERY_STRATEGY_REFRESH_REGISTRATION) {
            Object objB = this.a.b();
            objB.getClass();
            return (auji) objB;
        }
        if (augaVar == auga.RECOVERY_STRATEGY_RECREATE_GROUP) {
            Object objB2 = this.b.b();
            objB2.getClass();
            return (auji) objB2;
        }
        if (augaVar != auga.RECOVERY_STRATEGY_INVALIDATE_CAPABILITIES_CACHE) {
            return this.d;
        }
        Object objB3 = this.c.b();
        objB3.getClass();
        return (auji) objB3;
    }
}
