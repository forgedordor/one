package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import java.util.Collection;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class avmy implements avmr {
    public static final eksp a = eksp.c("BugleBCM");
    public static final cczi b = cdag.h(cdag.b, "update_thread_id_for_conversation", true);
    public static final cczi c = cdag.h(cdag.b, "log_update_thread_id_for_conversation", true);
    public final fcsu d;
    private final fcsu e;
    private final fcsu f;
    private final fcsu g;
    private final fcsu h;
    private final fcsu i;
    private final Optional j;
    private final apsl k;
    private final fcsu l;
    private final Context m;

    public avmy(fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5, fcsu fcsuVar6, Optional optional, apsl apslVar, fcsu fcsuVar7, Context context) {
        this.e = fcsuVar;
        this.f = fcsuVar2;
        this.g = fcsuVar3;
        this.d = fcsuVar4;
        this.h = fcsuVar5;
        this.i = fcsuVar6;
        this.j = optional;
        this.k = apslVar;
        this.l = fcsuVar7;
        this.m = context;
    }

    public static void c(bojh bojhVar, cnqj cnqjVar) {
        eksp ekspVar = a;
        ((eksl) ekspVar.n().h("com/google/android/apps/messaging/shared/conversation/ConversationThreadIdGetterImpl", "updateThreadIdForConversationInternal", 280, "ConversationThreadIdGetterImpl.java")).I("BCM updating conversationId=%s, existingThreadId=%s, newThreadId=%s", bojhVar.C(), bojhVar.N(), cnqjVar);
        if (cnqjVar.d()) {
            ((eksl) ((eksl) ekspVar.j()).h("com/google/android/apps/messaging/shared/conversation/ConversationThreadIdGetterImpl", "updateThreadIdForConversationInternal", 285, "ConversationThreadIdGetterImpl.java")).I("BCM updating conversationId=%s error, telephony did not return a valid thread, existingThreadId=%s, newThreadId=%s", bojhVar.C(), bojhVar.N(), cnqjVar);
            return;
        }
        String[] strArr = botm.a;
        bote boteVar = new bote();
        boteVar.ap("updateThreadIdForConversationInternal");
        boteVar.X(cnqjVar);
        boteVar.f(bojhVar.C());
    }

    private final cnqj d(String str) {
        return new cnqj(((cmqj) this.f.b()).f(this.m, cmmo.a, str));
    }

    private final cnqj e(String str) {
        return new cnqj(((cmqj) this.f.b()).f(this.m, cmmo.a, str));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v15, types: [cnqj] */
    /* JADX WARN: Type inference failed for: r9v16, types: [cnqj] */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v18 */
    private final cnqj f(String str, boolean z, bojh bojhVar) {
        if (((Boolean) avos.a.e()).booleanValue()) {
            try {
                str = z ? d(str) : e(str);
            } catch (RuntimeException e) {
                fcsu fcsuVar = this.i;
                ((ains) fcsuVar.b()).e("Bugle.ConversationThreadIdGetterImpl.FindThreadForConversation.TelephonyLookupRetry.Count", 1);
                eksl ekslVar = (eksl) ((eksl) a.j()).g(e);
                ekslVar.Z(eksk.FULL);
                eksl ekslVar2 = (eksl) ekslVar.h("com/google/android/apps/messaging/shared/conversation/ConversationThreadIdGetterImpl", "getRcsThreadId", 372, "ConversationThreadIdGetterImpl.java");
                String str2 = true != z ? "RCS group" : "RBM";
                ekslVar2.t("getOrCreateThreadId for %s failed with exception, attempting retry", str2);
                try {
                    str = z ? d(str) : e(str);
                    ((ains) fcsuVar.b()).e("Bugle.ConversationThreadIdGetterImpl.FindThreadForConversation.TelephonyLookupRetry.Count", 2);
                } catch (RuntimeException e2) {
                    eksl ekslVar3 = (eksl) ((eksl) a.j()).g(e2);
                    ekslVar3.Z(eksk.FULL);
                    ((eksl) ekslVar3.h("com/google/android/apps/messaging/shared/conversation/ConversationThreadIdGetterImpl", "getRcsThreadId", 381, "ConversationThreadIdGetterImpl.java")).t("getOrCreateThreadId retry failed for %s failed with exception. Returning threadId from conversation", str2);
                    str = bojhVar.N();
                    h(str);
                }
            }
        } else {
            str = z ? d(str) : e(str);
        }
        ((eksl) a.n().h("com/google/android/apps/messaging/shared/conversation/ConversationThreadIdGetterImpl", "getRcsThreadId", 394, "ConversationThreadIdGetterImpl.java")).D("RCS group conversationId=%s, threadId=%s", bojhVar.C(), str);
        return str;
    }

    private final cnqj g(ekgb ekgbVar) {
        return new cnqj(((cmqj) this.f.b()).g(this.m, cmmo.a, (Collection) Collection.EL.stream(ekgbVar).filter(new Predicate() { // from class: avmw
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
                eksp ekspVar = avmy.a;
                return ((ParticipantsTable.BindData) obj).T() != null;
            }
        }).map(new Function() { // from class: avmx
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                eksp ekspVar = avmy.a;
                String strT = ((ParticipantsTable.BindData) obj).T();
                ejyb.e(strT);
                return strT;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).collect(ekcv.b)));
    }

    private static void h(cnqj cnqjVar) {
        if (cnqjVar.d()) {
            ((eksl) ((eksl) a.j()).h("com/google/android/apps/messaging/shared/conversation/ConversationThreadIdGetterImpl", "checkThreadIdIsKnown", 479, "ConversationThreadIdGetterImpl.java")).q("getOrCreateThreadId resolved threadId to -1");
        }
    }

    @Override // defpackage.avmr
    public final cnqj a(ConversationIdType conversationIdType) {
        ejwl.l(!ecem.g());
        bojh bojhVarB = botm.b(conversationIdType);
        if (bojhVarB == null) {
            ((eksl) ((eksl) a.j()).h("com/google/android/apps/messaging/shared/conversation/ConversationThreadIdGetterImpl", "getOrCreateThreadIdForConversation", 145, "ConversationThreadIdGetterImpl.java")).t("Conversation query returned null for conversation [%s]", conversationIdType);
            return new cnqj();
        }
        ejyb.e(bojhVarB);
        return b(bojhVarB);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.avmr
    public final cnqj b(final bojh bojhVar) {
        cnqj cnqjVarN;
        ejwl.l(!ecem.g());
        int iK = bojhVar.k();
        if (bvdi.c(iK) || bvdi.e(iK)) {
            ekgb ekgbVarZ = baga.d(bojhVar.C()).z();
            if (bojhVar.an()) {
                ejyb.a(!ekgbVarZ.isEmpty());
                ejyb.a(ekgbVarZ.size() < 2);
                ejyb.a(((ParticipantsTable.BindData) ekgbVarZ.get(0)).p() == 1);
                cnqjVarN = f(((chwl) this.e.b()).b(cmpf.a((ParticipantsTable.BindData) ekgbVarZ.get(0))), true, bojhVar);
            } else if (((Boolean) avos.a.e()).booleanValue()) {
                try {
                    cnqjVarN = g(ekgbVarZ);
                } catch (RuntimeException e) {
                    fcsu fcsuVar = this.i;
                    ((ains) fcsuVar.b()).e("Bugle.ConversationThreadIdGetterImpl.FindThreadForConversation.TelephonyLookupRetry.Count", 1);
                    eksl ekslVar = (eksl) ((eksl) a.j()).g(e);
                    ekslVar.Z(eksk.FULL);
                    ((eksl) ekslVar.h("com/google/android/apps/messaging/shared/conversation/ConversationThreadIdGetterImpl", "findThreadForXmsConversation", 416, "ConversationThreadIdGetterImpl.java")).q("getOrCreateThreadId for XMS failed with exception, attempting retry");
                    try {
                        cnqjVarN = g(ekgbVarZ);
                        ((ains) fcsuVar.b()).e("Bugle.ConversationThreadIdGetterImpl.FindThreadForConversation.TelephonyLookupRetry.Count", 2);
                    } catch (RuntimeException e2) {
                        eksl ekslVar2 = (eksl) ((eksl) a.j()).g(e2);
                        ekslVar2.Z(eksk.FULL);
                        ((eksl) ekslVar2.h("com/google/android/apps/messaging/shared/conversation/ConversationThreadIdGetterImpl", "findThreadForXmsConversation", 424, "ConversationThreadIdGetterImpl.java")).q("getOrCreateThreadId retry failed for XMS failed with exception. Returning threadId from conversation");
                        cnqjVarN = bojhVar.N();
                    }
                    ((eksl) a.n().h("com/google/android/apps/messaging/shared/conversation/ConversationThreadIdGetterImpl", "findThreadForXmsConversation", 431, "ConversationThreadIdGetterImpl.java")).D("XMS conversationId=%s, threadId=%s", bojhVar.C(), cnqjVarN);
                    h(cnqjVarN);
                }
            } else {
                cnqjVarN = g(ekgbVarZ);
            }
        } else {
            if (!bvdi.d(iK)) {
                throw new UnsupportedOperationException("Unknown conversation type, type=" + iK + ", conversationId=" + String.valueOf(bojhVar.C()));
            }
            cnqjVarN = f(((ciuv) this.g.b()).a(ejwk.b(bojhVar.af()), ejwk.b(bojhVar.ae()), bojhVar.H().equals(bvdp.NAME_IS_AUTOMATIC) ? "" : bojhVar.Y()), false, bojhVar);
        }
        if (((Boolean) b.e()).booleanValue() && !cnqjVarN.equals(bojhVar.N())) {
            if (this.k.a()) {
                ((awlc) this.l.b()).d(new Consumer() { // from class: avmu
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void z(Object obj) {
                        cmvv cmvvVar = (cmvv) obj;
                        eksp ekspVar = avmy.a;
                        bojh bojhVar2 = bojhVar;
                        if (bvdi.d(bojhVar2.k())) {
                            cmvvVar.f();
                        } else if (bojhVar2.q() > 1) {
                            cmvvVar.c();
                        } else {
                            cmvvVar.e();
                        }
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
            } else {
                this.j.ifPresent(new Consumer() { // from class: avmv
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void z(Object obj) {
                        cmvv cmvvVar = (cmvv) obj;
                        eksp ekspVar = avmy.a;
                        bojh bojhVar2 = bojhVar;
                        if (bvdi.d(bojhVar2.k())) {
                            cmvvVar.f();
                        } else if (bojhVar2.q() > 1) {
                            cmvvVar.c();
                        } else {
                            cmvvVar.e();
                        }
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
            }
            if (!((Boolean) c.e()).booleanValue()) {
                c(bojhVar, cnqjVarN);
            } else if (!cnqjVarN.equals(bojhVar.N())) {
                ((eksl) a.n().h("com/google/android/apps/messaging/shared/conversation/ConversationThreadIdGetterImpl", "updateThreadIdForConversation", 260, "ConversationThreadIdGetterImpl.java")).I("Scheduling ConversationThreadIdUpdaterWorker. conversationId=%s, existingThreadId=%s, newThreadId=%s", bojhVar.C(), bojhVar.N(), cnqjVarN);
                avnb avnbVar = (avnb) this.h.b();
                ewsw ewswVar = (ewsw) ewsx.a.createBuilder();
                String strA = bojhVar.C().a();
                ewswVar.copyOnWrite();
                ewsx ewsxVar = (ewsx) ewswVar.instance;
                strA.getClass();
                ewsxVar.b = strA;
                long jA = cnqjVarN.a();
                ewswVar.copyOnWrite();
                ((ewsx) ewswVar.instance).c = jA;
                ((cazj) avnbVar.a.b()).a(cbcu.f("conversation_thread_id_updater_worker", (ewsx) ewswVar.build()));
            }
        }
        return cnqjVarN;
    }
}
