package defpackage;

import android.database.Cursor;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aeum extends dqwl {
    public aeum(dqwv dqwvVar) {
        super(dqwvVar);
    }

    @Override // defpackage.dqwl
    public final /* synthetic */ dqqj a(dqsy dqsyVar, Cursor cursor, String[] strArr, dqxe[] dqxeVarArr, dqwj dqwjVar, dqtm dqtmVar) {
        return new aeuk(dqsyVar, cursor, strArr, dqxeVarArr, dqwjVar, dqtmVar, this);
    }

    @Override // defpackage.dqwl
    protected final Map b() {
        String[] strArr = aeur.a;
        return new HashMap();
    }

    @Override // defpackage.dqwl
    protected final boolean c() {
        return true;
    }

    @Override // defpackage.dqwl
    protected final String[] d() {
        return new String[]{"messages._id", "participants._id", "messages.sender_id", "participants._id", "conversation_to_participants.participant_id", "profiles_table.participant_id", "conversation_to_participants.participant_id", "parts.message_id", "messages._id", "reminders.message_id", "messages._id", "conversation_pin.conversation_id", "conversations._id"};
    }

    @Override // defpackage.dqwl
    protected final String[] e() {
        return new String[]{"messages", "participants", "messages", "participants", "conversation_to_participants", "profiles_table", "conversation_to_participants", "parts", "messages", "reminders", "messages", "conversation_pin", "conversations"};
    }
}
