package defpackage;

import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aonx {
    public final Locale a;
    public final int b;
    private final int c;

    public aonx(Locale locale, int i, int i2) {
        locale.getClass();
        this.a = locale;
        this.c = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aonx)) {
            return false;
        }
        aonx aonxVar = (aonx) obj;
        return fdbq.f(this.a, aonxVar.a) && this.c == aonxVar.c && this.b == aonxVar.b;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.c) * 31) + this.b;
    }

    public final String toString() {
        return "LanguagePackInfo(locale=" + this.a + ", version=" + this.c + ", availability=" + ((Object) aonw.a(this.b)) + ")";
    }
}
