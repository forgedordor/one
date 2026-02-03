package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bmyr extends dqsi {
    public static final String[] a = {"cms_restore_dependency_cache_table._id", "cms_restore_dependency_cache_table.dependent_id", "cms_restore_dependency_cache_table.dependent_cms_id", "cms_restore_dependency_cache_table.dependency_cms_id", "cms_restore_dependency_cache_table.cms_data_provider_type", "cms_restore_dependency_cache_table.payload", "cms_restore_dependency_cache_table.inserted_at_timestamp"};
    public static final bmxx b;
    public static final int[] c;

    static {
        ekgi ekgiVar = new ekgi();
        ekgiVar.i("cms_restore_dependency_cache_table.cms_data_provider_type", 59660);
        ekgiVar.c();
        ekgi ekgiVar2 = new ekgi();
        ekgiVar2.i("dependent_cms_id", "index_cms_restore_dependency_cache_table_dependent_cms_id");
        ekgiVar2.i("dependency_cms_id", "index_cms_restore_dependency_cache_table_dependency_cms_id");
        ekgiVar2.i("inserted_at_timestamp", "index_cms_restore_dependency_cache_table_inserted_at_timestamp");
        ekgiVar2.c();
        b = new bmxx();
        c = new int[]{59650, 59660};
    }

    public static final bmyo a() {
        String[] strArr;
        Integer numC = c();
        if (numC.intValue() == Integer.MAX_VALUE) {
            strArr = a;
        } else {
            int i = ekgb.d;
            ekfw ekfwVar = new ekfw();
            ekfwVar.h("cms_restore_dependency_cache_table._id");
            ekfwVar.h("cms_restore_dependency_cache_table.dependent_id");
            ekfwVar.h("cms_restore_dependency_cache_table.dependent_cms_id");
            ekfwVar.h("cms_restore_dependency_cache_table.dependency_cms_id");
            if (numC.intValue() >= 59660) {
                ekfwVar.h("cms_restore_dependency_cache_table.cms_data_provider_type");
            }
            ekfwVar.h("cms_restore_dependency_cache_table.payload");
            ekfwVar.h("cms_restore_dependency_cache_table.inserted_at_timestamp");
            strArr = (String[]) ekfwVar.g().toArray(new String[0]);
        }
        return new bmyo(strArr);
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
        sb.append("dependent_id INTEGER NOT NULL");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("dependent_cms_id TEXT NOT NULL");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("dependency_cms_id TEXT NOT NULL");
        if (i >= 59660) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("cms_data_provider_type INT DEFAULT(0) NOT NULL");
        }
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("payload BLOB NOT NULL");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("inserted_at_timestamp INTEGER NOT NULL");
        sb.insert(0, "CREATE TABLE cms_restore_dependency_cache_table (");
        sb.append(");");
        dqsyVar.v(sb.toString());
        ArrayList arrayList = new ArrayList();
        arrayList.add("DROP INDEX IF EXISTS index_cms_restore_dependency_cache_table_dependent_cms_id");
        arrayList.add("CREATE INDEX index_cms_restore_dependency_cache_table_dependent_cms_id ON cms_restore_dependency_cache_table(dependent_cms_id);");
        arrayList.add("DROP INDEX IF EXISTS index_cms_restore_dependency_cache_table_dependency_cms_id");
        arrayList.add("CREATE INDEX index_cms_restore_dependency_cache_table_dependency_cms_id ON cms_restore_dependency_cache_table(dependency_cms_id);");
        arrayList.add("DROP INDEX IF EXISTS index_cms_restore_dependency_cache_table_inserted_at_timestamp");
        arrayList.add("CREATE INDEX index_cms_restore_dependency_cache_table_inserted_at_timestamp ON cms_restore_dependency_cache_table(inserted_at_timestamp);");
        for (String str : (String[]) arrayList.toArray(new String[0])) {
            dqsyVar.v(str);
        }
    }

    public static dqxa e() {
        return b().M();
    }
}
