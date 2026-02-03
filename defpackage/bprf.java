package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bprf extends dqsi {
    public static final String[] a = {"generic_worker_queue._id", "generic_worker_queue.worker_type", "generic_worker_queue.item_table_type", "generic_worker_queue.item_id", "generic_worker_queue.account_id", "generic_worker_queue.in_flight", "generic_worker_queue.retry_count", "generic_worker_queue.flags", "generic_worker_queue.next_execute_timestamp", "generic_worker_queue.trigger_name", "generic_worker_queue.enqueued_timestamp"};
    public static final ekgp b;
    public static final bpqd c;
    public static final int[] d;

    static {
        ekgi ekgiVar = new ekgi();
        ekgiVar.i("generic_worker_queue.account_id", 39020);
        ekgiVar.i("generic_worker_queue.flags", 32000);
        ekgiVar.i("generic_worker_queue.next_execute_timestamp", 34000);
        ekgiVar.i("generic_worker_queue.trigger_name", 59700);
        ekgiVar.i("generic_worker_queue.enqueued_timestamp", 59970);
        b = ekgiVar.c();
        new ekgi().c();
        c = new bpqd();
        d = new int[]{24000, 32000, 34000, 39020, 58340, 59700, 59970};
    }

    public static final bpra a() {
        String[] strArr;
        Integer numC = c();
        if (numC.intValue() == Integer.MAX_VALUE) {
            strArr = a;
        } else {
            int i = ekgb.d;
            ekfw ekfwVar = new ekfw();
            ekfwVar.h("generic_worker_queue._id");
            ekfwVar.h("generic_worker_queue.worker_type");
            ekfwVar.h("generic_worker_queue.item_table_type");
            ekfwVar.h("generic_worker_queue.item_id");
            if (numC.intValue() >= 39020) {
                ekfwVar.h("generic_worker_queue.account_id");
            }
            ekfwVar.h("generic_worker_queue.in_flight");
            ekfwVar.h("generic_worker_queue.retry_count");
            if (numC.intValue() >= 32000) {
                ekfwVar.h("generic_worker_queue.flags");
            }
            if (numC.intValue() >= 34000) {
                ekfwVar.h("generic_worker_queue.next_execute_timestamp");
            }
            if (numC.intValue() >= 59700) {
                ekfwVar.h("generic_worker_queue.trigger_name");
            }
            if (numC.intValue() >= 59970) {
                ekfwVar.h("generic_worker_queue.enqueued_timestamp");
            }
            strArr = (String[]) ekfwVar.g().toArray(new String[0]);
        }
        return new bpra(strArr);
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
        sb.append("worker_type INTEGER DEFAULT(3)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("item_table_type INTEGER");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("item_id INTEGER");
        if (i >= 39020) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("account_id INTEGER DEFAULT(-1)");
        }
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("in_flight INTEGER DEFAULT(0)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("retry_count INTEGER DEFAULT(0)");
        if (i >= 32000) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("flags INTEGER DEFAULT(0)");
        }
        if (i >= 34000) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("next_execute_timestamp INTEGER DEFAULT(0)");
        }
        if (i >= 59700) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("trigger_name TEXT");
        }
        if (i >= 59970) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("enqueued_timestamp INTEGER DEFAULT(0)");
        }
        sb.insert(0, "CREATE TABLE generic_worker_queue (");
        sb.append(");");
        dqsyVar.v(sb.toString());
        ArrayList arrayList = new ArrayList();
        if (i >= 58340) {
            arrayList.add("DROP INDEX IF EXISTS index_generic_worker_queue_next_execute_timestamp");
            arrayList.add("CREATE INDEX index_generic_worker_queue_next_execute_timestamp ON generic_worker_queue(next_execute_timestamp);");
        }
        if (i >= 58340) {
            arrayList.add("DROP INDEX IF EXISTS index_multi_column_index");
            arrayList.add("CREATE INDEX index_multi_column_index ON generic_worker_queue(in_flight, retry_count, item_id, item_table_type, next_execute_timestamp);");
        }
        for (String str : (String[]) arrayList.toArray(new String[0])) {
            dqsyVar.v(str);
        }
    }

    public static dqxa e() {
        return b().M();
    }
}
