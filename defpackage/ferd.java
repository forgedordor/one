package defpackage;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.StringTokenizer;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ferd implements Serializable {
    public static final int a;
    private static final long serialVersionUID = -7333226591784095142L;
    public transient Log b;
    public String c;
    public fend d;
    public int e;
    private int f;
    private fenn g;
    private fenn h;
    private fenn i;
    private ferm j;
    private fenn k;
    private fenn l;
    private fenn m;
    private fenn n;
    private fenn o;
    private String p;
    private int q;
    private Map r;
    private int s;

    static {
        String strA = fews.a("net.fortuna.ical4j.recur.maxincrementcount");
        a = (strA == null || strA.length() <= 0) ? 1000 : Integer.parseInt(strA);
    }

    public ferd() {
        this.b = LogFactory.getLog(ferd.class);
        this.e = -1;
        this.f = -1;
        this.r = new HashMap();
        this.q = 2;
    }

    public static fene b(fene feneVar) {
        fene feneVar2 = new fene(feneVar.a);
        if (feneVar.c) {
            feneVar2.c();
            return feneVar2;
        }
        feneVar2.a(feneVar.b);
        return feneVar2;
    }

    private final void m() {
        int i;
        String str = this.c;
        if (str == null) {
            throw new IllegalArgumentException("A recurrence rule MUST contain a FREQ rule part.");
        }
        if ("SECONDLY".equals(str)) {
            i = 13;
        } else if ("MINUTELY".equals(this.c)) {
            i = 12;
        } else if ("HOURLY".equals(this.c)) {
            i = 11;
        } else if ("DAILY".equals(this.c)) {
            i = 6;
        } else if ("WEEKLY".equals(this.c)) {
            i = 3;
        } else if ("MONTHLY".equals(this.c)) {
            i = 2;
        } else {
            if (!"YEARLY".equals(this.c)) {
                throw new IllegalArgumentException("Invalid FREQ rule part '" + this.c + "' in recurrence rule");
            }
            i = 1;
        }
        this.s = i;
    }

    private static final String n(StringTokenizer stringTokenizer, String str) {
        try {
            return stringTokenizer.nextToken();
        } catch (NoSuchElementException unused) {
            throw new IllegalArgumentException("Missing expected token, last token: ".concat(String.valueOf(str)));
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        this.b = LogFactory.getLog(ferd.class);
    }

    public final Calendar a(fend fendVar, boolean z) {
        Calendar calendarC = fewu.c(fendVar);
        calendarC.setMinimalDaysInFirstWeek(4);
        calendarC.setFirstDayOfWeek(this.q);
        calendarC.setLenient(z);
        calendarC.setTime(fendVar);
        return calendarC;
    }

    public final fenn c() {
        if (this.i == null) {
            this.i = new fenn(0, 23, false);
        }
        return this.i;
    }

    public final fenn d() {
        if (this.h == null) {
            this.h = new fenn(0, 59, false);
        }
        return this.h;
    }

    public final fenn e() {
        if (this.k == null) {
            this.k = new fenn(1, 31, true);
        }
        return this.k;
    }

    public final fenn f() {
        if (this.n == null) {
            this.n = new fenn(1, 12, false);
        }
        return this.n;
    }

    public final fenn g() {
        if (this.g == null) {
            this.g = new fenn(0, 59, false);
        }
        return this.g;
    }

    public final fenn h() {
        if (this.o == null) {
            this.o = new fenn(1, 366, true);
        }
        return this.o;
    }

    public final fenn i() {
        if (this.m == null) {
            this.m = new fenn(1, 53, true);
        }
        return this.m;
    }

    public final fenn j() {
        if (this.l == null) {
            this.l = new fenn(1, 366, true);
        }
        return this.l;
    }

    public final ferm k() {
        if (this.j == null) {
            this.j = new ferm();
        }
        return this.j;
    }

    public final void l(Calendar calendar) {
        int i = this.f;
        if (i <= 0) {
            i = 1;
        }
        calendar.add(this.s, i);
    }

    public final String toString() {
        StringBuffer stringBuffer = new StringBuffer("FREQ=");
        stringBuffer.append(this.c);
        if (this.p != null) {
            stringBuffer.append(";WKST=");
            stringBuffer.append(this.p);
        }
        if (this.f > 0) {
            stringBuffer.append(";INTERVAL=");
            stringBuffer.append(this.f);
        }
        if (this.d != null) {
            stringBuffer.append(";UNTIL=");
            stringBuffer.append(this.d);
        }
        if (this.e > 0) {
            stringBuffer.append(";COUNT=");
            stringBuffer.append(this.e);
        }
        if (!f().isEmpty()) {
            stringBuffer.append(";BYMONTH=");
            stringBuffer.append(this.n);
        }
        if (!i().isEmpty()) {
            stringBuffer.append(";BYWEEKNO=");
            stringBuffer.append(this.m);
        }
        if (!j().isEmpty()) {
            stringBuffer.append(";BYYEARDAY=");
            stringBuffer.append(this.l);
        }
        if (!e().isEmpty()) {
            stringBuffer.append(";BYMONTHDAY=");
            stringBuffer.append(this.k);
        }
        if (!k().isEmpty()) {
            stringBuffer.append(";BYDAY=");
            stringBuffer.append(this.j);
        }
        if (!c().isEmpty()) {
            stringBuffer.append(";BYHOUR=");
            stringBuffer.append(this.i);
        }
        if (!d().isEmpty()) {
            stringBuffer.append(";BYMINUTE=");
            stringBuffer.append(this.h);
        }
        if (!g().isEmpty()) {
            stringBuffer.append(";BYSECOND=");
            stringBuffer.append(this.g);
        }
        if (!h().isEmpty()) {
            stringBuffer.append(";BYSETPOS=");
            stringBuffer.append(this.o);
        }
        return stringBuffer.toString();
    }

    public ferd(String str) {
        this.b = LogFactory.getLog(ferd.class);
        this.e = -1;
        this.f = -1;
        this.r = new HashMap();
        this.q = 2;
        StringTokenizer stringTokenizer = new StringTokenizer(str, ";=");
        while (stringTokenizer.hasMoreTokens()) {
            String strNextToken = stringTokenizer.nextToken();
            if ("FREQ".equals(strNextToken)) {
                this.c = n(stringTokenizer, strNextToken);
            } else if ("UNTIL".equals(strNextToken)) {
                String strN = n(stringTokenizer, strNextToken);
                if (strN != null && strN.indexOf("T") >= 0) {
                    fenh fenhVar = new fenh(strN);
                    this.d = fenhVar;
                    fenhVar.b(true);
                } else {
                    this.d = new fend(strN);
                }
            } else if ("COUNT".equals(strNextToken)) {
                this.e = Integer.parseInt(n(stringTokenizer, strNextToken));
            } else if ("INTERVAL".equals(strNextToken)) {
                this.f = Integer.parseInt(n(stringTokenizer, strNextToken));
            } else if ("BYSECOND".equals(strNextToken)) {
                this.g = new fenn(n(stringTokenizer, strNextToken), 0, 59, false);
            } else if ("BYMINUTE".equals(strNextToken)) {
                this.h = new fenn(n(stringTokenizer, strNextToken), 0, 59, false);
            } else if ("BYHOUR".equals(strNextToken)) {
                this.i = new fenn(n(stringTokenizer, strNextToken), 0, 23, false);
            } else if ("BYDAY".equals(strNextToken)) {
                this.j = new ferm(n(stringTokenizer, strNextToken));
            } else if ("BYMONTHDAY".equals(strNextToken)) {
                this.k = new fenn(n(stringTokenizer, strNextToken), 1, 31, true);
            } else if ("BYYEARDAY".equals(strNextToken)) {
                this.l = new fenn(n(stringTokenizer, strNextToken), 1, 366, true);
            } else if ("BYWEEKNO".equals(strNextToken)) {
                this.m = new fenn(n(stringTokenizer, strNextToken), 1, 53, true);
            } else if ("BYMONTH".equals(strNextToken)) {
                this.n = new fenn(n(stringTokenizer, strNextToken), 1, 12, false);
            } else if ("BYSETPOS".equals(strNextToken)) {
                this.o = new fenn(n(stringTokenizer, strNextToken), 1, 366, true);
            } else if ("WKST".equals(strNextToken)) {
                this.p = n(stringTokenizer, strNextToken);
                this.q = ferl.a(new ferl(this.p));
            } else if (fewr.b("ical4j.parsing.relaxed")) {
                this.r.put(strNextToken, n(stringTokenizer, strNextToken));
            } else {
                throw new IllegalArgumentException("Invalid recurrence rule part: " + strNextToken + "=" + n(stringTokenizer, strNextToken));
            }
        }
        m();
    }

    public ferd(byte[] bArr) {
        this.b = LogFactory.getLog(ferd.class);
        this.e = -1;
        this.f = -1;
        this.r = new HashMap();
        this.q = 2;
        this.c = "DAILY";
        this.e = 1;
        m();
    }
}
