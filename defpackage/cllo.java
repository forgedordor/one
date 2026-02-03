package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cllo extends fcyz implements fdat {
    final /* synthetic */ cllp a;
    final /* synthetic */ MessageCoreData b;
    final /* synthetic */ baro c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cllo(fcxy fcxyVar, cllp cllpVar, MessageCoreData messageCoreData, baro baroVar) {
        super(2, fcxyVar);
        this.a = cllpVar;
        this.b = messageCoreData;
        this.c = baroVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cllo) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        baxe baxeVar = (baxe) this.a.c.b();
        MessageCoreData messageCoreData = this.b;
        ConversationIdType conversationIdTypeA = messageCoreData.A();
        MessageIdType messageIdTypeC = messageCoreData.C();
        String[] strArr = MessagesTable.a;
        brdu brduVar = new brdu();
        brduVar.ap("updateDatagramId");
        baro baroVar = this.c;
        brduVar.J(baroVar);
        baxeVar.V(conversationIdTypeA, messageIdTypeC, brduVar);
        ekrw ekrwVarH = cllp.a.h();
        ekrwVarH.X(eksq.a, "BugleSatellite");
        ekrd ekrdVar = (ekrd) ekrwVarH;
        ekrdVar.X(cqnc.b, messageCoreData.C());
        ekrdVar.X(cqnc.ac, baroVar);
        ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/satelliteapi/outgoing/SatelliteApiSender$updateDatagramId$lambda$5$$inlined$withLegacyPropagatingContext$1", "invokeSuspend", 145, "SatelliteApiSender.kt")).q("Successfully updated outgoing message datagramId.");
        return chvf.j(-1, 0).a();
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        cllo clloVar = new cllo(fcxyVar, this.a, this.b, this.c);
        clloVar.d = obj;
        return clloVar;
    }
}
