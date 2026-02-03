package defpackage;

import android.database.Cursor;
import com.google.android.apps.messaging.shared.datamodel.databasegen.queries.LocationSearchQuery;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bibp extends dqwl<bibn, bibp, bibr, LocationSearchQuery.BindData, bibm> {
    public bibp(dqwv dqwvVar) {
        super(dqwvVar);
    }

    @Override // defpackage.dqwl
    public final /* synthetic */ dqqj a(dqsy dqsyVar, Cursor cursor, String[] strArr, dqxe[] dqxeVarArr, dqwj dqwjVar, dqtm dqtmVar) {
        return new bibn(dqsyVar, cursor, strArr, dqxeVarArr, dqwjVar, dqtmVar, this);
    }

    @Override // defpackage.dqwl
    protected final Map b() {
        String[] strArr = LocationSearchQuery.a;
        return new HashMap();
    }

    @Override // defpackage.dqwl
    protected final boolean c() {
        return true;
    }

    @Override // defpackage.dqwl
    protected final String[] d() {
        return new String[]{"messages._id", "messages_annotations.message_id", "participants._id", "messages.sender_id", "message_star.message_id", "messages._id", "parent_disallowed_conversations.conversation_id", "messages.conversation_id", "conversations._id", "messages.conversation_id"};
    }

    @Override // defpackage.dqwl
    protected final String[] e() {
        return new String[]{"messages", "null", "participants", "messages", "message_star", "messages", "parent_disallowed_conversations", "messages", "conversations", "messages"};
    }
}
