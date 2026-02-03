package defpackage;

import android.os.Parcel;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ebq {
    public static final long a(Parcel parcel) {
        byte b = parcel.readByte();
        long j = b == 1 ? 4294967296L : b == 2 ? 8589934592L : 0L;
        return kjn.b(j, 0L) ? kjl.a : kjm.d(j, parcel.readFloat());
    }
}
