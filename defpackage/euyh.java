package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class euyh {
    public abstract float a();

    public abstract int b();

    public abstract String c();

    public abstract String d();

    public final boolean equals(Object obj) {
        if (!(obj instanceof euyh)) {
            return false;
        }
        euyh euyhVar = (euyh) obj;
        return Math.abs(euyhVar.a() - a()) < 1.0E-6f && euyhVar.b() == b() && euyhVar.c().equals(c()) && euyhVar.d().equals(d());
    }

    public final int hashCode() {
        return Objects.hash(c(), d(), Float.valueOf(a()), Integer.valueOf(b()));
    }

    public final String toString() {
        return "<Category \"" + c() + "\" (displayName=" + d() + " score=" + a() + " index=" + b() + ")>";
    }
}
