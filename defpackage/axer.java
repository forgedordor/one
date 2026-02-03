package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class axer extends dqsi {
    public static final String[] a = {"subscriptions.sub_id", "subscriptions.sim_serial_number", "subscriptions.telephony_phone_number", "subscriptions.my_identity_token", "subscriptions.my_identity_token_with_foreign_key"};
    public static final ekgp b;
    public static final axdy c;
    public static final int[] d;
    public static final int[] e;

    static {
        ekgi ekgiVar = new ekgi();
        ekgiVar.i("subscriptions.my_identity_token", 59450);
        ekgiVar.i("subscriptions.my_identity_token_with_foreign_key", 60160);
        b = ekgiVar.c();
        ekgi ekgiVar2 = new ekgi();
        ekgiVar2.i("my_identity_token", "index_subscriptions_my_identity_token");
        ekgiVar2.i("my_identity_token_with_foreign_key", "index_subscriptions_my_identity_token_with_foreign_key");
        ekgiVar2.c();
        c = new axdy();
        d = new int[]{59230, 59450, 60160};
        e = new int[]{59250};
    }

    public static final axem a() {
        String[] strArr;
        Integer numC = c();
        if (numC.intValue() == Integer.MAX_VALUE) {
            strArr = a;
        } else {
            int i = ekgb.d;
            ekfw ekfwVar = new ekfw();
            ekfwVar.h("subscriptions.sub_id");
            ekfwVar.h("subscriptions.sim_serial_number");
            ekfwVar.h("subscriptions.telephony_phone_number");
            if (numC.intValue() >= 59450) {
                ekfwVar.h("subscriptions.my_identity_token");
            }
            if (numC.intValue() >= 60160) {
                ekfwVar.h("subscriptions.my_identity_token_with_foreign_key");
            }
            strArr = (String[]) ekfwVar.g().toArray(new String[0]);
        }
        return new axem(strArr);
    }

    public static dqsy b() {
        return dqru.e("$primary");
    }

    public static Integer c() {
        return Integer.valueOf(g().a());
    }

    public static String d(int i, String str) {
        StringBuilder sb = new StringBuilder();
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("sub_id INT NOT NULL");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("sim_serial_number TEXT NOT NULL");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("telephony_phone_number TEXT");
        if (i >= 59450) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("my_identity_token TEXT");
        }
        if (i >= 60160) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("my_identity_token_with_foreign_key TEXT REFERENCES my_identities(token) ON DELETE NO ACTION ON UPDATE CASCADE");
        }
        sb.insert(0, a.a(str, "CREATE TABLE ", " ("));
        sb.append(", PRIMARY KEY (sub_id,sim_serial_number));");
        return sb.toString();
    }

    public static void e(dqsy dqsyVar, int i) {
        dqsyVar.v(d(i, "subscriptions"));
        for (String str : f(i)) {
            dqsyVar.v(str);
        }
    }

    static String[] f(int i) {
        ArrayList arrayList = new ArrayList();
        if (i >= 59450) {
            arrayList.add("DROP INDEX IF EXISTS index_subscriptions_my_identity_token");
            arrayList.add("CREATE INDEX index_subscriptions_my_identity_token ON subscriptions(my_identity_token);");
        }
        if (i >= 60160) {
            arrayList.add("DROP INDEX IF EXISTS index_subscriptions_my_identity_token_with_foreign_key");
            arrayList.add("CREATE INDEX index_subscriptions_my_identity_token_with_foreign_key ON subscriptions(my_identity_token_with_foreign_key);");
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public static dqxa g() {
        return b().M();
    }
}
