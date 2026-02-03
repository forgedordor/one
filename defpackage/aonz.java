package defpackage;

import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aonz implements aooa {
    public final Locale a;
    public final int b;

    public aonz(Locale locale, int i) {
        this.a = locale;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aonz)) {
            return false;
        }
        aonz aonzVar = (aonz) obj;
        return fdbq.f(this.a, aonzVar.a) && this.b == aonzVar.b;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b;
    }

    public final String toString() {
        return "LanguagePackUnavailable(locale=" + this.a + ", availability=" + ((Object) aonw.a(this.b)) + ")";
    }
}
