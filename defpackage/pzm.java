package defpackage;

import androidx.work.CoroutineWorker;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pzm extends fcyz implements fdat {
    int a;
    final /* synthetic */ CoroutineWorker b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pzm(CoroutineWorker coroutineWorker, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = coroutineWorker;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((pzm) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        CoroutineWorker coroutineWorker = this.b;
        this.a = 1;
        Object objC = coroutineWorker.c(this);
        return objC == fcylVar ? fcylVar : objC;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new pzm(this.b, fcxyVar);
    }
}
