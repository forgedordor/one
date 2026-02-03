package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Collection;
import j$.util.function.Function$CC;
import j$.util.stream.Stream;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cddp implements cdbt {
    public static final cqce a = cqce.g("BugleNetwork", "PhonePingRefreshHandler");
    public final cejj b;
    public final eosc c;
    private final fcsu d;
    private final fcsu e;

    public cddp(cejj cejjVar, eosc eoscVar, fcsu fcsuVar, fcsu fcsuVar2) {
        this.b = cejjVar;
        this.c = eoscVar;
        this.d = fcsuVar;
        this.e = fcsuVar2;
    }

    @Override // defpackage.cdbt
    public final eiju a() {
        if (!cezu.a()) {
            a.p("Phone registration refresh on ping is not enabled.");
            return eijx.e(null);
        }
        a.p("Refreshing Tachyon phone registration.");
        eiju eijuVarE = ((dggw) this.d.b()).e();
        ejvr ejvrVar = new ejvr() { // from class: cddj
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                Stream map = Collection.EL.stream((Set) obj).map(new Function() { // from class: cddn
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        return ((dggk) obj2).a;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                final cddp cddpVar = this.a;
                Stream map2 = map.map(new Function() { // from class: cddo
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        cddp cddpVar2 = cddpVar;
                        return cddpVar2.b.e((String) obj2, 9).i(new eooz() { // from class: cddm
                            @Override // defpackage.eooz
                            public final ListenableFuture a(Object obj3) {
                                return ((cejg) obj3).B();
                            }
                        }, cddpVar2.c);
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                int i = ekgb.d;
                return (ekgb) map2.collect(ekcv.a);
            }
        };
        eosc eoscVar = this.c;
        return eijx.k(eijuVarE.h(ejvrVar, eoscVar)).a(new Callable() { // from class: cddk
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return null;
            }
        }, eoscVar).e(IllegalArgumentException.class, new ejvr() { // from class: cddl
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                cddp.a.s("Got IllegalArgumentException when refreshing phone registration", (IllegalArgumentException) obj);
                return null;
            }
        }, eoqg.a);
    }
}
