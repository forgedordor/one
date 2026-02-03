package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.concurrent.Executor;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aaoh extends dqpi {
    public static final cczi a = cdag.h(cdag.b, "enable_too_many_1on1_participants_check", false);
    public final Executor b;
    public final aaow c;
    public final brdp d;
    private final dqsn e;

    public aaoh(Executor executor, dqsn dqsnVar, aaow aaowVar) {
        brdr brdrVarD = MessagesTable.d();
        brdrVarD.A("messageStatusQuery");
        brdrVarD.f(new Function() { // from class: aaod
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                cczi ccziVar = aaoh.a;
                return ((bran) obj).a;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        this.d = brdrVarD.b();
        this.b = executor;
        this.e = dqsnVar;
        this.c = aaowVar;
    }

    @Override // defpackage.dqpi
    public final /* bridge */ /* synthetic */ void b(dqwl dqwlVar, dqsd dqsdVar) {
        final MessagesTable.BindData bindData = (MessagesTable.BindData) dqsdVar.b();
        if (bindData != null) {
            this.e.g(new dqsm() { // from class: aaof
                @Override // defpackage.dqsm
                public final eieu a() {
                    cczi ccziVar = aaoh.a;
                    return eiiy.k("MTCL::onChangeInTransaction::runAfterCommit");
                }
            }, null, new Runnable() { // from class: aaog
                @Override // java.lang.Runnable
                public final void run() {
                    aaow aaowVar = this.a.c;
                    eosc eoscVar = (eosc) aaowVar.a.b();
                    eoscVar.getClass();
                    eosc eoscVar2 = (eosc) aaowVar.b.b();
                    eoscVar2.getClass();
                    aapx aapxVar = (aapx) aaowVar.c.b();
                    aapxVar.getClass();
                    final aaov aaovVar = new aaov(eoscVar, eoscVar2, aapxVar, bindData);
                    eijx.f(new Runnable() { // from class: aaor
                        @Override // java.lang.Runnable
                        public final void run() {
                            eksp ekspVar = aaov.a;
                            eksl ekslVar = (eksl) ekspVar.n().h("com/google/android/apps/messaging/custodian/inspectors/misthreading/TooManyParticipantsInOneOnOne", "evaluate", 50, "TooManyParticipantsInOneOnOne.java");
                            aaov aaovVar2 = aaovVar;
                            final MessagesTable.BindData bindData2 = aaovVar2.e;
                            ekslVar.D("Starting evaluation for message %s in conversation %s", bindData2.E(), bindData2.D());
                            botb botbVarE = botm.e();
                            botbVarE.A("getConversationBindDataFromMessage");
                            botbVarE.i(new Function() { // from class: aaou
                                @Override // java.util.function.Function
                                /* renamed from: andThen */
                                public final /* synthetic */ Function mo536andThen(Function function) {
                                    return Function$CC.$default$andThen(this, function);
                                }

                                @Override // java.util.function.Function
                                public final Object apply(Object obj) {
                                    botl botlVar = (botl) obj;
                                    eksp ekspVar2 = aaov.a;
                                    ConversationIdType conversationIdTypeD = bindData2.D();
                                    conversationIdTypeD.getClass();
                                    botlVar.r(conversationIdTypeD);
                                    return botlVar;
                                }

                                public final /* synthetic */ Function compose(Function function) {
                                    return Function$CC.$default$compose(this, function);
                                }
                            });
                            Optional optionalOfNullable = Optional.ofNullable((bojh) botbVarE.b().l());
                            if (!optionalOfNullable.isEmpty() && ((bojh) optionalOfNullable.get()).k() == 0) {
                                bojh bojhVar = (bojh) optionalOfNullable.get();
                                brdr brdrVarD = MessagesTable.d();
                                brdrVarD.A("getConversationParticipantIds");
                                brdrVarD.h(new Function() { // from class: aaos
                                    @Override // java.util.function.Function
                                    /* renamed from: andThen */
                                    public final /* synthetic */ Function mo536andThen(Function function) {
                                        return Function$CC.$default$andThen(this, function);
                                    }

                                    @Override // java.util.function.Function
                                    public final Object apply(Object obj) {
                                        brec brecVar = (brec) obj;
                                        eksp ekspVar2 = aaov.a;
                                        brecVar.m(bindData2.D());
                                        brecVar.aj(100, 117);
                                        return brecVar;
                                    }

                                    public final /* synthetic */ Function compose(Function function) {
                                        return Function$CC.$default$compose(this, function);
                                    }
                                });
                                brao braoVar = MessagesTable.c.c;
                                brdrVarD.c(braoVar);
                                brdrVarD.w(braoVar);
                                ekhx ekhxVar = (ekhx) brdrVarD.b().E().map(new Function() { // from class: aaot
                                    @Override // java.util.function.Function
                                    /* renamed from: andThen */
                                    public final /* synthetic */ Function mo536andThen(Function function) {
                                        return Function$CC.$default$andThen(this, function);
                                    }

                                    @Override // java.util.function.Function
                                    public final Object apply(Object obj) {
                                        eksp ekspVar2 = aaov.a;
                                        String strAa = ((MessagesTable.BindData) obj).aa();
                                        strAa.getClass();
                                        return strAa;
                                    }

                                    public final /* synthetic */ Function compose(Function function) {
                                        return Function$CC.$default$compose(this, function);
                                    }
                                }).collect(ekcv.b);
                                ((eksl) ekspVar.n().h("com/google/android/apps/messaging/custodian/inspectors/misthreading/TooManyParticipantsInOneOnOne", "getConversationParticipantIds", 110, "TooManyParticipantsInOneOnOne.java")).I("Conversation %s had participants %s when evaluating message %s", bojhVar.C(), ekhxVar, bindData2.E());
                                if (ekhxVar.size() > 1) {
                                    aapx aapxVar2 = aaovVar2.d;
                                    aaps aapsVar = new aaps();
                                    aapsVar.d(emvl.TOO_MANY_PARTICIPANTS_IN_ONE_ON_ONE_CONVERSATION);
                                    ConversationIdType conversationIdTypeD = bindData2.D();
                                    conversationIdTypeD.getClass();
                                    aapsVar.c(conversationIdTypeD);
                                    aapsVar.b = Optional.of(bindData2.E().b());
                                    aapxVar2.b(aapsVar.e());
                                    ((eksl) ekspVar.n().h("com/google/android/apps/messaging/custodian/inspectors/misthreading/TooManyParticipantsInOneOnOne", "evaluate", 64, "TooManyParticipantsInOneOnOne.java")).D("Conversation %s at message %s had too many participants", bindData2.D(), bindData2.E());
                                }
                            }
                        }
                    }, aaovVar.b).k(auvh.b(), aaovVar.c);
                }
            });
        }
    }
}
