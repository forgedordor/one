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
import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class SqlTimeTypeAdapter extends esyv {
    public static final esyw a = new esyw() { // from class: com.google.gson.internal.sql.SqlTimeTypeAdapter.1
        @Override // defpackage.esyw
        public final esyv a(esyd esydVar, etcz etczVar) {
            if (etczVar.a == Time.class) {
                return new SqlTimeTypeAdapter();
            }
            return null;
        }
    };
    private final DateFormat b = new SimpleDateFormat("hh:mm:ss a");

    @Override // defpackage.esyv
    public final /* bridge */ /* synthetic */ void b(etdd etddVar, Object obj) throws IOException {
        String str;
        Time time = (Time) obj;
        if (time == null) {
            etddVar.j();
            return;
        }
        synchronized (this) {
            str = this.b.format((Date) time);
        }
        etddVar.m(str);
    }

    @Override // defpackage.esyv
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final Time a(etdb etdbVar) throws IOException {
        Time time;
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
                    time = new Time(dateFormat.parse(strJ).getTime());
                } catch (ParseException e) {
                    throw new esyr(a.V(strJ, etdbVar, "Failed parsing '", "' as SQL Time; at path "), e);
                }
            } finally {
                this.b.setTimeZone(timeZone);
            }
        }
        return time;
    }
}
