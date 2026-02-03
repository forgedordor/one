package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;
import j$.time.Instant;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class clov implements Runnable {
    final /* synthetic */ clow a;
    final /* synthetic */ cloc b;

    public clov(clow clowVar, cloc clocVar) {
        this.a = clowVar;
        this.b = clocVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        clow clowVar = this.a;
        Optional optionalP = clowVar.c.p(clowVar.d.l());
        optionalP.getClass();
        bojh bojhVar = (bojh) fdct.b(optionalP);
        if (bojhVar == null) {
            return;
        }
        fcsu fcsuVar = clowVar.e;
        MessageCoreData messageCoreDataO = ((baxe) fcsuVar.b()).o(bojhVar.C());
        if (messageCoreDataO == null || messageCoreDataO.cC() || clow.a.contains(Integer.valueOf(messageCoreDataO.k()))) {
            return;
        }
        baxe baxeVar = (baxe) fcsuVar.b();
        String[] strArr = MessagesTable.a;
        brec brecVar = new brec();
        brecVar.m(bojhVar.C());
        brecVar.ai(239);
        MessageCoreData messageCoreDataN = baxeVar.n(new brdv(brecVar));
        baxe baxeVar2 = (baxe) fcsuVar.b();
        final ConversationIdType conversationIdTypeC = bojhVar.C();
        eieu eieuVarK = eiiy.k("MessageDatabaseOperations#getLatestEndOfEmergencyMessage");
        try {
            bsje bsjeVarC = PartsTable.c();
            bsjeVarC.h(new Function() { // from class: bawn
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    bsjl bsjlVar = (bsjl) obj;
                    cqce cqceVar = baxe.a;
                    bsjlVar.i(conversationIdTypeC);
                    bsjlVar.f("application/x-end-of-emergency-proto");
                    return bsjlVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            bsjeVarC.e(new Function() { // from class: bawo
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    cqce cqceVar = baxe.a;
                    return new bsgs[]{((bsgr) obj).b};
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            final bsjc bsjcVarB = bsjeVarC.b();
            final ekgb ekgbVarV = ekgb.v(247, 246, 249, 248, 250);
            brdr brdrVarD = MessagesTable.d();
            brdrVarD.A("getLatestEndOfEmergencyOrTombstoneMessage");
            brdrVarD.h(new Function() { // from class: bawp
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    brec brecVar2 = (brec) obj;
                    cqce cqceVar = baxe.a;
                    brecVar2.m(conversationIdTypeC);
                    return brecVar2;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            brdrVarD.e(new Function() { // from class: bawq
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    bran branVar = (bran) obj;
                    cqce cqceVar = baxe.a;
                    return new brao[]{branVar.a, branVar.i, branVar.j};
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            brdrVarD.h(new Function() { // from class: bawr
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    brec brecVar2 = (brec) obj;
                    cqce cqceVar = baxe.a;
                    final ekgb ekgbVar = ekgbVarV;
                    final bsjc bsjcVar = bsjcVarB;
                    brecVar2.b(new Function() { // from class: bavv
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo536andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj2) {
                            brec brecVar3 = (brec) obj2;
                            cqce cqceVar2 = baxe.a;
                            brecVar3.ah(ekgbVar);
                            return brecVar3;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    }, new Function() { // from class: bavw
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo536andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj2) {
                            brec brecVar3 = (brec) obj2;
                            cqce cqceVar2 = baxe.a;
                            brecVar3.s(bsjcVar);
                            return brecVar3;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                    return brecVar2;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            brdrVarD.d(new brdo(MessagesTable.c.i, false));
            brdrVarD.y(1);
            Optional optionalFindFirst = Collection.EL.stream(baxeVar2.K(brdrVarD.b())).findFirst();
            eieuVarK.close();
            if (!optionalFindFirst.isPresent() || (messageCoreDataN != null && ((MessageCoreData) optionalFindFirst.get()).o() <= messageCoreDataN.o())) {
                cloc clocVar = this.b;
                ekrg ekrgVar = clow.b;
                ekrw ekrwVarJ = ekrgVar.j();
                ekrz ekrzVar = eksq.a;
                ekrwVarJ.X(ekrzVar, "BugleSatellite");
                ((ekrd) ekrwVarJ.h("com/google/android/apps/messaging/shared/satelliteapi/session/EmergencyConversationTombstoneEnforcer", "ensureTombstoneAlignedWithSatelliteSession", 128, "EmergencyConversationTombstoneEnforcer.kt")).t("eSOS Conversation missing tombstone while satellite mode is [%s]. Adding one now.", clocVar.name());
                ekgb ekgbVar = (ekgb) clowVar.h.a().c();
                if (ekgbVar.size() != 1) {
                    ekrw ekrwVarJ2 = ekrgVar.j();
                    ekrwVarJ2.X(ekrzVar, "BugleSatellite");
                    ((ekrd) ekrwVarJ2.h("com/google/android/apps/messaging/shared/satelliteapi/session/EmergencyConversationTombstoneEnforcer", "insertEmergencyUnexpectedEnd", 178, "EmergencyConversationTombstoneEnforcer.kt")).r("Unexpected number of satellite self identities %s. Skipping tombstone insert.", ekgbVar.size());
                    return;
                }
                clkq clkqVar = clowVar.g;
                ekgbVar.getClass();
                String strB = ((aoer) fcva.N(ekgbVar)).h().b();
                SelfIdentityId selfIdentityIdH = ((aoer) fcva.N(ekgbVar)).h();
                ConversationIdType conversationIdTypeC2 = bojhVar.C();
                conversationIdTypeC2.getClass();
                Instant instantF = clowVar.j.f();
                instantF.getClass();
                MessageCoreData messageCoreDataA = clkqVar.a(strB, selfIdentityIdH, conversationIdTypeC2, evxd.b(instantF), clko.e);
                clowVar.f.a(messageCoreDataA);
                ((baqi) clowVar.k.b()).e(bojhVar.C(), messageCoreDataA.C(), Long.valueOf(messageCoreDataA.o()), bvdk.UNARCHIVED, false);
            }
        } finally {
        }
    }
}
