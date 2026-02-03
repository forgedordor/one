package defpackage;

import j$.time.Instant;
import j$.util.DateRetargetInterface;
import j$.util.DesugarDate;
import j$.util.DesugarTimeZone;
import java.text.DateFormat;
import java.util.Date;
import java.util.TimeZone;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class fenl extends Date implements DateRetargetInterface {
    private static final long serialVersionUID = -4290728005713946811L;
    private DateFormat a;
    public DateFormat b;
    private int c;

    public fenl(long j, String str, int i, TimeZone timeZone) {
        super(fewu.b(j, i, timeZone));
        DateFormat dateFormatA = femx.a(str);
        this.b = dateFormatA;
        dateFormatA.setTimeZone(timeZone);
        this.b.setLenient(fewr.b("ical4j.parsing.relaxed"));
        this.c = i;
    }

    @Override // java.util.Date
    public void setTime(long j) {
        DateFormat dateFormat = this.b;
        if (dateFormat != null) {
            super.setTime(fewu.b(j, this.c, dateFormat.getTimeZone()));
        } else {
            super.setTime(j);
        }
    }

    @Override // java.util.Date, j$.util.DateRetargetInterface
    public final /* synthetic */ Instant toInstant() {
        return DesugarDate.toInstant(this);
    }

    @Override // java.util.Date
    public String toString() {
        TimeZone timeZone = this.b.getTimeZone();
        if (timeZone instanceof ferg) {
            return this.b.format((Date) this);
        }
        if (this.a == null) {
            DateFormat dateFormat = (DateFormat) this.b.clone();
            this.a = dateFormat;
            dateFormat.setTimeZone(DesugarTimeZone.getTimeZone("Etc/GMT"));
        }
        return (timeZone.inDaylightTime(this) && timeZone.inDaylightTime(new Date(getTime() + (-1)))) ? this.a.format(new Date(getTime() + timeZone.getRawOffset() + timeZone.getDSTSavings())) : this.a.format(new Date(getTime() + timeZone.getRawOffset()));
    }

    public fenl(int i, TimeZone timeZone) {
        this(((long) Math.floor(System.currentTimeMillis() / 1000.0d)) * 1000, "yyyyMMdd", i, timeZone);
    }
}
