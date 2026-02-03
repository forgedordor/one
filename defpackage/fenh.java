package defpackage;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fenh extends fend {
    private static final feng c;
    private static final feng d;
    private static final feng e;
    private static final feng f;
    private static final feng g;
    private static final long serialVersionUID = -6407231357919440387L;
    public ferg a;
    private ferf h;

    static {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd'T'HHmmss'Z'");
        simpleDateFormat.setTimeZone(fexc.a);
        simpleDateFormat.setLenient(false);
        c = new feng(simpleDateFormat);
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyyMMdd'T'HHmmss");
        simpleDateFormat2.setLenient(false);
        d = new feng(simpleDateFormat2);
        e = new feng(new SimpleDateFormat("yyyyMMdd'T'HHmmss"));
        SimpleDateFormat simpleDateFormat3 = new SimpleDateFormat("yyyyMMdd");
        simpleDateFormat3.setLenient(true);
        f = new feng(simpleDateFormat3);
        g = new feng(new SimpleDateFormat("yyyy'-'MM'-'dd'T'HH':'mm':'ss'Z'"));
    }

    public fenh() {
        super(TimeZone.getDefault());
        this.h = new ferf(getTime(), this.b.getTimeZone());
    }

    private final void d() {
        this.b.setTimeZone(ferg.getDefault());
    }

    private final void e(String str, DateFormat dateFormat, TimeZone timeZone) {
        if (timeZone != null) {
            dateFormat.setTimeZone(timeZone);
        }
        setTime(dateFormat.parse(str).getTime());
    }

    public final void a(ferg fergVar) {
        this.a = fergVar;
        if (fergVar != null) {
            this.b.setTimeZone(fergVar);
        } else {
            d();
        }
        this.h = new ferf(this.h, this.b.getTimeZone(), false);
    }

    public final void b(boolean z) {
        this.a = null;
        if (z) {
            this.b.setTimeZone(fexc.a);
        } else {
            d();
        }
        this.h = new ferf(this.h, this.b.getTimeZone(), z);
    }

    public final boolean c() {
        return this.h.a;
    }

    @Override // java.util.Date
    public final boolean equals(Object obj) {
        if (!(obj instanceof fenh)) {
            return super.equals(obj);
        }
        ffhf ffhfVar = new ffhf();
        ffhfVar.c(this.h, ((fenh) obj).h);
        return ffhfVar.a;
    }

    @Override // defpackage.fenl, java.util.Date
    public final void setTime(long j) {
        super.setTime(j);
        ferf ferfVar = this.h;
        if (ferfVar != null) {
            ferfVar.setTime(j);
        }
    }

    @Override // defpackage.fenl, java.util.Date
    public final String toString() {
        StringBuffer stringBuffer = new StringBuffer(super.toString());
        stringBuffer.append('T');
        stringBuffer.append(this.h.toString());
        return stringBuffer.toString();
    }

    public fenh(long j) {
        super(j, 0, TimeZone.getDefault());
        this.h = new ferf(j, this.b.getTimeZone());
    }

    public fenh(String str) {
        this(str, null);
    }

    public fenh(String str, ferg fergVar) throws ParseException {
        super(0L, 0, fergVar != null ? fergVar : TimeZone.getDefault());
        this.h = new ferf(getTime(), this.b.getTimeZone());
        try {
            if (str.endsWith("Z")) {
                e(str, c.a(), null);
                b(true);
            } else {
                if (fergVar != null) {
                    e(str, d.a(), fergVar);
                } else {
                    e(str, e.a(), this.b.getTimeZone());
                }
                a(fergVar);
            }
        } catch (ParseException e2) {
            if (fewr.b("ical4j.compatibility.vcard")) {
                try {
                    e(str, g.a(), fergVar);
                    a(fergVar);
                    return;
                } catch (ParseException unused) {
                    if (fewr.b("ical4j.parsing.relaxed") && str.indexOf("-") == -1) {
                        e(str, f.a(), fergVar);
                        a(fergVar);
                        return;
                    }
                    return;
                }
            }
            if (fewr.b("ical4j.parsing.relaxed") && str.indexOf("-") == -1) {
                e(str, f.a(), fergVar);
                a(fergVar);
                return;
            }
            throw e2;
        }
    }

    public fenh(Date date) {
        super(date.getTime(), 0, TimeZone.getDefault());
        this.h = new ferf(date.getTime(), this.b.getTimeZone());
        if (date instanceof fenh) {
            fenh fenhVar = (fenh) date;
            if (fenhVar.c()) {
                b(true);
            } else {
                a(fenhVar.a);
            }
        }
    }

    public fenh(byte[] bArr) {
        this();
        b(true);
    }
}
