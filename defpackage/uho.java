package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uho implements ehsn {
    public final eosc a;
    public final ajsn b;
    private final Context c;
    private final ajso d;
    private final fcsu e;

    public uho(Context context, eosc eoscVar, ajsn ajsnVar, ajso ajsoVar, fcsu fcsuVar) {
        this.c = context;
        this.a = eoscVar;
        this.b = ajsnVar;
        this.d = ajsoVar;
        this.e = fcsuVar;
    }

    public final ehsj a(ConversationId conversationId, MessageIdType messageIdType) {
        Intent intentO = ((avmp) this.e.b()).o(this.c, conversationId, null, false);
        intentO.putExtra("message_id", messageIdType.b());
        return ehsj.b(intentO);
    }

    @Override // defpackage.ehsn
    public final ehsl b(ehsm ehsmVar) {
        Intent intent = ehsmVar.a;
        Uri data = intent.getData();
        if (data == null) {
            return null;
        }
        if ((!"https".equals(data.getScheme()) && !"http".equals(data.getScheme())) || !"messages.google.com".equals(data.getHost()) || !"/conversation".equals(data.getPath())) {
            return null;
        }
        Uri uri = (Uri) intent.getParcelableExtra("sms_uri");
        return uri != null ? new uhl(this, uri) : new uhn(this, barn.b(intent.getStringExtra("conversation_id")), this.d.a(intent), bary.b(intent.getStringExtra("message_id")));
    }
}
