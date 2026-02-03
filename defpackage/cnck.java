package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cnck {
    public static final eksp a = eksp.c("BugleTachygram");
    public final ains b;
    public final eosc c;
    public final eosc d;
    private final fcsu e;

    public cnck(fcsu fcsuVar, ains ainsVar, eosc eoscVar, eosc eoscVar2) {
        this.e = fcsuVar;
        this.b = ainsVar;
        this.c = eoscVar;
        this.d = eoscVar2;
    }

    public static cicr a(String str, emaf emafVar) {
        cicq cicqVarW = cicr.w();
        cicqVarW.j(false);
        cicqVarW.p(false);
        cicqVarW.q(true);
        cicqVarW.w(emafVar);
        cicqVarW.u(str);
        return cicqVarW.D();
    }

    public final eiju b(cicr cicrVar) {
        return ((cicm) this.e.b()).d(cicrVar).h(new ejvr() { // from class: cncd
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return Optional.ofNullable((ConversationIdType) obj);
            }
        }, this.d).h(new ejvr() { // from class: cnce
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                Optional optional = (Optional) obj;
                eksp ekspVar = cnck.a;
                if (optional.isEmpty()) {
                    ((eksl) ((eksl) cnck.a.j()).h("com/google/android/apps/messaging/shared/tachygram/chat/TachygramDatabaseOperations", "getConversationBindData", 207, "TachygramDatabaseOperations.java")).q("Cannot fetch ConversationsTable.BindData because conversation ID lookup failed.");
                    return Optional.empty();
                }
                bojh bojhVar = (bojh) botm.j((ConversationIdType) optional.get(), new Function() { // from class: cncc
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        bojh bojhVar2 = (bojh) obj2;
                        eksp ekspVar2 = cnck.a;
                        return bojhVar2;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                if (bojhVar != null) {
                    return Optional.of(bojhVar);
                }
                eksl ekslVar = (eksl) cnck.a.j();
                ekslVar.X(cqnc.r, ((ConversationIdType) optional.get()).toString());
                ((eksl) ekslVar.h("com/google/android/apps/messaging/shared/tachygram/chat/TachygramDatabaseOperations", "getConversationBindData", 219, "TachygramDatabaseOperations.java")).q("Could not get Conversation.BindData for an existing conversation.");
                return Optional.empty();
            }
        }, this.c);
    }

    public final eiju c(final String str, final evqs evqsVar) {
        return eijx.f(new Runnable() { // from class: cnci
            @Override // java.lang.Runnable
            public final void run() {
                eksp ekspVar = cnck.a;
                String[] strArr = botm.a;
                bote boteVar = new bote();
                boteVar.ap("setGroupRoutingToken");
                final String str2 = str;
                boteVar.ad(new Function() { // from class: cnch
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        botl botlVar = (botl) obj;
                        eksp ekspVar2 = cnck.a;
                        botlVar.E(str2);
                        return botlVar;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                byte[] bArrI = evqsVar.I();
                int iIntValue = botm.g().intValue();
                int iIntValue2 = botm.g().intValue();
                if (iIntValue2 < 58120) {
                    dqru.x("tachygram_group_routing_info_token", iIntValue2);
                }
                if (iIntValue >= 58120) {
                    boteVar.a.put("tachygram_group_routing_info_token", bArrI);
                }
                int iE = boteVar.b().e();
                if (iE == 0) {
                    eksl ekslVar = (eksl) cnck.a.j();
                    ekslVar.X(cqnc.N, str2);
                    ((eksl) ekslVar.h("com/google/android/apps/messaging/shared/tachygram/chat/TachygramDatabaseOperations", "setGroupRoutingToken", 105, "TachygramDatabaseOperations.java")).q("Failed to update conversation(s) group routing token for tachygram group.");
                } else if (iE > 1) {
                    eksl ekslVar2 = (eksl) cnck.a.h();
                    ekslVar2.X(cqnc.N, str2);
                    ((eksl) ekslVar2.h("com/google/android/apps/messaging/shared/tachygram/chat/TachygramDatabaseOperations", "setGroupRoutingToken", 114, "TachygramDatabaseOperations.java")).q("Updated more than one conversation's tachygram group routing token.");
                }
            }
        }, this.c);
    }
}
