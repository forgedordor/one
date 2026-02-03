package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class crje {
    public final fcsu a;
    public final fcsu b;
    public final cogw c;
    public final bxlc d;
    public final cqce e;
    private final fcsu f;
    private final fcsu g;

    public crje(fcsu fcsuVar, fcsu fcsuVar2, cogw cogwVar, fcsu fcsuVar3, fcsu fcsuVar4, bxlc bxlcVar) {
        fcsuVar.getClass();
        fcsuVar2.getClass();
        cogwVar.getClass();
        fcsuVar3.getClass();
        fcsuVar4.getClass();
        bxlcVar.getClass();
        this.a = fcsuVar;
        this.b = fcsuVar2;
        this.c = cogwVar;
        this.f = fcsuVar3;
        this.g = fcsuVar4;
        this.d = bxlcVar;
        this.e = cqce.g("Bugle", "SmartSuggestionPersister");
    }

    public final void a(MessageIdType messageIdType, List list, List list2, ConversationIdType conversationIdType) {
        MessageIdType messageIdType2;
        crie crieVar = (crie) this.g.b();
        if (crbf.h()) {
            cskc cskcVar = (cskc) crieVar.b.b();
            messageIdType2 = messageIdType;
            auvw.k(cskcVar.h, null, null, new cska(messageIdType2, list2, cskcVar, conversationIdType, null), 3);
        } else {
            messageIdType2 = messageIdType;
            ekrw ekrwVarH = crie.a.h();
            ekrwVarH.X(eksq.a, "BugleSpam");
            ((ekrd) ekrwVarH.h("com/google/android/apps/messaging/shared/util/p2p/operations/PenpalSpamClassificationHandler", "handleClassifications", 38, "PenpalSpamClassificationHandler.kt")).q("Penpal spam enforcement is disabled.");
        }
        csjq csjqVar = (csjq) this.f.b();
        auvw.k(csjqVar.f, null, null, new csjp(messageIdType2, csjqVar, list, null), 3);
    }
}
