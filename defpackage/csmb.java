package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class csmb {
    public final boolean a;
    public final boolean b;
    private final boolean c;

    /* JADX WARN: Illegal instructions before constructor call */
    public csmb() {
        boolean z = false;
        this(z, z, 7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof csmb)) {
            return false;
        }
        csmb csmbVar = (csmb) obj;
        if (this.a != csmbVar.a) {
            return false;
        }
        boolean z = csmbVar.c;
        return this.b == csmbVar.b;
    }

    public final int hashCode() {
        return (((csma.a(this.a) * 31) + csma.a(false)) * 31) + csma.a(this.b);
    }

    public final String toString() {
        return "SpatulaSettings(isEnabled=" + this.a + ", canEdit=false, isEnabledByDefault=" + this.b + ")";
    }

    public /* synthetic */ csmb(boolean z, boolean z2, int i) {
        this.a = 1 == ((z ? 1 : 0) & ((i & 1) ^ 1));
        this.c = false;
        this.b = ((i & 4) == 0) & z2;
    }
}
