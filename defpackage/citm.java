package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversation;
import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.DefaultConversation;
import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.lang.Iterable$EL;
import j$.time.Duration;
import j$.time.Instant;
import j$.util.Collection;
import j$.util.Objects;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class citm implements ajzi {
    public static final eksp a = eksp.c("BugleGroupManagement");
    private static final cohg c = new cohf("RcsGroupRecovery::onConversationOpened");
    public final cium b;
    private final eosc d;

    public citm(eosc eoscVar, cium ciumVar) {
        this.d = eoscVar;
        this.b = ciumVar;
    }

    @Override // defpackage.ajzi
    public final eieu a() {
        return c.a();
    }

    @Override // defpackage.ajzi
    public final eiju b(final BugleConversation bugleConversation, ajlm ajlmVar) {
        return eijx.f(new Runnable() { // from class: citk
            @Override // java.lang.Runnable
            public final void run() {
                bopp boppVar = botm.c;
                final int i = 2;
                bopq[] bopqVarArr = {boppVar.a, boppVar.O, boppVar.ao, boppVar.N, boppVar.ak};
                botb botbVarE = botm.e();
                botbVarE.A("RcsGroupRecovery");
                botbVarE.c(bopqVarArr);
                final BugleConversationId bugleConversationId = ((DefaultConversation) bugleConversation).a;
                botbVarE.i(new Function() { // from class: citl
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        botl botlVar = (botl) obj;
                        eksp ekspVar = citm.a;
                        botlVar.r(bugleConversationId.a);
                        return botlVar;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                ekgb ekgbVarZ = botbVarE.b().z();
                if (ekgbVarZ.isEmpty()) {
                    ((eksl) citm.a.n().h("com/google/android/apps/messaging/shared/rcs/groups/recovery/MapiRecoverDisabledRcsGroupOpenConversationListener", "recoverRcsGroup", 76, "MapiRecoverDisabledRcsGroupOpenConversationListener.java")).t("Recover disabled RCS group disabled because conversation[%s] does not exist.", bugleConversationId.b());
                    return;
                }
                bojh bojhVar = (bojh) ekis.l(ekgbVarZ);
                if (!bvdi.d(bojhVar.k())) {
                    ((eksl) citm.a.n().h("com/google/android/apps/messaging/shared/rcs/groups/recovery/MapiRecoverDisabledRcsGroupOpenConversationListener", "recoverRcsGroup", 85, "MapiRecoverDisabledRcsGroupOpenConversationListener.java")).D("Recover disabled RCS group disabled because conversation[%s][%s] is not a RCS group", bugleConversationId.b(), bvdi.a(bojhVar.k()));
                    return;
                }
                citm citmVar = this.a;
                final ConversationIdType conversationIdTypeC = bojhVar.C();
                int iN = bojhVar.n();
                avoe avoeVarA = bojhVar.A();
                final Optional optionalP = bojhVar.P();
                cium ciumVar = citmVar.b;
                if (iN != 4) {
                    if (iN != 7) {
                        if (iN != 2) {
                            i = iN;
                        } else if (avoeVarA.equals(avoe.RCS_GROUP_NOT_FOUND)) {
                            ((eksl) citt.a.n().h("com/google/android/apps/messaging/shared/rcs/groups/recovery/PwqRecoverDisabledRcsGroupScheduler", "scheduleRecoveryIfNeededAsync", 142, "PwqRecoverDisabledRcsGroupScheduler.java")).q("Join state is LEFT and error state is NOT_FOUND. Do not recover the conversation.");
                            return;
                        }
                        final citt cittVar = (citt) ciumVar;
                        auvh.h(eijx.f(new Runnable() { // from class: cits
                            @Override // java.lang.Runnable
                            public final void run() {
                                Function function = new Function() { // from class: citn
                                    @Override // java.util.function.Function
                                    /* renamed from: andThen */
                                    public final /* synthetic */ Function mo536andThen(Function function2) {
                                        return Function$CC.$default$andThen(this, function2);
                                    }

                                    @Override // java.util.function.Function
                                    public final Object apply(Object obj) {
                                        bojh bojhVar2 = (bojh) obj;
                                        eksp ekspVar = citt.a;
                                        return bojhVar2;
                                    }

                                    public final /* synthetic */ Function compose(Function function2) {
                                        return Function$CC.$default$compose(this, function2);
                                    }
                                };
                                final ConversationIdType conversationIdType = conversationIdTypeC;
                                bojh bojhVar2 = (bojh) botm.j(conversationIdType, function);
                                String strT = bojhVar2 != null ? bojhVar2.T() : null;
                                final Optional optional = optionalP;
                                final citt cittVar2 = cittVar;
                                Optional optionalOfNullable = Optional.ofNullable(aofa.c(strT));
                                final bbdl bbdlVar = (bbdl) cittVar2.g.b();
                                bbdlVar.getClass();
                                final boolean zBooleanValue = ((Boolean) optionalOfNullable.map(new Function() { // from class: cito
                                    @Override // java.util.function.Function
                                    /* renamed from: andThen */
                                    public final /* synthetic */ Function mo536andThen(Function function2) {
                                        return Function$CC.$default$andThen(this, function2);
                                    }

                                    @Override // java.util.function.Function
                                    public final Object apply(Object obj) {
                                        return bbdlVar.e((SelfIdentityId) obj);
                                    }

                                    public final /* synthetic */ Function compose(Function function2) {
                                        return Function$CC.$default$compose(this, function2);
                                    }
                                }).map(new Function() { // from class: citp
                                    @Override // java.util.function.Function
                                    /* renamed from: andThen */
                                    public final /* synthetic */ Function mo536andThen(Function function2) {
                                        return Function$CC.$default$andThen(this, function2);
                                    }

                                    @Override // java.util.function.Function
                                    public final Object apply(Object obj) {
                                        return Boolean.valueOf(Objects.nonNull((axcy) obj));
                                    }

                                    public final /* synthetic */ Function compose(Function function2) {
                                        return Function$CC.$default$compose(this, function2);
                                    }
                                }).orElse(false)).booleanValue();
                                ekhx ekhxVar = (ekhx) Collection.EL.stream(((cozg) cittVar2.h.b()).e()).filter(new Predicate() { // from class: citr
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
                                        citt cittVar3 = cittVar2;
                                        if (((cozg) cittVar3.h.b()).c((aubq) obj) != coze.c) {
                                            return false;
                                        }
                                        Optional optional2 = optional;
                                        return optional2.isEmpty() || cittVar3.i.f().isAfter(((Instant) optional2.get()).plus(Duration.ofDays((long) ((Integer) citt.b.e()).intValue()))) || !zBooleanValue;
                                    }
                                }).collect(ekcv.b);
                                if (ekhxVar.isEmpty()) {
                                    ((eksl) citt.a.n().h("com/google/android/apps/messaging/shared/rcs/groups/recovery/PwqRecoverDisabledRcsGroupScheduler", "scheduleRecoveryIfNeededAsync", 154, "PwqRecoverDisabledRcsGroupScheduler.java")).t("Recover disabled RCS group disabled because this conversation is not in a recoverable join state: %s", bvdh.a(i));
                                } else {
                                    Iterable$EL.forEach(ekhxVar, new Consumer() { // from class: citq
                                        @Override // java.util.function.Consumer
                                        /* renamed from: accept */
                                        public final void z(Object obj) {
                                            aubq aubqVar = (aubq) obj;
                                            ((eksl) citt.a.n().h("com/google/android/apps/messaging/shared/rcs/groups/recovery/PwqRecoverDisabledRcsGroupScheduler", "scheduleResyncForSelfIdentities", 169, "PwqRecoverDisabledRcsGroupScheduler.java")).q("Scheduling group metadata sync for RCS group");
                                            ciuj ciujVar = (ciuj) ciuk.a.createBuilder();
                                            String strA = conversationIdType.a();
                                            ciujVar.copyOnWrite();
                                            ciuk ciukVar = (ciuk) ciujVar.instance;
                                            strA.getClass();
                                            ciukVar.c = strA;
                                            ciujVar.copyOnWrite();
                                            ciuk ciukVar2 = (ciuk) ciujVar.instance;
                                            aubqVar.getClass();
                                            ciukVar2.d = aubqVar;
                                            ciukVar2.b |= 1;
                                            cittVar2.c.a((ciuk) ciujVar.build());
                                        }

                                        public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                            return Consumer$CC.$default$andThen(this, consumer);
                                        }
                                    });
                                }
                            }
                        }, cittVar.j));
                        return;
                    }
                    citt cittVar2 = (citt) ciumVar;
                    cittVar2.f.c("Bugle.Rcs.Groups.Recovery.ConversationDowngradedFromChatApiToVanillaRcs.Triggered.Counts");
                    if (!cittVar2.e.m()) {
                        cittVar2.a();
                        return;
                    }
                    ((eksl) citt.a.n().h("com/google/android/apps/messaging/shared/rcs/groups/recovery/PwqRecoverDisabledRcsGroupScheduler", "scheduleRecoverChatAPiToVanillaRcsDowngradedGroup", 254, "PwqRecoverDisabledRcsGroupScheduler.java")).q("Prerequisites to recover ChatAPI to Vanilla RCS downgraded group conversation met. Scheduling RecoverDisabledRcsGroupHandler");
                    ciuc ciucVar = cittVar2.d;
                    ciua ciuaVar = (ciua) ciub.a.createBuilder();
                    String strA = conversationIdTypeC.a();
                    ciuaVar.copyOnWrite();
                    ciub ciubVar = (ciub) ciuaVar.instance;
                    strA.getClass();
                    ciubVar.b = strA;
                    ((cazj) ciucVar.a.b()).g(cbcu.f("recover_chat_api_to_vanilla_rcs_downgraded_rcs_group", (ciub) ciuaVar.build()));
                    return;
                }
                citt cittVar3 = (citt) ciumVar;
                cittVar3.f.c("Bugle.Rcs.Groups.Recovery.ConversationRecoveredFromTelephony.Triggered.Counts");
                ekhx ekhxVarO = ekhx.o(((cozg) cittVar3.h.b()).e());
                if (ekhxVarO.isEmpty()) {
                    cittVar3.a();
                    return;
                }
                ekqg ekqgVarListIterator = ekhxVarO.listIterator();
                while (ekqgVarListIterator.hasNext()) {
                    aubq aubqVar = (aubq) ekqgVarListIterator.next();
                    if (cittVar3.e.l(aubqVar)) {
                        ((eksl) citt.a.n().h("com/google/android/apps/messaging/shared/rcs/groups/recovery/PwqRecoverDisabledRcsGroupScheduler", "scheduleRecoverDisabledRcsGroup", 234, "PwqRecoverDisabledRcsGroupScheduler.java")).q("Prerequisites to recover disabled RCS group conversation met. Scheduling RecoverDisabledRcsGroupHandler");
                        ciul ciulVar = cittVar3.c;
                        ciuj ciujVar = (ciuj) ciuk.a.createBuilder();
                        String strA2 = conversationIdTypeC.a();
                        ciujVar.copyOnWrite();
                        ciuk ciukVar = (ciuk) ciujVar.instance;
                        strA2.getClass();
                        ciukVar.c = strA2;
                        ciujVar.copyOnWrite();
                        ciuk ciukVar2 = (ciuk) ciujVar.instance;
                        aubqVar.getClass();
                        ciukVar2.d = aubqVar;
                        ciukVar2.b |= 1;
                        ciulVar.a((ciuk) ciujVar.build());
                    } else {
                        cittVar3.a();
                    }
                }
            }
        }, this.d);
    }
}
