package defpackage;

import android.util.Log;
import j$.time.DateTimeException;
import j$.time.DayOfWeek;
import j$.time.LocalDate;
import j$.time.LocalTime;
import j$.time.OffsetDateTime;
import j$.time.ZoneOffset;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class easr {
    public static final /* synthetic */ int a = 0;
    private static final ekgp b;
    private static final easj c;

    static {
        ekgi ekgiVar = new ekgi();
        ekgiVar.i(DayOfWeek.SUNDAY, eary.SUNDAY);
        ekgiVar.i(DayOfWeek.MONDAY, eary.MONDAY);
        ekgiVar.i(DayOfWeek.TUESDAY, eary.TUESDAY);
        ekgiVar.i(DayOfWeek.WEDNESDAY, eary.WEDNESDAY);
        ekgiVar.i(DayOfWeek.THURSDAY, eary.THURSDAY);
        ekgiVar.i(DayOfWeek.FRIDAY, eary.FRIDAY);
        ekgiVar.i(DayOfWeek.SATURDAY, eary.SATURDAY);
        b = ekgiVar.c();
        c = easj.c(23, 59);
    }

    static long a(ZoneOffset zoneOffset, easi easiVar, int i, int i2) {
        return OffsetDateTime.of(LocalDate.of(easiVar.c(), easiVar.b(), easiVar.a()), LocalTime.of(i, i2), zoneOffset).toInstant().toEpochMilli();
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0091  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Boolean b(defpackage.eatj r12, long r13) {
        /*
            Method dump skipped, instructions count: 497
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.easr.b(eatj, long):java.lang.Boolean");
    }

    private static ZoneOffset c(int i) {
        try {
            return ZoneOffset.ofTotalSeconds(i * 60);
        } catch (DateTimeException unused) {
            Log.w("Places OpeningHoursUtil", String.format("Cannot find timezone that associates with utcOffsetMinutes %d from Place object.", Integer.valueOf(i)));
            return null;
        }
    }
}
