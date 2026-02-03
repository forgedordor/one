package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bpcy extends dqsi {
    public static final String[] a = {"drafts.conversation_id", "drafts.text", "drafts.attachments", "drafts.subject", "drafts.is_urgent", "drafts.replied_to_message_id", "drafts.is_encrypted"};
    public static final bpcc b;
    public static final int[] c;

    static {
        ekgi ekgiVar = new ekgi();
        ekgiVar.i("drafts.attachments", 59420);
        ekgiVar.i("drafts.subject", 59170);
        ekgiVar.i("drafts.is_urgent", 59170);
        ekgiVar.i("drafts.replied_to_message_id", 59540);
        ekgiVar.i("drafts.is_encrypted", 59720);
        ekgiVar.c();
        new ekgi().c();
        b = new bpcc();
        c = new int[]{59150, 59170, 59420, 59540, 59720};
    }

    public static final bpct a() {
        String[] strArr;
        Integer numC = c();
        if (numC.intValue() == Integer.MAX_VALUE) {
            strArr = a;
        } else {
            int i = ekgb.d;
            ekfw ekfwVar = new ekfw();
            ekfwVar.h("drafts.conversation_id");
            ekfwVar.h("drafts.text");
            if (numC.intValue() >= 59420) {
                ekfwVar.h("drafts.attachments");
            }
            if (numC.intValue() >= 59170) {
                ekfwVar.h("drafts.subject");
            }
            if (numC.intValue() >= 59170) {
                ekfwVar.h("drafts.is_urgent");
            }
            if (numC.intValue() >= 59540) {
                ekfwVar.h("drafts.replied_to_message_id");
            }
            if (numC.intValue() >= 59720) {
                ekfwVar.h("drafts.is_encrypted");
            }
            strArr = (String[]) ekfwVar.g().toArray(new String[0]);
        }
        return new bpct(strArr);
    }

    public static dqsy b() {
        return dqru.e("$primary");
    }

    public static Integer c() {
        return Integer.valueOf(e().a());
    }

    public static void d(dqsy dqsyVar, int i) {
        StringBuilder sb = new StringBuilder();
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("conversation_id INTEGER PRIMARY KEY NOT NULL REFERENCES conversations(_id) ON DELETE CASCADE ON UPDATE CASCADE");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("text TEXT");
        if (i >= 59420) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("attachments BLOB");
        }
        if (i >= 59170) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("subject TEXT");
        }
        if (i >= 59170) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("is_urgent INT DEFAULT(0) NOT NULL");
        }
        if (i >= 59540) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("replied_to_message_id TEXT");
        }
        if (i >= 59720) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("is_encrypted INT DEFAULT(0) NOT NULL");
        }
        sb.insert(0, "CREATE TABLE drafts (");
        sb.append(");");
        dqsyVar.v(sb.toString());
        for (String str : (String[]) new ArrayList().toArray(new String[0])) {
            dqsyVar.v(str);
        }
    }

    public static dqxa e() {
        return b().M();
    }
}
