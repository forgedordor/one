package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cdzw implements cdzx {
    private final abvq c;
    private final eosc d;
    private static final eksp b = eksp.c("MmsPolicy");
    public static final cczv a = cdag.f(cdag.b, "mms_policy_query_timeout", 3000);

    public cdzw(abvq abvqVar, eosc eoscVar) {
        this.c = abvqVar;
        this.d = eoscVar;
    }

    private final eiju d(final Function function) {
        eieu eieuVarK = eiiy.k("MmsPolicy#isMmsAllowedFuture");
        try {
            eiju eijuVarI = this.c.a().i(new eooz() { // from class: cdzu
                @Override // defpackage.eooz
                public final ListenableFuture a(Object obj) {
                    Optional optional = (Optional) obj;
                    cczv cczvVar = cdzw.a;
                    optional.getClass();
                    return (ListenableFuture) optional.map(function).orElse(eijx.e(true));
                }
            }, this.d);
            eieuVarK.b(eijuVarI);
            eieuVarK.close();
            return eijuVarI;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    private final boolean e(Function function) {
        try {
            return ecem.g() ? ((Boolean) d(function).get(((Long) a.e()).longValue(), TimeUnit.MILLISECONDS)).booleanValue() : ((Boolean) dqle.b(d(function), ((Long) a.e()).longValue(), TimeUnit.MILLISECONDS)).booleanValue();
        } catch (InterruptedException e) {
            ((eksl) ((eksl) ((eksl) b.j()).g(e)).h("com/google/android/apps/messaging/shared/mmscontroller/MmsPolicy", "isEnabled", 'A', "MmsPolicy.java")).q("Interrupted while querying MmsController");
            return true;
        } catch (ExecutionException e2) {
            ((eksl) ((eksl) ((eksl) b.j()).g(e2)).h("com/google/android/apps/messaging/shared/mmscontroller/MmsPolicy", "isEnabled", '?', "MmsPolicy.java")).q("Failed to query MmsController");
            return true;
        } catch (TimeoutException e3) {
            ((eksl) ((eksl) ((eksl) b.j()).g(e3)).h("com/google/android/apps/messaging/shared/mmscontroller/MmsPolicy", "isEnabled", 'C', "MmsPolicy.java")).q("Timeout while querying MmsController");
            return true;
        }
    }

    public final boolean a() {
        return e(new Function() { // from class: cdzv
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((cdzr) obj).a();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
    }

    public final boolean b() {
        return e(new Function() { // from class: cdzs
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((cdzr) obj).b();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
    }

    @Override // defpackage.cdzx
    public final boolean c() {
        return e(new Function() { // from class: cdzt
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((cdzr) obj).c();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
    }
}
