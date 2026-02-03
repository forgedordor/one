package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversation;
import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.DefaultConversation;
import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;
import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import com.google.common.util.concurrent.ListenableFuture;
import j$.time.Duration;
import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ajwa implements ajwh {
    public final fcsu c;
    public final fcsu d;
    public final fcsu e;
    public final Object f = new Object();
    public Instant g = Instant.EPOCH;
    private final eosc i;
    public static final eksp a = eksp.c("BugleConversation");
    private static final cohg h = new cohf("BugleConversationUnlatcher::unlatchConversation");
    public static final Duration b = Duration.ofMinutes(2);

    public ajwa(eosc eoscVar, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3) {
        this.i = eoscVar;
        this.c = fcsuVar;
        this.d = fcsuVar2;
        this.e = fcsuVar3;
    }

    @Override // defpackage.ajwh
    public final eiju a(final BugleConversationId bugleConversationId) {
        eieu eieuVarA = h.a();
        try {
            BugleConversation bugleConversationL = ((ajvr) this.c.b()).L(bugleConversationId, false);
            final anpj anpjVar = ((DefaultConversation) bugleConversationL).f;
            final anpj anpjVar2 = ((DefaultConversation) bugleConversationL).d;
            eksl ekslVar = (eksl) a.h();
            ekslVar.X(cqnc.t, bugleConversationId);
            ((eksl) ekslVar.h("com/google/android/apps/messaging/shared/api/messaging/conversation/bugle/BugleConversationUnlatcher", "attemptUnlatchingConversation", 85, "BugleConversationUnlatcher.java")).q("Unlatcher: Checking if conversation needs unlatching.");
            eiju eijuVarI = eijx.h(new eooy() { // from class: ajvy
                @Override // defpackage.eooy
                public final ListenableFuture a() {
                    eksp ekspVar = ajwa.a;
                    eiju eijuVarB = anpjVar.b();
                    final BugleConversationId bugleConversationId2 = bugleConversationId;
                    return eijuVarB.h(new ejvr() { // from class: ajvu
                        @Override // defpackage.ejvr
                        public final Object apply(Object obj) {
                            ajts ajtsVar = (ajts) obj;
                            eksp ekspVar2 = ajwa.a;
                            boolean z = ajtsVar.z();
                            BugleConversationId bugleConversationId3 = bugleConversationId2;
                            if (z) {
                                eksl ekslVar2 = (eksl) ajwa.a.j();
                                ekslVar2.X(cqnc.t, bugleConversationId3);
                                ((eksl) ekslVar2.h("com/google/android/apps/messaging/shared/api/messaging/conversation/bugle/BugleConversationUnlatcher", "isConversationLatched", 123, "BugleConversationUnlatcher.java")).q("Unlatcher: Ignoring deleted conversation.");
                                return false;
                            }
                            if (ajtsVar.A() != 0) {
                                eksl ekslVar3 = (eksl) ajwa.a.h();
                                ekslVar3.X(cqnc.t, bugleConversationId3);
                                ((eksl) ekslVar3.h("com/google/android/apps/messaging/shared/api/messaging/conversation/bugle/BugleConversationUnlatcher", "isConversationLatched", 131, "BugleConversationUnlatcher.java")).t("Unlatcher: Ignoring conversation type %s.", bvdi.a(ajtsVar.A()));
                                return false;
                            }
                            if (ajtsVar.I() == elwp.SEND_MODE_XMS_LATCH) {
                                return true;
                            }
                            eksl ekslVar4 = (eksl) ajwa.a.h();
                            ekslVar4.X(cqnc.t, bugleConversationId3);
                            ((eksl) ekslVar4.h("com/google/android/apps/messaging/shared/api/messaging/conversation/bugle/BugleConversationUnlatcher", "isConversationLatched", 141, "BugleConversationUnlatcher.java")).t("Unlatcher: Ignoring unlatched conversation. SendMode: %s.", ajtsVar.I());
                            return false;
                        }
                    }, eoqg.a);
                }
            }, this.i).i(new eooz() { // from class: ajvz
                @Override // defpackage.eooz
                public final ListenableFuture a(Object obj) {
                    if (!((Boolean) obj).booleanValue()) {
                        return eijx.e(null);
                    }
                    anpj anpjVar3 = anpjVar2;
                    final BugleConversationId bugleConversationId2 = bugleConversationId;
                    final ajwa ajwaVar = this.a;
                    eiju eijuVarB = anpjVar3.b();
                    eooz eoozVar = new eooz() { // from class: ajvx
                        @Override // defpackage.eooz
                        public final ListenableFuture a(Object obj2) {
                            ekgb ekgbVar = (ekgb) obj2;
                            ejwl.l(ekgbVar.size() == 1);
                            final ResolvedRecipient resolvedRecipient = (ResolvedRecipient) ekgbVar.get(0);
                            eiju eijuVarB2 = resolvedRecipient.E(2).b();
                            final BugleConversationId bugleConversationId3 = bugleConversationId2;
                            final ajwa ajwaVar2 = ajwaVar;
                            return eijuVarB2.i(new eooz() { // from class: ajvs
                                @Override // defpackage.eooz
                                public final ListenableFuture a(Object obj3) {
                                    boolean z;
                                    anyy anyyVar = (anyy) obj3;
                                    boolean zQ = anyyVar.q();
                                    final BugleConversationId bugleConversationId4 = bugleConversationId3;
                                    if (!zQ) {
                                        eksl ekslVar2 = (eksl) ajwa.a.h();
                                        ekslVar2.X(cqnc.t, bugleConversationId4);
                                        ((eksl) ekslVar2.h("com/google/android/apps/messaging/shared/api/messaging/conversation/bugle/BugleConversationUnlatcher", "attemptUnlatch", 171, "BugleConversationUnlatcher.java")).t("Unlatcher: Returning since Recipient does not have RCS capabilities. Recipient Capabilities: %s.", anyyVar);
                                        return eijx.e(null);
                                    }
                                    final ajwa ajwaVar3 = ajwaVar2;
                                    Instant instantF = ((cogw) ajwaVar3.e.b()).f();
                                    synchronized (ajwaVar3.f) {
                                        z = Duration.between(ajwaVar3.g, instantF).compareTo(ajwa.b) >= 0;
                                        if (z) {
                                            ajwaVar3.g = instantF;
                                        }
                                    }
                                    if (!z) {
                                        eksl ekslVar3 = (eksl) ajwa.a.h();
                                        ekslVar3.X(cqnc.t, bugleConversationId4);
                                        ((eksl) ekslVar3.h("com/google/android/apps/messaging/shared/api/messaging/conversation/bugle/BugleConversationUnlatcher", "attemptUnlatch", 182, "BugleConversationUnlatcher.java")).q("Unlatcher: Skipping Recipient online status check due to rate limiting. Conversation will remain latched.");
                                        return eijx.e(null);
                                    }
                                    ResolvedRecipient resolvedRecipient2 = resolvedRecipient;
                                    eksl ekslVar4 = (eksl) ajwa.a.h();
                                    ekslVar4.X(cqnc.t, bugleConversationId4);
                                    ((eksl) ekslVar4.h("com/google/android/apps/messaging/shared/api/messaging/conversation/bugle/BugleConversationUnlatcher", "attemptUnlatch", 191, "BugleConversationUnlatcher.java")).q("Unlatcher: Calling Recipient.isOnline().");
                                    return resolvedRecipient2.t().i(new eooz() { // from class: ajvv
                                        @Override // defpackage.eooz
                                        public final ListenableFuture a(Object obj4) {
                                            if (!((Boolean) obj4).booleanValue()) {
                                                return eijx.e(null);
                                            }
                                            final BugleConversationId bugleConversationId5 = bugleConversationId4;
                                            final ajwa ajwaVar4 = ajwaVar3;
                                            eksl ekslVar5 = (eksl) ajwa.a.h();
                                            ekslVar5.X(cqnc.t, bugleConversationId5);
                                            ((eksl) ekslVar5.h("com/google/android/apps/messaging/shared/api/messaging/conversation/bugle/BugleConversationUnlatcher", "attemptUnlatch", BasePaymentResult.ERROR_REQUEST_CONNECTION_FAILED, "BugleConversationUnlatcher.java")).q("Unlatcher: Unlatching conversation. Recipient is ONLINE.");
                                            return ((ajvr) ajwaVar4.c.b()).P(bugleConversationId5, elwp.SEND_MODE_AUTO).h(new ejvr() { // from class: ajvw
                                                @Override // defpackage.ejvr
                                                public final Object apply(Object obj5) {
                                                    ((ajhd) ajwaVar4.d.b()).af(bugleConversationId5.a, 6);
                                                    return null;
                                                }
                                            }, eoqg.a);
                                        }
                                    }, eoqg.a);
                                }
                            }, eoqg.a);
                        }
                    };
                    eoqg eoqgVar = eoqg.a;
                    return eijuVarB.i(eoozVar, eoqgVar).f(Throwable.class, new eooz() { // from class: ajvt
                        @Override // defpackage.eooz
                        public final ListenableFuture a(Object obj2) {
                            eksl ekslVar2 = (eksl) ajwa.a.j();
                            ekslVar2.X(cqnc.t, bugleConversationId2);
                            ((eksl) ((eksl) ekslVar2.g((Throwable) obj2)).h("com/google/android/apps/messaging/shared/api/messaging/conversation/bugle/BugleConversationUnlatcher", "attemptUnlatchingConversation", 100, "BugleConversationUnlatcher.java")).q("Unlatcher: Exception thrown while unlatching. Conversation will remain latched.");
                            return eijx.e(null);
                        }
                    }, eoqgVar);
                }
            }, eoqg.a);
            eieuVarA.b(eijuVarI);
            eieuVarA.close();
            return eijuVarI;
        } catch (Throwable th) {
            try {
                eieuVarA.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
