package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class amon extends fcyz implements fdat {
    int a;
    final /* synthetic */ amos b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public amon(amos amosVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = amosVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((amon) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            eiju eijuVarB = this.b.c.b();
            eijuVarB.getClass();
            this.a = 1;
            obj = fdxs.c(eijuVarB, this);
            if (obj == fcylVar) {
                return fcylVar;
            }
        }
        aoer aoerVarH = ((akep) obj).h();
        if (fdbq.f(aoerVarH != null ? Boolean.valueOf(aoerVarH.u()) : null, true)) {
            return true;
        }
        ((ekrd) amos.a.j().h("com/google/android/apps/messaging/shared/api/messaging/message/compose/emergency/carrier/EmergencyCarrierConstraintSupplier$getAsync$1", "invokeSuspend", 41, "EmergencyCarrierConstraintSupplier.kt")).q("Current active self identity is on a carrier that does not allow emergency RCS.");
        return false;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new amon(this.b, fcxyVar);
    }
}
