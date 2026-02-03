package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dnff extends fcyz implements fdat {
    int a;
    final /* synthetic */ dnfr b;
    final /* synthetic */ dneb c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dnff(dnfr dnfrVar, dneb dnebVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = dnfrVar;
        this.c = dnebVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dnff) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        dnfr dnfrVar = this.b;
        ecmd ecmdVar = (ecmd) dnfrVar.b.b();
        ecnr ecnrVar = dnfe.a;
        dneb dnebVar = this.c;
        String str = (String) dnfrVar.e.b.invoke(dnebVar.a);
        String str2 = dnebVar.d;
        String strA = str2 != null ? dnfe.a(str2) : null;
        Instant instant = dnebVar.c;
        dnce dnceVar = dnebVar.b;
        String str3 = dnfrVar.f;
        str.getClass();
        ecnw ecnwVar = new ecnw();
        ecnwVar.b("\n          INSERT INTO `usages` (`type`, `value`, `context`, `time`, `search_term`)\n          VALUES (?, ?, ?, ?, ?)\n          ");
        ecnwVar.d(str3);
        ecnwVar.d(str);
        ecnwVar.c(Long.valueOf(dnceVar.a));
        ecnwVar.c(Long.valueOf(instant.toEpochMilli()));
        ecnwVar.d(strA);
        ListenableFuture listenableFutureB = ecmdVar.b(ecnwVar.a());
        listenableFutureB.getClass();
        this.a = 1;
        Object objC = fdxs.c(listenableFutureB, this);
        return objC == fcylVar ? fcylVar : objC;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dnff(this.b, this.c, fcxyVar);
    }
}
