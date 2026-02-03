package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dnvw extends fcyz implements fdat {
    int a;
    final /* synthetic */ dnwk b;
    final /* synthetic */ String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dnvw(dnwk dnwkVar, String str, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = dnwkVar;
        this.c = str;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dnvw) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        ecmd ecmdVarB = this.b.b();
        ecnr ecnrVar = dnvt.a;
        String str = this.c;
        ecnw ecnwVar = new ecnw();
        ecnwVar.b("\n      DELETE\n      FROM `emotify`\n      WHERE `id` = ?\n      ");
        ecnwVar.d(str);
        ListenableFuture listenableFutureB = ecmdVarB.b(ecnwVar.a());
        listenableFutureB.getClass();
        this.a = 1;
        Object objC = fdxs.c(listenableFutureB, this);
        return objC == fcylVar ? fcylVar : objC;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dnvw(this.b, this.c, fcxyVar);
    }
}
