package defpackage;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import j$.time.Instant;
import j$.util.Optional;

/* compiled from: PG */
@Deprecated
/* loaded from: classes5.dex */
public final class efmp {
    public static int a(Parcel parcel) {
        int iDataPosition = parcel.dataPosition();
        int i = parcel.readInt();
        parcel.setDataPosition(iDataPosition);
        return i;
    }

    public static Optional b(Parcel parcel, int i) {
        if (!s(parcel, i)) {
            return Optional.empty();
        }
        parcel.readInt();
        return Optional.of(Double.valueOf(parcel.readDouble()));
    }

    public static Optional c(Parcel parcel, int i) {
        if (!s(parcel, i)) {
            return Optional.empty();
        }
        parcel.readInt();
        return Optional.of(Instant.ofEpochSecond(parcel.readLong()).plusNanos(parcel.readInt()));
    }

    public static Optional d(Parcel parcel, int i) {
        if (!s(parcel, i)) {
            return Optional.empty();
        }
        parcel.readInt();
        return Optional.of(Integer.valueOf(parcel.readInt()));
    }

    public static Optional e(Parcel parcel) {
        return parcel.dataAvail() <= 0 ? Optional.empty() : !s(parcel, Integer.MIN_VALUE) ? Optional.empty() : Optional.of(Boolean.TRUE);
    }

    public static Optional f(Parcel parcel, int i, Parcelable.Creator creator) {
        if (!s(parcel, i)) {
            return Optional.empty();
        }
        parcel.readInt();
        return Optional.ofNullable(creator.createFromParcel(parcel));
    }

    public static Optional g(Parcel parcel, int i, Parcelable.Creator creator) {
        if (!s(parcel, i)) {
            return Optional.empty();
        }
        parcel.readInt();
        int i2 = parcel.readInt();
        int i3 = ekgb.d;
        ekfw ekfwVar = new ekfw();
        for (int i4 = 0; i4 < i2; i4++) {
            ekfwVar.h(creator.createFromParcel(parcel));
        }
        return Optional.of(ekfwVar.g());
    }

    public static Optional h(Parcel parcel, int i) {
        if (!s(parcel, i)) {
            return Optional.empty();
        }
        parcel.readInt();
        return Optional.ofNullable(parcel.readString());
    }

    public static Optional i(Parcel parcel, int i) {
        if (!s(parcel, i)) {
            return Optional.empty();
        }
        parcel.setDataPosition(parcel.dataPosition() + parcel.readInt());
        return Optional.of(true);
    }

    public static Optional j(Parcel parcel) {
        int iA = a(parcel);
        while (iA != Integer.MIN_VALUE) {
            if (!i(parcel, iA).isPresent()) {
                return Optional.empty();
            }
            iA = a(parcel);
        }
        return e(parcel);
    }

    public static void k(Parcel parcel, int i, int i2) {
        int iDataPosition = parcel.dataPosition();
        parcel.setDataPosition(i);
        parcel.writeInt(iDataPosition - i2);
        parcel.setDataPosition(iDataPosition);
    }

    public static void l(Parcel parcel) {
        parcel.writeInt(Integer.MIN_VALUE);
    }

    public static void m(Parcel parcel, int i, double d) {
        parcel.writeInt(i);
        int iDataPosition = parcel.dataPosition();
        parcel.writeInt(0);
        int iDataPosition2 = parcel.dataPosition();
        parcel.writeDouble(d);
        k(parcel, iDataPosition, iDataPosition2);
    }

    public static void n(Parcel parcel, int i, Instant instant) {
        parcel.writeInt(i);
        int iDataPosition = parcel.dataPosition();
        parcel.writeInt(0);
        int iDataPosition2 = parcel.dataPosition();
        parcel.writeLong(instant.getEpochSecond());
        parcel.writeInt(instant.getNano());
        k(parcel, iDataPosition, iDataPosition2);
    }

    public static void o(Parcel parcel, int i, int i2) {
        parcel.writeInt(i);
        int iDataPosition = parcel.dataPosition();
        parcel.writeInt(0);
        int iDataPosition2 = parcel.dataPosition();
        parcel.writeInt(i2);
        k(parcel, iDataPosition, iDataPosition2);
    }

    public static void p(Parcel parcel, int i, Object obj, efmj efmjVar, int i2) {
        parcel.writeInt(i);
        int iDataPosition = parcel.dataPosition();
        parcel.writeInt(0);
        int iDataPosition2 = parcel.dataPosition();
        efmjVar.a(parcel, obj, i2);
        k(parcel, iDataPosition, iDataPosition2);
    }

    public static void q(Parcel parcel, int i, Parcelable parcelable, int i2) {
        parcel.writeInt(i);
        int iDataPosition = parcel.dataPosition();
        parcel.writeInt(0);
        int iDataPosition2 = parcel.dataPosition();
        if (parcelable instanceof PendingIntent) {
            PendingIntent.writePendingIntentOrNullToParcel((PendingIntent) parcelable, parcel);
        } else {
            parcelable.writeToParcel(parcel, i2);
        }
        k(parcel, iDataPosition, iDataPosition2);
    }

    public static void r(Parcel parcel, int i, String str) {
        parcel.writeInt(i);
        int iDataPosition = parcel.dataPosition();
        parcel.writeInt(0);
        int iDataPosition2 = parcel.dataPosition();
        parcel.writeString(str);
        k(parcel, iDataPosition, iDataPosition2);
    }

    public static boolean s(Parcel parcel, int i) {
        if (parcel.dataAvail() <= 0) {
            return false;
        }
        int iDataPosition = parcel.dataPosition();
        if (parcel.readInt() == i) {
            return true;
        }
        parcel.setDataPosition(iDataPosition);
        return false;
    }
}
