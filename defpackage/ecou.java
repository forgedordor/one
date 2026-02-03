package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ecou extends ecpe {
    public final String a;
    public final int b;

    public ecou(String str, int i) {
        this.a = str;
        this.b = i;
    }

    @Override // defpackage.ecpe
    public final int a() {
        return this.b;
    }

    @Override // defpackage.ecpe
    public final String b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ecpe) {
            ecpe ecpeVar = (ecpe) obj;
            if (this.a.equals(ecpeVar.b()) && this.b == ecpeVar.a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b;
    }

    public final String toString() {
        return "Body{text=" + this.a + ", charSet=" + this.b + "}";
    }
}
