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
public final class cemq extends cmwg {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/net/TachyonBackgroundStartupTask");
    public final fcsu b;
    public final fcsu c;
    public final fcsu d;
    public final fcsu e;
    private final fcsu f;
    private final fcsu g;
    private final fcsu h;
    private final eosc i;
    private final fcsu j;

    public cemq(fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5, fcsu fcsuVar6, fcsu fcsuVar7, eosc eoscVar, fcsu fcsuVar8) {
        this.b = fcsuVar;
        this.f = fcsuVar3;
        this.c = fcsuVar4;
        this.g = fcsuVar5;
        this.d = fcsuVar2;
        this.h = fcsuVar6;
        this.e = fcsuVar7;
        this.i = eoscVar;
        this.j = fcsuVar8;
    }

    @Override // defpackage.cohg
    public final eieu a() {
        return eiiy.k("TachyonBackgroundStartupTask");
    }

    @Override // defpackage.cmwg
    public final eiju b() {
        eiju eijuVarI;
        ListenableFuture[] listenableFutureArr = new ListenableFuture[2];
        cqca.i("BugleNetwork", "Startup: registering tachyon.");
        listenableFutureArr[0] = ((cedm) this.b.b()).y().i(new eooz() { // from class: cemo
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                return ((Boolean) obj).booleanValue() ? eork.i(ezns.a) : ((cedm) this.a.b.b()).w();
            }
        }, eoqg.a);
        if (!cezu.a()) {
            eijuVarI = eijx.e(null);
        } else if (((crny) this.g.b()).r()) {
            fcsu fcsuVar = this.c;
            if (((ceni) fcsuVar.b()).h()) {
                cqca.i("BugleNetwork", "Startup: registering tachyon for phone.");
                ((cmfe) this.f.b()).o((efaq) fcsuVar.b());
            }
            eijuVarI = ((dggw) this.h.b()).e().i(new eooz() { // from class: cemp
                @Override // defpackage.eooz
                public final ListenableFuture a(Object obj) {
                    Set set = (Set) obj;
                    if (set.isEmpty()) {
                        ekrw ekrwVarJ = cemq.a.j();
                        ekrwVarJ.X(eksq.a, "BugleNetwork");
                        ((ekrd) ((ekrd) ekrwVarJ).h("com/google/android/apps/messaging/shared/net/TachyonBackgroundStartupTask", "registerByPhones", 123, "TachyonBackgroundStartupTask.java")).q("No available phone number to start tachyon for.");
                        return eijx.e(null);
                    }
                    final cemq cemqVar = this.a;
                    Stream map = Collection.EL.stream(set).map(new Function() { // from class: cemm
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo536andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj2) {
                            String str = ((dggk) obj2).a;
                            cemq cemqVar2 = cemqVar;
                            ((cfep) cemqVar2.d.b()).a(str, 22);
                            return ((ceni) cemqVar2.c.b()).a(((asqx) cemqVar2.e.b()).c(str));
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                    int i = ekgb.d;
                    return eijx.j((Iterable) map.collect(ekcv.a)).a(new Callable() { // from class: cemn
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            return null;
                        }
                    }, eoqg.a);
                }
            }, this.i);
        } else {
            cqca.i("BugleNetwork", "Startup: skip phone registration because of no sim.");
            eijuVarI = eijx.e(null);
        }
        listenableFutureArr[1] = eijuVarI;
        return eiju.g(eika.b(listenableFutureArr).a(new eopa(null), this.i));
    }

    @Override // defpackage.cmwz
    public final boolean c() {
        return true;
    }
}
