package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Collection;
import j$.util.Comparator;
import j$.util.Optional;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.function.Function;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cjrp {
    public static final cqce a = cqce.g("Bugle", "GoogleTosUiPresenter");
    public static final Comparator b = Comparator.CC.comparing(new Function() { // from class: cjri
        @Override // java.util.function.Function
        /* renamed from: andThen */
        public final /* synthetic */ Function mo536andThen(Function function) {
            return Function$CC.$default$andThen(this, function);
        }

        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            evvp evvpVar = ((cjqu) obj).f;
            return evvpVar == null ? evvp.a : evvpVar;
        }

        public final /* synthetic */ Function compose(Function function) {
            return Function$CC.$default$compose(this, function);
        }
    }, new java.util.Comparator() { // from class: cjrj
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            evvp evvpVar = evxc.a;
            return evxb.a((evvp) obj, (evvp) obj2);
        }
    });
    public final cjxi c;
    public final eosc d;
    public final eosc e;
    public final cogw f;
    private final cpdm g;
    private final cpdk h;

    public cjrp(cjxi cjxiVar, cpdm cpdmVar, cpdk cpdkVar, eosc eoscVar, eosc eoscVar2, cogw cogwVar) {
        this.c = cjxiVar;
        this.g = cpdmVar;
        this.h = cpdkVar;
        this.d = eoscVar;
        this.e = eoscVar2;
        this.f = cogwVar;
    }

    public static long a(ekgb ekgbVar, Predicate predicate) {
        return Collection.EL.stream(ekgbVar).filter(predicate).count();
    }

    public static long b(ekgb ekgbVar, int i) {
        return a(ekgbVar, new Predicate() { // from class: cjra
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
                cjqu cjquVar = (cjqu) obj;
                if (!cjrp.g(cjquVar)) {
                    return false;
                }
                cjqt cjqtVarB = cjqt.b(cjquVar.d);
                if (cjqtVarB == null) {
                    cjqtVarB = cjqt.UNRECOGNIZED;
                }
                return cjqtVarB.equals(cjqt.BANNER);
            }
        }) + i;
    }

    public static Optional f(ekgb ekgbVar) {
        return Collection.EL.stream(ekgbVar).filter(new Predicate() { // from class: cjrm
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
                return cjrp.g((cjqu) obj);
            }
        }).max(b).map(new Function() { // from class: cjqy
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                cqce cqceVar = cjrp.a;
                evvp evvpVar = ((cjqu) obj).f;
                if (evvpVar == null) {
                    evvpVar = evvp.a;
                }
                return Long.valueOf(evxc.a(evvpVar));
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
    }

    public static boolean g(cjqu cjquVar) {
        int iA;
        int iA2 = cjqs.a(cjquVar.c);
        return iA2 != 0 && iA2 == 3 && (iA = cjqr.a(cjquVar.e)) != 0 && iA == 6;
    }

    public final eiju c(final cjqt cjqtVar) {
        return e().i(new eooz() { // from class: cjrb
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                final Integer num = (Integer) obj;
                final cjqt cjqtVar2 = cjqtVar;
                cjrp cjrpVar = this.a;
                return cjrpVar.c.c().h(new ejvr() { // from class: cjqz
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj2) {
                        final ekgb ekgbVar = (ekgb) obj2;
                        cqce cqceVar = cjrp.a;
                        long jB = cjrp.b(ekgbVar, num.intValue());
                        final cjqt cjqtVar3 = cjqtVar2;
                        return new cjqj(jB, cjrp.a(ekgbVar, new Predicate() { // from class: cjqx
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
                            public final boolean test(Object obj3) {
                                int iA;
                                cjqu cjquVar = (cjqu) obj3;
                                long jLongValue = ((Long) cjrp.f(ekgbVar).orElse(0L)).longValue();
                                int iA2 = cjqs.a(cjquVar.c);
                                if (iA2 == 0 || iA2 != 3 || (iA = cjqr.a(cjquVar.e)) == 0 || iA != 4) {
                                    return false;
                                }
                                cjqt cjqtVarB = cjqt.b(cjquVar.d);
                                if (cjqtVarB == null) {
                                    cjqtVarB = cjqt.UNRECOGNIZED;
                                }
                                if (!cjqtVar3.equals(cjqtVarB)) {
                                    return false;
                                }
                                evvp evvpVar = cjquVar.f;
                                if (evvpVar == null) {
                                    evvpVar = evvp.a;
                                }
                                return evxb.a(evvpVar, evxc.c(jLongValue)) > 0;
                            }
                        }));
                    }
                }, cjrpVar.e);
            }
        }, this.e);
    }

    public final eiju d() {
        eiju eijuVarE;
        eiju eijuVarH;
        final cpdk cpdkVar = this.h;
        if (dfpi.z()) {
            eijuVarH = eijx.g(new Callable() { // from class: cpdh
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    if (cpdk.c()) {
                        ekrw ekrwVarD = cpdk.a.d();
                        ekrwVarD.X(eksq.a, "Bugle");
                        ((ekrd) ((ekrd) ekrwVarD).h("com/google/android/apps/messaging/shared/ui/reprompting/UpsellLogic", "decideGoogleTosPromptMultiSim", 84, "UpsellLogic.java")).q("Show Google Tos due to logic override");
                        return Optional.of(cjqt.BOTTOMSHEET);
                    }
                    final cpdk cpdkVar2 = cpdkVar;
                    cmlb cmlbVar = cpdkVar2.d;
                    if (!Collection.EL.stream(cmlbVar.o()).anyMatch(new Predicate() { // from class: cpdg
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
                            return cpdkVar2.e.c(dggo.a((dggn) obj).a).n;
                        }
                    })) {
                        ekrw ekrwVarD2 = cpdk.a.d();
                        ekrwVarD2.X(eksq.a, "Bugle");
                        ((ekrd) ((ekrd) ekrwVarD2).h("com/google/android/apps/messaging/shared/ui/reprompting/UpsellLogic", "decideGoogleTosPromptMultiSim", 89, "UpsellLogic.java")).q("Do not show Google Tos as showGoogleTos is false");
                        return Optional.empty();
                    }
                    if (Collection.EL.stream(cmlbVar.o()).anyMatch(new Predicate() { // from class: cpdj
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
                            return cpdkVar2.e.c(dggo.a((dggn) obj).a).u;
                        }
                    })) {
                        ekrw ekrwVarD3 = cpdk.a.d();
                        ekrwVarD3.X(eksq.a, "Bugle");
                        ((ekrd) ((ekrd) ekrwVarD3).h("com/google/android/apps/messaging/shared/ui/reprompting/UpsellLogic", "decideGoogleTosPromptMultiSim", 94, "UpsellLogic.java")).q("ToS prompting is disabled.");
                        return Optional.empty();
                    }
                    if (!cpdkVar2.d()) {
                        ekrw ekrwVarD4 = cpdk.a.d();
                        ekrwVarD4.X(eksq.a, "Bugle");
                        ((ekrd) ((ekrd) ekrwVarD4).h("com/google/android/apps/messaging/shared/ui/reprompting/UpsellLogic", "decideGoogleTosPromptMultiSim", 99, "UpsellLogic.java")).q("Not ready to show Google Tos");
                        return Optional.empty();
                    }
                    Iterator it = cmlbVar.o().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        if (cpdkVar2.f.a(dggo.a((dggn) it.next()).a)) {
                            if (cpdkVar2.b.q("should_show_rcs_default_on_prompt", false)) {
                                ekrw ekrwVarD5 = cpdk.a.d();
                                ekrwVarD5.X(eksq.a, "Bugle");
                                ((ekrd) ((ekrd) ekrwVarD5).h("com/google/android/apps/messaging/shared/ui/reprompting/UpsellLogic", "decideGoogleTosPromptMultiSim", 104, "UpsellLogic.java")).q("Do not show Google Tos as Legal FYI is requested");
                                return Optional.empty();
                            }
                        }
                    }
                    if (cpdkVar2.b()) {
                        ekrw ekrwVarD6 = cpdk.a.d();
                        ekrwVarD6.X(eksq.a, "Bugle");
                        ((ekrd) ((ekrd) ekrwVarD6).h("com/google/android/apps/messaging/shared/ui/reprompting/UpsellLogic", "decideGoogleTosPromptMultiSim", 109, "UpsellLogic.java")).q("Show Google Tos as Constellation requested");
                        return Optional.of(cjqt.BOTTOMSHEET);
                    }
                    if (!cpdkVar2.a()) {
                        return Optional.of(cjqt.BOTTOMSHEET);
                    }
                    ekrw ekrwVarD7 = cpdk.a.d();
                    ekrwVarD7.X(eksq.a, "Bugle");
                    ((ekrd) ((ekrd) ekrwVarD7).h("com/google/android/apps/messaging/shared/ui/reprompting/UpsellLogic", "decideGoogleTosPromptMultiSim", 114, "UpsellLogic.java")).q("Don't Show Google Tos as user already accepted");
                    return Optional.empty();
                }
            }, cpdkVar.g).h(new ejvr() { // from class: cpdi
                @Override // defpackage.ejvr
                public final Object apply(Object obj) {
                    return Boolean.valueOf(((Optional) obj).isPresent());
                }
            }, cpdkVar.h);
        } else {
            if (cpdk.c()) {
                ekrw ekrwVarD = cpdk.a.d();
                ekrwVarD.X(eksq.a, "Bugle");
                ((ekrd) ((ekrd) ekrwVarD).h("com/google/android/apps/messaging/shared/ui/reprompting/UpsellLogic", "decideGoogleTosPrompt", 125, "UpsellLogic.java")).q("Show Google Tos due to logic override");
                eijuVarE = eijx.e(Optional.of(cjqt.BOTTOMSHEET));
            } else if (((Boolean) cpdl.a.e()).booleanValue()) {
                ekrw ekrwVarD2 = cpdk.a.d();
                ekrwVarD2.X(eksq.a, "Bugle");
                ((ekrd) ((ekrd) ekrwVarD2).h("com/google/android/apps/messaging/shared/ui/reprompting/UpsellLogic", "decideGoogleTosPrompt", 130, "UpsellLogic.java")).q("ToS prompting is disabled.");
                eijuVarE = eijx.e(Optional.empty());
            } else if (cpdkVar.d()) {
                ekrg ekrgVar = cpdk.a;
                ekrw ekrwVarD3 = ekrgVar.d();
                ekrz ekrzVar = eksq.a;
                ekrwVarD3.X(ekrzVar, "Bugle");
                ((ekrd) ((ekrd) ekrwVarD3).h("com/google/android/apps/messaging/shared/ui/reprompting/UpsellLogic", "isLegalFyiFlowRequested", 182, "UpsellLogic.java")).q("Using enableLegalFyiFlow flag from phenotype instead.");
                if (dfpi.G() && cpdkVar.b.q("should_show_rcs_default_on_prompt", false)) {
                    ekrw ekrwVarD4 = ekrgVar.d();
                    ekrwVarD4.X(ekrzVar, "Bugle");
                    ((ekrd) ((ekrd) ekrwVarD4).h("com/google/android/apps/messaging/shared/ui/reprompting/UpsellLogic", "decideGoogleTosPrompt", 140, "UpsellLogic.java")).q("Do not show Google Tos as Legal FYI is requested");
                    eijuVarE = eijx.e(Optional.empty());
                } else if (cpdkVar.b()) {
                    ekrw ekrwVarD5 = ekrgVar.d();
                    ekrwVarD5.X(ekrzVar, "Bugle");
                    ((ekrd) ((ekrd) ekrwVarD5).h("com/google/android/apps/messaging/shared/ui/reprompting/UpsellLogic", "decideGoogleTosPrompt", 145, "UpsellLogic.java")).q("Show Google Tos as Constellation requested");
                    eijuVarE = eijx.e(Optional.of(cjqt.BOTTOMSHEET));
                } else if (cpdkVar.a()) {
                    ekrw ekrwVarD6 = ekrgVar.d();
                    ekrwVarD6.X(ekrzVar, "Bugle");
                    ((ekrd) ((ekrd) ekrwVarD6).h("com/google/android/apps/messaging/shared/ui/reprompting/UpsellLogic", "decideGoogleTosPrompt", 150, "UpsellLogic.java")).q("Don't Show Google Tos as user already accepted");
                    eijuVarE = eijx.e(Optional.empty());
                } else {
                    eijuVarE = eijx.e(Optional.of(cjqt.BOTTOMSHEET));
                }
            } else {
                ekrw ekrwVarD7 = cpdk.a.d();
                ekrwVarD7.X(eksq.a, "Bugle");
                ((ekrd) ((ekrd) ekrwVarD7).h("com/google/android/apps/messaging/shared/ui/reprompting/UpsellLogic", "decideGoogleTosPrompt", 135, "UpsellLogic.java")).q("Not ready to show Google Tos");
                eijuVarE = eijx.e(Optional.empty());
            }
            eijuVarH = eijuVarE.h(new ejvr() { // from class: cpdi
                @Override // defpackage.ejvr
                public final Object apply(Object obj) {
                    return Boolean.valueOf(((Optional) obj).isPresent());
                }
            }, cpdkVar.c);
        }
        final eiju eijuVar = eijuVarH;
        final eiju eijuVarE2 = e();
        final cpdm cpdmVar = this.g;
        cpdmVar.getClass();
        eiju eijuVarG = eijx.g(new Callable() { // from class: cjrc
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return cpdmVar.b();
            }
        }, this.d);
        ejvr ejvrVar = new ejvr() { // from class: cjrd
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                Optional optional = (Optional) obj;
                cqce cqceVar = cjrp.a;
                return optional.isPresent() ? Optional.of(Long.valueOf(((Date) optional.get()).getTime())) : Optional.empty();
            }
        };
        eosc eoscVar = this.e;
        final eiju eijuVarH2 = eijuVarG.h(ejvrVar, eoscVar);
        final eiju eijuVarC = this.c.c();
        return eijx.m(eijuVar, eijuVarE2, eijuVarH2, eijuVarC).a(new Callable() { // from class: cjrg
            /* JADX WARN: Code restructure failed: missing block: B:33:0x00e7, code lost:
            
                if (r0 != false) goto L59;
             */
            @Override // java.util.concurrent.Callable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object call() {
                /*
                    Method dump skipped, instructions count: 386
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.cjrg.call():java.lang.Object");
            }
        }, eoscVar);
    }

    public final eiju e() {
        final cpdm cpdmVar = this.g;
        cpdmVar.getClass();
        return eijx.g(new Callable() { // from class: cjrh
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Integer.valueOf(cpdmVar.a());
            }
        }, this.d);
    }
}
