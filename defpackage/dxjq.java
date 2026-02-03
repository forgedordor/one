package defpackage;

import java.net.URL;
import java.util.Arrays;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dxjq extends dxjx {
    public final URL a;
    public final String b;
    public final Map c;
    public final byte[] d;
    public final int e;

    public dxjq(URL url, String str, Map map, byte[] bArr, int i) {
        this.a = url;
        this.b = str;
        this.c = map;
        this.d = bArr;
        this.e = i;
    }

    @Override // defpackage.dxjx
    public final dxjv a() {
        return new dxjp(this);
    }

    @Override // defpackage.dxjx
    public final String b() {
        return this.b;
    }

    @Override // defpackage.dxjx
    public final URL c() {
        return this.a;
    }

    @Override // defpackage.dxjx
    public final Map d() {
        return this.c;
    }

    @Override // defpackage.dxjx
    public final byte[] e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof dxjx) {
            dxjx dxjxVar = (dxjx) obj;
            if (this.a.equals(dxjxVar.c()) && ((str = this.b) != null ? str.equals(dxjxVar.b()) : dxjxVar.b() == null) && this.c.equals(dxjxVar.d())) {
                if (Arrays.equals(this.d, dxjxVar instanceof dxjq ? ((dxjq) dxjxVar).d : dxjxVar.e()) && this.e == dxjxVar.f()) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.dxjx
    public final int f() {
        return this.e;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        String str = this.b;
        return (((((((iHashCode * 1000003) ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.c.hashCode()) * 1000003) ^ Arrays.hashCode(this.d)) * 1000003) ^ this.e;
    }

    public final String toString() {
        byte[] bArr = this.d;
        Map map = this.c;
        return "GnpHttpRequest{url=" + this.a.toString() + ", contentType=" + this.b + ", headers=" + map.toString() + ", body=" + Arrays.toString(bArr) + ", purpose=" + dxjw.a(this.e) + "}";
    }
}
