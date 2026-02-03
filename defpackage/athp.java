package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class athp extends fcyz implements fdat {
    final /* synthetic */ athv a;
    final /* synthetic */ MessageCoreData b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public athp(fcxy fcxyVar, athv athvVar, MessageCoreData messageCoreData) {
        super(2, fcxyVar);
        this.a = athvVar;
        this.b = messageCoreData;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((athp) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        baxe baxeVar = (baxe) this.a.b.b();
        MessageCoreData messageCoreData = this.b;
        ConversationIdType conversationIdTypeA = messageCoreData.A();
        MessageIdType messageIdTypeC = messageCoreData.C();
        String[] strArr = MessagesTable.a;
        brdu brduVar = new brdu();
        brduVar.ap("updateMessageSelfId");
        brduVar.U(4);
        return Boolean.valueOf(baxeVar.V(conversationIdTypeA, messageIdTypeC, brduVar));
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        athp athpVar = new athp(fcxyVar, this.a, this.b);
        athpVar.c = obj;
        return athpVar;
    }
}
