package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.HashSet;
import java.util.concurrent.Callable;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class ciui extends cayv {
    public static final eksp a = eksp.c("BugleGroupManagement");
    public final eosc b;
    public final asre c;
    public final fcsu d;
    public final ciux e;
    public final ains f;
    private final eosc g;

    public ciui(eosc eoscVar, eosc eoscVar2, asre asreVar, fcsu fcsuVar, ciux ciuxVar, ains ainsVar) {
        this.g = eoscVar;
        this.b = eoscVar2;
        this.c = asreVar;
        this.d = fcsuVar;
        this.e = ciuxVar;
        this.f = ainsVar;
    }

    @Override // defpackage.cazg
    public final eieu b() {
        return eiiy.k("RecoverDisabledRcsGroupHandler");
    }

    @Override // defpackage.cazg
    public final evuo d() {
        return ciuk.a.getParserForType();
    }

    @Override // defpackage.cayv
    protected final /* bridge */ /* synthetic */ eiju j(cayy cayyVar, evuh evuhVar) {
        final ciuk ciukVar = (ciuk) evuhVar;
        final ConversationIdType conversationIdTypeB = barn.b(ciukVar.c);
        if (conversationIdTypeB.b()) {
            ((eksl) ((eksl) a.j()).h("com/google/android/apps/messaging/shared/rcs/groups/recovery/RecoverDisabledRcsGroupHandler", "processPendingWorkItemAsync", 97, "RecoverDisabledRcsGroupHandler.java")).q("Skipping recovering conversation because conversation ID is empty");
            return eijx.e(cbcw.k());
        }
        Callable callable = new Callable() { // from class: ciue
            @Override // java.util.concurrent.Callable
            public final Object call() {
                eksp ekspVar = ciui.a;
                botb botbVarE = botm.e();
                botbVarE.A("RecoverdisabledRcsGroupHandler#getConversation-conversations1");
                bopp boppVar = botm.c;
                botbVarE.c(boppVar.a, boppVar.b, boppVar.aa, boppVar.ab, boppVar.N);
                final ConversationIdType conversationIdType = conversationIdTypeB;
                botbVarE.i(new Function() { // from class: ciud
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        botl botlVar = (botl) obj;
                        eksp ekspVar2 = ciui.a;
                        botlVar.r(conversationIdType);
                        botlVar.j(2);
                        return botlVar;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                return Optional.ofNullable((bojh) botbVarE.b().l());
            }
        };
        eosc eoscVar = this.g;
        return eijx.g(callable, eoscVar).i(new eooz() { // from class: ciuf
            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                Optional optional = (Optional) obj;
                boolean zIsEmpty = optional.isEmpty();
                final ciui ciuiVar = this.a;
                final ConversationIdType conversationIdType = conversationIdTypeB;
                char c = 2;
                if (zIsEmpty) {
                    eksl ekslVar = (eksl) ciui.a.j();
                    ekslVar.X(cqnc.r, conversationIdType.toString());
                    ((eksl) ekslVar.h("com/google/android/apps/messaging/shared/rcs/groups/recovery/RecoverDisabledRcsGroupHandler", "processPendingWorkItemAsync", 108, "RecoverDisabledRcsGroupHandler.java")).q("Skipping recovering conversation because could not retrieve ConversationsTable bind data");
                    ciuiVar.f.e("Bugle.Rcs.Groups.Recovery.Disabled.Cause", 2);
                    return eijx.e(cbcw.k());
                }
                final String strAe = ((bojh) optional.get()).ae();
                String strAd = ((bojh) optional.get()).ad();
                if (ejwk.c(strAe)) {
                    eksl ekslVar2 = (eksl) ciui.a.j();
                    ekslVar2.X(cqnc.r, conversationIdType.toString());
                    ekslVar2.X(cqnc.N, strAe);
                    ((eksl) ekslVar2.h("com/google/android/apps/messaging/shared/rcs/groups/recovery/RecoverDisabledRcsGroupHandler", "processPendingWorkItemAsync", 125, "RecoverDisabledRcsGroupHandler.java")).q("Skipping conversation because we do not have valid group ID. Updating join state to CONVERSATION_JOIN_STATE_DIFFERENT_CONFIG");
                    String[] strArr = botm.a;
                    bote boteVar = new bote();
                    boteVar.ap("RecoverDisabledRcsGroupHandler.processPendingWorkItemAsync-conversationw1");
                    boteVar.A(3);
                    boteVar.f(((bojh) optional.get()).C());
                    ciuiVar.f.e("Bugle.Rcs.Groups.Recovery.Disabled.Cause", 3);
                    return eijx.e(cbcw.i());
                }
                char c2 = 4;
                if (ejwk.c(strAd)) {
                    eksp ekspVar = ciui.a;
                    eksl ekslVar3 = (eksl) ekspVar.j();
                    ekslVar3.X(cqnc.r, conversationIdType.toString());
                    ekslVar3.X(cqnc.N, strAe);
                    ((eksl) ekslVar3.h("com/google/android/apps/messaging/shared/rcs/groups/recovery/RecoverDisabledRcsGroupHandler", "processPendingWorkItemAsync", 145, "RecoverDisabledRcsGroupHandler.java")).q("Skipping conversation because we do not have valid conference URI.");
                    if (((bojh) optional.get()).n() == 4) {
                        String[] strArr2 = botm.a;
                        bote boteVar2 = new bote();
                        boteVar2.ap("RecoverDisabledRcsGroupHandler#processPendingWorkItemAsync-conversationw2");
                        boteVar2.A(3);
                        boteVar2.f(((bojh) optional.get()).C());
                        ciuiVar.f.e("Bugle.Rcs.Groups.Recovery.Disabled.Cause", 4);
                        ((eksl) ((eksl) ekspVar.j()).h("com/google/android/apps/messaging/shared/rcs/groups/recovery/RecoverDisabledRcsGroupHandler", "processPendingWorkItemAsync", 156, "RecoverDisabledRcsGroupHandler.java")).q("Updating join state to CONVERSATION_JOIN_STATE_DIFFERENT_CONFIG");
                    }
                    return eijx.e(cbcw.i());
                }
                botb botbVarE = botm.e();
                botbVarE.A("conversationIsCorruptAndShouldNotBeRecovered");
                bopp boppVar = botm.c;
                int i = 0;
                botbVarE.c(boppVar.a, boppVar.b);
                botbVarE.i(new Function() { // from class: ciuh
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        botl botlVar = (botl) obj2;
                        eksp ekspVar2 = ciui.a;
                        botlVar.E(strAe);
                        return botlVar;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                ekgb ekgbVarZ = botbVarE.b().z();
                if (ekgbVarZ.size() > 1) {
                    HashSet hashSet = new HashSet();
                    int size = ekgbVarZ.size();
                    while (i < size) {
                        bojh bojhVar = (bojh) ekgbVarZ.get(i);
                        char c3 = c;
                        char c4 = c2;
                        Optional optional2 = ((ciup) ciuiVar.e.a(bojhVar.N())).a;
                        if (!optional2.isEmpty()) {
                            ciun ciunVar = (ciun) optional2.get();
                            if (strAe.equals(ciunVar.c)) {
                                String str = ciunVar.b;
                                if (hashSet.contains(str)) {
                                    eksl ekslVar4 = (eksl) ciui.a.j();
                                    ekslVar4.X(cqnc.r, bojhVar.C().toString());
                                    ekslVar4.X(cqnc.N, strAe);
                                    ((eksl) ekslVar4.h("com/google/android/apps/messaging/shared/rcs/groups/recovery/RecoverDisabledRcsGroupHandler", "conversationIsCorruptAndShouldNotBeRecovered", 284, "RecoverDisabledRcsGroupHandler.java")).q("Skipping conversation because RCS group is forked.");
                                } else {
                                    hashSet.add(str);
                                    i++;
                                    c = c3;
                                    c2 = c4;
                                }
                            }
                        }
                        return eijx.e(cbcw.k());
                    }
                }
                aubq aubqVar = ciukVar.d;
                if (aubqVar == null) {
                    aubqVar = aubq.a;
                }
                audt audtVar = (audt) audu.a.createBuilder();
                audtVar.copyOnWrite();
                audu auduVar = (audu) audtVar.instance;
                strAe.getClass();
                auduVar.b |= 1;
                auduVar.c = strAe;
                aubq aubqVarA = ((asqx) ciuiVar.d.b()).a(strAd, true);
                audtVar.copyOnWrite();
                audu auduVar2 = (audu) audtVar.instance;
                aubqVarA.getClass();
                auduVar2.d = aubqVarA;
                auduVar2.b |= 2;
                audu auduVar3 = (audu) audtVar.build();
                auif auifVar = (auif) auig.a.createBuilder();
                auifVar.copyOnWrite();
                auig auigVar = (auig) auifVar.instance;
                strAe.getClass();
                auigVar.b |= 1;
                auigVar.c = strAe;
                auig auigVar2 = (auig) auifVar.build();
                auih auihVar = (auih) auii.a.createBuilder();
                auihVar.copyOnWrite();
                auii auiiVar = (auii) auihVar.instance;
                auduVar3.getClass();
                auiiVar.c = auduVar3;
                auiiVar.b |= 1;
                auihVar.copyOnWrite();
                auii auiiVar2 = (auii) auihVar.instance;
                aubqVar.getClass();
                auiiVar2.e = aubqVar;
                auiiVar2.b |= 4;
                evqs byteString = auigVar2.toByteString();
                auihVar.copyOnWrite();
                auii auiiVar3 = (auii) auihVar.instance;
                auiiVar3.b |= 2;
                auiiVar3.d = byteString;
                return ciuiVar.c.f((auii) auihVar.build()).h(new ejvr() { // from class: ciug
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj2) {
                        aubl aublVar = ((auik) obj2).c;
                        if (aublVar == null) {
                            aublVar = aubl.a;
                        }
                        aubk aubkVar = aubk.PENDING;
                        aubk aubkVarB = aubk.b(aublVar.c);
                        if (aubkVarB == null) {
                            aubkVarB = aubk.UNKNOWN_STATUS;
                        }
                        String str2 = strAe;
                        ConversationIdType conversationIdType2 = conversationIdType;
                        if (!aubkVar.equals(aubkVarB)) {
                            aubk aubkVar2 = aubk.OK;
                            aubk aubkVarB2 = aubk.b(aublVar.c);
                            if (aubkVarB2 == null) {
                                aubkVarB2 = aubk.UNKNOWN_STATUS;
                            }
                            if (!aubkVar2.equals(aubkVarB2)) {
                                eksl ekslVar5 = (eksl) ciui.a.j();
                                ekslVar5.X(cqnc.r, conversationIdType2.toString());
                                ekslVar5.X(cqnc.N, str2);
                                eksl ekslVar6 = (eksl) ekslVar5.h("com/google/android/apps/messaging/shared/rcs/groups/recovery/RecoverDisabledRcsGroupHandler", "recoverDisabledRcsGroupWithChatApi", 213, "RecoverDisabledRcsGroupHandler.java");
                                aubi aubiVarB = aubi.b(aublVar.d);
                                if (aubiVarB == null) {
                                    aubiVarB = aubi.UNKNOWN_CAUSE;
                                }
                                ciui ciuiVar2 = ciuiVar;
                                ekslVar6.t("Failed to recover disabled RCS group with ChatApi. Cause: %s", aubiVarB.name());
                                ciuiVar2.f.e("Bugle.Rcs.Groups.Recovery.Disabled.Cause", 5);
                                return cbcw.k();
                            }
                        }
                        ekrw ekrwVarN = ciui.a.n();
                        ekrwVarN.X(cqnc.r, conversationIdType2.toString());
                        ekrwVarN.X(cqnc.N, str2);
                        ((eksl) ekrwVarN.h("com/google/android/apps/messaging/shared/rcs/groups/recovery/RecoverDisabledRcsGroupHandler", "recoverDisabledRcsGroupWithChatApi", 205, "RecoverDisabledRcsGroupHandler.java")).q("Successfully initiated recovering a disabled RCs group with ChatApi.");
                        return cbcw.i();
                    }
                }, ciuiVar.b);
            }
        }, eoscVar);
    }
}
