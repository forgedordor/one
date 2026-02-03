package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class ckvr {
    public static final String[] a = {"message_reactions.message_id", "message_reactions.reacted_message_id", "message_reactions.reaction", "message_reactions.applied_reaction", "messages._id", "messages.message_status"};
    public static final ckvi b;

    static {
        ekgi ekgiVar = new ekgi();
        ekgiVar.i("message_reactions.reacted_message_id", 46020);
        ekgiVar.i("message_reactions.reaction", 48000);
        ekgiVar.i("message_reactions.applied_reaction", 59060);
        ekgiVar.c();
        ekgi ekgiVar2 = new ekgi();
        ekgiVar2.i("reacted_message_id", "index_null_reacted_message_id");
        ekgiVar2.c();
        b = new ckvi();
    }

    public static final ckvo a() {
        String[] strArr;
        Integer numC = c();
        if (numC.intValue() == Integer.MAX_VALUE) {
            strArr = a;
        } else {
            int i = ekgb.d;
            ekfw ekfwVar = new ekfw();
            ekfwVar.h("message_reactions.message_id");
            if (numC.intValue() >= 46020) {
                ekfwVar.h("message_reactions.reacted_message_id");
            }
            if (numC.intValue() >= 48000) {
                ekfwVar.h("message_reactions.reaction");
            }
            if (numC.intValue() >= 59060) {
                ekfwVar.h("message_reactions.applied_reaction");
            }
            ekfwVar.h("messages._id");
            ekfwVar.h("messages.message_status");
            strArr = (String[]) ekfwVar.g().toArray(new String[0]);
        }
        return new ckvo(strArr);
    }

    public static dqsy b() {
        return dqru.e("$primary");
    }

    public static Integer c() {
        return Integer.valueOf(b().M().a());
    }
}
