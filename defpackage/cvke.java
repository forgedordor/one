package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cvke {
    final int a;
    final int b;
    public final int c;
    Integer d;
    public String e;

    public cvke(int i, int i2, int i3, Integer num) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cvke)) {
            return false;
        }
        cvke cvkeVar = (cvke) obj;
        return this.a == cvkeVar.a && this.b == cvkeVar.b && this.c == cvkeVar.c && Objects.equals(this.d, cvkeVar.d);
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.a), Integer.valueOf(this.b), Integer.valueOf(this.c), this.d);
    }

    public cvke(int i, int i2, int i3) {
        this(i, i2, i3, null);
    }
}
