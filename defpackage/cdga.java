package defpackage;

import android.util.Pair;
import com.google.android.gms.feedback.FileTeleporter;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.function.Function;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cdga extends dcwa {
    private final Map d;
    private final eosc e;
    private final aqvx f;
    private ekgp g;
    private ekgp h;
    public static final cczv a = cdag.f(cdag.b, "feedback_async_timeout_ms", 4750);
    private static final cqce c = cqce.g("Bugle", "BugleFeedbackProductSpecificData");
    public static final ekrg b = ekrg.c("com/google/android/apps/messaging/shared/feedback/psd/BugleFeedbackProductSpecificDataV2");

    public cdga(Map map, eosc eoscVar, aqvx aqvxVar) {
        ekgp ekgpVar = ekoj.a;
        this.g = ekgpVar;
        this.h = ekgpVar;
        this.d = map;
        this.e = eoscVar;
        this.f = aqvxVar;
    }

    @Override // defpackage.dcwa
    public final List a() throws TimeoutException {
        ExecutionException e;
        InterruptedException e2;
        TimeoutException e3;
        final HashMap map = new HashMap(this.d);
        map.putAll(this.h);
        this.h = ekoj.a;
        List arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList((Collection) Collection.EL.stream(map.keySet()).filter(new cdfh()).sorted().collect(Collectors.toCollection(new cdfr())));
        try {
            try {
                final List list = (List) Collection.EL.stream(arrayList2).map(new Function() { // from class: cdfn
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        cczv cczvVar = cdga.a;
                        cdfg cdfgVar = (cdfg) map.get((String) obj);
                        cdfgVar.getClass();
                        return cdfgVar.c();
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }).collect(Collectors.toCollection(new cdfr()));
                ekrw ekrwVarH = b.h();
                ekrwVarH.X(eksq.a, "Bugle");
                ((ekrd) ((ekrd) ekrwVarH).h("com/google/android/apps/messaging/shared/feedback/psd/BugleFeedbackProductSpecificDataV2", "getAsyncFeedbackPsbd", 210, "BugleFeedbackProductSpecificDataV2.java")).r("psbdLength: %s", list.size());
                try {
                    return (List) eijx.j(list).a(new Callable() { // from class: cdfo
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            cczv cczvVar = cdga.a;
                            ArrayList arrayList3 = new ArrayList();
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                arrayList3.addAll((java.util.Collection) eork.q((eiju) it.next()));
                            }
                            return arrayList3;
                        }
                    }, this.e).get(((Long) a.e()).longValue(), TimeUnit.MILLISECONDS);
                } catch (TimeoutException e4) {
                    if (!this.f.a()) {
                        throw e4;
                    }
                    ekrw ekrwVarJ = b.j();
                    ekrwVarJ.X(eksq.a, "Bugle");
                    ((ekrd) ((ekrd) ekrwVarJ).h("com/google/android/apps/messaging/shared/feedback/psd/BugleFeedbackProductSpecificDataV2", "getAsyncFeedbackPsbd", 228, "BugleFeedbackProductSpecificDataV2.java")).q("Encountered a timeout while getting PSBD. Returning partial results.");
                    List list2 = (List) Collection.EL.stream(list).filter(new Predicate() { // from class: cdfp
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
                            cczv cczvVar = cdga.a;
                            return ((eiju) obj).isDone();
                        }
                    }).map(new Function() { // from class: cdfq
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo536andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            eiju eijuVar = (eiju) obj;
                            cczv cczvVar = cdga.a;
                            try {
                                return Optional.of((List) eork.q(eijuVar));
                            } catch (Exception unused) {
                                TimeoutException timeoutException = e4;
                                ekrw ekrwVarJ2 = cdga.b.j();
                                ekrwVarJ2.X(eksq.a, "Bugle");
                                ((ekrd) ((ekrd) ((ekrd) ekrwVarJ2).g(timeoutException)).h("com/google/android/apps/messaging/shared/feedback/psd/BugleFeedbackProductSpecificDataV2", "getAsyncFeedbackPsbd", 239, "BugleFeedbackProductSpecificDataV2.java")).q("Skipping PSD");
                                return Optional.empty();
                            }
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    }).filter(new cdfz()).map(new cdfi()).flatMap(new cdfj()).collect(Collectors.toCollection(new cdfr()));
                    try {
                        list2.add(new FileTeleporter(((String) ekpo.b(Collection.EL.stream(arrayList2), Collection.EL.stream(list), new cdfs()).filter(new Predicate() { // from class: cdfl
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
                                cczv cczvVar = cdga.a;
                                return !((eiju) ((Pair) obj).second).isDone();
                            }
                        }).map(new Function() { // from class: cdfm
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo536andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj) {
                                cczv cczvVar = cdga.a;
                                return (String) ((Pair) obj).first;
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        }).collect(Collectors.joining("\n"))).getBytes(), "PSBD Feedback Timeouts"));
                        return list2;
                    } catch (InterruptedException e5) {
                        e2 = e5;
                        arrayList = list2;
                        c.s("Interrupt while getAsyncFeedbackPsbd()", e2);
                        return arrayList;
                    } catch (ExecutionException e6) {
                        e = e6;
                        arrayList = list2;
                        c.s("Failed to getAsyncFeedbackPsbd()", e);
                        return arrayList;
                    } catch (TimeoutException e7) {
                        e3 = e7;
                        arrayList = list2;
                        c.s("Timeout while getAsyncFeedbackPsbd()", e3);
                        return arrayList;
                    }
                }
            } catch (TimeoutException e8) {
                e3 = e8;
            }
        } catch (InterruptedException e9) {
            e2 = e9;
        } catch (ExecutionException e10) {
            e = e10;
        }
    }

    @Override // defpackage.dcwa
    public final List b() throws TimeoutException {
        final HashMap map = new HashMap(this.d);
        map.putAll(this.g);
        this.g = ekoj.a;
        List arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList(map.keySet());
        final List list = (List) Collection.EL.stream(arrayList2).filter(new cdfh()).sorted().map(new Function() { // from class: cdfv
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                cczv cczvVar = cdga.a;
                cdfg cdfgVar = (cdfg) map.get((String) obj);
                cdfgVar.getClass();
                return cdfgVar.d();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).collect(Collectors.toCollection(new cdfr()));
        try {
            try {
                try {
                    return (List) eijx.j(list).a(new Callable() { // from class: cdfw
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            cczv cczvVar = cdga.a;
                            ArrayList arrayList3 = new ArrayList();
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                try {
                                    for (cdff cdffVar : (List) eork.q((eiju) it.next())) {
                                        arrayList3.add(new Pair(cdffVar.a(), cdffVar.b()));
                                    }
                                } catch (Throwable th) {
                                    ekrw ekrwVarJ = cdga.b.j();
                                    ekrwVarJ.X(eksq.a, "Bugle");
                                    ((ekrd) ((ekrd) ((ekrd) ekrwVarJ).g(th)).h("com/google/android/apps/messaging/shared/feedback/psd/BugleFeedbackProductSpecificDataV2", "getAsyncFeedbackPsd", (char) 134, "BugleFeedbackProductSpecificDataV2.java")).q("Skipping PSD");
                                }
                            }
                            return arrayList3;
                        }
                    }, this.e).get(((Long) a.e()).longValue(), TimeUnit.MILLISECONDS);
                } catch (TimeoutException e) {
                    if (!this.f.a()) {
                        throw e;
                    }
                    ((ekrd) c.k().h("com/google/android/apps/messaging/shared/feedback/psd/BugleFeedbackProductSpecificDataV2", "getAsyncFeedbackPsd", 147, "BugleFeedbackProductSpecificDataV2.java")).q("Encountered a timeout while getting PSD. Returning partial results.");
                    List list2 = (List) Collection.EL.stream(list).filter(new Predicate() { // from class: cdfx
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
                            cczv cczvVar = cdga.a;
                            return ((eiju) obj).isDone();
                        }
                    }).map(new Function() { // from class: cdfy
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo536andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            eiju eijuVar = (eiju) obj;
                            cczv cczvVar = cdga.a;
                            try {
                                return Optional.of((List) eork.q(eijuVar));
                            } catch (Exception e2) {
                                ekrw ekrwVarJ = cdga.b.j();
                                ekrwVarJ.X(eksq.a, "Bugle");
                                ((ekrd) ((ekrd) ((ekrd) ekrwVarJ).g(e2)).h("com/google/android/apps/messaging/shared/feedback/psd/BugleFeedbackProductSpecificDataV2", "getAsyncFeedbackPsd", (char) 157, "BugleFeedbackProductSpecificDataV2.java")).q("Skipping PSD");
                                return Optional.empty();
                            }
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    }).filter(new cdfz()).map(new cdfi()).flatMap(new cdfj()).map(new Function() { // from class: cdfk
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo536andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            cdff cdffVar = (cdff) obj;
                            cczv cczvVar = cdga.a;
                            return new Pair(cdffVar.a(), cdffVar.b());
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    }).collect(Collectors.toCollection(new cdfr()));
                    try {
                        list2.add(new Pair("PSD Feedback Timeouts", (String) ekpo.b(Collection.EL.stream(arrayList2), Collection.EL.stream(list), new cdfs()).filter(new Predicate() { // from class: cdft
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
                                cczv cczvVar = cdga.a;
                                return !((eiju) ((Pair) obj).second).isDone();
                            }
                        }).map(new Function() { // from class: cdfu
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo536andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj) {
                                cczv cczvVar = cdga.a;
                                return (String) ((Pair) obj).first;
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        }).collect(Collectors.joining("\n"))));
                        return list2;
                    } catch (InterruptedException e2) {
                        e = e2;
                        arrayList = list2;
                        c.s("Interrupt while getAsyncFeedbackPsd()", e);
                        return arrayList;
                    } catch (ExecutionException e3) {
                        e = e3;
                        arrayList = list2;
                        c.s("Failed to getAsyncFeedbackPsd()", e);
                        return arrayList;
                    } catch (TimeoutException e4) {
                        e = e4;
                        arrayList = list2;
                        c.s("Timeout while getAsyncFeedbackPsd()", e);
                        return arrayList;
                    }
                }
            } catch (TimeoutException e5) {
                e = e5;
            }
        } catch (InterruptedException e6) {
            e = e6;
        } catch (ExecutionException e7) {
            e = e7;
        }
    }

    public final void c(ekgp ekgpVar) {
        this.g = ekgpVar;
        this.h = ekgpVar;
    }
}
