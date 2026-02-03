package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ejgx extends ejhe {
    private final String a;
    private final int b;

    public ejgx(String str, int i) {
        if (str == null) {
            throw new NullPointerException("Null matchedSubstring");
        }
        this.a = str;
        this.b = i;
    }

    @Override // defpackage.ejhe
    public final int a() {
        return this.b;
    }

    @Override // defpackage.ejhe
    public final String b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ejhe) {
            ejhe ejheVar = (ejhe) obj;
            if (this.a.equals(ejheVar.b()) && this.b == ejheVar.a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b;
    }

    public final String toString() {
        return "Match{matchedSubstring=" + this.a + ", startIndex=" + this.b + "}";
    }
}
