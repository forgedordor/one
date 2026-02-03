package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.concurrent.Callable;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class citz extends cayv {
    public static final eksp a = eksp.c("BugleGroupManagement");
    public final eosc b;
    public final bxlc c;
    public final ains d;
    private final eosc e;

    public citz(eosc eoscVar, eosc eoscVar2, bxlc bxlcVar, ains ainsVar) {
        this.e = eoscVar;
        this.b = eoscVar2;
        this.c = bxlcVar;
        this.d = ainsVar;
    }

    @Override // defpackage.cazg
    public final eieu b() {
        return eiiy.k("RecoverChatApiToVanillaRcsDowngradedRcsGroupHandler");
    }

    @Override // defpackage.cazg
    public final evuo d() {
        return ciub.a.getParserForType();
    }

    @Override // defpackage.cayv
    protected final /* bridge */ /* synthetic */ eiju j(cayy cayyVar, evuh evuhVar) {
        final ConversationIdType conversationIdTypeB = barn.b(((ciub) evuhVar).b);
        if (!conversationIdTypeB.b()) {
            return eijx.g(new Callable() { // from class: citu
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    eksp ekspVar = citz.a;
                    botb botbVarE = botm.e();
                    botbVarE.A("RecoverChatApiToVanillaRcsDowngradedRcsGroupHandler#getConversation");
                    botbVarE.f(new Function() { // from class: citw
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo536andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            eksp ekspVar2 = citz.a;
                            bopp boppVar = botm.c;
                            return new bopq[]{((bopp) obj).a, boppVar.aa, boppVar.ab};
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                    final ConversationIdType conversationIdType = conversationIdTypeB;
                    botbVarE.i(new Function() { // from class: citx
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo536andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            botl botlVar = (botl) obj;
                            eksp ekspVar2 = citz.a;
                            botlVar.r(conversationIdType);
                            return botlVar;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                    return Optional.ofNullable((bojh) botbVarE.b().l());
                }
            }, this.b).i(new eooz() { // from class: citv
                @Override // defpackage.eooz
                public final ListenableFuture a(Object obj) {
                    Optional optional = (Optional) obj;
                    boolean zIsEmpty = optional.isEmpty();
                    final citz citzVar = this.a;
                    final ConversationIdType conversationIdType = conversationIdTypeB;
                    if (zIsEmpty) {
                        ekrw ekrwVarN = citz.a.n();
                        ekrwVarN.X(cqnc.r, conversationIdType.toString());
                        ((eksl) ekrwVarN.h("com/google/android/apps/messaging/shared/rcs/groups/recovery/RecoverChatApiToVanillaRcsDowngradedRcsGroupHandler", "processPendingWorkItemAsync", 93, "RecoverChatApiToVanillaRcsDowngradedRcsGroupHandler.java")).q("Skipping recovering ChatAPI to Vanilla RCS downgraded conversation because could not retrieve ConversationsTable bind data");
                        citzVar.d.e("Bugle.Rcs.Groups.Recovery.Disabled.Cause", 2);
                        return eijx.e(cbcw.k());
                    }
                    String strAe = ((bojh) optional.get()).ae();
                    String strAd = ((bojh) optional.get()).ad();
                    if (ejwk.c(strAe)) {
                        ekrw ekrwVarN2 = citz.a.n();
                        ekrwVarN2.X(cqnc.r, conversationIdType.toString());
                        ekrwVarN2.X(cqnc.N, strAe);
                        ((eksl) ekrwVarN2.h("com/google/android/apps/messaging/shared/rcs/groups/recovery/RecoverChatApiToVanillaRcsDowngradedRcsGroupHandler", "processPendingWorkItemAsync", 110, "RecoverChatApiToVanillaRcsDowngradedRcsGroupHandler.java")).q("Skipping recovering ChatAPI to Vanilla RCS downgraded conversation because we do not have valid group ID.");
                        citzVar.d.e("Bugle.Rcs.Groups.Recovery.Disabled.Cause", 3);
                        return eijx.e(cbcw.k());
                    }
                    if (!ejwk.c(strAd)) {
                        ekrw ekrwVarN3 = citz.a.n();
                        ekrwVarN3.X(cqnc.r, conversationIdType.toString());
                        ekrwVarN3.X(cqnc.N, strAe);
                        ((eksl) ekrwVarN3.h("com/google/android/apps/messaging/shared/rcs/groups/recovery/RecoverChatApiToVanillaRcsDowngradedRcsGroupHandler", "processPendingWorkItemAsync", 137, "RecoverChatApiToVanillaRcsDowngradedRcsGroupHandler.java")).q("Bugle is using ChatAPI but the conversation was disabled due to a prior downgrade to Vanilla RCS. Enabling the group.");
                        return eijx.g(new Callable() { // from class: city
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                String[] strArr = botm.a;
                                bote boteVar = new bote();
                                boteVar.ap("YYYYY");
                                boteVar.A(0);
                                ConversationIdType conversationIdType2 = conversationIdType;
                                boteVar.f(conversationIdType2);
                                citzVar.c.d(conversationIdType2);
                                return cbcw.i();
                            }
                        }, citzVar.b);
                    }
                    ekrw ekrwVarN4 = citz.a.n();
                    ekrwVarN4.X(cqnc.r, conversationIdType.toString());
                    ekrwVarN4.X(cqnc.N, strAe);
                    ((eksl) ekrwVarN4.h("com/google/android/apps/messaging/shared/rcs/groups/recovery/RecoverChatApiToVanillaRcsDowngradedRcsGroupHandler", "processPendingWorkItemAsync", 124, "RecoverChatApiToVanillaRcsDowngradedRcsGroupHandler.java")).q("Skipping recovering ChatAPI to Vanilla RCS downgraded conversation because we do not have valid conference URI.");
                    citzVar.d.e("Bugle.Rcs.Groups.Recovery.Disabled.Cause", 4);
                    return eijx.e(cbcw.k());
                }
            }, this.e);
        }
        ((eksl) a.n().h("com/google/android/apps/messaging/shared/rcs/groups/recovery/RecoverChatApiToVanillaRcsDowngradedRcsGroupHandler", "processPendingWorkItemAsync", 80, "RecoverChatApiToVanillaRcsDowngradedRcsGroupHandler.java")).q("Skipping recovering ChatAPI to Vanilla RCS downgraded conversation because conversation ID is empty");
        return eijx.e(cbcw.k());
    }
}
