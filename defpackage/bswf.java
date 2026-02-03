package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bswf extends dqsi {
    public static final String[] a = {"rbm_business_info_properties._id", "rbm_business_info_properties.rbm_bot_id", "rbm_business_info_properties.type", "rbm_business_info_properties.header", "rbm_business_info_properties.subheader", "rbm_business_info_properties.property_value"};
    public static final ekgp b;
    public static final bsvm c;
    public static final int[] d;

    static {
        ekgi ekgiVar = new ekgi();
        ekgiVar.i("rbm_business_info_properties.rbm_bot_id", 51020);
        b = ekgiVar.c();
        ekgi ekgiVar2 = new ekgi();
        ekgiVar2.i("rbm_bot_id", "index_rbm_business_info_properties_rbm_bot_id");
        ekgiVar2.c();
        c = new bsvm();
        d = new int[]{51020, 58410, 59830};
    }

    public static final bswc a() {
        String[] strArr;
        Integer numC = c();
        if (numC.intValue() == Integer.MAX_VALUE) {
            strArr = a;
        } else {
            int i = ekgb.d;
            ekfw ekfwVar = new ekfw();
            ekfwVar.h("rbm_business_info_properties._id");
            if (numC.intValue() >= 51020) {
                ekfwVar.h("rbm_business_info_properties.rbm_bot_id");
            }
            ekfwVar.h("rbm_business_info_properties.type");
            ekfwVar.h("rbm_business_info_properties.header");
            ekfwVar.h("rbm_business_info_properties.subheader");
            ekfwVar.h("rbm_business_info_properties.property_value");
            strArr = (String[]) ekfwVar.g().toArray(new String[0]);
        }
        return new bswc(strArr);
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
        sb.append("_id INTEGER PRIMARY KEY AUTOINCREMENT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("rbm_bot_id TEXT REFERENCES rbm_business_info(rbm_bot_id) ON DELETE CASCADE ON UPDATE CASCADE");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("type INT NOT NULL");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("header TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("subheader TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("property_value TEXT");
        sb.insert(0, "CREATE TABLE rbm_business_info_properties (");
        sb.append(");");
        dqsyVar.v(sb.toString());
        ArrayList arrayList = new ArrayList();
        if (i >= 58410) {
            arrayList.add("DROP INDEX IF EXISTS index_rbm_business_info_properties_rbm_bot_id");
            arrayList.add("CREATE INDEX index_rbm_business_info_properties_rbm_bot_id ON rbm_business_info_properties(rbm_bot_id);");
        }
        if (i >= 59830) {
            arrayList.add("DROP INDEX IF EXISTS index_rbm_business_info_properties_rbm_short_codes");
            arrayList.add("CREATE INDEX index_rbm_business_info_properties_rbm_short_codes ON rbm_business_info_properties(type, property_value) WHERE type = 10;");
        }
        for (String str : (String[]) arrayList.toArray(new String[0])) {
            dqsyVar.v(str);
        }
    }

    public static dqxa e() {
        return b().M();
    }
}
