package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dkpe implements dkpi {
    public final fdat a;
    public final char b;
    private final Boolean c = null;
    private final int d = 1;

    public /* synthetic */ dkpe(fdat fdatVar, char c) {
        this.a = fdatVar;
        this.b = c;
    }

    @Override // defpackage.dkpi
    public final Boolean a() {
        return null;
    }

    @Override // defpackage.dkpi
    public final int b() {
        return 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dkpe)) {
            return false;
        }
        dkpe dkpeVar = (dkpe) obj;
        if (!fdbq.f(this.a, dkpeVar.a) || this.b != dkpeVar.b) {
            return false;
        }
        Boolean bool = dkpeVar.c;
        if (!fdbq.f(null, null)) {
            return false;
        }
        int i = dkpeVar.d;
        return true;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b) * 961) + 1;
    }

    public final String toString() {
        return "Character(backgroundColor=" + this.a + ", character=" + this.b + ", forceClipToCircle=null, monogramBadge=NONE)";
    }
}
