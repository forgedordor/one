package defpackage;

import android.os.Parcel;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ebr {
    public static final void a(long j, Parcel parcel) {
        long jC = kjl.c(j);
        byte b = 0;
        if (!kjn.b(jC, 0L)) {
            if (kjn.b(jC, 4294967296L)) {
                b = 1;
            } else if (kjn.b(jC, 8589934592L)) {
                b = 2;
            }
        }
        parcel.writeByte(b);
        if (kjn.b(kjl.c(j), 0L)) {
            return;
        }
        parcel.writeFloat(kjl.a(j));
    }
}
