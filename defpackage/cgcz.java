package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.res.Resources;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cgcz {
    public final Context a;
    public final cpbz b;
    private final avmp c;
    private final clgq d;

    public cgcz(Context context, avmp avmpVar, clgq clgqVar, cpbz cpbzVar) {
        this.a = context;
        this.c = avmpVar;
        this.d = clgqVar;
        this.b = cpbzVar;
    }

    final kvf a(emgm emgmVar) {
        Context context = this.a;
        PendingIntent pendingIntentD = this.d.d(emgmVar);
        String string = context.getString(R.string.report_issue_action_text);
        pendingIntentD.getClass();
        kve kveVar = new kve(R.drawable.ic_warning_light, string, pendingIntentD);
        kveVar.d = true;
        return kveVar.a();
    }

    final kvf b(int i, ConversationIdType conversationIdType, ConversationId conversationId) throws Resources.NotFoundException {
        emgj emgjVar = (emgj) emgo.a.createBuilder();
        emgjVar.copyOnWrite();
        emgo emgoVar = (emgo) emgjVar.instance;
        emgoVar.c = 3;
        emgoVar.b |= 1;
        emgm emgmVar = emgm.MESSAGE_STUCK_IN_SENDING;
        emgjVar.copyOnWrite();
        emgo emgoVar2 = (emgo) emgjVar.instance;
        emgoVar2.d = emgmVar.o;
        emgoVar2.b |= 2;
        emgo emgoVar3 = (emgo) emgjVar.build();
        PendingIntent pendingIntentS = !conversationIdType.b() ? this.c.s(this.a, conversationId, emgoVar3) : this.c.d(this.a, emgoVar3);
        String quantityString = this.a.getResources().getQuantityString(R.plurals.stuck_in_sending_notification_view_message_action_button, i);
        pendingIntentS.getClass();
        kve kveVar = new kve(R.drawable.ic_warning_light, quantityString, pendingIntentS);
        kveVar.d = true;
        return kveVar.a();
    }
}
