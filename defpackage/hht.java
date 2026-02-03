package defpackage;

import j$.time.DayOfWeek;
import j$.time.Instant;
import j$.time.LocalDate;
import j$.time.LocalTime;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.chrono.Chronology;
import j$.time.format.DateTimeFormatterBuilder;
import j$.time.format.DateTimeParseException;
import j$.time.format.FormatStyle;
import j$.time.format.TextStyle;
import j$.time.temporal.WeekFields;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hht extends hhr {
    public static final ZoneId c = ZoneId.of("UTC");
    private final int d;
    private final List e;

    public hht(Locale locale) {
        super(locale);
        this.d = WeekFields.of(locale).getFirstDayOfWeek().getValue();
        DayOfWeek[] dayOfWeekArrValues = DayOfWeek.values();
        ArrayList arrayList = new ArrayList(dayOfWeekArrValues.length);
        for (DayOfWeek dayOfWeek : dayOfWeekArrValues) {
            arrayList.add(new fcti(dayOfWeek.getDisplayName(TextStyle.FULL, locale), dayOfWeek.getDisplayName(TextStyle.NARROW, locale)));
        }
        this.e = arrayList;
    }

    private final hhv l(LocalDate localDate) {
        int value = localDate.getDayOfWeek().getValue() - this.d;
        if (value < 0) {
            value += 7;
        }
        return new hhv(localDate.getYear(), localDate.getMonthValue(), localDate.lengthOfMonth(), value, localDate.B(LocalTime.MIDNIGHT).y(c).toInstant().toEpochMilli());
    }

    @Override // defpackage.hhr
    public final int a() {
        return this.d;
    }

    @Override // defpackage.hhr
    public final hhq b(long j) {
        LocalDate localDate = Instant.ofEpochMilli(j).atZone(c).toLocalDate();
        return new hhq(localDate.getYear(), localDate.getMonthValue(), localDate.getDayOfMonth(), 1000 * localDate.atStartOfDay().toEpochSecond(ZoneOffset.UTC));
    }

    @Override // defpackage.hhr
    public final hhq c() {
        LocalDate localDateNow = LocalDate.now();
        return new hhq(localDateNow.getYear(), localDateNow.getMonthValue(), localDateNow.getDayOfMonth(), localDateNow.B(LocalTime.MIDNIGHT).y(c).toInstant().toEpochMilli());
    }

    @Override // defpackage.hhr
    public final hhq d(String str, String str2, Locale locale) {
        try {
            LocalDate localDate = LocalDate.parse(str, hhs.a(str2, locale, this.b));
            return new hhq(localDate.getYear(), localDate.getMonth().getValue(), localDate.getDayOfMonth(), localDate.B(LocalTime.MIDNIGHT).y(c).toInstant().toEpochMilli());
        } catch (DateTimeParseException unused) {
            return null;
        }
    }

    @Override // defpackage.hhr
    public final hhv e(long j) {
        return l(Instant.ofEpochMilli(j).atZone(c).withDayOfMonth(1).toLocalDate());
    }

    @Override // defpackage.hhr
    public final hhv f(hhq hhqVar) {
        return l(LocalDate.of(hhqVar.a, hhqVar.b, 1));
    }

    @Override // defpackage.hhr
    public final hhv g(int i, int i2) {
        return l(LocalDate.of(i, i2, 1));
    }

    @Override // defpackage.hhr
    public final hhv h(hhv hhvVar, int i) {
        return i <= 0 ? hhvVar : l(Instant.ofEpochMilli(hhvVar.e).atZone(c).toLocalDate().plusMonths(i));
    }

    @Override // defpackage.hhr
    public final hid i(Locale locale) {
        String strB = fdgn.B(fdgn.q(new fdgl("y{1,4}").b(new fdgl("M{1,2}").b(new fdgl("d{1,2}").b(new fdgl("[^dMy/\\-.]").b(DateTimeFormatterBuilder.getLocalizedDateTimePattern(FormatStyle.SHORT, null, Chronology.CC.ofLocale(locale), locale), ""), "dd"), "MM"), "yyyy"), "My", "M/y"), ".");
        fdgd fdgdVarF = new fdgl("[/\\-.]").f(strB);
        fdgdVarF.getClass();
        fdgc fdgcVarB = ((fdgg) fdgdVarF).b.b(0);
        fdgcVarB.getClass();
        return new hid(strB, fdgcVarB.a.charAt(0));
    }

    @Override // defpackage.hhr
    public final String j(long j, String str, Locale locale) {
        return Instant.ofEpochMilli(j).atZone(c).toLocalDate().format(hhs.a(str, locale, this.b));
    }

    @Override // defpackage.hhr
    public final List k() {
        return this.e;
    }

    public final String toString() {
        return "CalendarModel";
    }
}
