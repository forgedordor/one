package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.lang.Iterable$EL;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import j$.util.stream.Collector;
import j$.util.stream.Stream;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bbcw {
    public static final eksp a = eksp.c("BugleDataModel");
    public static final cqce b = cqce.g("Bugle", "UpdateBugleParticipantAndConversations");
    public final fcsu c;
    public final fcsu d;
    public final fcsu e;
    public final dqsn f;
    public final eygg g;
    public final eygg h;
    public final fcsu i;
    public final fcsu j;
    public final fcsu k;
    public final fcsu l;
    public final fcsu m;
    private final fcsu n;
    private final fcsu o;

    public bbcw(fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, dqsn dqsnVar, fcsu fcsuVar5, eygg eyggVar, eygg eyggVar2, fcsu fcsuVar6, fcsu fcsuVar7, fcsu fcsuVar8, fcsu fcsuVar9, fcsu fcsuVar10) {
        this.n = fcsuVar;
        this.c = fcsuVar2;
        this.d = fcsuVar3;
        this.e = fcsuVar4;
        this.f = dqsnVar;
        this.o = fcsuVar5;
        this.g = eyggVar;
        this.h = eyggVar2;
        this.i = fcsuVar6;
        this.j = fcsuVar7;
        this.k = fcsuVar8;
        this.l = fcsuVar9;
        this.m = fcsuVar10;
    }

    public final int a(bsbs bsbsVar, bbcx bbcxVar) {
        return ((Boolean) ((cczi) bbcb.b.get()).e()).booleanValue() ? ((bbce) this.o.b()).b(bsbsVar, bbcxVar) : ((Boolean) ((cczi) bbcb.a.get()).e()).booleanValue() ? ((bbce) this.o.b()).a(bsbsVar.b()) : bsbsVar.b().e();
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [alqm, java.lang.Object] */
    public final void b(final ParticipantsTable.BindData bindData, final ConversationIdType conversationIdType) {
        final Optional optionalOf;
        eieu eieuVarK = eiiy.k("UpdateBugleParticipantAndConversations.updateBugleParticipantToMoreCanonicalAndCompareAddress");
        try {
            alqm alqmVarT = ((alrj) this.n.b()).t(bindData);
            if (alqmVarT.y()) {
                optionalOf = Optional.of(alqmVarT);
            } else {
                ((eksl) ((eksl) a.h()).h("com/google/android/apps/messaging/shared/datamodel/data/participant/UpdateBugleParticipantAndConversations", "createMessagingIdentityFromE164", 320, "UpdateBugleParticipantAndConversations.java")).t("Input was not E164 %s, skipping the Bugle participant update", cqcv.b(alqmVarT.n()));
                optionalOf = Optional.empty();
            }
            if (!optionalOf.isEmpty()) {
                ((eksl) ((eksl) a.h()).h("com/google/android/apps/messaging/shared/datamodel/data/participant/UpdateBugleParticipantAndConversations", "updateBugleParticipantToMoreCanonicalAndCompareAddress", 288, "UpdateBugleParticipantAndConversations.java")).t("Verifying whether the Bugle participant can be updated to E164 %s", cqcv.b(optionalOf.get().n()));
                dqsn dqsnVar = this.f;
                final bbcv bbcvVar = (bbcv) dqsnVar.c("UpdateBugleParticipantAndConversations#updateBugleParticipantToMoreCanonicalAndCompareAddress", new ejxr() { // from class: bbcr
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Removed duplicated region for block: B:11:0x008d A[RETURN] */
                    /* JADX WARN: Removed duplicated region for block: B:12:0x008e  */
                    /* JADX WARN: Type inference failed for: r3v1, types: [alqm, java.lang.Object] */
                    @Override // defpackage.ejxr
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final java.lang.Object get() {
                        /*
                            Method dump skipped, instructions count: 529
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: defpackage.bbcr.get():java.lang.Object");
                    }
                });
                if (bbcvVar != null) {
                    dqsnVar.d("UpdateBugleParticipantAndConversations#updateParticipantInConversations", new Runnable() { // from class: bbcg
                        @Override // java.lang.Runnable
                        public final void run() {
                            ParticipantsTable.BindData bindData2;
                            bbcv bbcvVar2 = bbcvVar;
                            ParticipantsTable.BindData bindDataA = bbcvVar2.a();
                            ParticipantsTable.BindData bindDataB = bbcvVar2.b();
                            final String strC = bbcvVar2.c();
                            String strR = bindDataA.R();
                            String strV = bindDataA.V();
                            ConversationIdType conversationIdType2 = conversationIdType;
                            if (strV == null) {
                                eksl ekslVar = (eksl) bbcw.a.h();
                                ekslVar.X(cqnc.r, conversationIdType2.toString());
                                ((eksl) ekslVar.h("com/google/android/apps/messaging/shared/datamodel/data/participant/UpdateBugleParticipantAndConversations", "updateParticipantInConversationsAndUpdateParticipantSendDestination", 165, "UpdateBugleParticipantAndConversations.java")).q("Existing participant's send destination is null.");
                                return;
                            }
                            final bbcw bbcwVar = this.a;
                            if (strC.equals(strR)) {
                                bindData2 = bindDataB;
                            } else {
                                eksl ekslVar2 = (eksl) bbcw.a.h();
                                ekslVar2.X(cqnc.p, strR);
                                ((eksl) ekslVar2.h("com/google/android/apps/messaging/shared/datamodel/data/participant/UpdateBugleParticipantAndConversations", "updateParticipantInConversationsAndUpdateParticipantSendDestination", 174, "UpdateBugleParticipantAndConversations.java")).t("Updating the Bugle participant in all conversations to participant id %s", strC);
                                if (strR.equals(strC)) {
                                    throw new IllegalArgumentException("Old participant id cannot be the same as the new participant id");
                                }
                                eieu eieuVarK2 = eiiy.k("UpdateBugleParticipantAndConversations#updateParticipantForAlLConversations");
                                try {
                                    ecem.b();
                                    final long j = Long.parseLong(strR);
                                    final long j2 = Long.parseLong(strC);
                                    final ekhv ekhvVar = new ekhv();
                                    bindData2 = bindDataB;
                                    ekhx ekhxVar = (ekhx) bbcwVar.f.c("UpdateBugleParticipantAndConversations#replaceParticipantsAndGetConversationIds", new ejxr() { // from class: bbcs
                                        @Override // defpackage.ejxr
                                        public final Object get() {
                                            String[] strArr = boiv.a;
                                            boil boilVar = new boil();
                                            boilVar.f("replaceParticipantInAllGroupConversations");
                                            final long j3 = j;
                                            boilVar.c(new Function() { // from class: bbct
                                                @Override // java.util.function.Function
                                                /* renamed from: andThen */
                                                public final /* synthetic */ Function mo536andThen(Function function) {
                                                    return Function$CC.$default$andThen(this, function);
                                                }

                                                @Override // java.util.function.Function
                                                public final Object apply(Object obj) {
                                                    boiu boiuVar = (boiu) obj;
                                                    eksp ekspVar = bbcw.a;
                                                    boiuVar.e(j3);
                                                    return boiuVar;
                                                }

                                                public final /* synthetic */ Function compose(Function function) {
                                                    return Function$CC.$default$compose(this, function);
                                                }
                                            });
                                            final boit boitVar = (boit) boilVar.b().b;
                                            ekgb ekgbVar = (ekgb) boiv.a().p("conversation_to_participants-deleteAndReturnDeletedRows-txn", new ejxr() { // from class: bohd
                                                @Override // defpackage.ejxr
                                                public final Object get() {
                                                    String[] strArr2 = boiv.a;
                                                    boiq boiqVar = new boiq(boiv.a);
                                                    boit boitVar2 = boitVar;
                                                    boiqVar.k(boitVar2);
                                                    boiqVar.A("conversation_to_participants-deleteAndReturnDeletedRows-query");
                                                    ekgb ekgbVarZ = boiqVar.b().z();
                                                    boil boilVar2 = new boil();
                                                    boilVar2.b = boitVar2;
                                                    boilVar2.f("conversation_to_participants-deleteAndReturnDeletedRows-delete");
                                                    boilVar2.b().b();
                                                    return ekgbVarZ;
                                                }
                                            });
                                            final long j4 = j2;
                                            Iterable$EL.forEach(ekgbVar, new Consumer() { // from class: bbcu
                                                @Override // java.util.function.Consumer
                                                /* renamed from: accept */
                                                public final void z(Object obj) {
                                                    bohm bohmVar = (bohm) obj;
                                                    eksp ekspVar = bbcw.a;
                                                    String[] strArr2 = boiv.a;
                                                    bohr bohrVar = new bohr();
                                                    bohrVar.c(bohmVar.n());
                                                    bohrVar.e(j4);
                                                    bohrVar.d(bohmVar.o());
                                                    bohrVar.f(bohmVar.m());
                                                    bohm bohmVarA = bohrVar.a();
                                                    final dqsy dqsyVarA = boiv.a();
                                                    dqru.b(boiv.a(), "conversation_to_participants", bohmVarA, new Function() { // from class: bohh
                                                        @Override // java.util.function.Function
                                                        /* renamed from: andThen */
                                                        public final /* synthetic */ Function mo536andThen(Function function) {
                                                            return Function$CC.$default$andThen(this, function);
                                                        }

                                                        @Override // java.util.function.Function
                                                        public final Object apply(Object obj2) {
                                                            return Long.valueOf(dqsyVarA.Q("conversation_to_participants", (dqst) obj2, 5));
                                                        }

                                                        public final /* synthetic */ Function compose(Function function) {
                                                            return Function$CC.$default$compose(this, function);
                                                        }
                                                    }, new Consumer() { // from class: bohi
                                                        @Override // java.util.function.Consumer
                                                        /* renamed from: accept */
                                                        public final void z(Object obj2) {
                                                        }

                                                        public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                                            return Consumer$CC.$default$andThen(this, consumer);
                                                        }
                                                    });
                                                }

                                                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                                    return Consumer$CC.$default$andThen(this, consumer);
                                                }
                                            });
                                            Stream map = Collection.EL.stream(ekgbVar).map(new Function() { // from class: bbch
                                                @Override // java.util.function.Function
                                                /* renamed from: andThen */
                                                public final /* synthetic */ Function mo536andThen(Function function) {
                                                    return Function$CC.$default$andThen(this, function);
                                                }

                                                @Override // java.util.function.Function
                                                public final Object apply(Object obj) {
                                                    return ((bohm) obj).n();
                                                }

                                                public final /* synthetic */ Function compose(Function function) {
                                                    return Function$CC.$default$compose(this, function);
                                                }
                                            });
                                            Collector collector = ekcv.b;
                                            Iterable iterable = (Iterable) map.collect(collector);
                                            ekhv ekhvVar2 = ekhvVar;
                                            ekhvVar2.j(iterable);
                                            bocd bocdVarB = bocg.b();
                                            bocdVarB.ap("replaceParticipantInAllConversations");
                                            dqru.u(bocdVarB.a, "participant_id", j4);
                                            bocdVarB.af(new boce((bocf) new Function() { // from class: bbco
                                                @Override // java.util.function.Function
                                                /* renamed from: andThen */
                                                public final /* synthetic */ Function mo536andThen(Function function) {
                                                    return Function$CC.$default$andThen(this, function);
                                                }

                                                @Override // java.util.function.Function
                                                public final Object apply(Object obj) {
                                                    bocf bocfVar = (bocf) obj;
                                                    eksp ekspVar = bbcw.a;
                                                    bocfVar.c(j3);
                                                    return bocfVar;
                                                }

                                                public final /* synthetic */ Function compose(Function function) {
                                                    return Function$CC.$default$compose(this, function);
                                                }
                                            }.apply(new bocf())));
                                            final bocc boccVarB = bocdVarB.b();
                                            final int i = 5;
                                            ekhvVar2.j((ekhx) Collection.EL.stream((ekgb) bocg.c().p("conversation_participants.updateAndReturnUpdatedRows-txn", new ejxr() { // from class: bocb
                                                /* JADX WARN: Multi-variable type inference failed */
                                                @Override // defpackage.ejxr
                                                public final Object get() {
                                                    boca bocaVarA = bocg.a();
                                                    bocaVarA.A("conversation_participants.updateAndReturnUpdatedRows-query");
                                                    bocc boccVar = boccVarB;
                                                    ekgb ekgbVar2 = boccVar.e;
                                                    int i2 = ((ekoe) ekgbVar2).c;
                                                    for (int i3 = 0; i3 < i2; i3++) {
                                                        bocaVarA.k((boce) ((dqyj) ekgbVar2.get(i3)));
                                                    }
                                                    dqpb dqpbVar = (dqpb) boccVar.d;
                                                    if (dqpbVar.b) {
                                                        bocf bocfVar = new bocf();
                                                        bocfVar.ar(boccVar.h());
                                                        bocaVarA.k(new boce(bocfVar));
                                                    }
                                                    if (dqpbVar.c) {
                                                        bocaVarA.s();
                                                    }
                                                    Integer num = i;
                                                    ekgb ekgbVarZ = bocaVarA.b().z();
                                                    num.intValue();
                                                    boccVar.t(5);
                                                    return ekgbVarZ;
                                                }
                                            })).map(new Function() { // from class: bbcp
                                                @Override // java.util.function.Function
                                                /* renamed from: andThen */
                                                public final /* synthetic */ Function mo536andThen(Function function) {
                                                    return Function$CC.$default$andThen(this, function);
                                                }

                                                @Override // java.util.function.Function
                                                public final Object apply(Object obj) {
                                                    return ((boar) obj).m();
                                                }

                                                public final /* synthetic */ Function compose(Function function) {
                                                    return Function$CC.$default$compose(this, function);
                                                }
                                            }).collect(collector));
                                            ekhx ekhxVarG = ekhvVar2.g();
                                            cqbd cqbdVarA = bbcw.b.a();
                                            cqbdVarA.I("Conversations with replaced participants");
                                            cqbdVarA.I(ekhxVarG);
                                            cqbdVarA.r();
                                            return ekhxVarG;
                                        }
                                    });
                                    eieuVarK2.close();
                                    if (!ekhxVar.isEmpty()) {
                                        ((ains) bbcwVar.l.b()).c("Bugle.Datamodel.Participant.UpdateParticipantInConversations");
                                    }
                                    if (ekhxVar.isEmpty()) {
                                        eksl ekslVar3 = (eksl) bbcw.a.h();
                                        ekslVar3.X(cqnc.p, strC);
                                        ((eksl) ekslVar3.h("com/google/android/apps/messaging/shared/datamodel/data/participant/UpdateBugleParticipantAndConversations", "updateParticipantInConversationsAndUpdateParticipantSendDestination", 192, "UpdateBugleParticipantAndConversations.java")).t("No conversation ids with existing participant %s found", strR);
                                        return;
                                    }
                                    ParticipantsTable.BindData bindDataB2 = ((bbca) bbcwVar.e.b()).b(strC);
                                    if (bindDataB2 == null) {
                                        eksl ekslVar4 = (eksl) bbcw.a.h();
                                        ekslVar4.X(cqnc.p, strC);
                                        ekslVar4.X(cqnc.r, conversationIdType2.toString());
                                        ((eksl) ekslVar4.h("com/google/android/apps/messaging/shared/datamodel/data/participant/UpdateBugleParticipantAndConversations", "updateParticipantInConversationsAndUpdateParticipantSendDestination", 207, "UpdateBugleParticipantAndConversations.java")).q("Found or created participant' is null.");
                                        return;
                                    }
                                    fcsu fcsuVar = bbcwVar.c;
                                    ((bakt) fcsuVar.b()).Z(ekhxVar, bindDataB2);
                                    ((bakt) fcsuVar.b()).Y(ekhxVar, strC, strR);
                                    for (bbap bbapVar : (Set) ((bbaq) bbcwVar.h.b()).a.b()) {
                                        eieu eieuVarB = bbapVar.b();
                                        try {
                                            bbapVar.d();
                                            if (eieuVarB != null) {
                                                eieuVarB.close();
                                            }
                                        } finally {
                                        }
                                    }
                                    bbcwVar.f.g(new dqsm() { // from class: bbci
                                        @Override // defpackage.dqsm
                                        public final eieu a() {
                                            eksp ekspVar = bbcw.a;
                                            return eiiy.k("UBPAC::afterParticipantInConversationChanged::runAfterCommit");
                                        }
                                    }, "UpdateBugleParticipantAndConversations#afterParticipantInConversationChanged", new Runnable() { // from class: bbcj
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            for (bbap bbapVar2 : (Set) ((bbaq) bbcwVar.h.b()).a.b()) {
                                                eieu eieuVarA = bbapVar2.a();
                                                try {
                                                    bbapVar2.c();
                                                    if (eieuVarA != null) {
                                                        eieuVarA.close();
                                                    }
                                                } catch (Throwable th) {
                                                    if (eieuVarA != null) {
                                                        try {
                                                            eieuVarA.close();
                                                        } catch (Throwable th2) {
                                                            th.addSuppressed(th2);
                                                        }
                                                    }
                                                    throw th;
                                                }
                                            }
                                        }
                                    });
                                } finally {
                                }
                            }
                            if (strV.equals(bindData2.V())) {
                                return;
                            }
                            String strV2 = bindData.V();
                            strV2.getClass();
                            bbcx bbcxVar = bbcx.c;
                            bsbs bsbsVarF = ParticipantsTable.f();
                            bsbsVarF.ap("updateSendDestinationForParticipantId");
                            bsbsVarF.N(strV2);
                            bsbsVarF.U(new Function() { // from class: bbcq
                                @Override // java.util.function.Function
                                /* renamed from: andThen */
                                public final /* synthetic */ Function mo536andThen(Function function) {
                                    return Function$CC.$default$andThen(this, function);
                                }

                                @Override // java.util.function.Function
                                public final Object apply(Object obj) {
                                    bsbx bsbxVar = (bsbx) obj;
                                    eksp ekspVar = bbcw.a;
                                    bsbxVar.k(strC);
                                    return bsbxVar;
                                }

                                public final /* synthetic */ Function compose(Function function) {
                                    return Function$CC.$default$compose(this, function);
                                }
                            });
                            if (bbcwVar.a(bsbsVarF, bbcxVar) == 1) {
                                ((ains) bbcwVar.l.b()).c("Bugle.Datamodel.Participant.UpdateParticipantSendDestination");
                                ((eksl) ((eksl) bbcw.a.h()).h("com/google/android/apps/messaging/shared/datamodel/data/participant/UpdateBugleParticipantAndConversations", "updateSendDestinationForParticipantId", 495, "UpdateBugleParticipantAndConversations.java")).t("Successfully updated the Bugle participant to E164 %s", cqcv.b(strV2));
                            }
                            for (bbav bbavVar : (Set) ((bbaw) bbcwVar.g.b()).a.b()) {
                                eieu eieuVarB2 = bbavVar.b();
                                try {
                                    bbavVar.d();
                                    if (eieuVarB2 != null) {
                                        eieuVarB2.close();
                                    }
                                } finally {
                                }
                            }
                            bbcwVar.f.g(new dqsm() { // from class: bbck
                                @Override // defpackage.dqsm
                                public final eieu a() {
                                    eksp ekspVar = bbcw.a;
                                    return eiiy.k("UBPAC::afterParticipantSendDestinationUpdated::runAfterCommit");
                                }
                            }, "UpdateBugleParticipantAndConversations#afterParticipantSendDestinationUpdated", new Runnable() { // from class: bbcl
                                @Override // java.lang.Runnable
                                public final void run() {
                                    for (bbav bbavVar2 : (Set) ((bbaw) bbcwVar.g.b()).a.b()) {
                                        eieu eieuVarA = bbavVar2.a();
                                        try {
                                            bbavVar2.c();
                                            if (eieuVarA != null) {
                                                eieuVarA.close();
                                            }
                                        } catch (Throwable th) {
                                            if (eieuVarA != null) {
                                                try {
                                                    eieuVarA.close();
                                                } catch (Throwable th2) {
                                                    th.addSuppressed(th2);
                                                }
                                            }
                                            throw th;
                                        }
                                    }
                                }
                            });
                        }
                    });
                }
            }
            eieuVarK.close();
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
