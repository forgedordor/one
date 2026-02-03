package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class yem {
    public final boolean a;
    private final boolean b;
    private final boolean c;

    /* JADX WARN: Illegal instructions before constructor call */
    public yem() {
        boolean z = false;
        this(z, z, 7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yem)) {
            return false;
        }
        yem yemVar = (yem) obj;
        if (this.a != yemVar.a) {
            return false;
        }
        boolean z = yemVar.b;
        return this.c == yemVar.c;
    }

    public final int hashCode() {
        return (((yel.a(this.a) * 31) + yel.a(false)) * 31) + yel.a(this.c);
    }

    public final String toString() {
        return "Flags(includeRbmHeaderIfAvailable=" + this.a + ", enableSwipeToShowTimestamps=false, disableNewTimestampsForTalkback=" + this.c + ")";
    }

    public /* synthetic */ yem(boolean z, boolean z2, int i) {
        this.a = 1 == ((z ? 1 : 0) & ((i & 1) ^ 1));
        this.b = false;
        this.c = ((i & 4) == 0) & z2;
    }
}
