package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class afcw {
    public static final String[] a = {"message_labels._id", "message_labels.message_id", "message_labels.label", "message_labels.confidence", "message_labels.source", "message_labels.intent", "message_labels.model_id", "messages.conversation_id", "messages.received_timestamp"};
    public static final ekgp b;
    public static final afcp c;

    static {
        ekgi ekgiVar = new ekgi();
        ekgiVar.i("message_labels.confidence", 53060);
        ekgiVar.i("message_labels.intent", 58590);
        b = ekgiVar.c();
        ekgi ekgiVar2 = new ekgi();
        ekgiVar2.i("intent", "index_null_intent");
        ekgiVar2.c();
        c = new afcp();
    }

    public static final afct a() {
        String[] strArr;
        Integer numC = c();
        if (numC.intValue() == Integer.MAX_VALUE) {
            strArr = a;
        } else {
            int i = ekgb.d;
            ekfw ekfwVar = new ekfw();
            ekfwVar.h("message_labels._id");
            ekfwVar.h("message_labels.message_id");
            ekfwVar.h("message_labels.label");
            if (numC.intValue() >= 53060) {
                ekfwVar.h("message_labels.confidence");
            }
            ekfwVar.h("message_labels.source");
            if (numC.intValue() >= 58590) {
                ekfwVar.h("message_labels.intent");
            }
            ekfwVar.h("message_labels.model_id");
            ekfwVar.h("messages.conversation_id");
            ekfwVar.h("messages.received_timestamp");
            strArr = (String[]) ekfwVar.g().toArray(new String[0]);
        }
        return new afct(strArr);
    }

    public static dqsy b() {
        return dqru.e("$primary");
    }

    public static Integer c() {
        return Integer.valueOf(b().M().a());
    }
}
