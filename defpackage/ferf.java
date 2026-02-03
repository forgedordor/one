package defpackage;

import java.util.Date;
import java.util.TimeZone;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ferf extends fenl {
    private static final long serialVersionUID = -8401010870773304348L;
    public boolean a;

    /* JADX WARN: Illegal instructions before constructor call */
    public ferf(long j, TimeZone timeZone) {
        TimeZone timeZone2 = fexc.a;
        boolean z = "Etc/UTC".equals(timeZone.getID()) || "GMT".equals(timeZone.getID());
        super(j, true != z ? "HHmmss" : "HHmmss'Z'", 0, timeZone);
        this.a = false;
        this.b.setTimeZone(timeZone);
        this.a = z;
    }

    public ferf(Date date, TimeZone timeZone, boolean z) {
        super(date.getTime(), true != z ? "HHmmss" : "HHmmss'Z'", 0, timeZone);
        this.a = false;
        this.b.setTimeZone(timeZone);
        this.a = z;
    }
}
