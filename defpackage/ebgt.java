package defpackage;

import java.net.InetAddress;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ebgt extends ebhx {
    private final InetAddress a;
    private final int b;
    private final ebic c;

    public ebgt(InetAddress inetAddress, int i, ebic ebicVar) {
        if (inetAddress == null) {
            throw new NullPointerException("Null inetAddress");
        }
        this.a = inetAddress;
        this.b = i;
        if (ebicVar == null) {
            throw new NullPointerException("Null transport");
        }
        this.c = ebicVar;
    }

    @Override // defpackage.ebhx
    public final int a() {
        return this.b;
    }

    @Override // defpackage.ebhx
    public final ebic b() {
        return this.c;
    }

    @Override // defpackage.ebhx
    public final InetAddress c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ebhx) {
            ebhx ebhxVar = (ebhx) obj;
            if (this.a.equals(ebhxVar.c()) && this.b == ebhxVar.a() && this.c.equals(ebhxVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        ebic ebicVar = this.c;
        return "DnsTransportAddress{inetAddress=" + this.a.toString() + ", port=" + this.b + ", transport=" + ebicVar.toString() + "}";
    }
}
