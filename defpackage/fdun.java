package defpackage;

import androidx.car.app.model.Alert;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fdun {
    public static final fdzi a = new fdzi("NO_VALUE");

    public static final Object a(Object[] objArr, long j) {
        return objArr[((int) j) & (objArr.length - 1)];
    }

    public static final void b(Object[] objArr, long j, Object obj) {
        objArr[((int) j) & (objArr.length - 1)] = obj;
    }

    public static final fdpl c(fduj fdujVar, fcyh fcyhVar, int i, int i2) {
        return ((i == 0 || i == -3) && i2 == 1) ? fdujVar : new fdwb(fdujVar, fcyhVar, i, i2);
    }

    public static final fdue d(int i, int i2, int i3) {
        if (i < 0) {
            throw new IllegalArgumentException(a.g(i, "replay cannot be negative, but was "));
        }
        if (i2 < 0) {
            throw new IllegalArgumentException(a.g(i2, "extraBufferCapacity cannot be negative, but was "));
        }
        if (i <= 0 && i2 <= 0 && i3 != 1) {
            Objects.toString(fdnp.a(i3));
            throw new IllegalArgumentException("replay or extraBufferCapacity must be positive with non-default onBufferOverflow strategy ".concat(fdnp.a(i3)));
        }
        int i4 = i2 + i;
        if (i4 < 0) {
            i4 = Alert.DURATION_SHOW_INDEFINITELY;
        }
        return new fdum(i, i4, i3);
    }

    public static /* synthetic */ fdue e(int i, int i2, int i3, int i4) {
        if ((i4 & 2) != 0) {
            i2 = 0;
        }
        if ((i4 & 4) != 0) {
            i3 = 1;
        }
        return d(i & ((i4 & 1) ^ 1), i2, i3);
    }
}
