package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fad {
    public static final fad a = new fad(null, null, null, null, 63);
    public final fdap b;
    public final fdap c;
    public final fdap d;
    public final fdap e;
    private final fdap f;
    private final fdap g;

    public fad() {
        this(null, null, null, null, 63);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fad)) {
            return false;
        }
        fad fadVar = (fad) obj;
        if (this.b == fadVar.b) {
            fdap fdapVar = fadVar.f;
            if (this.c == fadVar.c) {
                fdap fdapVar2 = fadVar.g;
                if (this.d == fadVar.d && this.e == fadVar.e) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        fdap fdapVar = this.b;
        int iHashCode = fdapVar != null ? fdapVar.hashCode() : 0;
        fdap fdapVar2 = this.c;
        int iHashCode2 = fdapVar2 != null ? fdapVar2.hashCode() : 0;
        int i = iHashCode * 961;
        fdap fdapVar3 = this.d;
        int iHashCode3 = fdapVar3 != null ? fdapVar3.hashCode() : 0;
        int i2 = (i + iHashCode2) * 961;
        fdap fdapVar4 = this.e;
        return ((i2 + iHashCode3) * 31) + (fdapVar4 != null ? fdapVar4.hashCode() : 0);
    }

    public /* synthetic */ fad(fdap fdapVar, fdap fdapVar2, fdap fdapVar3, fdap fdapVar4, int i) {
        this.b = 1 == (i & 1) ? null : fdapVar;
        this.f = null;
        this.c = (i & 4) != 0 ? null : fdapVar2;
        this.g = null;
        this.d = (i & 16) != 0 ? null : fdapVar3;
        this.e = (i & 32) != 0 ? null : fdapVar4;
    }
}
