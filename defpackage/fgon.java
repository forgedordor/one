package defpackage;

import java.io.Serializable;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes6.dex */
public abstract class fgon implements Serializable {
    private static final long serialVersionUID = 1971226328211649661L;

    protected abstract long a();

    protected fgmq b() {
        throw null;
    }

    public abstract fgms c();

    public final int d() {
        return c().a(a());
    }

    public final String e(Locale locale) {
        return c().l(a(), locale);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fgon)) {
            return false;
        }
        fgon fgonVar = (fgon) obj;
        return d() == fgonVar.d() && g().equals(fgonVar.g()) && fgot.d(b(), fgonVar.b());
    }

    public final String f(Locale locale) {
        return c().n(a(), locale);
    }

    public final fgmu g() {
        return c().p();
    }

    public final int hashCode() {
        return (d() * 17) + g().hashCode() + b().hashCode();
    }

    public final String toString() {
        return "Property[" + c().o() + "]";
    }
}
