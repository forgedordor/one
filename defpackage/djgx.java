package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djgx {
    public final String a;
    public final boolean b;
    private final String c = null;

    public /* synthetic */ djgx(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof djgx)) {
            return false;
        }
        djgx djgxVar = (djgx) obj;
        if (!fdbq.f(this.a, djgxVar.a) || this.b != djgxVar.b) {
            return false;
        }
        String str = djgxVar.c;
        return fdbq.f(null, null);
    }

    public final int hashCode() {
        return ((this.a.hashCode() * 31) + (true != this.b ? 1237 : 1231)) * 31;
    }

    public final String toString() {
        return "CounterUiData(text=" + this.a + ", isError=" + this.b + ", contentDescription=null)";
    }
}
