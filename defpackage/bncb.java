package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bncb extends dqsi {
    public static final String[] a = {"cms.key_index", "cms.encryption_key", "cms.key_type", "cms.cms_correlation_id", "cms.cms_id"};
    public static final ekgp b;
    public static final bnbf c;
    public static final int[] d;

    static {
        ekgi ekgiVar = new ekgi();
        ekgiVar.i("cms.cms_correlation_id", 42060);
        ekgiVar.i("cms.cms_id", 35020);
        b = ekgiVar.c();
        ekgi ekgiVar2 = new ekgi();
        ekgiVar2.i("cms_correlation_id", "index_cms_cms_correlation_id");
        ekgiVar2.i("cms_id", "index_cms_cms_id");
        ekgiVar2.c();
        c = new bnbf();
        d = new int[]{32030, 35020, 42060};
    }

    public static final bnbw a() {
        String[] strArr;
        Integer numC = c();
        if (numC.intValue() == Integer.MAX_VALUE) {
            strArr = a;
        } else {
            int i = ekgb.d;
            ekfw ekfwVar = new ekfw();
            ekfwVar.h("cms.key_index");
            ekfwVar.h("cms.encryption_key");
            ekfwVar.h("cms.key_type");
            if (numC.intValue() >= 42060) {
                ekfwVar.h("cms.cms_correlation_id");
            }
            if (numC.intValue() >= 35020) {
                ekfwVar.h("cms.cms_id");
            }
            strArr = (String[]) ekfwVar.g().toArray(new String[0]);
        }
        return new bnbw(strArr);
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
        sb.append("key_index INT DEFAULT(0)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("encryption_key BLOB");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("key_type INT DEFAULT(0)");
        if (i >= 42060) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("cms_correlation_id TEXT");
        }
        if (i >= 35020) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("cms_id TEXT");
        }
        sb.insert(0, "CREATE TABLE cms (");
        sb.append(");");
        dqsyVar.v(sb.toString());
        ArrayList arrayList = new ArrayList();
        if (i >= 35020) {
            arrayList.add("DROP INDEX IF EXISTS index_cms_cms_id");
            arrayList.add("CREATE UNIQUE INDEX index_cms_cms_id ON cms(cms_id);");
        }
        if (i >= 42060) {
            arrayList.add("DROP INDEX IF EXISTS index_cms_cms_correlation_id");
            arrayList.add("CREATE UNIQUE INDEX index_cms_cms_correlation_id ON cms(cms_correlation_id);");
        }
        for (String str : (String[]) arrayList.toArray(new String[0])) {
            dqsyVar.v(str);
        }
    }

    public static dqxa e() {
        return b().M();
    }
}
