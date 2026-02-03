package defpackage;

import androidx.work.WorkerParameters;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cbfm extends fcyz implements fdat {
    int a;
    final /* synthetic */ cbfp b;
    final /* synthetic */ WorkerParameters c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cbfm(cbfp cbfpVar, WorkerParameters workerParameters, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = cbfpVar;
        this.c = workerParameters;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cbfm) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        cbfp cbfpVar = this.b;
        WorkerParameters workerParameters = this.c;
        workerParameters.getClass();
        this.a = 1;
        Object objD = cbfpVar.d(workerParameters, this);
        return objD == fcylVar ? fcylVar : objD;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new cbfm(this.b, this.c, fcxyVar);
    }
}
