package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lit {
    public final int a;

    static {
        fcwa.f(new fcti(2, 2), new fcti(1, 1));
    }

    public lit(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lit) && this.a == ((lit) obj).a;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.a));
    }
}
