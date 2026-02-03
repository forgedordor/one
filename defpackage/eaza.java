package defpackage;

import android.content.ContentValues;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eaza {
    static ContentValues a(eayy eayyVar, int i) {
        ContentValues contentValues = new ContentValues();
        eaxo eaxoVar = (eaxo) eayyVar;
        contentValues.put("customer_id", Long.valueOf(eaxoVar.a));
        contentValues.put("project_id", Long.valueOf(eaxoVar.b));
        contentValues.put("metric_id", Long.valueOf(eaxoVar.c));
        contentValues.put("report_id", Long.valueOf(eaxoVar.d));
        contentValues.put("last_sent_day_index", Integer.valueOf(i));
        return contentValues;
    }

    static ecnv b(eayy eayyVar, int i) {
        ecnw ecnwVar = new ecnw();
        ecnwVar.b("UPDATE Reports SET last_sent_day_index = ? ");
        ecnwVar.c(Long.valueOf(i));
        ecnwVar.b(" WHERE ");
        ecnwVar.b("customer_id = ?");
        eaxo eaxoVar = (eaxo) eayyVar;
        ecnwVar.c(Long.valueOf(eaxoVar.a));
        ecnwVar.b(" AND project_id = ?");
        ecnwVar.c(Long.valueOf(eaxoVar.b));
        ecnwVar.b(" AND metric_id = ?");
        ecnwVar.c(Long.valueOf(eaxoVar.c));
        ecnwVar.b(" AND report_id = ?");
        ecnwVar.c(Long.valueOf(eaxoVar.d));
        return ecnwVar.a();
    }
}
