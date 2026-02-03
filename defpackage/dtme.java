package defpackage;

import j$.util.DesugarTimeZone;
import java.util.GregorianCalendar;
import java.util.HashSet;
import java.util.TimeZone;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dtme {
    private static final TimeZone a;
    private final diep b;
    private volatile long c;

    static {
        int i = elcz.a;
        a = DesugarTimeZone.getTimeZone("America/Los_Angeles");
    }

    public dtme(diep diepVar) {
        new HashSet();
        this.b = diepVar;
        GregorianCalendar gregorianCalendar = new GregorianCalendar(a);
        gregorianCalendar.setTimeInMillis(diepVar.f().toEpochMilli());
        gregorianCalendar.set(11, 0);
        gregorianCalendar.set(12, 0);
        gregorianCalendar.set(13, 0);
        gregorianCalendar.set(14, 0);
        this.c = gregorianCalendar.getTimeInMillis();
    }
}
