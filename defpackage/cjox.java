package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.time.Duration;
import j$.util.concurrent.ConcurrentHashMap;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cjox implements cjpb, cjpc {
    public final cjol f;
    private final ConcurrentHashMap h = new ConcurrentHashMap();
    private final ConcurrentHashMap i = new ConcurrentHashMap();
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/rcs/performance/PhoneChannelAwaker");
    public static final cczi b = cdag.b("enable_prewarm_on_typing", true);
    public static final cczi c = cdag.b("enable_prewarm_on_send_button_pressed", false);
    private static final cczi g = cdag.a("prewarm_on_typing_max_frequency_ms", 65000);
    static final cczi d = cdag.a("send_button_prewarm_tickle_priority", 5);
    static final cczi e = cdag.a("typing_prewarm_tickle_priority", 10);

    public cjox(cjol cjolVar) {
        this.f = cjolVar;
    }

    public static int e(long j) {
        return j == 10 ? 2 : 1;
    }

    static final boolean g(alqm alqmVar) {
        if (alqmVar.e().isEmpty()) {
            ((ekrd) ((ekrd) a.e()).h("com/google/android/apps/messaging/shared/rcs/performance/PhoneChannelAwaker", "isValidPreWarmDestination", 312, "PhoneChannelAwaker.java")).q("Not prewarming invalid chat endpoint");
            return false;
        }
        if (!alqmVar.A()) {
            return true;
        }
        ((ekrd) ((ekrd) a.e()).h("com/google/android/apps/messaging/shared/rcs/performance/PhoneChannelAwaker", "isValidPreWarmDestination", 317, "PhoneChannelAwaker.java")).q("Not prewarming bot conversation");
        return false;
    }

    @Override // defpackage.cjpb
    public final void a(aoer aoerVar, alqm alqmVar) {
        if (((Boolean) c.e()).booleanValue() && g(alqmVar)) {
            this.f.a(aoerVar).a(alqmVar.o(), e(((Long) d.e()).longValue()));
        }
    }

    @Override // defpackage.cjpb
    public final void b(aoer aoerVar, awjl awjlVar) {
        f(aoerVar, awjlVar, e(((Long) d.e()).longValue()));
    }

    @Override // defpackage.cjpc
    public final void c(final aoer aoerVar, alqm alqmVar) {
        if (((Boolean) b.e()).booleanValue() && g(alqmVar)) {
            final String strO = alqmVar.o();
            ejxr ejxrVarB = ejxx.b(new ejxr() { // from class: cjov
                @Override // defpackage.ejxr
                public final Object get() {
                    this.a.f.a(aoerVar).a(strO, cjox.e(((Long) cjox.e.e()).longValue()));
                    return null;
                }
            }, Duration.ofMillis(((Long) g.e()).longValue()));
            ConcurrentHashMap concurrentHashMap = this.h;
            concurrentHashMap.putIfAbsent(strO, ejxrVarB);
            ((ejxr) concurrentHashMap.get(strO)).get();
        }
    }

    @Override // defpackage.cjpc
    public final void d(final aoer aoerVar, final awjl awjlVar) {
        ejxr ejxrVarB = ejxx.b(new ejxr() { // from class: cjow
            @Override // defpackage.ejxr
            public final Object get() {
                this.a.f(aoerVar, awjlVar, cjox.e(((Long) cjox.e.e()).longValue()));
                return null;
            }
        }, Duration.ofMillis(((Long) g.e()).longValue()));
        ConcurrentHashMap concurrentHashMap = this.i;
        concurrentHashMap.putIfAbsent(awjlVar, ejxrVarB);
        ((ejxr) concurrentHashMap.get(awjlVar)).get();
    }

    public final void f(aoer aoerVar, final awjl awjlVar, final int i) {
        cjok cjokVarA = this.f.a(aoerVar);
        eieu eieuVarK = eiiy.k("ChannelBasedAwakeSender::prewarm");
        try {
            ekrd ekrdVar = (ekrd) cjou.a.h();
            ekrdVar.X(cqnc.y, ((cjou) cjokVarA).d.h());
            ekrdVar.X(cqnc.ag, awjlVar);
            ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/rcs/performance/ChannelBasedAwakeSender", "prewarm", 105, "ChannelBasedAwakeSender.java")).q("Attempting to send prewarm.");
            final cjou cjouVar = (cjou) cjokVarA;
            eiju eijuVarE = ((awjh) ((cjou) cjokVarA).c.b()).b(awjlVar).i(new eooz() { // from class: cjom
                @Override // defpackage.eooz
                public final ListenableFuture a(Object obj) {
                    felm felmVar;
                    awjb awjbVar = (awjb) obj;
                    awja awjaVar = awjbVar.b;
                    boolean z = awjaVar == awja.a || awjaVar == awja.c;
                    awjl awjlVar2 = awjlVar;
                    cjou cjouVar2 = cjouVar;
                    ejwl.r(z, "[destinationToken=%s] maps to a destination with [destinationType=%s]. Only phone numbers and group ids are supported.", awjlVar2, awjaVar);
                    cnlm cnlmVarB = cjouVar2.b();
                    awjbVar.getClass();
                    ezok ezokVar = (ezok) ezol.a.createBuilder();
                    ezokVar.getClass();
                    eymt.b("RCS", ezokVar);
                    eymt.c(awjbVar.c, ezokVar);
                    int iOrdinal = awjaVar.ordinal();
                    if (iOrdinal == 0) {
                        felmVar = felm.PHONE_NUMBER;
                    } else if (iOrdinal == 1) {
                        felmVar = felm.RCS_BOT;
                    } else if (iOrdinal == 2) {
                        felmVar = felm.GROUP_ID;
                    } else {
                        if (iOrdinal != 3) {
                            throw new fctg();
                        }
                        felmVar = felm.EMERGENCY;
                    }
                    int i2 = i;
                    eymt.d(felmVar, ezokVar);
                    return cnlmVarB.a(eymt.a(ezokVar), cjou.c(i2));
                }
            }, ((cjou) cjokVarA).b).e(Throwable.class, new ejvr() { // from class: cjon
                @Override // defpackage.ejvr
                public final Object apply(Object obj) {
                    ((ekrd) ((ekrd) ((ekrd) cjou.a.j()).g((Throwable) obj)).h("com/google/android/apps/messaging/shared/rcs/performance/ChannelBasedAwakeSender", "prewarm", (char) 128, "ChannelBasedAwakeSender.java")).q("Failed to prewarm remote client");
                    return null;
                }
            }, eoqg.a);
            eieuVarK.b(eijuVarE);
            auvh.h(eijuVarE);
            eieuVarK.close();
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
