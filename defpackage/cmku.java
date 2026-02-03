package defpackage;

import androidx.work.WorkerParameters;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cmku extends fcyz implements fdat {
    int a;
    final /* synthetic */ cmkw b;
    final /* synthetic */ WorkerParameters c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cmku(cmkw cmkwVar, WorkerParameters workerParameters, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = cmkwVar;
        this.c = workerParameters;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cmku) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        cmkw.a.n().q("Received work request. Starting internal work.");
        cmkw cmkwVar = this.b;
        WorkerParameters workerParameters = this.c;
        this.a = 1;
        Object objG = cmkwVar.g(workerParameters, this);
        return objG == fcylVar ? fcylVar : objG;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new cmku(this.b, this.c, fcxyVar);
    }
}
