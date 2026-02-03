package com.google.gson.internal.sql;

import defpackage.a;
import defpackage.esyd;
import defpackage.esyr;
import defpackage.esyv;
import defpackage.esyw;
import defpackage.etcz;
import defpackage.etdb;
import defpackage.etdd;
import java.io.IOException;
import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.TimeZone;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class SqlDateTypeAdapter extends esyv {
    public static final esyw a = new esyw() { // from class: com.google.gson.internal.sql.SqlDateTypeAdapter.1
        @Override // defpackage.esyw
        public final esyv a(esyd esydVar, etcz etczVar) {
            if (etczVar.a == Date.class) {
                return new SqlDateTypeAdapter();
            }
            return null;
        }
    };
    private final DateFormat b = new SimpleDateFormat("MMM d, yyyy");

    @Override // defpackage.esyv
    public final /* bridge */ /* synthetic */ void b(etdd etddVar, Object obj) throws IOException {
        String str;
        Date date = (Date) obj;
        if (date == null) {
            etddVar.j();
            return;
        }
        synchronized (this) {
            str = this.b.format((java.util.Date) date);
        }
        etddVar.m(str);
    }

    @Override // defpackage.esyv
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final Date a(etdb etdbVar) throws IOException {
        Date date;
        if (etdbVar.t() == 9) {
            etdbVar.p();
            return null;
        }
        String strJ = etdbVar.j();
        synchronized (this) {
            DateFormat dateFormat = this.b;
            TimeZone timeZone = dateFormat.getTimeZone();
            try {
                try {
                    date = new Date(dateFormat.parse(strJ).getTime());
                } catch (ParseException e) {
                    throw new esyr(a.V(strJ, etdbVar, "Failed parsing '", "' as SQL Date; at path "), e);
                }
            } finally {
                this.b.setTimeZone(timeZone);
            }
        }
        return date;
    }
}
