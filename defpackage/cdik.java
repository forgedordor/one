package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.common.util.concurrent.ListenableFuture;
import j$.time.Duration;
import j$.time.Instant;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cdik {
    public static final cqce a = cqce.g("Bugle", "MessageTrackerImpl");
    public static final eksp b = eksp.c("Bugle");
    public final eosc c;
    public final eygg d;

    public cdik(eosc eoscVar, eygg eyggVar) {
        this.c = eoscVar;
        this.d = eyggVar;
    }

    public final eiju a(final List list, final bvdo bvdoVar) {
        return eiju.g(((cdia) this.d.b()).k.b("markFlaggedMessagesAsNotified", new Runnable() { // from class: cdhe
            @Override // java.lang.Runnable
            public final void run() {
                eksp ekspVar = cdia.a;
                String[] strArr = bpmq.a;
                bpmn bpmnVar = new bpmn();
                bpmnVar.ap("markFlaggedMessagesAsNotified");
                final List list2 = list;
                final bvdo bvdoVar2 = bvdoVar;
                bpmnVar.af(new bpmo((bpmp) new Function() { // from class: cdhr
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        bpmp bpmpVar = (bpmp) obj;
                        eksp ekspVar2 = cdia.a;
                        bpmpVar.c(list2);
                        bpmpVar.d(bvdoVar2);
                        return bpmpVar;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }.apply(new bpmp())));
                int iIntValue = bpmq.c().intValue();
                int iIntValue2 = bpmq.c().intValue();
                if (iIntValue2 < 46030) {
                    dqru.x("flagged_message_notified", iIntValue2);
                }
                if (iIntValue >= 46030) {
                    bpmnVar.a.put("flagged_message_notified", (Boolean) true);
                }
                bpmnVar.b().e();
            }
        }));
    }

    public final void b(final MessageIdType messageIdType, final Instant instant, final bvdo bvdoVar) {
        eiju eijuVarI;
        if (messageIdType.c()) {
            cqbd cqbdVarE = a.e();
            cqbdVarE.I("Cannot track message - messageId cannot be");
            cqbdVarE.I(true != messageIdType.c() ? "empty" : "null");
            cqbdVarE.r();
            return;
        }
        final cdia cdiaVar = (cdia) this.d.b();
        if (messageIdType.c()) {
            ((eksl) ((eksl) cdia.a.j()).h("com/google/android/apps/messaging/shared/flaggedmessages/MessageFlagger", "flagMessage", 111, "MessageFlagger.java")).q("Cannot flag message - messageId cannot be empty.");
            eijuVarI = eijx.e(false);
        } else {
            byeq byeqVar = cdiaVar.k;
            ejwl.b(true ^ byeqVar.a.i(), "This transaction must not be nested, as the transform routine needs the results to be visible");
            eijuVarI = eiju.g(byeqVar.a("MessageFlagger#flagMessage", new ejxr() { // from class: cdhg
                @Override // defpackage.ejxr
                public final Object get() {
                    MessageIdType messageIdType2 = messageIdType;
                    bvdo bvdoVar2 = bvdoVar;
                    if (cdia.d(messageIdType2, bvdoVar2)) {
                        return false;
                    }
                    Instant instant2 = instant;
                    String[] strArr = bpmq.a;
                    bplh bplhVar = new bplh();
                    bplhVar.c(messageIdType2);
                    bplhVar.e(bvdoVar2);
                    bplhVar.d(instant2.toEpochMilli());
                    return Boolean.valueOf(bplhVar.a().p().longValue() > 0);
                }
            })).i(new eooz() { // from class: cdhh
                @Override // defpackage.eooz
                public final ListenableFuture a(Object obj) {
                    return ((Boolean) obj).booleanValue() ? cdiaVar.a().h(new ejvr() { // from class: cdhy
                        @Override // defpackage.ejvr
                        public final Object apply(Object obj2) {
                            eksp ekspVar = cdia.a;
                            return true;
                        }
                    }, eoqg.a) : eijx.e(false);
                }
            }, cdiaVar.c);
        }
        eijuVarI.k(auwc.a(new cqob(new Consumer() { // from class: cdig
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
                Boolean bool = (Boolean) obj;
                cqce cqceVar = cdik.a;
                if (bool == null || !bool.booleanValue()) {
                    return;
                }
                MessageIdType messageIdType2 = messageIdType;
                bvdo bvdoVar2 = bvdoVar;
                cqbd cqbdVarC = cdik.a.c();
                cqbdVarC.I("Started tracking message");
                cqbdVarC.A("TrackingPurpose", bvdoVar2);
                cqbdVarC.d(messageIdType2);
                cqbdVarC.r();
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        }, new Consumer() { // from class: cdih
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
                cqbd cqbdVarE2 = cdik.a.e();
                cqbdVarE2.I("Error when trying to start tracking");
                cqbdVarE2.A("TrackingPurpose", bvdoVar);
                cqbdVarE2.d(messageIdType);
                cqbdVarE2.s((Throwable) obj);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        })), this.c);
    }

    public final void c(final MessageIdType messageIdType, final Instant instant, final bvdo bvdoVar, final Duration duration) {
        eiju eijuVarI;
        if (messageIdType.c()) {
            cqbd cqbdVarE = a.e();
            cqbdVarE.I("Cannot track message - messageId cannot be");
            cqbdVarE.I(true != messageIdType.c() ? "empty" : "null");
            cqbdVarE.r();
            return;
        }
        final cdia cdiaVar = (cdia) this.d.b();
        if (messageIdType.c()) {
            ((eksl) ((eksl) cdia.a.j()).h("com/google/android/apps/messaging/shared/flaggedmessages/MessageFlagger", "flagMessage", 159, "MessageFlagger.java")).q("Cannot flag message - messageId cannot be empty.");
            eijuVarI = eijx.e(false);
        } else {
            byeq byeqVar = cdiaVar.k;
            ejwl.b(true ^ byeqVar.a.i(), "This transaction must not be nested, as the transform routine needs the results to be visible");
            eijuVarI = eiju.g(byeqVar.a("MessageFlagger#flagMessage", new ejxr() { // from class: cdho
                @Override // defpackage.ejxr
                public final Object get() {
                    MessageIdType messageIdType2 = messageIdType;
                    bvdo bvdoVar2 = bvdoVar;
                    if (cdia.d(messageIdType2, bvdoVar2)) {
                        return false;
                    }
                    Duration duration2 = duration;
                    Instant instant2 = instant;
                    String[] strArr = bpmq.a;
                    bplh bplhVar = new bplh();
                    bplhVar.c(messageIdType2);
                    bplhVar.e(bvdoVar2);
                    bplhVar.d(instant2.toEpochMilli());
                    bplhVar.b(duration2);
                    return Boolean.valueOf(bplhVar.a().p().longValue() > 0);
                }
            })).i(new eooz() { // from class: cdhp
                @Override // defpackage.eooz
                public final ListenableFuture a(Object obj) {
                    return ((Boolean) obj).booleanValue() ? cdiaVar.a().h(new ejvr() { // from class: cdhl
                        @Override // defpackage.ejvr
                        public final Object apply(Object obj2) {
                            eksp ekspVar = cdia.a;
                            return true;
                        }
                    }, eoqg.a) : eijx.e(false);
                }
            }, cdiaVar.c);
        }
        eijuVarI.k(auwc.a(new cqob(new Consumer() { // from class: cdie
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
                Boolean bool = (Boolean) obj;
                cqce cqceVar = cdik.a;
                if (bool == null || !bool.booleanValue()) {
                    return;
                }
                MessageIdType messageIdType2 = messageIdType;
                bvdo bvdoVar2 = bvdoVar;
                cqbd cqbdVarC = cdik.a.c();
                cqbdVarC.I("Started tracking message");
                cqbdVarC.A("TrackingPurpose", bvdoVar2);
                cqbdVarC.d(messageIdType2);
                cqbdVarC.r();
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        }, new Consumer() { // from class: cdif
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
                cqbd cqbdVarE2 = cdik.a.e();
                cqbdVarE2.I("Error when trying to start tracking");
                cqbdVarE2.A("TrackingPurpose", bvdoVar);
                cqbdVarE2.d(messageIdType);
                cqbdVarE2.s((Throwable) obj);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        })), this.c);
    }

    public final void d(final MessageIdType messageIdType, final bvdo bvdoVar) {
        eiju eijuVarI;
        if (messageIdType.c()) {
            cqbd cqbdVarE = a.e();
            cqbdVarE.A("reason", bvdoVar);
            cqbdVarE.I("Cannot stop tracking message - messageId cannot be");
            cqbdVarE.I(true != messageIdType.c() ? "empty" : "null");
            cqbdVarE.r();
            return;
        }
        final cdia cdiaVar = (cdia) this.d.b();
        if (messageIdType.c()) {
            ((eksl) ((eksl) cdia.a.j()).h("com/google/android/apps/messaging/shared/flaggedmessages/MessageFlagger", "unflagMessage", 268, "MessageFlagger.java")).q("Cannot unflag message - messageId cannot be empty.");
            eijuVarI = eijx.e(false);
        } else {
            eijuVarI = eijx.g(new Callable() { // from class: cdhi
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    eksp ekspVar = cdia.a;
                    String[] strArr = bpmq.a;
                    bpmg bpmgVar = new bpmg();
                    bpmgVar.f("unflagMessage");
                    final MessageIdType messageIdType2 = messageIdType;
                    final bvdo bvdoVar2 = bvdoVar;
                    bpmgVar.a(new Function() { // from class: cdhn
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo536andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            bpmp bpmpVar = (bpmp) obj;
                            eksp ekspVar2 = cdia.a;
                            bpmpVar.b(messageIdType2);
                            bpmpVar.d(bvdoVar2);
                            return bpmpVar;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                    return Boolean.valueOf(bpmgVar.d() > 0);
                }
            }, cdiaVar.b).i(new eooz() { // from class: cdhj
                @Override // defpackage.eooz
                public final ListenableFuture a(Object obj) {
                    if (!((Boolean) obj).booleanValue()) {
                        return eijx.e(false);
                    }
                    cdia cdiaVar2 = cdiaVar;
                    cdiaVar2.c();
                    return cdiaVar2.a().h(new ejvr() { // from class: cdhk
                        @Override // defpackage.ejvr
                        public final Object apply(Object obj2) {
                            eksp ekspVar = cdia.a;
                            return true;
                        }
                    }, cdiaVar2.c);
                }
            }, cdiaVar.c);
        }
        eijuVarI.k(auwc.a(new cqob(new Consumer() { // from class: cdii
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
                Boolean bool = (Boolean) obj;
                cqce cqceVar = cdik.a;
                if (bool == null || !bool.booleanValue()) {
                    return;
                }
                MessageIdType messageIdType2 = messageIdType;
                bvdo bvdoVar2 = bvdoVar;
                cqbd cqbdVarC = cdik.a.c();
                cqbdVarC.I("Stopped tracking message");
                cqbdVarC.A("TrackingPurpose", bvdoVar2);
                cqbdVarC.d(messageIdType2);
                cqbdVarC.r();
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        }, new Consumer() { // from class: cdij
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
                cqbd cqbdVarE2 = cdik.a.e();
                cqbdVarE2.I("Error when trying to stop tracking");
                cqbdVarE2.A("TrackingPurpose", bvdoVar);
                cqbdVarE2.d(messageIdType);
                cqbdVarE2.s((Throwable) obj);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        })), this.c);
    }
}
