package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cpdr implements cpdn {
    public final fcsu a;
    public final appk b;
    private final fcsu c;
    private final fcsu d;
    private final bveg e;
    private final fdjx f;
    private final fcyh g;
    private final fcsu h;

    public cpdr(fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, bveg bvegVar, appk appkVar, fdjx fdjxVar, fcyh fcyhVar, fcsu fcsuVar4) {
        fcsuVar.getClass();
        fcsuVar2.getClass();
        fcsuVar3.getClass();
        bvegVar.getClass();
        appkVar.getClass();
        fdjxVar.getClass();
        fcyhVar.getClass();
        this.c = fcsuVar;
        this.d = fcsuVar2;
        this.a = fcsuVar3;
        this.e = bvegVar;
        this.b = appkVar;
        this.f = fdjxVar;
        this.g = fcyhVar;
        this.h = fcsuVar4;
    }

    @Override // defpackage.cpdn
    public final eiju a(MessageIdType messageIdType) {
        return auvw.c(this.f, fcyi.a, fdjz.a, new cpdp(this, messageIdType, null));
    }

    @Override // defpackage.cpdn
    public final void b(MessageIdType messageIdType) {
        auvw.k(this.f, null, null, new cpdo(this, messageIdType, null), 3);
    }

    @Override // defpackage.cpdn
    public final Object c(ConversationIdType conversationIdType, MessageIdType messageIdType, fcxy fcxyVar) {
        return fdin.a(eicg.a(this.g), new cpdq(null, this, conversationIdType, messageIdType), fcxyVar);
    }

    @Override // defpackage.cpdn
    public final void d(ConversationIdType conversationIdType, MessageIdType messageIdType, int i) {
        e(conversationIdType, i, messageIdType);
    }

    public final MessageIdType e(ConversationIdType conversationIdType, int i, MessageIdType messageIdType) {
        MessageCoreData messageCoreDataW = !messageIdType.c() ? ((baxe) this.c.b()).w(messageIdType) : null;
        MessageCoreData messageCoreDataL = this.e.l(conversationIdType, i, messageCoreDataW != null ? messageCoreDataW.o() + 1 : ((cogw) this.h.b()).f().toEpochMilli(), messageIdType);
        if (messageCoreDataW != null && !messageCoreDataW.cN()) {
            messageCoreDataL.bB(false);
        }
        return ((bauh) this.d.b()).a(messageCoreDataL);
    }
}
