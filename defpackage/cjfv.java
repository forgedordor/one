package defpackage;

import com.google.android.rcs.client.messaging.GetMessagesRequest;
import com.google.android.rcs.client.messaging.GetMessagesResponse;
import com.google.android.rcs.client.messaging.MessagingResult;
import com.google.android.rcs.client.messaging.RcsMessagingService;
import com.google.android.rcs.client.messaging.data.MessageNotification;
import com.google.common.util.concurrent.ListenableFuture;
import j$.time.Duration;
import j$.time.Instant;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeoutException;
import java.util.function.BiFunction;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cjfv extends cayv {
    static final GetMessagesRequest c;
    public final eosc d;
    public final eosc e;
    public final cjcb f;
    public final cjae g;
    public final cjfz h;
    public final cjbf i;
    public final cjfy j;
    public final cogw k;
    public final fcsu l;
    private final eosc o;
    private final crru p;
    private final BiFunction q;
    private final aika r;
    private static final cczi m = cdag.e(cdag.b, "rcs_engine_get_single_message_max_retry_count", 5);
    private static final cczi n = cdag.e(cdag.b, "rcs_engine_get_single_message_retry_delay_seconds", 2);
    public static final cqce a = cqce.g("BugleRcs", "GetMessagesMethod");
    public static final ekrg b = ekrg.c("com/google/android/apps/messaging/shared/rcs/messaging/handler/GetSingleMessageHandler");

    static {
        efdv efdvVarC = GetMessagesRequest.c();
        efdvVarC.b(1);
        c = efdvVarC.a();
    }

    public cjfv(cjcb cjcbVar, crru crruVar, BiFunction biFunction, cjae cjaeVar, cjfz cjfzVar, eosc eoscVar, eosc eoscVar2, eosc eoscVar3, cjbf cjbfVar, cjfy cjfyVar, aika aikaVar, cogw cogwVar, fcsu fcsuVar) {
        this.d = eoscVar;
        this.o = eoscVar2;
        this.f = cjcbVar;
        this.e = eoscVar3;
        this.p = crruVar;
        this.q = biFunction;
        this.g = cjaeVar;
        this.h = cjfzVar;
        this.i = cjbfVar;
        this.j = cjfyVar;
        this.r = aikaVar;
        this.k = cogwVar;
        this.l = fcsuVar;
    }

    @Override // defpackage.cayv, defpackage.cazg
    public final caya a() {
        caxz caxzVarL = caya.l();
        caxzVarL.c(((Integer) m.e()).intValue());
        caxzVarL.g(Duration.ofSeconds(((Integer) n.e()).intValue()).toMillis());
        caxzVarL.f(pza.a);
        return caxzVarL.a();
    }

    @Override // defpackage.cazg
    public final eieu b() {
        return eiiy.k("GetSingleMessageHandler");
    }

    @Override // defpackage.cazg
    public final evuo d() {
        return cjgb.a.getParserForType();
    }

    @Override // defpackage.cayv
    protected final /* bridge */ /* synthetic */ eiju j(cayy cayyVar, evuh evuhVar) {
        final cjgb cjgbVar = (cjgb) evuhVar;
        if (((Boolean) ((cczi) cjbf.e.get()).e()).booleanValue()) {
            cjbf cjbfVar = this.i;
            auib auibVar = cjgbVar.e;
            if (auibVar == null) {
                auibVar = auib.a;
            }
            cjbfVar.c(auibVar, basd.a, 4, 19);
        }
        final Instant instantOfEpochMilli = Instant.ofEpochMilli(this.k.a());
        eiju eijuVarA = this.p.a(this.q, RcsMessagingService.class);
        eooz eoozVar = new eooz() { // from class: cjfo
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                TimeoutException timeoutException = (TimeoutException) obj;
                if (dfog.v()) {
                    this.a.g.b.c("Bugle.MessagingService.GetMessages.Binder.OnDemand.Connect.Timeout.Count");
                }
                return eijx.d(timeoutException);
            }
        };
        eosc eoscVar = this.e;
        return eijuVarA.f(TimeoutException.class, eoozVar, eoscVar).h(new ejvr() { // from class: cjfp
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                cjfv cjfvVar = this.a;
                RcsMessagingService rcsMessagingService = (RcsMessagingService) obj;
                if (dfog.v()) {
                    Instant instant = instantOfEpochMilli;
                    cjae cjaeVar = cjfvVar.g;
                    cjaeVar.b.g("Bugle.MessagingService.GetMessages.Binder.OnDemand.Connect.Latency", Duration.between(instant, Instant.ofEpochMilli(cjfvVar.k.a())).toMillis());
                }
                if (((Boolean) ((cczi) cjbf.e.get()).e()).booleanValue()) {
                    cjgb cjgbVar2 = cjgbVar;
                    cjbf cjbfVar2 = cjfvVar.i;
                    auib auibVar2 = cjgbVar2.e;
                    if (auibVar2 == null) {
                        auibVar2 = auib.a;
                    }
                    cjbfVar2.c(auibVar2, basd.a, 9, 19);
                }
                return rcsMessagingService.getMessages(cjfv.c);
            }
        }, this.o).i(new eooz() { // from class: cjfq
            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                eiju eijuVarE;
                GetMessagesResponse getMessagesResponse = (GetMessagesResponse) obj;
                if (getMessagesResponse == null) {
                    cjfv.a.r("Null response from getMessages. RCS Engine might not be ready");
                    return eijx.e(cbcw.m());
                }
                final cjfv cjfvVar = this.a;
                if (MessagingResult.d.equals(getMessagesResponse.a())) {
                    ekgb ekgbVarB = getMessagesResponse.b();
                    final cjae cjaeVar = cjfvVar.g;
                    cjaeVar.b(ekgbVarB.size());
                    if (ekgbVarB.isEmpty()) {
                        cqbd cqbdVarE = cjfv.a.e();
                        cqbdVarE.I("Fetching incoming RCS messages successful but no messages returned from GetSingleMessageHandler");
                        cqbdVarE.r();
                        eijuVarE = eijx.e(Optional.empty());
                    } else {
                        if (ekgbVarB.size() > 1) {
                            throw new IllegalStateException("Unexpected number of messages: " + ekgbVarB.size());
                        }
                        MessageNotification messageNotification = (MessageNotification) ekgbVarB.get(0);
                        if (dfog.v()) {
                            Optional optionalD = messageNotification.d();
                            cjaeVar.getClass();
                            optionalD.ifPresent(new Consumer() { // from class: cjfj
                                @Override // java.util.function.Consumer
                                /* renamed from: accept */
                                public final void z(Object obj2) {
                                    cjae cjaeVar2 = cjaeVar;
                                    Duration durationBetween = Duration.between((Instant) obj2, Instant.ofEpochMilli(cjaeVar2.c.a()));
                                    if (Duration.ZERO.compareTo(durationBetween) > 0) {
                                        cjae.a.m("Skipping UMA histogram update for invalid incoming message queuing duration");
                                    } else {
                                        cjaeVar2.b.g("Bugle.MessagingService.GetMessages.Queuing.Latency", durationBetween.toMillis());
                                    }
                                }

                                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                    return Consumer$CC.$default$andThen(this, consumer);
                                }
                            });
                        }
                        final basd basdVarA = basd.a(messageNotification.b().h());
                        eiju eijuVarA2 = cjfvVar.f.a(messageNotification);
                        ejvr ejvrVar = new ejvr() { // from class: cjfk
                            @Override // defpackage.ejvr
                            public final Object apply(Object obj2) {
                                return Optional.of((aufh) obj2);
                            }
                        };
                        eosc eoscVar2 = cjfvVar.e;
                        eijuVarE = eijuVarA2.h(ejvrVar, eoscVar2).e(IllegalArgumentException.class, new ejvr() { // from class: cjfl
                            @Override // defpackage.ejvr
                            public final Object apply(Object obj2) {
                                cqbd cqbdVarE2 = cjfv.a.e();
                                cqbdVarE2.I("Ignoring invalid incoming RCS message");
                                cqbdVarE2.h(basdVarA);
                                cqbdVarE2.s((IllegalArgumentException) obj2);
                                return Optional.empty();
                            }
                        }, eoscVar2);
                    }
                } else {
                    cqbd cqbdVarE2 = cjfv.a.e();
                    cqbdVarE2.I("Fetching incoming RCS messages failed");
                    cqbdVarE2.y("errorCode", getMessagesResponse.a().b());
                    cqbdVarE2.r();
                    eijuVarE = eijx.e(Optional.empty());
                }
                return eijuVarE.i(new eooz() { // from class: cjfh
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj2) {
                        cbog cbogVarK;
                        Optional optional = (Optional) obj2;
                        if (optional.isEmpty()) {
                            return eijx.e(cbcw.k());
                        }
                        final cjfv cjfvVar2 = cjfvVar;
                        final aufh aufhVar = (aufh) optional.get();
                        final basd basdVarA2 = basd.a(aufhVar.j);
                        if (((Boolean) ((cczi) cjbf.f.get()).e()).booleanValue()) {
                            cjfvVar2.i.b(basdVarA2, 4, 20);
                        }
                        cjfy cjfyVar = cjfvVar2.j;
                        aubq aubqVar = aufhVar.f;
                        if (aubqVar == null) {
                            aubqVar = aubq.a;
                        }
                        aubp aubpVarB = aubp.b(aubqVar.c);
                        if (aubpVarB == null) {
                            aubpVarB = aubp.UNKNOWN_TYPE;
                        }
                        aubp aubpVar = aubp.GROUP;
                        if (aubpVarB.equals(aubpVar)) {
                            cbogVarK = cjfvVar2.k(aufhVar.k);
                        } else {
                            aubq aubqVar2 = aufhVar.f;
                            if (aubqVar2 == null) {
                                aubqVar2 = aubq.a;
                            }
                            cbogVarK = cjfvVar2.k(asrd.a(aubqVar2));
                        }
                        final eiju eijuVarB = ((cazj) cjfyVar.a.b()).b(cbcu.g("post_incoming_message_to_chat_api", aufhVar, cbogVarK));
                        aubq aubqVar3 = aufhVar.f;
                        if (aubqVar3 == null) {
                            aubqVar3 = aubq.a;
                        }
                        aubp aubpVarB2 = aubp.b(aubqVar3.c);
                        if (aubpVarB2 == null) {
                            aubpVarB2 = aubp.UNKNOWN_TYPE;
                        }
                        final eiju eijuVarE2 = !aubpVarB2.equals(aubpVar) ? eijx.e(false) : eijx.g(new Callable() { // from class: cjfi
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                return Boolean.valueOf(!((bakt) cjfvVar2.l.b()).af(aufhVar.k));
                            }
                        }, cjfvVar2.d);
                        eijw eijwVarK = eijx.k(eijuVarB, eijuVarE2);
                        eooy eooyVar = new eooy() { // from class: cjfu
                            @Override // defpackage.eooy
                            public final ListenableFuture a() {
                                cqce cqceVar = cjfv.a;
                                cazi caziVar = (cazi) eork.q(eijuVarB);
                                if (!((Boolean) eork.q(eijuVarE2)).booleanValue()) {
                                    return caziVar.a().h(new ejvr() { // from class: cjft
                                        @Override // defpackage.ejvr
                                        public final Object apply(Object obj3) {
                                            cqce cqceVar2 = cjfv.a;
                                            return ((cbcw) obj3).e() ? cbcw.i() : cbcw.k();
                                        }
                                    }, eoqg.a);
                                }
                                aufh aufhVar2 = aufhVar;
                                ekrd ekrdVar = (ekrd) cjfv.b.j();
                                ekrdVar.X(cqnc.e, aufhVar2.j);
                                ekrdVar.X(cqnc.s, barn.b(aufhVar2.k));
                                ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/rcs/messaging/handler/GetSingleMessageHandler", "enqueueAndWaitForResultIfGroupConversationExists", 351, "GetSingleMessageHandler.java")).q("Group conversation missing, not waiting for message processing");
                                return caziVar.b().h(new ejvr() { // from class: cjfs
                                    @Override // defpackage.ejvr
                                    public final Object apply(Object obj3) {
                                        cqce cqceVar2 = cjfv.a;
                                        return cbcw.i();
                                    }
                                }, eoqg.a);
                            }
                        };
                        eosc eoscVar3 = cjfvVar2.e;
                        return eijwVarK.b(eooyVar, eoscVar3).h(new ejvr() { // from class: cjfg
                            @Override // defpackage.ejvr
                            public final Object apply(Object obj3) {
                                cbcw cbcwVar = (cbcw) obj3;
                                if (((Boolean) ((cczi) cjbf.f.get()).e()).booleanValue()) {
                                    cjfvVar2.i.b(basdVarA2, 5, 20);
                                }
                                return cbcwVar;
                            }
                        }, eoscVar3);
                    }
                }, cjfvVar.e);
            }
        }, this.d).h(new ejvr() { // from class: cjfr
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                cbcw cbcwVar = (cbcw) obj;
                if (cbcwVar.e()) {
                    cjgb cjgbVar2 = cjgbVar;
                    if (cjgbVar2.d) {
                        cjfv cjfvVar = this.a;
                        caxr caxrVar = new caxr();
                        caxrVar.b = "perform_catch_up_work_item_dedup_tag";
                        cjfvVar.h.a(cjgbVar2, caxrVar.a());
                    }
                }
                return cbcwVar;
            }
        }, eoscVar).e(effg.class, new ejvr() { // from class: cjff
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                cjfv.a.s("MessagingService.GetMessages rejected request", (effg) obj);
                return cbcw.m();
            }
        }, eoscVar).e(TimeoutException.class, new ejvr() { // from class: cjfm
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                cjfv.a.s("MessagingService. connection timed out", (TimeoutException) obj);
                return cbcw.m();
            }
        }, eoscVar).e(crsk.class, new ejvr() { // from class: cjfn
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                cjfv.a.s("MessagingService connection failed", (crsk) obj);
                return cbcw.m();
            }
        }, eoscVar);
    }

    public final cbog k(String str) {
        caxr caxrVar = new caxr();
        caxrVar.a = Long.toString(this.r.c(str));
        return caxrVar.a();
    }
}
