package defpackage;

import com.google.android.ims.rcsservice.businessinfo.BusinessInfoDatabaseConstants;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cbfi extends dqsi {
    public static final String[] a = {"work_queue._id", "work_queue.type", "work_queue.rawdata", "work_queue.attempts", "work_queue.timestamp", "work_queue.queue", "work_queue.deduplication_tag", "work_queue.scheduled_in_workmanager", "work_queue.workmanager_id", "work_queue.minimum_start_time", "work_queue.cancellation_tag"};
    public static final ekgp b;
    public static final cbeg c;
    public static final int[] d;

    static {
        ekgi ekgiVar = new ekgi();
        ekgiVar.i("work_queue.queue", 41030);
        ekgiVar.i("work_queue.deduplication_tag", 42050);
        ekgiVar.i("work_queue.scheduled_in_workmanager", 45030);
        ekgiVar.i("work_queue.workmanager_id", 46060);
        ekgiVar.i("work_queue.minimum_start_time", 46070);
        ekgiVar.i("work_queue.cancellation_tag", 48020);
        b = ekgiVar.c();
        ekgi ekgiVar2 = new ekgi();
        ekgiVar2.i(BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.TYPE, "index_work_queue_type");
        ekgiVar2.i("deduplication_tag", "index_work_queue_deduplication_tag");
        ekgiVar2.i("scheduled_in_workmanager", "index_work_queue_scheduled_in_workmanager");
        ekgiVar2.c();
        c = new cbeg();
        d = new int[]{39060, 41030, 42050, 45030, 46060, 46070, 48020, 58270};
    }

    public static final cbfd a() {
        String[] strArr;
        Integer numC = c();
        if (numC.intValue() == Integer.MAX_VALUE) {
            strArr = a;
        } else {
            int i = ekgb.d;
            ekfw ekfwVar = new ekfw();
            ekfwVar.h("work_queue._id");
            ekfwVar.h("work_queue.type");
            ekfwVar.h("work_queue.rawdata");
            ekfwVar.h("work_queue.attempts");
            ekfwVar.h("work_queue.timestamp");
            if (numC.intValue() >= 41030) {
                ekfwVar.h("work_queue.queue");
            }
            if (numC.intValue() >= 42050) {
                ekfwVar.h("work_queue.deduplication_tag");
            }
            if (numC.intValue() >= 45030) {
                ekfwVar.h("work_queue.scheduled_in_workmanager");
            }
            if (numC.intValue() >= 46060) {
                ekfwVar.h("work_queue.workmanager_id");
            }
            if (numC.intValue() >= 46070) {
                ekfwVar.h("work_queue.minimum_start_time");
            }
            if (numC.intValue() >= 48020) {
                ekfwVar.h("work_queue.cancellation_tag");
            }
            strArr = (String[]) ekfwVar.g().toArray(new String[0]);
        }
        cbfd cbfdVar = new cbfd(strArr);
        cbfdVar.r();
        return cbfdVar;
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
        sb.append("type TEXT NOT NULL");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("subtype TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("rawdata BLOB NOT NULL");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("attempts INTEGER");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("timestamp INTEGER");
        if (i >= 41030) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("queue TEXT");
        }
        if (i >= 42050) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("deduplication_tag TEXT");
        }
        if (i >= 45030) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("scheduled_in_workmanager INT");
        }
        if (i >= 46060) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("workmanager_id TEXT");
        }
        if (i >= 46070) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("minimum_start_time INT");
        }
        if (i >= 48020) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("cancellation_tag TEXT");
        }
        sb.insert(0, "CREATE TABLE work_queue (");
        sb.append(");");
        dqsyVar.v(sb.toString());
        ArrayList arrayList = new ArrayList();
        if (i >= 41030) {
            arrayList.add("DROP INDEX IF EXISTS index_work_queue_queue");
            arrayList.add("CREATE INDEX index_work_queue_queue ON work_queue(queue);");
        }
        if (i >= 42050) {
            arrayList.add("DROP INDEX IF EXISTS index_work_queue_deduplication_tag");
            arrayList.add("CREATE INDEX index_work_queue_deduplication_tag ON work_queue(deduplication_tag);");
        }
        if (i >= 58270) {
            arrayList.add("DROP INDEX IF EXISTS index_work_queue_type");
            arrayList.add("CREATE INDEX index_work_queue_type ON work_queue(type);");
        }
        if (i >= 58270) {
            arrayList.add("DROP INDEX IF EXISTS index_work_queue_scheduled_in_workmanager");
            arrayList.add("CREATE INDEX index_work_queue_scheduled_in_workmanager ON work_queue(scheduled_in_workmanager);");
        }
        if (i >= 58270) {
            arrayList.add("DROP INDEX IF EXISTS queue_time");
            arrayList.add("CREATE INDEX queue_time ON work_queue(queue, minimum_start_time);");
        }
        for (String str : (String[]) arrayList.toArray(new String[0])) {
            dqsyVar.v(str);
        }
    }

    public static dqxa e() {
        return b().M();
    }
}
