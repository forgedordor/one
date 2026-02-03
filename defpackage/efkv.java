package defpackage;

import android.os.Parcel;
import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efkv {
    public static Instant a(Parcel parcel, int i) {
        char c = (char) (i >> 16);
        if (c == '\f') {
            return Instant.ofEpochSecond(parcel.readLong(), parcel.readInt());
        }
        throw new dclu("Expected size 12 got " + ((int) c) + " (0x" + Integer.toHexString(c) + ")", parcel);
    }

    public static Enum b(Parcel parcel, int i, Class cls) {
        int length;
        Enum[] enumArr = (Enum[]) cls.getEnumConstants();
        if (enumArr == null || (length = enumArr.length) == 0) {
            throw new dclu("Unexpected enum without labels ".concat(String.valueOf(cls.getName())), parcel);
        }
        int iF = dclv.f(parcel, i);
        return (iF < 0 || iF >= length) ? enumArr[0] : enumArr[iF];
    }

    public static void c(Parcel parcel, int i, Enum r2) {
        dclw.i(parcel, i, r2.ordinal());
    }

    public static void d(Parcel parcel, int i, Instant instant) {
        parcel.writeInt(i | 786432);
        parcel.writeLong(instant.getEpochSecond());
        parcel.writeInt(instant.getNano());
    }
}
