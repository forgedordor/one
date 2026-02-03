package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.time.Instant;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class ccxi extends fcyz implements fdat {
    final /* synthetic */ ccxj a;
    final /* synthetic */ MessageCoreData b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ccxi(ccxj ccxjVar, MessageCoreData messageCoreData, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = ccxjVar;
        this.b = messageCoreData;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ccxi) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        final ccxj ccxjVar = this.a;
        bakt baktVar = (bakt) ccxjVar.h.b();
        final MessageCoreData messageCoreData = this.b;
        List listK = baktVar.K(messageCoreData.A());
        listK.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : listK) {
            if (((ParticipantsTable.BindData) obj2).T() != null) {
                arrayList.add(obj2);
            }
        }
        final alqm alqmVar = null;
        if (arrayList.isEmpty()) {
            ekrd ekrdVar = (ekrd) ccxj.a.j();
            ekrdVar.X(cqnc.s, messageCoreData.A());
            ekrdVar.X(cqnc.b, messageCoreData.C());
            ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/emergency/session/EmergencySessionManager", "fetchParticipants", 189, "EmergencySessionManager.kt")).q("Unable to retrieve participants for the conversation.");
            arrayList = null;
        }
        if (arrayList != null) {
            alqm alqmVarQ = ((alrj) ccxjVar.g.b()).q((ParticipantsTable.BindData) fcva.N(arrayList));
            if (alqmVarQ.e().isEmpty()) {
                ekrd ekrdVar2 = (ekrd) ccxj.a.g();
                ekrdVar2.X(cqnc.s, messageCoreData.A());
                ekrdVar2.X(cqnc.b, messageCoreData.C());
                ((ekrd) ekrdVar2.h("com/google/android/apps/messaging/shared/emergency/session/EmergencySessionManager", "fetchMessagingIdentity", 209, "EmergencySessionManager.kt")).q("Messaging identity does not have RCS identifier.");
            } else {
                alqmVar = alqmVarQ;
            }
            if (alqmVar != null) {
                if (alqmVar.v()) {
                    ((dqsn) ccxjVar.e.b()).d("EmergencySessionManagerImpl.handleEmergencyMessage", new Runnable() { // from class: ccxh
                        @Override // java.lang.Runnable
                        public final void run() {
                            long j;
                            MessageCoreData messageCoreData2 = messageCoreData;
                            amrb amrbVar = messageCoreData2.cX() ? amrb.a : amrb.b;
                            alqm alqmVar2 = alqmVar;
                            ccxj ccxjVar2 = ccxjVar;
                            ccwi ccwiVar = (ccwi) ccxjVar2.f.b();
                            String str = ((aubq) alqmVar2.e().get()).d;
                            str.getClass();
                            amqj amqjVarA = ccwiVar.a(str, amrbVar);
                            if (amqjVarA != null) {
                                Instant instantF = ((cogw) ccxjVar2.i.b()).f();
                                long j2 = amqjVarA.c;
                                Instant instantPlusMillis = instantF.plusMillis(j2);
                                instantPlusMillis.getClass();
                                ccxj.f(new amqj(amqjVarA.a, amqjVarA.b, j2, amqjVarA.d, instantPlusMillis));
                                return;
                            }
                            if (messageCoreData2.cI()) {
                                ekrd ekrdVar3 = (ekrd) ccxj.a.j();
                                ekrdVar3.X(cqnc.s, messageCoreData2.A());
                                ekrdVar3.X(cqnc.b, messageCoreData2.C());
                                ekrdVar3.X(cqnc.I, ((aubq) alqmVar2.e().get()).d);
                                ((ekrd) ekrdVar3.h("com/google/android/apps/messaging/shared/emergency/session/EmergencySessionManager", "handleEmergencyMessage$lambda$2", 236, "EmergencySessionManager.kt")).q("Received an incoming emergency message but there are no active emergency sessions.");
                                return;
                            }
                            int iOrdinal = amrbVar.ordinal();
                            if (iOrdinal == 0) {
                                j = ccxjVar2.b;
                            } else {
                                if (iOrdinal != 1) {
                                    throw new fctg();
                                }
                                j = ccxjVar2.c;
                            }
                            String str2 = ((aubq) alqmVar2.e().get()).d;
                            str2.getClass();
                            fcsu fcsuVar = ccxjVar2.i;
                            Instant instantF2 = ((cogw) fcsuVar.b()).f();
                            instantF2.getClass();
                            Instant instantPlusMillis2 = ((cogw) fcsuVar.b()).f().plusMillis(j);
                            instantPlusMillis2.getClass();
                            ccxj.f(new amqj(str2, amrbVar, j, instantF2, instantPlusMillis2));
                        }
                    });
                    return fctx.a;
                }
                cub cubVarB = ccxjVar.b();
                ConversationIdType conversationIdTypeA = messageCoreData.A();
                conversationIdTypeA.getClass();
                cubVarB.d(conversationIdTypeA, false);
                ekrd ekrdVar3 = (ekrd) ccxj.a.g();
                ekrdVar3.X(cqnc.s, messageCoreData.A());
                ekrdVar3.X(cqnc.b, messageCoreData.C());
                ekrdVar3.X(cqnc.I, ((aubq) alqmVar.e().get()).d);
                ((ekrd) ekrdVar3.h("com/google/android/apps/messaging/shared/emergency/session/EmergencySessionManager$process$1", "invokeSuspend", 169, "EmergencySessionManager.kt")).q("Participant is not an emergency number.");
                return fctx.a;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new ccxi(this.a, this.b, fcxyVar);
    }
}
