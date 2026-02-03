package defpackage;

import androidx.work.impl.workers.ConstraintTrackingWorker;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qmi extends fcyz implements fdat {
    int a;
    final /* synthetic */ ConstraintTrackingWorker b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qmi(ConstraintTrackingWorker constraintTrackingWorker, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = constraintTrackingWorker;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((qmi) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        ConstraintTrackingWorker constraintTrackingWorker = this.b;
        this.a = 1;
        Object objL = constraintTrackingWorker.l(this);
        return objL == fcylVar ? fcylVar : objL;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new qmi(this.b, fcxyVar);
    }
}
