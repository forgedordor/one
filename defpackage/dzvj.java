package defpackage;

import android.text.TextUtils;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Collection;
import j$.util.DesugarCollections;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Function;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dzvj extends dzuz implements dzlo, dzut {
    public final dzlm a;
    public final eygg b;
    public final eygg c;
    public final dzvq d;
    public final dzvr e;
    public final AtomicReference f;
    private final eosd g;

    public dzvj(dzln dzlnVar, eosd eosdVar, final eygg eyggVar, eygg eyggVar2, fcsu fcsuVar, dzvq dzvqVar, dzvu dzvuVar) {
        AtomicReference atomicReference = new AtomicReference();
        this.f = atomicReference;
        this.g = eosdVar;
        this.b = eyggVar;
        this.c = eyggVar2;
        this.d = dzvqVar;
        this.a = dzlnVar.a(eosdVar, new eygg() { // from class: dzva
            @Override // defpackage.eygg
            public final Object b() {
                return dzuv.f().c(true).d();
            }
        }, fcsuVar);
        this.e = dzvuVar.a(new fcsu() { // from class: dzvb
            @Override // defpackage.fcsu
            public final Object b() {
                eygg eyggVar3 = eyggVar;
                return Integer.valueOf(((dzus) eyggVar3.b()).c() ? ((dzus) eyggVar3.b()).a() : 10);
            }
        });
        atomicReference.set(dzvqVar.a(1.0f));
    }

    private static ekhx h(fegm fegmVar) {
        return (ekhx) Collection.EL.stream(fegmVar.f).filter(new Predicate() { // from class: dzvg
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
                int iA = fegg.a(((fegh) obj).e);
                return iA != 0 && iA == 3;
            }
        }).map(new Function() { // from class: dzvh
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                fegh feghVar = (fegh) obj;
                return Long.valueOf(feghVar.c == 2 ? ((Long) feghVar.d).longValue() : 0L);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).collect(ekcv.b);
    }

    private static ekhx i(fejw fejwVar) {
        return (ekhx) Collection.EL.stream(fejwVar.d).filter(new Predicate() { // from class: dzve
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
                return (((fejt) obj).b & 2048) != 0;
            }
        }).map(new Function() { // from class: dzvf
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Long.valueOf(((fejt) obj).n);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).collect(ekcv.b);
    }

    private static final boolean j(fejw fejwVar) {
        return fejwVar.d.size() != 0;
    }

    private static final boolean k(fegm fegmVar) {
        return fegmVar.k.size() != 0;
    }

    private final void l(final String str, final Set set, final long j, final dzle dzleVar) {
        eork.n(new eooy() { // from class: dzvi
            @Override // defpackage.eooy
            public final ListenableFuture a() {
                String str2 = str;
                dzle dzleVar2 = dzleVar;
                dzvj dzvjVar = this.a;
                Set set2 = set;
                if (set2.isEmpty()) {
                    ((dzus) dzvjVar.b.b()).f();
                    long jA = dzvjVar.a.a(str2);
                    if (jA == -1) {
                        return eorv.a;
                    }
                    ((dzkw) dzleVar2).d = Long.valueOf(jA);
                } else {
                    dzleVar2.d(true);
                }
                if (!((dzus) dzvjVar.b.b()).c()) {
                    return eorv.a;
                }
                dzvr dzvrVar = dzvjVar.e;
                if (dzvrVar.b()) {
                    return eorv.a;
                }
                long j2 = j;
                dzvrVar.a();
                ekrg ekrgVar = dzfq.a;
                ((ekrd) ((ekrd) ekrgVar.e()).h("com/google/android/libraries/performance/primes/metrics/trace/TraceMetricServiceImpl", "recordTrace", 307, "TraceMetricServiceImpl.java")).A("Recording trace %d: %s", j2, str2);
                Iterator it = set2.iterator();
                while (it.hasNext()) {
                    ((ekrd) ((ekrd) ekrgVar.e()).h("com/google/android/libraries/performance/primes/metrics/trace/TraceMetricServiceImpl", "recordTrace", 309, "TraceMetricServiceImpl.java")).t("Trace may be available in Dapper: http://go/trace/0x%X", (Long) it.next());
                }
                return dzvjVar.a.b(dzleVar2.a());
            }
        }, this.g);
    }

    @Override // defpackage.dzut
    public final ListenableFuture a(String str, String str2) {
        if (true != TextUtils.isEmpty(str2)) {
            str = str2;
        }
        int i = dzvk.a;
        ejwl.l(!TextUtils.isEmpty(str));
        final dzuy dzuyVar = (dzuy) dzvk.c.getAndSet(null);
        if (dzuyVar != null) {
            dzuyVar.b.b = str;
        }
        return dzuyVar == null ? eorv.a : eork.n(new eooy() { // from class: dzvd
            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.eooy
            public final ListenableFuture a() {
                List listUnmodifiableList;
                dzvj dzvjVar = this.a;
                if (!((dzuv) dzvjVar.c.b()).c()) {
                    return eorv.a;
                }
                if (((dzus) dzvjVar.b.b()).c()) {
                    ((ekrd) ((ekrd) dzfq.a.e()).h("com/google/android/libraries/performance/primes/metrics/trace/TraceMetricServiceImpl", "endTracingIfStarted", 162, "TraceMetricServiceImpl.java")).q("Primes Tracing is not supported if TikTok tracing is enabled");
                    return eorv.a;
                }
                dzvr dzvrVar = dzvjVar.e;
                if (dzvrVar.b()) {
                    return eorv.a;
                }
                dzuy dzuyVar2 = dzuyVar;
                dzvrVar.a();
                int i2 = dzvk.a;
                ecem.b();
                if (dzuyVar2.a() == 0) {
                    listUnmodifiableList = null;
                } else {
                    Comparator comparator = new Comparator() { // from class: dzuw
                        @Override // java.util.Comparator
                        public final int compare(Object obj, Object obj2) {
                            return (int) (((dzuo) obj).c - ((dzuo) obj2).c);
                        }
                    };
                    List list = dzuyVar2.d;
                    synchronized (list) {
                        Collections.sort(list, comparator);
                        dzuyVar2.b.b(list);
                    }
                    ArrayList arrayList = new ArrayList(dzuyVar2.c.keySet());
                    Collections.sort(arrayList, comparator);
                    dzuo dzuoVar = dzuyVar2.b;
                    dzuoVar.b(arrayList);
                    dzup dzupVar = new dzup(dzuoVar);
                    ArrayList arrayList2 = new ArrayList();
                    dzupVar.a(dzupVar.a, 0L, arrayList2);
                    if (arrayList2.size() == 1) {
                        ((ekrd) ((ekrd) dzfq.a.e()).h("com/google/android/libraries/performance/primes/metrics/trace/SpanProtoGenerator", "generate", 71, "SpanProtoGenerator.java")).q("No other span except for root span. Dropping trace...");
                        listUnmodifiableList = null;
                    } else {
                        listUnmodifiableList = DesugarCollections.unmodifiableList(arrayList2);
                    }
                }
                if (listUnmodifiableList == null || listUnmodifiableList.isEmpty()) {
                    return eorv.a;
                }
                fefm fefmVar = (fefm) fefo.a.createBuilder();
                long leastSignificantBits = UUID.randomUUID().getLeastSignificantBits();
                fefmVar.copyOnWrite();
                fefo fefoVar = (fefo) fefmVar.instance;
                fefoVar.b = 1 | fefoVar.b;
                fefoVar.c = leastSignificantBits;
                fefmVar.copyOnWrite();
                fefo fefoVar2 = (fefo) fefmVar.instance;
                fefoVar2.a();
                evpz.addAll(listUnmodifiableList, fefoVar2.e);
                fefo fefoVar3 = (fefo) fefmVar.build();
                String str3 = fefoVar3.e.size() > 0 ? ((fefr) fefoVar3.e.get(0)).c : null;
                dzlm dzlmVar = dzvjVar.a;
                long jA = dzlmVar.a(str3);
                if (jA == -1) {
                    return eorv.a;
                }
                feiw feiwVar = (feiw) feix.a.createBuilder();
                feiwVar.copyOnWrite();
                feix feixVar = (feix) feiwVar.instance;
                fefoVar3.getClass();
                feixVar.m = fefoVar3;
                feixVar.b |= 2048;
                feix feixVar2 = (feix) feiwVar.build();
                ((ekrd) ((ekrd) dzfq.a.f()).h("com/google/android/libraries/performance/primes/metrics/trace/TraceMetricServiceImpl", "endTracingIfStarted", 195, "TraceMetricServiceImpl.java")).A("Recording trace %d: %s", fefoVar3.c, str3);
                dzle dzleVarN = dzlf.n();
                dzleVarN.f(feixVar2);
                ((dzkw) dzleVarN).d = Long.valueOf(jA);
                return dzlmVar.b(dzleVarN.a());
            }
        }, this.g);
    }

    @Override // defpackage.dzut
    public final void b() {
        dzuy dzuyVar = (dzuy) dzvk.c.getAndSet(null);
        if (dzuyVar != null) {
            ((ekrd) ((ekrd) dzfq.a.e()).h("com/google/android/libraries/performance/primes/metrics/trace/Tracer", "cancel", 102, "Tracer.java")).t("Cancel trace: %s", dzuyVar.b.b);
        }
    }

    @Override // defpackage.dzut
    public final void c(String str, long j, long j2) {
        dzuy dzuyVar;
        if (TextUtils.isEmpty(str) || j2 <= 0 || (dzuyVar = (dzuy) dzvk.c.get()) == null || dzuyVar.b.c > j) {
            return;
        }
        ((ekrd) ((ekrd) dzfq.a.g()).h("com/google/android/libraries/performance/primes/metrics/trace/TraceData", "sideLoadSpan", 115, "TraceData.java")).I("Sideload span: %s. startMs: %d, durationMs: %d", str, Long.valueOf(j), Long.valueOf(j2));
        dzuo dzuoVar = new dzuo(str, j, j + j2, Thread.currentThread().getId(), 4);
        List list = dzuyVar.d;
        synchronized (list) {
            list.add(dzuoVar);
        }
        dzuyVar.b();
    }

    @Override // defpackage.dzut
    public final boolean d(String str) {
        if (!((dzvp) this.f.get()).a()) {
            return false;
        }
        int i = dzvk.a;
        str.getClass();
        AtomicReference atomicReference = dzvk.c;
        if (atomicReference.get() == null) {
            dzuy dzuyVar = new dzuy(str);
            while (!atomicReference.compareAndSet(null, dzuyVar)) {
                if (atomicReference.get() != null) {
                }
            }
            dzvk.a = 5;
            dzvk.b = 1000;
            return true;
        }
        ((ekrd) ((ekrd) dzfq.a.g()).h("com/google/android/libraries/performance/primes/metrics/trace/Tracer", ConversationSuggestion.SUGGESTION_PROPERTY_CALENDAR_START_TIME, 67, "Tracer.java")).q("Ignore Tracer.start(), current active trace...");
        return false;
    }

    @Override // defpackage.dzuz
    public final void e(fegm fegmVar, fejg fejgVar, feeg feegVar) {
        if (!k(fegmVar)) {
            ((ekrd) ((ekrd) dzfq.a.j()).h("com/google/android/libraries/performance/primes/metrics/trace/TraceMetricServiceImpl", "recordAsFuture", 210, "TraceMetricServiceImpl.java")).q("Invalid traces were logged.");
            ListenableFuture listenableFuture = eorv.a;
            return;
        }
        dzle dzleVarN = dzlf.n();
        feiw feiwVar = (feiw) feix.a.createBuilder();
        feiwVar.copyOnWrite();
        feix feixVar = (feix) feiwVar.instance;
        feixVar.o = fegmVar;
        feixVar.b |= 8192;
        feiwVar.copyOnWrite();
        feix feixVar2 = (feix) feiwVar.instance;
        feixVar2.p = fejgVar;
        feixVar2.b |= 16384;
        dzleVarN.f((feix) feiwVar.build());
        if (feegVar != null) {
            ((dzkw) dzleVarN).b = feegVar;
        }
        l(fegmVar.d, h(fegmVar), fegmVar.c, dzleVarN);
    }

    @Override // defpackage.dzuz
    public final void f(fejw fejwVar, String str, feeg feegVar) {
        if (!j(fejwVar)) {
            ((ekrd) ((ekrd) dzfq.a.j()).h("com/google/android/libraries/performance/primes/metrics/trace/TraceMetricServiceImpl", "recordAsFuture", 227, "TraceMetricServiceImpl.java")).q("Invalid traces were logged.");
            ListenableFuture listenableFuture = eorv.a;
            return;
        }
        dzle dzleVarN = dzlf.n();
        feiw feiwVar = (feiw) feix.a.createBuilder();
        feiwVar.copyOnWrite();
        feix feixVar = (feix) feiwVar.instance;
        feixVar.n = fejwVar;
        feixVar.b |= 4096;
        dzleVarN.f((feix) feiwVar.build());
        if (feegVar != null) {
            ((dzkw) dzleVarN).b = feegVar;
        }
        l(str, i(fejwVar), fejwVar.c, dzleVarN);
    }

    @Override // defpackage.dzuz
    public final void g(fejw fejwVar, fegm fegmVar, fejg fejgVar, feeg feegVar) {
        if (!j(fejwVar) || !k(fegmVar)) {
            ((ekrd) ((ekrd) dzfq.a.j()).h("com/google/android/libraries/performance/primes/metrics/trace/TraceMetricServiceImpl", "recordTraceRecordAndUnifiedTraceAsFuture", 246, "TraceMetricServiceImpl.java")).q("Invalid traces were logged.");
            ListenableFuture listenableFuture = eorv.a;
            return;
        }
        dzle dzleVarN = dzlf.n();
        feiw feiwVar = (feiw) feix.a.createBuilder();
        feiwVar.copyOnWrite();
        feix feixVar = (feix) feiwVar.instance;
        feixVar.o = fegmVar;
        feixVar.b |= 8192;
        feiwVar.copyOnWrite();
        feix feixVar2 = (feix) feiwVar.instance;
        feixVar2.p = fejgVar;
        feixVar2.b |= 16384;
        feiwVar.copyOnWrite();
        feix feixVar3 = (feix) feiwVar.instance;
        feixVar3.n = fejwVar;
        feixVar3.b |= 4096;
        dzleVarN.f((feix) feiwVar.build());
        if (feegVar != null) {
            ((dzkw) dzleVarN).b = feegVar;
        }
        HashSet hashSet = new HashSet();
        hashSet.addAll(h(fegmVar));
        hashSet.addAll(i(fejwVar));
        l(fegmVar.d, hashSet, fegmVar.c, dzleVarN);
    }

    @Override // defpackage.dzlo
    public final void n() {
        this.g.execute(new Runnable() { // from class: dzvc
            @Override // java.lang.Runnable
            public final void run() {
                dzvj dzvjVar = this.a;
                try {
                    AtomicReference atomicReference = dzvjVar.f;
                    dzvq dzvqVar = dzvjVar.d;
                    eygg eyggVar = dzvjVar.c;
                    atomicReference.set(dzvqVar.a(((dzuv) eyggVar.b()).c() ? ((dzuv) eyggVar.b()).d() : 0.0f));
                } catch (Throwable unused) {
                    dzvjVar.f.set(dzvjVar.d.a(0.0f));
                }
            }
        });
    }
}
