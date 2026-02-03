package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class etib implements Serializable, evst, ethy, etia {
    public static final etib sm = new etib(-1);
    private final int sn;

    public etib(int i) {
        this.sn = i;
    }

    @Override // defpackage.evst
    public final int a() {
        if (this != sm) {
            return this.sn;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public final String toString() {
        return Integer.toString(this.sn);
    }
}
