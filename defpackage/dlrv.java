package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dlrv extends dlrx {
    public final String a;
    private final String b = null;

    public dlrv(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dlrv)) {
            return false;
        }
        dlrv dlrvVar = (dlrv) obj;
        if (!fdbq.f(this.a, dlrvVar.a)) {
            return false;
        }
        String str = dlrvVar.b;
        return fdbq.f(null, null);
    }

    public final int hashCode() {
        return this.a.hashCode() * 31;
    }

    public final String toString() {
        return "Data(data=" + this.a + ", baseUrl=null)";
    }
}
