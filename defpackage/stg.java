package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class stg extends fcyz implements fdat {
    final /* synthetic */ sth a;
    final /* synthetic */ MessageCoreData b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public stg(sth sthVar, MessageCoreData messageCoreData, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = sthVar;
        this.b = messageCoreData;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((stg) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        sth sthVar = this.a;
        crif crifVar = (crif) sthVar.b.b();
        ezgh ezghVar = (ezgh) ezgi.a.createBuilder();
        ezghVar.getClass();
        ezfc ezfcVar = (ezfc) ezfd.a.createBuilder();
        ezfcVar.getClass();
        evsn evsnVarBuild = ezfcVar.build();
        evsnVarBuild.getClass();
        ezghVar.copyOnWrite();
        ezgi ezgiVar = (ezgi) ezghVar.instance;
        ezgiVar.d = (ezfd) evsnVarBuild;
        ezgiVar.c = 32;
        ezgf ezgfVar = (ezgf) ezgg.b.createBuilder();
        ezgfVar.getClass();
        ezat.b(ezan.RECORD_VOICE_MESSAGE, ezgfVar);
        ezau.c(ezat.a(ezgfVar), ezghVar);
        List listB = fcva.b(ezau.a(ezghVar));
        MessageCoreData messageCoreData = this.b;
        ConversationIdType conversationIdTypeA = messageCoreData.A();
        conversationIdTypeA.getClass();
        MessageIdType messageIdTypeC = messageCoreData.C();
        messageIdTypeC.getClass();
        crifVar.j(listB, conversationIdTypeA, messageIdTypeC, ((cogw) sthVar.a.b()).f().toEpochMilli());
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new stg(this.a, this.b, fcxyVar);
    }
}
