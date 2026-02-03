package defpackage;

import j$.util.Objects;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class ebnj {
    private final InetAddress f() {
        String strD = d();
        if (strD == null) {
            return null;
        }
        return eomh.a(strD);
    }

    public abstract int a();

    public abstract ebmr b();

    public abstract String c();

    public abstract String d();

    final boolean e() {
        return f() instanceof Inet6Address;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ebnj)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        ebnj ebnjVar = (ebnj) obj;
        return Objects.equals(f(), ebnjVar.f()) && Objects.equals(c(), ebnjVar.c()) && a() == ebnjVar.a() && Objects.equals(b(), ebnjVar.b());
    }

    public final int hashCode() {
        return Objects.hash(f(), c(), Integer.valueOf(a()), b());
    }

    public final String toString() {
        String strD = d();
        if (strD == null) {
            strD = "";
        }
        return String.format(Locale.US, "%s %s/%s", c(), eomf.a(strD, a()), b());
    }
}
