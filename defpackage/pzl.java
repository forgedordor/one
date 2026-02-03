package defpackage;

import androidx.work.CoroutineWorker;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pzl extends fcyz implements fdat {
    int a;
    final /* synthetic */ CoroutineWorker b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pzl(CoroutineWorker coroutineWorker, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = coroutineWorker;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) throws Throwable {
        fcxy fcxyVarC = c((fdjx) obj, (fcxy) obj2);
        fctx fctxVar = fctx.a;
        ((pzl) fcxyVarC).b(fctxVar);
        return fctxVar;
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        this.a = 1;
        throw new IllegalStateException("Not implemented");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new pzl(this.b, fcxyVar);
    }
}
