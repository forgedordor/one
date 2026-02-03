package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class ckwj implements ckvy {
    public static final eksp a = eksp.c("BugleReactions");
    public final dqsn b;
    public final bxlc c;
    public final Set d;
    public final cogw e;

    public ckwj(dqsn dqsnVar, bxlc bxlcVar, Set set, cogw cogwVar) {
        this.b = dqsnVar;
        this.c = bxlcVar;
        this.d = set;
        this.e = cogwVar;
    }

    @Override // defpackage.ckvy
    public final void a(final ckwl ckwlVar, final MessageIdType messageIdType) {
        eksl ekslVar = (eksl) a.h();
        ekslVar.X(cqnc.s, ckwlVar.a());
        ekslVar.X(ckmz.d, ckwlVar.b());
        ekslVar.X(ckmz.a, messageIdType);
        ((eksl) ekslVar.h("com/google/android/apps/messaging/shared/reactions/transport/handler/ReactionsDatabaseHandlerImpl", "handleReaction", 64, "ReactionsDatabaseHandlerImpl.java")).q("Start persisting a reaction into the database.");
        final Function function = new Function() { // from class: ckwg
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function2) {
                return Function$CC.$default$andThen(this, function2);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                cklu ckluVar = (cklu) ((cklv) obj).toBuilder();
                long epochMilli = this.a.e.f().toEpochMilli();
                ckluVar.copyOnWrite();
                ((cklv) ckluVar.instance).c = epochMilli;
                cklv cklvVar = (cklv) ckluVar.build();
                ckwl ckwlVar2 = ckwlVar;
                int iOrdinal = ckwlVar2.d().ordinal();
                if (iOrdinal != 1) {
                    if (iOrdinal != 2) {
                        throw new IllegalArgumentException("Unknown reaction action.");
                    }
                    ckly cklyVar = ckwlVar2.e().c;
                    if (cklyVar == null) {
                        cklyVar = ckly.a;
                    }
                    cklu ckluVar2 = (cklu) cklvVar.toBuilder();
                    cklw.a(ckluVar2, cklyVar);
                    return (cklv) ckluVar2.build();
                }
                ckmb ckmbVarC = ckwlVar2.c();
                ckmi ckmiVarE = ckwlVar2.e();
                cklu ckluVar3 = (cklu) cklvVar.toBuilder();
                ckly cklyVar2 = ckmiVarE.c;
                if (cklyVar2 == null) {
                    cklyVar2 = ckly.a;
                }
                cklw.a(ckluVar3, cklyVar2);
                int i = 0;
                while (true) {
                    if (i >= ((cklv) ckluVar3.instance).b.size()) {
                        ckmd ckmdVar = (ckmd) ckme.a.createBuilder();
                        ckmdVar.copyOnWrite();
                        ckme ckmeVar = (ckme) ckmdVar.instance;
                        ckmbVarC.getClass();
                        ckmeVar.c = ckmbVarC;
                        ckmeVar.b |= 1;
                        ckmdVar.a(ckmiVarE);
                        ckluVar3.b((ckme) ckmdVar.build());
                        break;
                    }
                    ckme ckmeVarA = ckluVar3.a(i);
                    ckmb ckmbVar = ckmeVarA.c;
                    if (ckmbVar == null) {
                        ckmbVar = ckmb.a;
                    }
                    if (ckmbVar.d.equals(ckmbVarC.d)) {
                        ckmd ckmdVar2 = (ckmd) ckmeVarA.toBuilder();
                        ckmdVar2.a(ckmiVarE);
                        ckluVar3.d(i, ckmdVar2);
                        break;
                    }
                    i++;
                }
                return (cklv) ckluVar3.build();
            }

            public final /* synthetic */ Function compose(Function function2) {
                return Function$CC.$default$compose(this, function2);
            }
        };
        this.b.d("ReactionsDbHandler#updateReactionsTable", new Runnable() { // from class: ckwh
            @Override // java.lang.Runnable
            public final void run() {
                ckmb ckmbVarC;
                final ckwl ckwlVar2 = ckwlVar;
                final ConversationIdType conversationIdTypeA = ckwlVar2.a();
                String[] strArr = bqkl.a;
                bqki bqkiVar = new bqki();
                bqkiVar.ap("removeExistingReactionAnimationEffectFromConversation");
                bqkiVar.f(new Function() { // from class: ckwi
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function2) {
                        return Function$CC.$default$andThen(this, function2);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        bqkk bqkkVar = (bqkk) obj;
                        eksp ekspVar = ckwj.a;
                        bqkg bqkgVarA = bqkl.a();
                        bqkgVarA.f(new Function() { // from class: ckwb
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo536andThen(Function function2) {
                                return Function$CC.$default$andThen(this, function2);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj2) {
                                bqkk bqkkVar2 = (bqkk) obj2;
                                int iIntValue = bqkl.c().intValue();
                                if (iIntValue < 59520) {
                                    dqru.x("animation_effect", iIntValue);
                                }
                                bqkkVar2.ap(new dqpn("message_reactions.animation_effect", 6));
                                return bqkkVar2;
                            }

                            public final /* synthetic */ Function compose(Function function2) {
                                return Function$CC.$default$compose(this, function2);
                            }
                        });
                        bqkgVarA.e(new Function() { // from class: ckwc
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo536andThen(Function function2) {
                                return Function$CC.$default$andThen(this, function2);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj2) {
                                eksp ekspVar2 = ckwj.a;
                                return ((bqjp) obj2).b;
                            }

                            public final /* synthetic */ Function compose(Function function2) {
                                return Function$CC.$default$compose(this, function2);
                            }
                        });
                        brdr brdrVarD = MessagesTable.d();
                        brao braoVar = MessagesTable.c.a;
                        brdrVarD.c(braoVar);
                        final ConversationIdType conversationIdType = conversationIdTypeA;
                        brdrVarD.h(new Function() { // from class: ckwd
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo536andThen(Function function2) {
                                return Function$CC.$default$andThen(this, function2);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj2) {
                                brec brecVar = (brec) obj2;
                                eksp ekspVar2 = ckwj.a;
                                brecVar.m(conversationIdType);
                                return brecVar;
                            }

                            public final /* synthetic */ Function compose(Function function2) {
                                return Function$CC.$default$compose(this, function2);
                            }
                        });
                        bqkgVarA.E(dqts.i(brdrVarD.b(), braoVar, bqkl.c.b).g());
                        bqkkVar.ap(new dqpk("message_reactions.message_id", 3, bqkgVarA.b()));
                        return bqkkVar;
                    }

                    public final /* synthetic */ Function compose(Function function2) {
                        return Function$CC.$default$compose(this, function2);
                    }
                });
                bqkiVar.d();
                bqkiVar.a().e();
                MessageIdType messageIdTypeB = ckwlVar2.b();
                final Function function2 = function;
                bqkl.f(messageIdTypeB, new Consumer() { // from class: ckwe
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void z(Object obj) {
                        eksp ekspVar = ckwj.a;
                        cklv cklvVarN = ((bqit) obj).n();
                        if (cklvVarN == null) {
                            cklvVarN = cklv.a;
                        }
                        ckwl ckwlVar3 = ckwlVar2;
                        cklv cklvVar = (cklv) function2.apply(cklvVarN);
                        String[] strArr2 = bqkl.a;
                        bqki bqkiVar2 = new bqki();
                        bqkiVar2.ap("updateReactedMessage");
                        bqkiVar2.e(cklvVar);
                        if (ckwlVar3.d() == ckmc.ADD_REACTION) {
                            ckmb ckmbVarC2 = ckwlVar3.c();
                            int iIntValue = bqkl.c().intValue();
                            int iIntValue2 = bqkl.c().intValue();
                            if (iIntValue2 < 59520) {
                                dqru.x("animation_effect", iIntValue2);
                            }
                            if (iIntValue >= 59520) {
                                if (ckmbVarC2 == null) {
                                    bqkiVar2.a.putNull("animation_effect");
                                } else {
                                    bqkiVar2.a.put("animation_effect", ckmbVarC2.toByteArray());
                                }
                            }
                        }
                        bqkiVar2.c(ckwlVar3.b());
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                }, new Runnable() { // from class: ckwf
                    @Override // java.lang.Runnable
                    public final void run() {
                        eksp ekspVar = ckwj.a;
                        cklv cklvVar = (cklv) function2.apply(cklv.a);
                        String[] strArr2 = bqkl.a;
                        bqiy bqiyVar = new bqiy();
                        ckwl ckwlVar3 = ckwlVar2;
                        bqiyVar.e(ckwlVar3.b());
                        bqiyVar.h(cklvVar);
                        if (ckwlVar3.d() == ckmc.ADD_REACTION) {
                            bqiyVar.c(ckwlVar3.c());
                        }
                        bqiyVar.a().s();
                    }
                });
                final MessageIdType messageIdType2 = messageIdType;
                if (!messageIdType2.c()) {
                    int iOrdinal = ckwlVar2.d().ordinal();
                    if (iOrdinal == 1) {
                        ckmbVarC = ckwlVar2.c();
                    } else {
                        if (iOrdinal != 2) {
                            throw new IllegalArgumentException("Could not get reaction for action: " + ckwlVar2.d().a());
                        }
                        ckmbVarC = ckmg.a(ckml.REACTION_TYPE_UNSPECIFIED);
                    }
                    bqiy bqiyVar = new bqiy();
                    bqiyVar.e(messageIdType2);
                    bqiyVar.f(ckwlVar2.b());
                    bqiyVar.d(ckmbVarC);
                    ckml ckmlVarB = ckml.b(ckmbVarC.e);
                    if (ckmlVarB == null) {
                        ckmlVarB = ckml.UNRECOGNIZED;
                    }
                    bqiyVar.g(ckmlVarB);
                    final bqit bqitVarA = bqiyVar.a();
                    final dqsy dqsyVarB = bqkl.b();
                    dqru.b(bqkl.b(), "message_reactions", bqitVarA, new Function() { // from class: bqin
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo536andThen(Function function3) {
                            return Function$CC.$default$andThen(this, function3);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            return Long.valueOf(dqsyVarB.Q("message_reactions", (dqst) obj, 5));
                        }

                        public final /* synthetic */ Function compose(Function function3) {
                            return Function$CC.$default$compose(this, function3);
                        }
                    }, new Consumer() { // from class: bqio
                        @Override // java.util.function.Consumer
                        /* renamed from: accept */
                        public final void z(Object obj) {
                            bqitVarA.r((Long) obj);
                        }

                        public final /* synthetic */ Consumer andThen(Consumer consumer) {
                            return Consumer$CC.$default$andThen(this, consumer);
                        }
                    });
                }
                final ckwj ckwjVar = this.a;
                dqsm dqsmVar = new dqsm() { // from class: ckvz
                    @Override // defpackage.dqsm
                    public final eieu a() {
                        eksp ekspVar = ckwj.a;
                        return eiiy.k("RDHI::updateReactionsTable::runAfterCommit");
                    }
                };
                String strValueOf = String.valueOf(ckwlVar2.b().b());
                ckwjVar.b.g(dqsmVar, "reactionFor".concat(strValueOf), new Runnable() { // from class: ckwa
                    @Override // java.lang.Runnable
                    public final void run() {
                        ckwl ckwlVar3 = ckwlVar2;
                        ckwj ckwjVar2 = ckwjVar;
                        ckwjVar2.c.l(ckwlVar3.a(), ckwlVar3.b(), new String[0]);
                        eksl ekslVar2 = (eksl) ckwj.a.h();
                        ekslVar2.X(cqnc.s, ckwlVar3.a());
                        ekslVar2.X(ckmz.d, ckwlVar3.b());
                        ekslVar2.X(ckmz.a, messageIdType2);
                        ((eksl) ekslVar2.h("com/google/android/apps/messaging/shared/reactions/transport/handler/ReactionsDatabaseHandlerImpl", "updateReactionsTable", 121, "ReactionsDatabaseHandlerImpl.java")).q("Persisted reaction in the database. Notifying about message change.");
                        ekqg ekqgVarListIterator = ((ekph) ckwjVar2.d).listIterator();
                        while (ekqgVarListIterator.hasNext()) {
                            ((baqi) ((ckwm) ekqgVarListIterator.next()).a.b()).b(ckwlVar3.a(), false, bvdk.UNARCHIVED);
                        }
                    }
                });
            }
        });
    }
}
