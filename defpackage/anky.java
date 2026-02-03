package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class anky implements anlb {
    private final String a;
    private final int c = 2;
    private final boolean b = false;

    public anky(String str) {
        this.a = str;
    }

    @Override // defpackage.anlb
    public final String a() {
        return this.a;
    }

    @Override // defpackage.anlb
    public final int b() {
        return 2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof anky)) {
            return false;
        }
        anky ankyVar = (anky) obj;
        if (!fdbq.f(this.a, ankyVar.a)) {
            return false;
        }
        int i = ankyVar.c;
        boolean z = ankyVar.b;
        return true;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + 2) * 31) + 1237;
    }

    public final String toString() {
        return "BugleIncomingDisplayableStatus(text=" + this.a + ", type=" + ((Object) anlc.a(2)) + ", canDownload=false)";
    }
}
