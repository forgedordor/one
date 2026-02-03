package com.google.gson.internal.bind;

import defpackage.a;
import defpackage.esyd;
import defpackage.esyr;
import defpackage.esyv;
import defpackage.esyw;
import defpackage.etab;
import defpackage.etbb;
import defpackage.etcr;
import defpackage.etcz;
import defpackage.etdb;
import defpackage.etdd;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class DefaultDateTypeAdapter extends esyv {
    public static final esyw a = new esyw() { // from class: com.google.gson.internal.bind.DefaultDateTypeAdapter.1
        @Override // defpackage.esyw
        public final esyv a(esyd esydVar, etcz etczVar) {
            if (etczVar.a != Date.class) {
                return null;
            }
            etbb etbbVar = etbb.a;
            return new DefaultDateTypeAdapter();
        }

        public final String toString() {
            return "DefaultDateTypeAdapter#DEFAULT_STYLE_FACTORY";
        }
    };
    private final List b;

    public DefaultDateTypeAdapter() {
        ArrayList arrayList = new ArrayList();
        this.b = arrayList;
        arrayList.add(DateFormat.getDateTimeInstance(2, 2, Locale.US));
        if (!Locale.getDefault().equals(Locale.US)) {
            arrayList.add(DateFormat.getDateTimeInstance(2, 2));
        }
        if (etab.a()) {
            arrayList.add(new SimpleDateFormat("MMM d, yyyy h:mm:ss a", Locale.US));
        }
    }

    private final Date c(etdb etdbVar) throws IOException {
        List<DateFormat> list = this.b;
        String strJ = etdbVar.j();
        synchronized (list) {
            for (DateFormat dateFormat : list) {
                TimeZone timeZone = dateFormat.getTimeZone();
                try {
                    Date date = dateFormat.parse(strJ);
                    dateFormat.setTimeZone(timeZone);
                    return date;
                } catch (ParseException unused) {
                    dateFormat.setTimeZone(timeZone);
                } catch (Throwable th) {
                    dateFormat.setTimeZone(timeZone);
                    throw th;
                }
            }
            try {
                return etcr.a(strJ, new ParsePosition(0));
            } catch (ParseException e) {
                throw new esyr(a.V(strJ, etdbVar, "Failed parsing '", "' as Date; at path "), e);
            }
        }
    }

    @Override // defpackage.esyv
    public final /* bridge */ /* synthetic */ Object a(etdb etdbVar) {
        if (etdbVar.t() != 9) {
            return c(etdbVar);
        }
        etdbVar.p();
        return null;
    }

    @Override // defpackage.esyv
    public final /* bridge */ /* synthetic */ void b(etdd etddVar, Object obj) throws IOException {
        String str;
        Date date = (Date) obj;
        if (date == null) {
            etddVar.j();
            return;
        }
        List list = this.b;
        DateFormat dateFormat = (DateFormat) list.get(0);
        synchronized (list) {
            str = dateFormat.format(date);
        }
        etddVar.m(str);
    }

    public final String toString() {
        DateFormat dateFormat = (DateFormat) this.b.get(0);
        if (dateFormat instanceof SimpleDateFormat) {
            return "DefaultDateTypeAdapter(" + ((SimpleDateFormat) dateFormat).toPattern() + ")";
        }
        return "DefaultDateTypeAdapter(" + dateFormat.getClass().getSimpleName() + ")";
    }
}
