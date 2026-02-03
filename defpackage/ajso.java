package defpackage;

import android.content.Intent;
import android.os.BaseBundle;
import android.os.Bundle;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.InvalidConversationId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ajso {
    private final fcsu a;

    public ajso(fcsu fcsuVar) {
        this.a = fcsuVar;
    }

    public static final void b(ConversationId conversationId, BaseBundle baseBundle) {
        if (conversationId != InvalidConversationId.a) {
            baseBundle.putString("conversation_id", conversationId.b());
            baseBundle.putInt("mapi_conversation_kind", conversationId.a().a());
        }
    }

    public static final void c(ConversationId conversationId, Bundle bundle) {
        if (conversationId != InvalidConversationId.a) {
            b(conversationId, bundle);
            bundle.putParcelable("mapi_conversation_id", conversationId);
        }
    }

    public static final void d(ConversationId conversationId, Intent intent, boolean z) {
        Bundle bundle = new Bundle();
        if (z) {
            b(conversationId, bundle);
        } else {
            c(conversationId, bundle);
        }
        intent.putExtras(bundle);
    }

    public final ConversationId a(Intent intent) {
        if (intent.getExtras() == null) {
            return null;
        }
        Bundle extras = intent.getExtras();
        extras.getClass();
        ConversationId conversationId = (ConversationId) extras.getParcelable("mapi_conversation_id");
        if (conversationId != null) {
            return conversationId;
        }
        String string = extras.getString("conversation_id");
        if (string == null) {
            return null;
        }
        ConversationIdType conversationIdTypeB = barn.b(string);
        if (conversationIdTypeB.b()) {
            return null;
        }
        akll akllVar = (akll) akln.a.createBuilder();
        String strA = conversationIdTypeB.a();
        akllVar.copyOnWrite();
        akln aklnVar = (akln) akllVar.instance;
        strA.getClass();
        aklnVar.c = strA;
        aklm aklmVar = aklm.UNKNOWN;
        int i = extras.getInt("mapi_conversation_kind", aklmVar.a());
        akllVar.copyOnWrite();
        ((akln) akllVar.instance).b = i;
        akln aklnVar2 = (akln) akllVar.build();
        aklm aklmVarB = aklm.b(aklnVar2.b);
        if (aklmVarB == null) {
            aklmVarB = aklm.UNRECOGNIZED;
        }
        return aklmVarB != aklmVar ? ((ajln) this.a.b()).b(aklnVar2) : new BugleConversationId(conversationIdTypeB);
    }
}
