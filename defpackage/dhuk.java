package defpackage;

import java.nio.ByteBuffer;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dhuk extends dhph {
    public final ByteBuffer a;
    public final String b;
    public final String c;
    public final fdgl d;
    public final String e;
    public final int f;
    private final Map g = null;
    private final String h = null;

    public dhuk(ByteBuffer byteBuffer, String str, String str2, int i, fdgl fdglVar, String str3) {
        this.a = byteBuffer;
        this.b = str;
        this.c = str2;
        this.f = i;
        this.d = fdglVar;
        this.e = str3;
        if (!byteBuffer.isDirect()) {
            throw new IllegalArgumentException("byteBuffer must be direct");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dhuk)) {
            return false;
        }
        dhuk dhukVar = (dhuk) obj;
        if (!fdbq.f(this.a, dhukVar.a) || !fdbq.f(this.b, dhukVar.b) || !fdbq.f(this.c, dhukVar.c) || this.f != dhukVar.f) {
            return false;
        }
        Map map = dhukVar.g;
        if (!fdbq.f(null, null) || !fdbq.f(this.d, dhukVar.d) || !fdbq.f(this.e, dhukVar.e)) {
            return false;
        }
        String str = dhukVar.h;
        return fdbq.f(null, null);
    }

    public final int hashCode() {
        int iHashCode = (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
        fdgl fdglVar = this.d;
        int iHashCode2 = ((((iHashCode * 31) + this.f) * 961) + (fdglVar == null ? 0 : fdglVar.hashCode())) * 31;
        String str = this.e;
        return (iHashCode2 + (str != null ? str.hashCode() : 0)) * 31;
    }
}
