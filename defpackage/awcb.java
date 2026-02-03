package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class awcb {
    public static final String[] a = {"conversations._id", "conversations.conv_type", "conversations.has_ea2p_bot_recipient", "group_concat(quote(conversation_to_participants.participant_id), '|')", "group_concat(quote(conversation_to_participants.rowid), '|') AS conversation_to_participants__ROWID", "participants._id", "group_concat(quote(participants.normalized_destination), '|')", "group_concat(quote(participants.send_destination), '|')", "group_concat(quote(participants.rowid), '|') AS participants__ROWID"};
    public static final awbr b;

    static {
        ekgi ekgiVar = new ekgi();
        ekgiVar.i("conversations.conv_type", 10007);
        ekgiVar.i("conversations.has_ea2p_bot_recipient", 12001);
        ekgiVar.c();
        new ekgi().c();
        b = new awbr();
    }

    public static final awby a() {
        String[] strArr;
        Integer numC = c();
        if (numC.intValue() == Integer.MAX_VALUE) {
            strArr = a;
        } else {
            int i = ekgb.d;
            ekfw ekfwVar = new ekfw();
            ekfwVar.h("conversations._id");
            if (numC.intValue() >= 10007) {
                ekfwVar.h("conversations.conv_type");
            }
            if (numC.intValue() >= 12001) {
                ekfwVar.h("conversations.has_ea2p_bot_recipient");
            }
            ekfwVar.h("group_concat(quote(conversation_to_participants.participant_id), '|')");
            ekfwVar.h("participants._id");
            ekfwVar.h("group_concat(quote(participants.normalized_destination), '|')");
            ekfwVar.h("group_concat(quote(participants.send_destination), '|')");
            strArr = (String[]) ekfwVar.g().toArray(new String[0]);
        }
        return new awby(strArr);
    }

    public static dqsy b() {
        return dqru.e("$primary");
    }

    public static Integer c() {
        return Integer.valueOf(b().M().a());
    }
}
