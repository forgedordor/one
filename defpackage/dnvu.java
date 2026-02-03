package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dnvu extends fcyz implements fdat {
    int a;
    final /* synthetic */ dnwk b;
    final /* synthetic */ String c;
    final /* synthetic */ String d;
    final /* synthetic */ dnvg e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dnvu(dnwk dnwkVar, String str, String str2, dnvg dnvgVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = dnwkVar;
        this.c = str;
        this.d = str2;
        this.e = dnvgVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dnvu) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
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
        String str2 = this.d;
        dnwn dnwnVarH = dnwr.h(this.e);
        ecnw ecnwVar = new ecnw();
        ecnwVar.b("\n          INSERT INTO `emotify` (`id`, `uri`, `data`)\n          VALUES (?, ?, ?)\n          ");
        ecnwVar.d(str);
        ecnwVar.d(str2);
        ecnwVar.e(dnwnVarH.toByteArray());
        ListenableFuture listenableFutureB = ecmdVarB.b(ecnwVar.a());
        listenableFutureB.getClass();
        this.a = 1;
        Object objC = fdxs.c(listenableFutureB, this);
        return objC == fcylVar ? fcylVar : objC;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dnvu(this.b, this.c, this.d, this.e, fcxyVar);
    }
}
