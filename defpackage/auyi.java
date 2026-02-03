package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class auyi extends auyj implements fdvc {
    private final String b;
    private final fdvc c;

    public auyi(String str, fdvc fdvcVar) {
        super(str);
        this.b = str;
        this.c = fdvcVar;
    }

    @Override // defpackage.fduj, defpackage.fdpl
    public final Object a(fdpm fdpmVar, fcxy fcxyVar) {
        return this.c.a(fdpmVar, fcxyVar);
    }

    @Override // defpackage.fdvc
    public final Object c() {
        return this.c.c();
    }

    @Override // defpackage.fduj
    public final List d() {
        return this.c.d();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof auyi)) {
            return false;
        }
        auyi auyiVar = (auyi) obj;
        return fdbq.f(this.b, auyiVar.b) && fdbq.f(this.c, auyiVar.c);
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.c.hashCode();
    }

    @Override // defpackage.auyj
    public final String toString() {
        return "NamedStateFlow(name=" + this.b + ", flow=" + this.c + ")";
    }
}
