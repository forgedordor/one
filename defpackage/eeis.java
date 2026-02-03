package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eeis implements Comparable<eeis>, Parcelable {
    public static final Parcelable.Creator<eeis> CREATOR = new eeir();
    public final Calendar a;
    final int b;
    final int c;
    public final int d;
    final int e;
    final long f;
    private String g;

    public eeis(Calendar calendar) {
        calendar.set(5, 1);
        Calendar calendarC = eejd.c(calendar);
        this.a = calendarC;
        this.b = calendarC.get(2);
        this.c = calendarC.get(1);
        this.d = calendarC.getMaximum(7);
        this.e = calendarC.getActualMaximum(5);
        this.f = calendarC.getTimeInMillis();
    }

    static eeis c(long j) {
        Calendar calendarE = eejd.e();
        calendarE.setTimeInMillis(j);
        return new eeis(calendarE);
    }

    static eeis d(int i, int i2) {
        Calendar calendarE = eejd.e();
        calendarE.set(1, i);
        calendarE.set(2, i2);
        return new eeis(calendarE);
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(eeis eeisVar) {
        return this.a.compareTo(eeisVar.a);
    }

    final int b(eeis eeisVar) {
        if (!(this.a instanceof GregorianCalendar)) {
            throw new IllegalArgumentException("Only Gregorian calendars are supported.");
        }
        return ((eeisVar.c - this.c) * 12) + (eeisVar.b - this.b);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    final eeis e(int i) {
        Calendar calendarC = eejd.c(this.a);
        calendarC.add(2, i);
        return new eeis(calendarC);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eeis)) {
            return false;
        }
        eeis eeisVar = (eeis) obj;
        return this.b == eeisVar.b && this.c == eeisVar.c;
    }

    final String f() {
        if (this.g == null) {
            this.g = eejd.b("yMMMM", Locale.getDefault()).format(new Date(this.a.getTimeInMillis()));
        }
        return this.g;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.b), Integer.valueOf(this.c)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.c);
        parcel.writeInt(this.b);
    }
}
