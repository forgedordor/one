package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes6.dex */
public abstract class fgmu implements Serializable {
    public static final fgmu b = new fgmt("era", (byte) 1, fgnc.a);
    public static final fgmu c;
    public static final fgmu d;
    public static final fgmu e;
    public static final fgmu f;
    public static final fgmu g;
    public static final fgmu h;
    public static final fgmu i;
    public static final fgmu j;
    public static final fgmu k;
    public static final fgmu l;
    public static final fgmu m;
    public static final fgmu n;
    public static final fgmu o;
    public static final fgmu p;
    public static final fgmu q;
    public static final fgmu r;
    public static final fgmu s;
    private static final long serialVersionUID = -42615285973990L;
    public static final fgmu t;
    public static final fgmu u;
    public static final fgmu v;
    public static final fgmu w;
    public static final fgmu x;
    public final String y;

    static {
        fgnc fgncVar = fgnc.d;
        c = new fgmt("yearOfEra", (byte) 2, fgncVar);
        d = new fgmt("centuryOfEra", (byte) 3, fgnc.b);
        e = new fgmt("yearOfCentury", (byte) 4, fgncVar);
        f = new fgmt("year", (byte) 5, fgncVar);
        fgnc fgncVar2 = fgnc.g;
        g = new fgmt("dayOfYear", (byte) 6, fgncVar2);
        h = new fgmt("monthOfYear", (byte) 7, fgnc.e);
        i = new fgmt("dayOfMonth", (byte) 8, fgncVar2);
        fgnc fgncVar3 = fgnc.c;
        j = new fgmt("weekyearOfCentury", (byte) 9, fgncVar3);
        k = new fgmt("weekyear", (byte) 10, fgncVar3);
        l = new fgmt("weekOfWeekyear", (byte) 11, fgnc.f);
        m = new fgmt("dayOfWeek", (byte) 12, fgncVar2);
        n = new fgmt("halfdayOfDay", (byte) 13, fgnc.h);
        fgnc fgncVar4 = fgnc.i;
        o = new fgmt("hourOfHalfday", (byte) 14, fgncVar4);
        p = new fgmt("clockhourOfHalfday", (byte) 15, fgncVar4);
        q = new fgmt("clockhourOfDay", (byte) 16, fgncVar4);
        r = new fgmt("hourOfDay", (byte) 17, fgncVar4);
        fgnc fgncVar5 = fgnc.j;
        s = new fgmt("minuteOfDay", (byte) 18, fgncVar5);
        t = new fgmt("minuteOfHour", (byte) 19, fgncVar5);
        fgnc fgncVar6 = fgnc.k;
        u = new fgmt("secondOfDay", (byte) 20, fgncVar6);
        v = new fgmt("secondOfMinute", (byte) 21, fgncVar6);
        fgnc fgncVar7 = fgnc.l;
        w = new fgmt("millisOfDay", (byte) 22, fgncVar7);
        x = new fgmt("millisOfSecond", (byte) 23, fgncVar7);
    }

    protected fgmu(String str) {
        this.y = str;
    }

    public abstract fgms a(fgmq fgmqVar);

    public final String toString() {
        return this.y;
    }
}
