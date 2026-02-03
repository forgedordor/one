package defpackage;

import j$.util.function.Consumer$CC;
import java.util.Map;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cdee implements cdbr {
    public static final cqce a = cqce.g("BugleNetwork", "TachyonClientPingHandler");
    private final fcsu b;

    public cdee(fcsu fcsuVar) {
        this.b = fcsuVar;
    }

    @Override // defpackage.cdbr
    public final int a(esju esjuVar) {
        return 0;
    }

    @Override // defpackage.cdbr
    public final void b(esju esjuVar) {
        cqce cqceVar = a;
        cqceVar.p("Received Client Ping from Tachyon");
        final String str = (String) esjuVar.c().get("app");
        fcsu fcsuVar = (fcsu) ((Map) this.b.b()).get(str);
        if (fcsuVar != null) {
            eiju eijuVarA = ((cdbt) fcsuVar.b()).a();
            ejvr ejvrVar = new ejvr() { // from class: cdec
                @Override // defpackage.ejvr
                public final Object apply(Object obj) {
                    cdee.a.s("Got StatusRuntimeException during refresh", (fbtf) obj);
                    return null;
                }
            };
            eoqg eoqgVar = eoqg.a;
            eika.l(eijuVarA.e(fbtf.class, ejvrVar, eoqgVar), auvh.c(new Consumer() { // from class: cded
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void z(Object obj) {
                    cdee.a.p("Successfully handled Tachyon ping for ".concat(String.valueOf(str)));
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            }), eoqgVar);
            return;
        }
        String str2 = (String) esjuVar.c().get("tickle");
        cqbd cqbdVarE = cqceVar.e();
        cqbdVarE.I("PingRefreshHandler not registered for app");
        cqbdVarE.A("appName", str);
        cqbdVarE.A("tickleId", str2);
        cqbdVarE.r();
    }

    @Override // defpackage.cdbr
    public final void c() {
    }
}
