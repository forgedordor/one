package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bsrg extends dqsi {
    public static final String[] a = {"pipeline_work.work_id", "pipeline_work.pipeline_type", "pipeline_work.sequencing_key", "pipeline_work.insertion_timestamp", "pipeline_work.execution_attempt_count", "pipeline_work.execution_state", "pipeline_work.client_supplied_id", "pipeline_work.payload", "pipeline_work.execute_after_timestamp"};
    public static final bsqh b;
    public static final int[] c;

    static {
        ekgi ekgiVar = new ekgi();
        ekgiVar.i("pipeline_work.execute_after_timestamp", 60840);
        ekgiVar.c();
        new ekgi().c();
        b = new bsqh();
        c = new int[]{60510, 60840};
    }

    public static final bsra a() {
        String[] strArr;
        Integer numC = c();
        if (numC.intValue() == Integer.MAX_VALUE) {
            strArr = a;
        } else {
            int i = ekgb.d;
            ekfw ekfwVar = new ekfw();
            ekfwVar.h("pipeline_work.work_id");
            ekfwVar.h("pipeline_work.pipeline_type");
            ekfwVar.h("pipeline_work.sequencing_key");
            ekfwVar.h("pipeline_work.insertion_timestamp");
            ekfwVar.h("pipeline_work.execution_attempt_count");
            ekfwVar.h("pipeline_work.execution_state");
            ekfwVar.h("pipeline_work.client_supplied_id");
            ekfwVar.h("pipeline_work.payload");
            if (numC.intValue() >= 60840) {
                ekfwVar.h("pipeline_work.execute_after_timestamp");
            }
            strArr = (String[]) ekfwVar.g().toArray(new String[0]);
        }
        return new bsra(strArr);
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
        sb.append("work_id TEXT PRIMARY KEY");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("pipeline_type INTEGER NOT NULL");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("sequencing_key TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("insertion_timestamp INTEGER NOT NULL");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("execution_attempt_count INTEGER DEFAULT(0) NOT NULL");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("execution_state INTEGER NOT NULL");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("client_supplied_id TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("payload BLOB");
        if (i >= 60840) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("execute_after_timestamp INTEGER");
        }
        sb.insert(0, "CREATE TABLE pipeline_work (");
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
