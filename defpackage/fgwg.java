package defpackage;

import java.net.InetAddress;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fgwg {
    public final int a;
    public final boolean b;
    public final int c;
    public final Object d;

    public fgwg(int i, boolean z, Object obj, int i2) {
        this.a = i;
        this.b = z;
        this.d = obj;
        this.c = i2;
        if (!fgwh.e(i, i2)) {
            throw new IllegalArgumentException("invalid prefix length");
        }
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof fgwg)) {
            fgwg fgwgVar = (fgwg) obj;
            if (this.a == fgwgVar.a && this.b == fgwgVar.b && this.c == fgwgVar.c && this.d.equals(fgwgVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.d.hashCode() + this.c + (this.b ? 1 : 0);
    }

    public final String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        if (this.b) {
            stringBuffer.append("!");
        }
        int i = this.a;
        stringBuffer.append(i);
        stringBuffer.append(":");
        if (i == 1 || i == 2) {
            stringBuffer.append(((InetAddress) this.d).getHostAddress());
        } else {
            stringBuffer.append(fhau.a((byte[]) this.d));
        }
        stringBuffer.append("/");
        stringBuffer.append(this.c);
        return stringBuffer.toString();
    }
}
