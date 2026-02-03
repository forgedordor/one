package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.time.Duration;
import j$.util.Collection;
import j$.util.Comparator;
import j$.util.Objects;
import j$.util.Optional;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.Stream;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Function;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cjtk {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/rcsdata/PhoneNumberInputUIPresenter");
    public static final cqce b = cqce.g("Bugle", "PhoneNumberInputUIPresenter");
    public final egzg c;
    public final egzg d;
    public final egyt e;
    public final cogw f;
    public final cqbm g;
    public final eosc h;
    public final eosc i;
    public final crqv j;
    public final egzh k;
    public final cmlb l;
    public final fcsu m;
    public final fcsu n;
    public final fcsu o;
    private final cjxi q;
    private final eosc r;
    private final AtomicReference s = new AtomicReference(Optional.empty());
    public final AtomicBoolean p = new AtomicBoolean(false);

    public cjtk(cjxi cjxiVar, egzg egzgVar, egzg egzgVar2, egyt egytVar, cogw cogwVar, cqbm cqbmVar, eosc eoscVar, eosc eoscVar2, eosc eoscVar3, crqv crqvVar, egzh egzhVar, cmlb cmlbVar, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3) {
        this.q = cjxiVar;
        this.c = egzgVar;
        this.d = egzgVar2;
        this.e = egytVar;
        this.f = cogwVar;
        this.g = cqbmVar;
        this.r = eoscVar;
        this.h = eoscVar2;
        this.i = eoscVar3;
        this.j = crqvVar;
        this.k = egzhVar;
        this.l = cmlbVar;
        this.m = fcsuVar;
        this.n = fcsuVar2;
        this.o = fcsuVar3;
    }

    public static int a(final ekgb ekgbVar, final cjsa cjsaVar) {
        int iA = eonc.a(c(ekgbVar, new Predicate() { // from class: cjsn
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
                int iB;
                cjsb cjsbVar = (cjsb) obj;
                long jLongValue = ((Long) cjtk.j(ekgbVar).orElse(0L)).longValue();
                int iB2 = cjrz.b(cjsbVar.c);
                if (iB2 == 0 || iB2 != 3) {
                    return false;
                }
                cjsa cjsaVarB = cjsa.b(cjsbVar.h);
                if (cjsaVarB == null) {
                    cjsaVarB = cjsa.UNRECOGNIZED;
                }
                if (!cjsaVar.equals(cjsaVarB) || (iB = cjrx.b(cjsbVar.d)) == 0 || iB != 4) {
                    return false;
                }
                evvp evvpVar = cjsbVar.e;
                if (evvpVar == null) {
                    evvpVar = evvp.a;
                }
                return evxc.a(evvpVar) > jLongValue;
            }
        }));
        b.m(String.format("countImpressions: Counted %s impressions of %s UiVariant.", String.valueOf(iA), cjsaVar));
        return iA;
    }

    public static int b(ekgb ekgbVar) {
        int iA = eonc.a(c(ekgbVar, new cjte()));
        b.m(String.format("countRepromptNumber: Counted %s already completed PhoneNumberInput reprompts.", String.valueOf(iA)));
        return iA;
    }

    public static long c(ekgb ekgbVar, Predicate predicate) {
        return Collection.EL.stream(ekgbVar).filter(predicate).count();
    }

    public static Optional g(ekgb ekgbVar, Predicate predicate) {
        return Collection.EL.stream(ekgbVar).filter(predicate).max(Comparator.CC.comparing(new Function() { // from class: cjsx
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                evvp evvpVar = ((cjsb) obj).e;
                return evvpVar == null ? evvp.a : evvpVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }, new java.util.Comparator() { // from class: cjsy
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                evvp evvpVar = evxc.a;
                return evxb.a((evvp) obj, (evvp) obj2);
            }
        }));
    }

    public static Optional i(ekgb ekgbVar, Predicate predicate) {
        return g(ekgbVar, predicate).map(new Function() { // from class: cjse
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                evvp evvpVar = ((cjsb) obj).e;
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

    public static Optional j(ekgb ekgbVar) {
        return i(ekgbVar, new cjte());
    }

    public final eiju d(final String str) {
        return this.q.d().h(new ejvr() { // from class: cjwb
            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                String str2 = str;
                cjui cjuiVar = cjui.a;
                str2.getClass();
                evub evubVar = ((cjuu) obj).g;
                if (evubVar.containsKey(str2)) {
                    cjuiVar = (cjui) evubVar.get(str2);
                }
                return ekgb.n(cjuiVar.b);
            }
        }, eoqg.a);
    }

    public final eiju e() {
        return this.l.c().i(new eooz() { // from class: cjsr
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                Stream map = Collection.EL.stream((Set) obj).map(new Function() { // from class: cjta
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        return dggo.a((dggn) obj2).a;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                final cjtk cjtkVar = this.a;
                Stream map2 = map.map(new Function() { // from class: cjtb
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        cjtk cjtkVar2 = cjtkVar;
                        final String str = (String) obj2;
                        return cjtkVar2.f(str).h(new ejvr() { // from class: cjso
                            @Override // defpackage.ejvr
                            public final Object apply(Object obj3) {
                                final String str2 = str;
                                return ((Optional) obj3).map(new Function() { // from class: cjtf
                                    @Override // java.util.function.Function
                                    /* renamed from: andThen */
                                    public final /* synthetic */ Function mo536andThen(Function function) {
                                        return Function$CC.$default$andThen(this, function);
                                    }

                                    @Override // java.util.function.Function
                                    public final Object apply(Object obj4) {
                                        return new cjql(str2, (cjsa) obj4);
                                    }

                                    public final /* synthetic */ Function compose(Function function) {
                                        return Function$CC.$default$compose(this, function);
                                    }
                                });
                            }
                        }, cjtkVar2.i);
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                int i = ekgb.d;
                return eijx.i((ekgb) map2.collect(ekcv.a)).h(new ejvr() { // from class: cjtc
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj2) {
                        Stream streamFilter = Collection.EL.stream((List) obj2).filter(new Predicate() { // from class: cjss
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
                                return Objects.nonNull((Optional) obj3);
                            }
                        });
                        int i2 = ekgb.d;
                        return Collection.EL.stream((ekgb) streamFilter.collect(ekcv.a)).filter(new Predicate() { // from class: cjst
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
                                return ((Optional) obj3).isPresent();
                            }
                        }).map(new Function() { // from class: cjsu
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo536andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj3) {
                                return (cjtj) ((Optional) obj3).get();
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        }).findFirst();
                    }
                }, cjtkVar.i);
            }
        }, this.h);
    }

    public final eiju f(final String str) {
        return !this.p.get() ? eijx.e(Optional.empty()) : eiju.g(this.h.submit(eiid.l(new Callable() { // from class: cjsg
            @Override // java.util.concurrent.Callable
            public final Object call() {
                cjtk cjtkVar = this.a;
                dgid dgidVar = new dgid(((chza) cjtkVar.g.a()).v(new dggp(str)));
                boolean z = true;
                if (!dgidVar.a.equals(enwr.CARRIER_SETUP_PENDING) && (!((arui) cjtkVar.o.b()).a() || !dgidVar.b())) {
                    z = false;
                }
                return Boolean.valueOf(z);
            }
        }))).i(new eooz() { // from class: cjsk
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                if (!((Boolean) obj).booleanValue()) {
                    ((ekrd) ((ekrd) cjtk.a.e()).h("com/google/android/apps/messaging/shared/rcsdata/PhoneNumberInputUIPresenter", "shouldPromptPhoneNumberInputUIFuture", 432, "PhoneNumberInputUIPresenter.java")).q("Not prompting PhoneNumberInputUI: RcsAvailability is not CARRIER_SETUP_PENDING");
                    return eijx.e(false);
                }
                final String str2 = str;
                final cjtk cjtkVar = this.a;
                return cjtkVar.d(str2).h(new ejvr() { // from class: cjsf
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj2) {
                        cjtk cjtkVar2 = cjtkVar;
                        ekgb ekgbVar = (ekgb) obj2;
                        boolean z = false;
                        if (cjtkVar2.j.q("is_manual_msisdn_shown_or_dismissed", false) && cjtk.b(ekgbVar) == 0) {
                            cjtk.b.m("Not prompting PhoneNumberInputUI: User has already seen the legacy UI.");
                        } else if (ekgbVar.isEmpty()) {
                            cjtk.b.m(String.format("shouldPromptPhoneNumberInputUI: Returning defaultValue of %b, because there are no PhoneNumberInputUIEvents", false));
                        } else {
                            Optional optionalJ = cjtk.j(ekgbVar);
                            Optional optionalI = cjtk.i(ekgbVar, new Predicate() { // from class: cjsv
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
                                    int iB;
                                    cjsb cjsbVar = (cjsb) obj3;
                                    int iB2 = cjrz.b(cjsbVar.c);
                                    return iB2 != 0 && iB2 == 3 && (iB = cjrx.b(cjsbVar.d)) != 0 && iB == 3;
                                }
                            });
                            if (optionalI.isEmpty()) {
                                cjtk.b.m("Not prompting PhoneNumberInputUI: PE has never requested it.");
                            } else if (optionalJ.isPresent() && ((Long) optionalJ.get()).longValue() > ((Long) optionalI.get()).longValue()) {
                                cjtk.b.m("Not prompting PhoneNumberInputUI: Already prompted for most recent request from PE.");
                            } else if (optionalJ.isPresent() && cjtkVar2.f.f().toEpochMilli() - ((Long) optionalJ.get()).longValue() <= Duration.ofSeconds(((Long) dfpi.t().a.J.a()).longValue()).toMillis()) {
                                cjtk.b.m("Not prompting PhoneNumberInputUI: Not enough duration since last prompt.");
                            } else if (cjtk.c(ekgbVar, new cjte()) >= ((cebq) cjtkVar2.n.b()).c(str2).z) {
                                cjtk.b.m("Not prompting PhoneNumberInputUI: Max number of remprompts.");
                            } else if (!"phone_number_ui_variant_promo_banner".equals(dfpi.w()) || dfpi.c() <= 0 || cjtk.a(ekgbVar, cjsa.PROMO_BANNER) < dfpi.c()) {
                                cjtk.b.m("Prompting PhoneNumberInputUI");
                                z = true;
                            } else {
                                cjtk.b.m("Not prompting PhoneNumberInputUI: Max number of banner impressions.");
                            }
                        }
                        return Boolean.valueOf(z);
                    }
                }, eoqg.a);
            }
        }, this.r).i(new eooz() { // from class: cjth
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                if (!((Boolean) obj).booleanValue()) {
                    return eijx.e(Optional.empty());
                }
                String str2 = str;
                cjtk cjtkVar = this.a;
                return cjtkVar.d(str2).h(new ejvr() { // from class: cjsq
                    /* JADX WARN: Code restructure failed: missing block: B:37:0x009f, code lost:
                    
                        if (r6 == 10) goto L41;
                     */
                    /* JADX WARN: Removed duplicated region for block: B:18:0x003a  */
                    @Override // defpackage.ejvr
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final java.lang.Object apply(java.lang.Object r6) {
                        /*
                            r5 = this;
                            ekgb r6 = (defpackage.ekgb) r6
                            java.lang.String r0 = defpackage.dfpi.w()
                            int r1 = r0.hashCode()
                            r2 = -1957840740(0xffffffff8b4db89c, float:-3.9620449E-32)
                            r3 = 2
                            r4 = 1
                            if (r1 == r2) goto L30
                            r2 = -694512988(0xffffffffd69a92a4, float:-8.4977304E13)
                            if (r1 == r2) goto L26
                            r2 = 755425503(0x2d06e0df, float:7.6669495E-12)
                            if (r1 == r2) goto L1c
                            goto L3a
                        L1c:
                            java.lang.String r1 = "phone_number_ui_variant_input_bottomsheet"
                            boolean r0 = r0.equals(r1)
                            if (r0 == 0) goto L3a
                            r0 = r4
                            goto L3b
                        L26:
                            java.lang.String r1 = "phone_number_ui_variant_promo_bottomsheet"
                            boolean r0 = r0.equals(r1)
                            if (r0 == 0) goto L3a
                            r0 = 0
                            goto L3b
                        L30:
                            java.lang.String r1 = "phone_number_ui_variant_promo_banner"
                            boolean r0 = r0.equals(r1)
                            if (r0 == 0) goto L3a
                            r0 = r3
                            goto L3b
                        L3a:
                            r0 = -1
                        L3b:
                            if (r0 == 0) goto Lca
                            if (r0 == r4) goto Lbc
                            if (r0 == r3) goto L4f
                            cqce r6 = defpackage.cjtk.b
                            java.lang.String r0 = "Decided input fullscreen from experiment configuration or default."
                            r6.m(r0)
                            cjsa r6 = defpackage.cjsa.INPUT_FULLSCREEN
                            j$.util.Optional r6 = j$.util.Optional.of(r6)
                            return r6
                        L4f:
                            int r0 = defpackage.cjtk.b(r6)
                            dfpi r1 = defpackage.dfpi.t()
                            dfph r1 = r1.a
                            dfoa r1 = r1.aj
                            java.lang.Object r1 = r1.a()
                            java.lang.Integer r1 = (java.lang.Integer) r1
                            int r1 = r1.intValue()
                            if (r0 < r1) goto Lae
                            cjsa r0 = defpackage.cjsa.PROMO_BANNER
                            cjsh r1 = new cjsh
                            r1.<init>()
                            j$.util.Optional r6 = defpackage.cjtk.g(r6, r1)
                            boolean r1 = r6.isEmpty()
                            if (r1 == 0) goto L79
                            goto La2
                        L79:
                            java.lang.Object r1 = r6.get()
                            cjsb r1 = (defpackage.cjsb) r1
                            int r1 = r1.h
                            cjsa r1 = defpackage.cjsa.b(r1)
                            if (r1 != 0) goto L89
                            cjsa r1 = defpackage.cjsa.UNRECOGNIZED
                        L89:
                            boolean r1 = r0.equals(r1)
                            if (r1 == 0) goto La2
                            java.lang.Object r6 = r6.get()
                            cjsb r6 = (defpackage.cjsb) r6
                            int r6 = r6.d
                            int r6 = defpackage.cjrx.b(r6)
                            if (r6 == 0) goto La2
                            r1 = 10
                            if (r6 != r1) goto La2
                            goto Lae
                        La2:
                            cqce r6 = defpackage.cjtk.b
                            java.lang.String r1 = "Decided promo banner from experiment configuration."
                            r6.m(r1)
                            j$.util.Optional r6 = j$.util.Optional.of(r0)
                            return r6
                        Lae:
                            cqce r6 = defpackage.cjtk.b
                            java.lang.String r0 = "Decided input popup because has not reached max, or user accepted promo."
                            r6.m(r0)
                            cjsa r6 = defpackage.cjsa.INPUT_BOTTOMSHEET
                            j$.util.Optional r6 = j$.util.Optional.of(r6)
                            return r6
                        Lbc:
                            cqce r6 = defpackage.cjtk.b
                            java.lang.String r0 = "Decided input popup from experiment configuration."
                            r6.m(r0)
                            cjsa r6 = defpackage.cjsa.INPUT_BOTTOMSHEET
                            j$.util.Optional r6 = j$.util.Optional.of(r6)
                            return r6
                        Lca:
                            int r6 = defpackage.cjtk.b(r6)
                            if (r6 != 0) goto Lde
                            cqce r6 = defpackage.cjtk.b
                            java.lang.String r0 = "Decided input popup because initial prompt."
                            r6.m(r0)
                            cjsa r6 = defpackage.cjsa.INPUT_BOTTOMSHEET
                            j$.util.Optional r6 = j$.util.Optional.of(r6)
                            return r6
                        Lde:
                            cqce r6 = defpackage.cjtk.b
                            java.lang.String r0 = "Decided promo popup from experiment configuration."
                            r6.m(r0)
                            cjsa r6 = defpackage.cjsa.PROMO_BOTTOMSHEET
                            j$.util.Optional r6 = j$.util.Optional.of(r6)
                            return r6
                        */
                        throw new UnsupportedOperationException("Method not decompiled: defpackage.cjsq.apply(java.lang.Object):java.lang.Object");
                    }
                }, cjtkVar.i);
            }
        }, this.i);
    }

    public final Optional h() {
        return (Optional) this.s.get();
    }

    public final void k() {
        this.s.set(Optional.empty());
    }

    public final void l(String str) {
        this.s.set(Optional.of(str));
    }
}
