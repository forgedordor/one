package defpackage;

import j$.util.DesugarArrays;
import j$.util.concurrent.ConcurrentHashMap;
import j$.util.function.Function$CC;
import j$.util.stream.Stream;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cmxn {
    public static final cczi a = cdag.e(cdag.b, "message_in_memory_window_sec", 15);
    public static final ekrg b;
    public static final dzfh c;
    public static final dzfh d;
    public static final dzfh e;
    public static final dzfh f;
    public static final dzfh g;
    public static final ekgb h;
    public static final ekgb i;
    public static final ekgb j;
    public static final ekgb k;
    public static final cczv l;
    public static final cczv m;
    public static final cczv n;
    public static final cczv o;
    public static final cczv p;
    private final ConcurrentHashMap A;
    public final dzuc q;
    public final cogw r;
    public final fcsu s;
    public final fcsu t;
    public final AtomicInteger u = new AtomicInteger(0);
    public long v = 0;
    public final AtomicInteger w = new AtomicInteger();
    public final ekgb x;
    private final eosd y;
    private final fcsu z;

    static {
        cdag.e(cdag.b, "receive_message_timer_removal_delay_sec", 45);
        b = ekrg.c("com/google/android/apps/messaging/shared/stuckmessages/MessageLatencyAnalytics");
        c = new dzfh("MLA::NamedTrace::pressButtonToVisible");
        d = new dzfh("MLA::NamedTrace::pressButtonToVisibleFromDisk");
        e = new dzfh("MLA::NamedTrace::pressButtonToTachygramStartingSend");
        f = new dzfh("MLA::NamedTrace::pressButtonToTachygramFinishedSend");
        g = new dzfh("MLA::NamedTrace::pressButtonToSentVisible");
        ekgb ekgbVarR = ekgb.r(cmxm.SEND_BUTTON_ACCURATE);
        h = ekgbVarR;
        ekfw ekfwVar = new ekfw();
        ekfwVar.j(ekgbVarR);
        ekfwVar.h(cmxm.NOTIFICATION);
        ekgb ekgbVarG = ekfwVar.g();
        i = ekgbVarG;
        ekfw ekfwVar2 = new ekfw();
        ekfwVar2.j(ekgbVarG);
        ekfwVar2.h(cmxm.TACHYGRAM_FINISHED_SENDING);
        j = ekfwVar2.g();
        k = eotp.a("bugle.add_receive_sms_mla_metrics", "bugle") ? ekgb.t(cmxm.TICKLE_ARRIVED, cmxm.TACHYGRAM_MESSAGE_ARRIVED, cmxm.SMS_ARRIVED) : ekgb.s(cmxm.TICKLE_ARRIVED, cmxm.TACHYGRAM_MESSAGE_ARRIVED);
        l = cdag.q(239071186, "enable_prime_metrics_for_message_latency");
        m = cdag.q(239071186, "enable_prime_metrics_for_compose_view_peer");
        n = cdag.q(249281779, "enable_prime_metrics_for_receive_message_latency");
        o = cdag.q(249281779, "enable_tachygram_to_sent_visible_latency");
        p = cdag.q(248087153, "enable_macro_benchmark_named_trace");
    }

    public cmxn(dzuc dzucVar, cogw cogwVar, eosd eosdVar, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3) {
        Stream map = DesugarArrays.stream(cmxm.values()).map(new Function() { // from class: cmxf
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                cczi ccziVar = cmxn.a;
                return new ConcurrentHashMap();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        int i2 = ekgb.d;
        this.x = (ekgb) map.collect(ekcv.a);
        this.A = new ConcurrentHashMap();
        this.q = dzucVar;
        this.r = cogwVar;
        this.y = eosdVar;
        this.z = fcsuVar;
        this.s = fcsuVar2;
        this.t = fcsuVar3;
    }

    public static dzfh a(int i2) {
        switch (i2) {
            case -1:
            case 4:
            case 5:
            case 6:
                return new dzfh("Unknown");
            case 0:
                return new dzfh("Sms");
            case 1:
            case 2:
                return new dzfh("Mms");
            case 3:
                return new dzfh("Rcs");
            default:
                return new dzfh("UnknownDefault");
        }
    }

    private final void m() {
        fcsu fcsuVar = this.s;
        int iIncrementAndGet = this.w.incrementAndGet();
        ((ajfx) fcsuVar.b()).b(c, iIncrementAndGet);
        ((ajfx) fcsuVar.b()).b(d, iIncrementAndGet);
        ((ajfx) fcsuVar.b()).b(e, iIncrementAndGet);
        ((ajfx) fcsuVar.b()).b(f, iIncrementAndGet);
        ((ajfx) fcsuVar.b()).b(g, iIncrementAndGet);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(cmxm cmxmVar, String str, cmxk cmxkVar) {
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.x.get(cmxmVar.ordinal());
        if (concurrentHashMap.mappingCount() > 300) {
            ((ekrd) ((ekrd) b.j()).h("com/google/android/apps/messaging/shared/stuckmessages/MessageLatencyAnalytics", "addTracker", 357, "MessageLatencyAnalytics.java")).q("Exceeded limit of tracked messages");
            concurrentHashMap.clear();
        }
        if (((cmxk) concurrentHashMap.putIfAbsent(str, cmxkVar)) != null) {
            ((ekrd) ((ekrd) b.j()).h("com/google/android/apps/messaging/shared/stuckmessages/MessageLatencyAnalytics", "logDuplicateTimer", 255, "MessageLatencyAnalytics.java")).D("Duplicate trace for startPoint=%s and traceId=%s. Ignoring", new esvh(esvg.NO_USER_DATA, cmxmVar.g), str);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void c(String str, String str2) {
        if (((Boolean) n.e()).booleanValue()) {
            ekgb ekgbVar = this.x;
            int size = ekgbVar.size();
            for (int i2 = 0; i2 < size; i2++) {
                ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) ekgbVar.get(i2);
                if (concurrentHashMap.containsKey(str)) {
                    concurrentHashMap.put(str2, (cmxk) concurrentHashMap.get(str));
                }
            }
        }
    }

    public final void d(cmxm cmxmVar, String str) {
        cmxk cmxkVar = (cmxk) this.A.remove(cmxmVar);
        if (cmxkVar == null) {
            return;
        }
        b(cmxmVar, str, cmxkVar);
    }

    public final void e(final String str, int i2, final ekgb ekgbVar) {
        auvh.e(this.y.schedule(eiid.k(new Runnable() { // from class: cmxg
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.lang.Runnable
            public final void run() {
                int i3 = 0;
                while (true) {
                    ekgb ekgbVar2 = ekgbVar;
                    if (i3 >= ((ekoe) ekgbVar2).c) {
                        return;
                    }
                    String str2 = str;
                    cmxn cmxnVar = this.a;
                    ((ConcurrentHashMap) cmxnVar.x.get(((cmxm) ekgbVar2.get(i3)).ordinal())).remove(str2);
                    i3++;
                }
            }
        }), i2, TimeUnit.SECONDS));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void f(String str, dzfh dzfhVar, feeg feegVar, ekgb ekgbVar) {
        for (int i2 = 0; i2 < ((ekoe) ekgbVar).c; i2++) {
            cmxm cmxmVar = (cmxm) ekgbVar.get(i2);
            dzfh dzfhVarA = dzfh.a(cmxmVar.g, dzfhVar);
            cmxk cmxkVar = (cmxk) ((ConcurrentHashMap) this.x.get(cmxmVar.ordinal())).get(str);
            if (cmxkVar == null) {
                ((ekrd) ((ekrd) b.f()).h("com/google/android/apps/messaging/shared/stuckmessages/MessageLatencyAnalytics", "sendTimerEvent", 945, "MessageLatencyAnalytics.java")).I("Timer is not tracked. traceId=%s, timerName=%s, startPoint=%s", str, dzfhVar, cmxmVar);
            } else if (this.v > cmxkVar.a) {
                ((ekrd) ((ekrd) b.e()).h("com/google/android/apps/messaging/shared/stuckmessages/MessageLatencyAnalytics", "sendTimerEvent", 954, "MessageLatencyAnalytics.java")).D("Conversation opened after timer was started. traceId=%s, timerName=%s", str, dzfhVar);
            } else {
                cmxkVar.b(dzfhVarA, feegVar);
            }
        }
    }

    public final void g(cmxm cmxmVar, String str) {
        if (((Boolean) l.e()).booleanValue()) {
            b(cmxmVar, str, new cmxk(this));
            if (((Boolean) p.e()).booleanValue() && cmxmVar.equals(cmxm.SEND_BUTTON_ACCURATE)) {
                m();
            }
        }
    }

    public final void h(String str) {
        g(cmxm.TACHYGRAM_MESSAGE_ARRIVED, str);
    }

    public final void i(cmxm cmxmVar) {
        if (((Boolean) l.e()).booleanValue()) {
            if (((cmxk) this.A.put(cmxmVar, new cmxk(this))) != null) {
                ((ekrd) ((ekrd) b.j()).h("com/google/android/apps/messaging/shared/stuckmessages/MessageLatencyAnalytics", "startTrackingGlobal", 236, "MessageLatencyAnalytics.java")).t("Previous global tracker for start point was still not consumed. %s", cmxmVar.g);
            }
            if (((Boolean) p.e()).booleanValue() && cmxmVar.equals(cmxm.SEND_BUTTON_ACCURATE)) {
                m();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void j(String str, dzfh dzfhVar, ekgb ekgbVar) {
        for (int i2 = 0; i2 < ((ekoe) ekgbVar).c; i2++) {
            cmxm cmxmVar = (cmxm) ekgbVar.get(i2);
            dzfh dzfhVarA = dzfh.a(cmxmVar.g, dzfhVar);
            cmxk cmxkVar = (cmxk) ((ConcurrentHashMap) this.x.get(cmxmVar.ordinal())).get(str);
            if (cmxkVar == null) {
                ((ekrd) ((ekrd) b.g()).h("com/google/android/apps/messaging/shared/stuckmessages/MessageLatencyAnalytics", "sendTimerEvent", 908, "MessageLatencyAnalytics.java")).I("Timer is not tracked. traceId=%s, timerName=%s, startPoint=%s", str, dzfhVar, cmxmVar);
            } else if (this.v > cmxkVar.a) {
                ((ekrd) ((ekrd) b.g()).h("com/google/android/apps/messaging/shared/stuckmessages/MessageLatencyAnalytics", "sendTimerEvent", 917, "MessageLatencyAnalytics.java")).D("Conversation opened after timer was started. traceId=%s, timerName=%s", str, dzfhVar);
            } else {
                cmxkVar.a(dzfhVarA);
            }
        }
    }

    public final void k(String str, dzfh dzfhVar, cmxm... cmxmVarArr) {
        j(str, dzfhVar, ekgb.p(cmxmVarArr));
    }

    public final void l(String str, ajlt ajltVar, int i2, boolean z, boolean z2) {
        feeg feegVarB = ((ajfr) this.t.b()).b(ajltVar, z, z2);
        dzfh dzfhVar = new dzfh("ToVisible");
        if (feegVarB != null) {
            f(str, dzfhVar, feegVarB, k);
        }
        ekgb ekgbVar = k;
        j(str, dzfhVar, ekgbVar);
        j(str, dzfh.a(dzfhVar, a(i2)), ekgbVar);
    }
}
