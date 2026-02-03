package defpackage;

import android.database.Cursor;
import com.google.android.apps.messaging.shared.datamodel.databasegen.queries.UrlSearchQuery;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bmem extends dqwl<bmek, bmem, bmeo, UrlSearchQuery.BindData, bmej> {
    public bmem(dqwv dqwvVar) {
        super(dqwvVar);
    }

    @Override // defpackage.dqwl
    public final /* synthetic */ dqqj a(dqsy dqsyVar, Cursor cursor, String[] strArr, dqxe[] dqxeVarArr, dqwj dqwjVar, dqtm dqtmVar) {
        return new bmek(dqsyVar, cursor, strArr, dqxeVarArr, dqwjVar, dqtmVar, this);
    }

    @Override // defpackage.dqwl
    protected final Map b() {
        String[] strArr = UrlSearchQuery.a;
        return new HashMap();
    }

    @Override // defpackage.dqwl
    protected final boolean c() {
        return true;
    }

    @Override // defpackage.dqwl
    protected final String[] d() {
        return new String[]{"messages._id", "messages_annotations.message_id", "participants._id", "messages.sender_id", "link_preview.message_id", "messages_annotations.message_id", "message_star.message_id", "messages._id", "parent_disallowed_conversations.conversation_id", "messages.conversation_id", "conversations._id", "messages.conversation_id"};
    }

    @Override // defpackage.dqwl
    protected final String[] e() {
        return new String[]{"messages", "null", "participants", "messages", "link_preview", "null", "message_star", "messages", "parent_disallowed_conversations", "messages", "conversations", "messages"};
    }
}
