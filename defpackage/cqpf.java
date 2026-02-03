package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class cqpf extends cqpu {
    public final String a;
    public final String b;

    public cqpf(String str, String str2) {
        if (str == null) {
            throw new NullPointerException("Null gifObjectId");
        }
        this.a = str;
        if (str2 == null) {
            throw new NullPointerException("Null query");
        }
        this.b = str2;
    }

    @Override // defpackage.cqpu
    public final String a() {
        return this.a;
    }

    @Override // defpackage.cqpu
    public final String b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cqpu) {
            cqpu cqpuVar = (cqpu) obj;
            if (this.a.equals(cqpuVar.a()) && this.b.equals(cqpuVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "TenorRegisterShareRequest{gifObjectId=" + this.a + ", query=" + this.b + "}";
    }
}
