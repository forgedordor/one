package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dsnm extends fcyz implements fdat {
    int a;
    final /* synthetic */ dsoa b;
    final /* synthetic */ String c;
    final /* synthetic */ evje d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dsnm(dsoa dsoaVar, String str, evje evjeVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = dsoaVar;
        this.c = str;
        this.d = evjeVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dsnm) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        dsoa dsoaVar = this.b;
        String str = this.c;
        ListenableFuture listenableFutureC = ((dski) dsoaVar.b.a(str)).c();
        listenableFutureC.getClass();
        evje evjeVar = this.d;
        etgy etgyVarB = dsoaVar.b();
        this.a = 1;
        Object objC = dsoaVar.c(listenableFutureC, etgyVarB, str, evjeVar, this);
        return objC == fcylVar ? fcylVar : objC;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dsnm(this.b, this.c, this.d, fcxyVar);
    }
}
