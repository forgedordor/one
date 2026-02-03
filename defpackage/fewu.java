package defpackage;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fewu {
    public static int a(Date date, int i) {
        if (i == 0 || i < -31 || i > 31) {
            throw new IllegalArgumentException(MessageFormat.format("Invalid month day [{0}]", Integer.valueOf(i)));
        }
        if (i > 0) {
            return i;
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        int i2 = calendar.get(2);
        ArrayList arrayList = new ArrayList();
        calendar.set(5, 1);
        while (calendar.get(2) == i2) {
            arrayList.add(Integer.valueOf(calendar.get(5)));
            calendar.add(5, 1);
        }
        return ((Integer) arrayList.get(arrayList.size() + i)).intValue();
    }

    public static long b(long j, int i, TimeZone timeZone) {
        if (i == 0 && j % 1000 == 0) {
            return j;
        }
        Calendar calendar = Calendar.getInstance(timeZone);
        calendar.setTimeInMillis(j);
        if (i == 1) {
            calendar.set(11, 0);
            calendar.clear(12);
            calendar.clear(13);
            calendar.clear(14);
        } else {
            calendar.clear(14);
        }
        return calendar.getTimeInMillis();
    }

    public static Calendar c(fend fendVar) {
        if (!(fendVar instanceof fenh)) {
            return Calendar.getInstance(fexc.a());
        }
        fenh fenhVar = (fenh) fendVar;
        ferg fergVar = fenhVar.a;
        return fergVar != null ? Calendar.getInstance(fergVar) : fenhVar.c() ? Calendar.getInstance(fexc.a) : Calendar.getInstance();
    }

    public static fend d(Date date, fety fetyVar) {
        return fety.e.equals(fetyVar) ? new fend(date.getTime(), 1, fexc.a()) : new fenh(date);
    }
}
