package defpackage;

import android.content.ContentValues;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eaxh {
    public static ContentValues a(eayy eayyVar, int i, long j, eayr eayrVar, Optional optional) {
        ContentValues contentValues = new ContentValues();
        eaxo eaxoVar = (eaxo) eayyVar;
        contentValues.put("customer_id", Long.valueOf(eaxoVar.a));
        contentValues.put("project_id", Long.valueOf(eaxoVar.b));
        contentValues.put("metric_id", Long.valueOf(eaxoVar.c));
        contentValues.put("report_id", Long.valueOf(eaxoVar.d));
        contentValues.put("day_index", Integer.valueOf(i));
        contentValues.put("system_profile_hash", Long.valueOf(j));
        contentValues.put("event_vector", eayrVar.c());
        if (optional.isEmpty()) {
            contentValues.putNull("aggregate_value");
            return contentValues;
        }
        contentValues.put("aggregate_value", ((evpz) optional.get()).toByteArray());
        return contentValues;
    }

    static ecnv b(eayy eayyVar, int i, eayr eayrVar, long j, long j2) {
        ecnw ecnwVar = new ecnw();
        ecnwVar.b("UPDATE AggregateStore SET system_profile_hash = ? ");
        ecnwVar.c(Long.valueOf(j2));
        ecnwVar.b(" WHERE customer_id = ?");
        eaxo eaxoVar = (eaxo) eayyVar;
        ecnwVar.c(Long.valueOf(eaxoVar.a));
        ecnwVar.b(" AND project_id = ?");
        ecnwVar.c(Long.valueOf(eaxoVar.b));
        ecnwVar.b(" AND metric_id = ?");
        ecnwVar.c(Long.valueOf(eaxoVar.c));
        ecnwVar.b(" AND report_id = ?");
        ecnwVar.c(Long.valueOf(eaxoVar.d));
        ecnwVar.b(" AND day_index = ?");
        ecnwVar.c(Long.valueOf(i));
        ecnwVar.b(" AND event_vector = ?");
        ecnwVar.d(eayrVar.c());
        ecnwVar.b(" AND system_profile_hash = ?");
        ecnwVar.c(Long.valueOf(j));
        return ecnwVar.a();
    }
}
