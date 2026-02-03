package defpackage;

import androidx.work.impl.workers.ConstraintTrackingWorker;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qmn extends fcyz implements fdat {
    int a;
    final /* synthetic */ ConstraintTrackingWorker b;
    final /* synthetic */ qaq c;
    final /* synthetic */ qgr d;
    final /* synthetic */ qjn e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qmn(ConstraintTrackingWorker constraintTrackingWorker, qaq qaqVar, qgr qgrVar, qjn qjnVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = constraintTrackingWorker;
        this.c = qaqVar;
        this.d = qgrVar;
        this.e = qjnVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((qmn) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
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
        qaq qaqVar = this.c;
        qgr qgrVar = this.d;
        qjn qjnVar = this.e;
        this.a = 1;
        Object objK = constraintTrackingWorker.k(qaqVar, qgrVar, qjnVar, this);
        return objK == fcylVar ? fcylVar : objK;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new qmn(this.b, this.c, this.d, this.e, fcxyVar);
    }
}
