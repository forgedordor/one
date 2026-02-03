package defpackage;

import android.util.SparseBooleanArray;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mar {
    private final SparseBooleanArray a;

    public mar(SparseBooleanArray sparseBooleanArray) {
        this.a = sparseBooleanArray;
    }

    public final int a(int i) {
        mee.e(i, b());
        return this.a.keyAt(i);
    }

    public final int b() {
        return this.a.size();
    }

    public final boolean c(int i) {
        return this.a.get(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof mar) {
            return this.a.equals(((mar) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
