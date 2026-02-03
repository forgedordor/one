package defpackage;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.TimeZone;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class fend extends fenl {
    private static final long serialVersionUID = 7136072363141363141L;

    public fend() {
        super(1, fexc.a());
    }

    protected fend(TimeZone timeZone) {
        super(0, timeZone);
    }

    public fend(long j, int i, TimeZone timeZone) {
        super(j, "yyyyMMdd", i, timeZone);
    }

    public fend(String str) throws ParseException {
        super(1, fexc.a());
        try {
            setTime(this.b.parse(str).getTime());
        } catch (ParseException e) {
            if (fewr.b("ical4j.compatibility.vcard")) {
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy'-'MM'-'dd");
                simpleDateFormat.setTimeZone(fexc.a());
                setTime(simpleDateFormat.parse(str).getTime());
                return;
            }
            throw e;
        }
    }
}
