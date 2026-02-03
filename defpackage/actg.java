package defpackage;

import j$.util.Collection;
import j$.util.Comparator;
import j$.util.Optional;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.Stream;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.ToIntFunction;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class actg implements actx {
    public static final cqce a = cqce.g("Bugle", "ConversationListBannerHost");
    public final fcsu b;
    public final cogw c;
    public final fcsu d;
    public actn e = actn.m();
    public Optional f = Optional.empty();
    public boolean g;
    public boolean h;
    private final acto i;

    public actg(acto actoVar, fcsu fcsuVar, cogw cogwVar, fcsu fcsuVar2) {
        this.i = actoVar;
        this.b = fcsuVar;
        this.c = cogwVar;
        this.d = fcsuVar2;
    }

    @Override // defpackage.actx
    public final void a(Optional optional) {
        if (dfpi.F()) {
            this.f = optional;
        }
        actu actuVar = (actu) this.i;
        actuVar.f.set(true);
        actuVar.g.a(eijx.e(null), actu.a);
    }

    @Override // defpackage.actx
    public final void b(ehac ehacVar, final cdpg cdpgVar) {
        egzp egzpVarB;
        final actu actuVar = (actu) this.i;
        eopk eopkVar = new eopk() { // from class: actt
            @Override // defpackage.eopk
            public final eopy a(eopt eoptVar) {
                eiju eijuVarA;
                actu actuVar2 = actuVar;
                if (((Boolean) ((Optional) actuVar2.h.b()).map(new Function() { // from class: actq
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return Boolean.valueOf(((aidh) obj).b());
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }).orElse(false)).booleanValue()) {
                    ((ekrd) ((ekrd) actu.b.e()).h("com/google/android/apps/messaging/home/banner/HomeBannerDataServiceImpl", "getDataSourceWithTopBannerIfReady", 106, "HomeBannerDataServiceImpl.java")).q("Suppressing getDataSourceWithTopBannerIfReady for Retail Mode device.");
                    eijuVarA = eijx.e(actn.m());
                } else if (actuVar2.f.get()) {
                    final cdpg cdpgVar2 = cdpgVar;
                    Stream streamSorted = Collection.EL.stream(ekpg.d((Set) actuVar2.d.b(), actuVar2.e)).filter(new Predicate() { // from class: actr
                        public final /* synthetic */ Predicate and(Predicate predicate) {
                            return Predicate$CC.$default$and(this, predicate);
                        }

                        @Override // java.util.function.Predicate
                        /* renamed from: negate */
                        public final /* synthetic */ Predicate mo538negate() {
                            return Predicate$CC.$default$negate(this);
                        }

                        public final /* synthetic */ Predicate or(Predicate predicate) {
                            return Predicate$CC.$default$or(this, predicate);
                        }

                        @Override // java.util.function.Predicate
                        public final boolean test(Object obj) {
                            return ((acth) obj).c().contains(cdpgVar2);
                        }
                    }).sorted(Comparator.CC.comparingInt(new ToIntFunction() { // from class: acts
                        @Override // java.util.function.ToIntFunction
                        public final int applyAsInt(Object obj) {
                            return ((acth) obj).d() - 2;
                        }
                    }));
                    int i = ekgb.d;
                    eijuVarA = actuVar2.a((ekgb) streamSorted.collect(ekcv.a), 0);
                } else {
                    eijuVarA = eijx.e(actn.m());
                }
                return new eopy(eijuVarA);
            }
        };
        if (dfpi.F()) {
            ekhv ekhvVar = new ekhv();
            ekhvVar.c(actu.a);
            ekhvVar.c(cjxi.b);
            ekhvVar.c(cjxi.c);
            ekhvVar.c(chzn.a);
            egzpVarB = egzp.b(ekhvVar.g());
        } else {
            egzpVarB = egzp.b(ekhx.s(actu.a, cjxi.b, chzn.a));
        }
        ehacVar.a(new egys(actuVar.c, eopkVar, egzpVarB), new egzv<actn>() { // from class: actg.1
            @Override // defpackage.egzv
            public final void a(Throwable th) {
                actg.a.r("onError is thrown while calling getBannerEligibility.");
            }

            @Override // defpackage.egzv
            public final /* bridge */ /* synthetic */ void b(Object obj) {
                actg actgVar = actg.this;
                actn actnVar = actgVar.e;
                actgVar.e = (actn) obj;
                if (actnVar.i().equals(actgVar.e.i())) {
                    actg.a.m("Ignoring update to HomeBanner since we are already showing the same banner.");
                    return;
                }
                boolean zEquals = actgVar.e.i().equals("stub_banner_name");
                boolean z = !zEquals;
                if (dfpi.F() && !actgVar.h && zEquals) {
                    actg.a.p("Ignoring update to HomeBanner since it's the first banner and it's not eligible");
                    return;
                }
                if (dfpi.F() && dfpi.o() >= 0 && !actgVar.h && actgVar.e.j() && actgVar.f.isPresent() && actgVar.c.f().toEpochMilli() - ((Long) actgVar.f.get()).longValue() > dfpi.o()) {
                    actg.a.p("Ignoring eligilibilty update for initial banner calulcation, its been too long since app interactive");
                    actgVar.f = Optional.empty();
                    return;
                }
                actgVar.h = true;
                boolean z2 = actgVar.g;
                actgVar.g = z;
                if (z2 && !zEquals) {
                    ((actw) actgVar.b.b()).b(3);
                    return;
                }
                if (z2 && zEquals) {
                    ((actw) actgVar.b.b()).b(2);
                } else {
                    if (z2 || zEquals) {
                        return;
                    }
                    ((actw) actgVar.b.b()).b(1);
                }
            }

            @Override // defpackage.egzv
            public final /* synthetic */ void hn() {
            }
        });
    }
}
