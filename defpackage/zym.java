package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zym implements divg {
    public final List a;
    private final boolean b = true;
    private final fdae c;

    public zym(List list, fdae fdaeVar) {
        this.a = list;
        this.c = fdaeVar;
    }

    @Override // defpackage.divg
    public final divg a(fdae fdaeVar) {
        return new zym(this.a, fdaeVar);
    }

    @Override // defpackage.divg
    public final fdae b() {
        return this.c;
    }

    @Override // defpackage.divg
    public final boolean c() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zym)) {
            return false;
        }
        zym zymVar = (zym) obj;
        if (!fdbq.f(this.a, zymVar.a)) {
            return false;
        }
        boolean z = zymVar.b;
        return fdbq.f(this.c, zymVar.c);
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + 1231) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "ActiveComposersUiData(composers=" + this.a + ", includeScrim=true, onDismiss=" + this.c + ")";
    }
}
