package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fflx {
    protected final int[] a;

    public fflx(int[] iArr) {
        this.a = (int[]) iArr.clone();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof fflx) {
            return Arrays.equals(this.a, ((fflx) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return ffwk.b(this.a);
    }
}
