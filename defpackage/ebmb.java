package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ebmb {
    public String a;
    public String b;
    private int c;

    public final void a(String str) {
        this.a = str;
        if (str == null || (str.indexOf("#") < 0 && str.indexOf(";") < 0)) {
            b(2);
        } else {
            b(1);
        }
    }

    public final void b(int i) {
        if (i != 1) {
            i = 2;
        }
        this.c = i;
    }

    public final Object clone() {
        ebmb ebmbVar = new ebmb();
        ebmbVar.a(this.a);
        String str = this.b;
        if (str != null) {
            ebmbVar.b = str;
        }
        return ebmbVar;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof ebmb)) {
            return false;
        }
        ebmb ebmbVar = (ebmb) obj;
        if (this.c != ebmbVar.c || !ejwh.a(this.b, ebmbVar.b)) {
            return false;
        }
        String str = this.a;
        if (str != null || ebmbVar.a == null) {
            return str == null || str.equalsIgnoreCase(ebmbVar.a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.c), this.b, this.a});
    }
}
