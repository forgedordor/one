package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class akzi {
    public static final String[] a = {"conversations._id", "conversations.name", "conversations.name_is_automatic", "conversations.sort_timestamp", "conversations.join_state", "conversations.conv_type", "group_concat(quote(conversation_to_participants.participant_id), '|')", "group_concat(quote(conversation_to_participants.rowid), '|') AS conversation_to_participants__ROWID", "participants._id", "group_concat(quote(participants.normalized_destination), '|')", "group_concat(quote(participants.send_destination), '|')", "group_concat(quote(participants.comparable_destination), '|')", "group_concat(quote(participants.rowid), '|') AS participants__ROWID"};
    public static final akyy b;

    static {
        ekgi ekgiVar = new ekgi();
        ekgiVar.i("conversations.name_is_automatic", 10012);
        ekgiVar.i("conversations.join_state", 10006);
        ekgiVar.i("conversations.conv_type", 10007);
        ekgiVar.i("group_concat(quote(participants.comparable_destination), '|')", 54040);
        ekgiVar.c();
        ekgi ekgiVar2 = new ekgi();
        ekgiVar2.i("sort_timestamp", "index_null_sort_timestamp");
        ekgiVar2.c();
        b = new akyy();
    }

    public static final akzf a() {
        String[] strArr;
        Integer numC = c();
        if (numC.intValue() == Integer.MAX_VALUE) {
            strArr = a;
        } else {
            int i = ekgb.d;
            ekfw ekfwVar = new ekfw();
            ekfwVar.h("conversations._id");
            ekfwVar.h("conversations.name");
            if (numC.intValue() >= 10012) {
                ekfwVar.h("conversations.name_is_automatic");
            }
            ekfwVar.h("conversations.sort_timestamp");
            if (numC.intValue() >= 10006) {
                ekfwVar.h("conversations.join_state");
            }
            if (numC.intValue() >= 10007) {
                ekfwVar.h("conversations.conv_type");
            }
            ekfwVar.h("group_concat(quote(conversation_to_participants.participant_id), '|')");
            ekfwVar.h("participants._id");
            ekfwVar.h("group_concat(quote(participants.normalized_destination), '|')");
            ekfwVar.h("group_concat(quote(participants.send_destination), '|')");
            if (numC.intValue() >= 54040) {
                ekfwVar.h("group_concat(quote(participants.comparable_destination), '|')");
            }
            strArr = (String[]) ekfwVar.g().toArray(new String[0]);
        }
        return new akzf(strArr);
    }

    public static dqsy b() {
        return dqru.e("$primary");
    }

    public static Integer c() {
        return Integer.valueOf(b().M().a());
    }
}
