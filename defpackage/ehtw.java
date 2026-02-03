package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ehtw extends ehtz {
    public final String a;
    public final Integer b;
    private final esob c;

    public ehtw(String str, Integer num, esob esobVar) {
        this.a = str;
        this.b = num;
        this.c = esobVar;
    }

    @Override // defpackage.ehtz
    public final esob a() {
        return this.c;
    }

    @Override // defpackage.ehtz
    public final Integer b() {
        return this.b;
    }

    @Override // defpackage.ehtz
    public final String c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ehtz) {
            ehtz ehtzVar = (ehtz) obj;
            String str = this.a;
            if (str != null ? str.equals(ehtzVar.c()) : ehtzVar.c() == null) {
                Integer num = this.b;
                if (num != null ? num.equals(ehtzVar.b()) : ehtzVar.b() == null) {
                    if (this.c.equals(ehtzVar.a())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = str == null ? 0 : str.hashCode();
        Integer num = this.b;
        return ((((iHashCode ^ 1000003) * 1000003) ^ (num != null ? num.hashCode() : 0)) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        return "GrpcClientConfig{host=" + this.a + ", port=" + this.b + ", rpcServiceConfig=" + this.c.toString() + "}";
    }
}
