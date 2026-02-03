package defpackage;

import android.database.Cursor;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bdxf extends dqwl {
    public bdxf(dqwv dqwvVar) {
        super(dqwvVar);
    }

    @Override // defpackage.dqwl
    public final /* synthetic */ dqqj a(dqsy dqsyVar, Cursor cursor, String[] strArr, dqxe[] dqxeVarArr, dqwj dqwjVar, dqtm dqtmVar) {
        return new bdxd(dqsyVar, cursor, strArr, dqxeVarArr, dqwjVar, dqtmVar, this);
    }

    @Override // defpackage.dqwl
    protected final Map b() {
        String[] strArr = bdxk.a;
        return new HashMap();
    }

    @Override // defpackage.dqwl
    protected final boolean c() {
        return true;
    }

    @Override // defpackage.dqwl
    protected final String[] d() {
        return new String[]{"messages._id", "conversations.latest_message_id", "participants._id", "messages.sender_id", "participants._id", "conversation_participants.participant_id", "profiles_table.participant_id", "conversation_participants.participant_id", "parts.message_id", "messages._id", "vmt.part_id", "parts._id", "reminders.message_id", "conversations.latest_message_id", "message_star.message_id", "messages._id", "parent_disallowed_conversations.conversation_id", "conversations._id"};
    }

    @Override // defpackage.dqwl
    protected final String[] e() {
        return new String[]{"messages", "null", "participants", "messages", "participants", "conversation_participants", "profiles_table", "conversation_participants", "parts", "messages", "vmt", "parts", "reminders", "conversations", "message_star", "messages", "parent_disallowed_conversations", "conversations"};
    }
}
