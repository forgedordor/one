package defpackage;

import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fdbx implements fdbh {
    private final Class a;

    public fdbx(Class cls) {
        this.a = cls;
    }

    @Override // defpackage.fdbh
    public final Class a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof fdbx) && fdbq.f(this.a, ((fdbx) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        Class cls = this.a;
        Objects.toString(cls);
        return cls.toString().concat(" (Kotlin reflection is not available)");
    }
}
