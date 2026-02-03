package com.google.gson.internal.sql;

import defpackage.esyd;
import defpackage.esyv;
import defpackage.esyw;
import defpackage.etcz;
import defpackage.etdb;
import defpackage.etdd;
import java.sql.Timestamp;
import java.util.Date;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class SqlTimestampTypeAdapter extends esyv {
    public static final esyw a = new esyw() { // from class: com.google.gson.internal.sql.SqlTimestampTypeAdapter.1
        @Override // defpackage.esyw
        public final esyv a(esyd esydVar, etcz etczVar) {
            if (etczVar.a == Timestamp.class) {
                return new SqlTimestampTypeAdapter(esydVar.b(Date.class));
            }
            return null;
        }
    };
    private final esyv b;

    public SqlTimestampTypeAdapter(esyv esyvVar) {
        this.b = esyvVar;
    }

    @Override // defpackage.esyv
    public final /* bridge */ /* synthetic */ Object a(etdb etdbVar) {
        Date date = (Date) this.b.a(etdbVar);
        if (date != null) {
            return new Timestamp(date.getTime());
        }
        return null;
    }

    @Override // defpackage.esyv
    public final /* bridge */ /* synthetic */ void b(etdd etddVar, Object obj) {
        this.b.b(etddVar, (Timestamp) obj);
    }
}
