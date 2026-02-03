package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.HashSet;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aano extends dqpi {
    public static final /* synthetic */ int c = 0;
    public final aamn a;
    public final bosz b;
    private final dqsn d;

    public aano(dqsn dqsnVar, aamn aamnVar) {
        botb botbVarE = botm.e();
        botbVarE.A("activeRcsGroupConversationIdQuery");
        botbVarE.g(new Function() { // from class: aank
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                int i = aano.c;
                return ((bopp) obj).a;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        botbVarE.i(new Function() { // from class: aanl
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                botl botlVar = (botl) obj;
                int i = aano.c;
                botlVar.j(2);
                botlVar.x(0);
                botlVar.F();
                botlVar.H();
                return botlVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        this.b = botbVarE.b();
        this.d = dqsnVar;
        this.a = aamnVar;
    }

    @Override // defpackage.dqpi
    public final /* bridge */ /* synthetic */ void b(dqwl dqwlVar, dqsd dqsdVar) {
        final bojh bojhVar = (bojh) dqsdVar.b();
        if (bojhVar != null && bojhVar.k() == 2 && bojhVar.n() == 0) {
            final String strAe = bojhVar.ae();
            if (ejwk.c(strAe)) {
                return;
            }
            this.d.g(new dqsm() { // from class: aanm
                @Override // defpackage.dqsm
                public final eieu a() {
                    int i = aano.c;
                    return eiiy.k("FCTCL::onChangeInTransaction::runAfterCommit");
                }
            }, null, new Runnable() { // from class: aann
                @Override // java.lang.Runnable
                public final void run() {
                    aamn aamnVar = this.a.a;
                    fcsu fcsuVar = aamnVar.a;
                    ConversationIdType conversationIdTypeC = bojhVar.C();
                    eosc eoscVar = (eosc) fcsuVar.b();
                    eoscVar.getClass();
                    eosc eoscVar2 = (eosc) aamnVar.b.b();
                    eoscVar2.getClass();
                    aapx aapxVar = (aapx) aamnVar.c.b();
                    aapxVar.getClass();
                    conversationIdTypeC.getClass();
                    String str = strAe;
                    str.getClass();
                    final aamm aammVar = new aamm(eoscVar, eoscVar2, aapxVar, conversationIdTypeC, str);
                    eijx.f(new Runnable() { // from class: aaml
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // java.lang.Runnable
                        public final void run() {
                            aamm aammVar2 = aammVar;
                            final String str2 = aammVar2.f;
                            if (str2.isEmpty()) {
                                ((eksl) aamm.a.n().h("com/google/android/apps/messaging/custodian/inspectors/forking/conversationstable/DuplicateRcsGroupIdDatabaseChecker", "evaluate", 68, "DuplicateRcsGroupIdDatabaseChecker.java")).q("Skipping evaluations because RCS group ID is empty");
                                return;
                            }
                            eksl ekslVar = (eksl) aamm.a.n().h("com/google/android/apps/messaging/custodian/inspectors/forking/conversationstable/DuplicateRcsGroupIdDatabaseChecker", "evaluate", 71, "DuplicateRcsGroupIdDatabaseChecker.java");
                            final ConversationIdType conversationIdType = aammVar2.e;
                            ekslVar.D("Starting evaluation for conversation %s with RCS group ID %s", conversationIdType, str2);
                            ejwl.b(!str2.isEmpty(), "RCS group ID is empty");
                            botb botbVarE = botm.e();
                            botbVarE.A("getForkedConversationJoinStates");
                            botbVarE.g(new Function() { // from class: aamj
                                @Override // java.util.function.Function
                                /* renamed from: andThen */
                                public final /* synthetic */ Function mo536andThen(Function function) {
                                    return Function$CC.$default$andThen(this, function);
                                }

                                @Override // java.util.function.Function
                                public final Object apply(Object obj) {
                                    eksp ekspVar = aamm.a;
                                    return ((bopp) obj).N;
                                }

                                public final /* synthetic */ Function compose(Function function) {
                                    return Function$CC.$default$compose(this, function);
                                }
                            });
                            botbVarE.i(new Function() { // from class: aamk
                                @Override // java.util.function.Function
                                /* renamed from: andThen */
                                public final /* synthetic */ Function mo536andThen(Function function) {
                                    return Function$CC.$default$andThen(this, function);
                                }

                                @Override // java.util.function.Function
                                public final Object apply(Object obj) {
                                    botl botlVar = (botl) obj;
                                    eksp ekspVar = aamm.a;
                                    botlVar.w(conversationIdType);
                                    botlVar.E(str2);
                                    return botlVar;
                                }

                                public final /* synthetic */ Function compose(Function function) {
                                    return Function$CC.$default$compose(this, function);
                                }
                            });
                            bopr boprVar = (bopr) botbVarE.b().q(botm.c.N);
                            try {
                                ekgb ekgbVarO = boprVar.o();
                                boprVar.close();
                                if (ekgbVarO.isEmpty()) {
                                    return;
                                }
                                aaps aapsVar = new aaps();
                                aapsVar.d(emvl.NEW_CONVERSATION_WITH_EXISTING_RCS_GROUP_ID);
                                ConversationIdType conversationIdType2 = aammVar2.e;
                                aapsVar.c(conversationIdType2);
                                aapsVar.c = Optional.of(ekgbVarO);
                                final String str3 = aammVar2.f;
                                ejwl.b(!str3.isEmpty(), "RCS group ID is empty");
                                HashSet hashSet = new HashSet();
                                botb botbVarE2 = botm.e();
                                botbVarE2.A("getForkedConversationDifferentNamesLocalCount");
                                botbVarE2.f(new Function() { // from class: aamh
                                    @Override // java.util.function.Function
                                    /* renamed from: andThen */
                                    public final /* synthetic */ Function mo536andThen(Function function) {
                                        return Function$CC.$default$andThen(this, function);
                                    }

                                    @Override // java.util.function.Function
                                    public final Object apply(Object obj) {
                                        bopp boppVar = (bopp) obj;
                                        eksp ekspVar = aamm.a;
                                        return new bopq[]{boppVar.c, boppVar.d};
                                    }

                                    public final /* synthetic */ Function compose(Function function) {
                                        return Function$CC.$default$compose(this, function);
                                    }
                                });
                                botbVarE2.i(new Function() { // from class: aami
                                    @Override // java.util.function.Function
                                    /* renamed from: andThen */
                                    public final /* synthetic */ Function mo536andThen(Function function) {
                                        return Function$CC.$default$andThen(this, function);
                                    }

                                    @Override // java.util.function.Function
                                    public final Object apply(Object obj) {
                                        botl botlVar = (botl) obj;
                                        eksp ekspVar = aamm.a;
                                        botlVar.E(str3);
                                        return botlVar;
                                    }

                                    public final /* synthetic */ Function compose(Function function) {
                                        return Function$CC.$default$compose(this, function);
                                    }
                                });
                                ekgb ekgbVarZ = botbVarE2.b().z();
                                int size = ekgbVarZ.size();
                                int i = 0;
                                for (int i2 = 0; i2 < size; i2++) {
                                    bojh bojhVar2 = (bojh) ekgbVarZ.get(i2);
                                    if (bojhVar2.H() == bvdp.NAME_IS_AUTOMATIC) {
                                        i = 1;
                                    } else {
                                        hashSet.add(ejwk.b(bojhVar2.Y()));
                                    }
                                }
                                aapsVar.d = Optional.of(Integer.valueOf(hashSet.size() + i));
                                aammVar2.d.b(aapsVar.e());
                                ((eksl) aamm.a.n().h("com/google/android/apps/messaging/custodian/inspectors/forking/conversationstable/DuplicateRcsGroupIdDatabaseChecker", "evaluate", 86, "DuplicateRcsGroupIdDatabaseChecker.java")).I("Conversation %s evaluation: RCS group ID %s occured %d other times", conversationIdType2, str3, Integer.valueOf(((ekoe) ekgbVarO).c));
                            } finally {
                            }
                        }
                    }, aammVar.b).k(auvh.b(), aammVar.c);
                }
            });
        }
    }
}
