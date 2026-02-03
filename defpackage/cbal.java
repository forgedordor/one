package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cbal extends fcyz implements fdat {
    final /* synthetic */ cban a;
    final /* synthetic */ pzj b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cbal(fcxy fcxyVar, cban cbanVar, pzj pzjVar) {
        super(2, fcxyVar);
        this.a = cbanVar;
        this.b = pzjVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cbal) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        pzj pzjVar = this.b;
        boolean z = false;
        if (pzjVar.d) {
            ((ekrd) cban.a.h().h("com/google/android/apps/messaging/shared/datamodel/workqueue/WorkQueueConstraintEvaluator", "evaluateUnsupportedConstraints", 91, "WorkQueueConstraintEvaluator.kt")).q("Device Idle constraint does not support eager evaluation");
        } else if (pzjVar.f) {
            ((ekrd) cban.a.h().h("com/google/android/apps/messaging/shared/datamodel/workqueue/WorkQueueConstraintEvaluator", "evaluateUnsupportedConstraints", 95, "WorkQueueConstraintEvaluator.kt")).q("Storage Not Low constraint does not support eager evaluation");
        } else {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        cbal cbalVar = new cbal(fcxyVar, this.a, this.b);
        cbalVar.c = obj;
        return cbalVar;
    }
}
