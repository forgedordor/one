package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes6.dex */
public abstract class fgxh {
    public final int e;

    public fgxh(int i) {
        int i2 = fgzh.j;
        this.e = i;
    }

    public abstract String a();

    public abstract void b(fgxc fgxcVar);

    public abstract void c(fgxe fgxeVar);

    final byte[] d() {
        fgxe fgxeVar = new fgxe();
        c(fgxeVar);
        return fgxeVar.h();
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof fgxh)) {
            return false;
        }
        fgxh fgxhVar = (fgxh) obj;
        if (this.e == fgxhVar.e) {
            return Arrays.equals(d(), fgxhVar.d());
        }
        return false;
    }

    public final int hashCode() {
        int i = 0;
        for (byte b : d()) {
            i += (i << 3) + (b & 255);
        }
        return i;
    }

    public final String toString() {
        StringBuffer stringBuffer = new StringBuffer("{");
        stringBuffer.append(fgxg.a.c(this.e));
        stringBuffer.append(": ");
        stringBuffer.append(a());
        stringBuffer.append("}");
        return stringBuffer.toString();
    }
}
