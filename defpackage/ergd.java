package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ergd {
    private final Class a;
    private final Class b;

    public ergd(Class cls, Class cls2) {
        this.a = cls;
        this.b = cls2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ergd)) {
            return false;
        }
        ergd ergdVar = (ergd) obj;
        return ergdVar.a.equals(this.a) && ergdVar.b.equals(this.b);
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b);
    }

    public final String toString() {
        Class cls = this.b;
        return this.a.getSimpleName() + " with serialization type: " + cls.getSimpleName();
    }
}
