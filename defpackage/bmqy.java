package defpackage;

import j$.util.function.BiConsumer$CC;
import java.util.ArrayList;
import java.util.function.BiConsumer;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bmqy extends dqsi {
    public static final String[] a = {"cms_dead_letter_queue._id", "cms_dead_letter_queue.cms_id", "cms_dead_letter_queue.cms_data_type", "cms_dead_letter_queue.abandoned_action", "cms_dead_letter_queue.failure_reason", "cms_dead_letter_queue.bugle_table_type", "cms_dead_letter_queue.bugle_id", "cms_dead_letter_queue.cms_backup_parameters", "cms_dead_letter_queue.backup_flags", "cms_dead_letter_queue.backup_dependency_table_type", "cms_dead_letter_queue.backup_dependency_bugle_id"};
    public static final ekgp b;
    public static final bmpw c;
    public static final int[] d;

    static {
        ekgi ekgiVar = new ekgi();
        ekgiVar.i("cms_dead_letter_queue.bugle_table_type", 57090);
        ekgiVar.i("cms_dead_letter_queue.bugle_id", 57090);
        ekgiVar.i("cms_dead_letter_queue.cms_backup_parameters", 57090);
        ekgiVar.i("cms_dead_letter_queue.backup_flags", 57090);
        ekgiVar.i("cms_dead_letter_queue.backup_dependency_table_type", 57090);
        ekgiVar.i("cms_dead_letter_queue.backup_dependency_bugle_id", 57090);
        b = ekgiVar.c();
        ekgi ekgiVar2 = new ekgi();
        ekgiVar2.i("cms_id", "index_cms_dead_letter_queue_cms_id");
        ekgiVar2.i("abandoned_action", "index_cms_dead_letter_queue_abandoned_action");
        ekgiVar2.i("bugle_id", "index_cms_dead_letter_queue_bugle_id");
        ekgiVar2.c();
        c = new bmpw();
        d = new int[]{51040, 57090, 58050, 58300};
    }

    public static final bmqr a() {
        String[] strArr;
        Integer numC = c();
        if (numC.intValue() == Integer.MAX_VALUE) {
            strArr = a;
        } else {
            int i = ekgb.d;
            ekfw ekfwVar = new ekfw();
            ekfwVar.h("cms_dead_letter_queue._id");
            ekfwVar.h("cms_dead_letter_queue.cms_id");
            ekfwVar.h("cms_dead_letter_queue.cms_data_type");
            ekfwVar.h("cms_dead_letter_queue.abandoned_action");
            ekfwVar.h("cms_dead_letter_queue.failure_reason");
            if (numC.intValue() >= 57090) {
                ekfwVar.h("cms_dead_letter_queue.bugle_table_type");
            }
            if (numC.intValue() >= 57090) {
                ekfwVar.h("cms_dead_letter_queue.bugle_id");
            }
            if (numC.intValue() >= 57090) {
                ekfwVar.h("cms_dead_letter_queue.cms_backup_parameters");
            }
            if (numC.intValue() >= 57090) {
                ekfwVar.h("cms_dead_letter_queue.backup_flags");
            }
            if (numC.intValue() >= 57090) {
                ekfwVar.h("cms_dead_letter_queue.backup_dependency_table_type");
            }
            if (numC.intValue() >= 57090) {
                ekfwVar.h("cms_dead_letter_queue.backup_dependency_bugle_id");
            }
            strArr = (String[]) ekfwVar.g().toArray(new String[0]);
        }
        return new bmqr(strArr);
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
        sb.append("cms_id TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("cms_data_type INT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("abandoned_action INT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("failure_reason INT");
        if (i >= 57090) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("bugle_table_type INTEGER DEFAULT(-1)");
        }
        if (i >= 57090) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("bugle_id INTEGER DEFAULT('-1')");
        }
        if (i >= 57090) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("cms_backup_parameters BLOB");
        }
        if (i >= 57090) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("backup_flags INTEGER");
        }
        if (i >= 57090) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("backup_dependency_table_type INTEGER DEFAULT(-1)");
        }
        if (i >= 57090) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("backup_dependency_bugle_id INTEGER DEFAULT('-1')");
        }
        sb.insert(0, "CREATE TABLE cms_dead_letter_queue (");
        sb.append(");");
        dqsyVar.v(sb.toString());
        ArrayList arrayList = new ArrayList();
        if (i >= 58050) {
            arrayList.add("DROP INDEX IF EXISTS index_cms_dead_letter_queue_cms_id");
            arrayList.add("CREATE INDEX index_cms_dead_letter_queue_cms_id ON cms_dead_letter_queue(cms_id);");
        }
        if (i >= 58050) {
            arrayList.add("DROP INDEX IF EXISTS index_cms_dead_letter_queue_bugle_id");
            arrayList.add("CREATE INDEX index_cms_dead_letter_queue_bugle_id ON cms_dead_letter_queue(bugle_id);");
        }
        if (i >= 58300) {
            arrayList.add("DROP INDEX IF EXISTS index_cms_dead_letter_queue_abandoned_action");
            arrayList.add("CREATE INDEX index_cms_dead_letter_queue_abandoned_action ON cms_dead_letter_queue(abandoned_action);");
        }
        for (String str : (String[]) arrayList.toArray(new String[0])) {
            dqsyVar.v(str);
        }
    }

    public static dqxa e() {
        return b().M();
    }

    public static void f(bmou... bmouVarArr) {
        dqru.B(b(), 0, false, new BiConsumer() { // from class: bmor
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                bmou bmouVar = (bmou) obj;
                Long l = (Long) obj2;
                String[] strArr = bmqy.a;
                if (l.longValue() >= 0) {
                    bmouVar.a = String.valueOf(l);
                    bmouVar.fN(0);
                }
            }

            public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                return BiConsumer$CC.$default$andThen(this, biConsumer);
            }
        }, bmouVarArr);
    }
}
