package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class ckwk {
    public static final ckwl a(ConversationIdType conversationIdType, MessageIdType messageIdType, ckmb ckmbVar, ckmi ckmiVar, ckmc ckmcVar, ckmo ckmoVar) {
        conversationIdType.getClass();
        messageIdType.getClass();
        ckmbVar.getClass();
        ckmiVar.getClass();
        ckmcVar.getClass();
        ckvw ckvwVar = (ckvw) ckvx.a.createBuilder();
        String strA = conversationIdType.a();
        ckvwVar.copyOnWrite();
        ckvx ckvxVar = (ckvx) ckvwVar.instance;
        strA.getClass();
        ckvxVar.c = strA;
        String strB = messageIdType.b();
        ckvwVar.copyOnWrite();
        ckvx ckvxVar2 = (ckvx) ckvwVar.instance;
        strB.getClass();
        ckvxVar2.d = strB;
        ckvwVar.copyOnWrite();
        ckvx ckvxVar3 = (ckvx) ckvwVar.instance;
        ckmbVar.getClass();
        ckvxVar3.e = ckmbVar;
        ckvxVar3.b |= 1;
        ckvwVar.copyOnWrite();
        ckvx ckvxVar4 = (ckvx) ckvwVar.instance;
        ckmiVar.getClass();
        ckvxVar4.f = ckmiVar;
        ckvxVar4.b |= 2;
        ckvwVar.copyOnWrite();
        ((ckvx) ckvwVar.instance).g = ckmcVar.a();
        if (ckmoVar != null) {
            ckvwVar.copyOnWrite();
            ckvx ckvxVar5 = (ckvx) ckvwVar.instance;
            ckvxVar5.h = ckmoVar;
            ckvxVar5.b |= 4;
        }
        return new ckwl((ckvx) ckvwVar.build());
    }
}
