package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cpdq extends fcyz implements fdat {
    final /* synthetic */ cpdr a;
    final /* synthetic */ ConversationIdType b;
    final /* synthetic */ MessageIdType c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cpdq(fcxy fcxyVar, cpdr cpdrVar, ConversationIdType conversationIdType, MessageIdType messageIdType) {
        super(2, fcxyVar);
        this.a = cpdrVar;
        this.b = conversationIdType;
        this.c = messageIdType;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cpdq) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        return this.a.e(this.b, 265, this.c);
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        cpdq cpdqVar = new cpdq(fcxyVar, this.a, this.b, this.c);
        cpdqVar.d = obj;
        return cpdqVar;
    }
}
