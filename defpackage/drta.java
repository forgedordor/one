package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class drta extends qya {
    public static final drta a = new drta("", 0, 0);
    public final String b;
    public final int c;
    public final int d;

    public drta(String str, int i, int i2) {
        this.b = str;
        this.c = i;
        this.d = i2;
    }

    public final drta a(String str) {
        return this.b.equals(str) ? this : new drta(str, this.c, this.d);
    }

    public final /* synthetic */ boolean b(Object obj) {
        if (!(obj instanceof drta)) {
            return false;
        }
        drta drtaVar = (drta) obj;
        return this.c == drtaVar.c && this.d == drtaVar.d && Objects.equals(this.b, drtaVar.b);
    }

    public final boolean equals(Object obj) {
        return b(obj);
    }

    public final int hashCode() {
        return (((this.c * 31) + this.d) * 31) + Objects.hashCode(this.b);
    }

    public final String toString() {
        int i = 0;
        Object[] objArr = {this.b, Integer.valueOf(this.c), Integer.valueOf(this.d)};
        String[] strArrSplit = "text;width;height".split(";");
        StringBuilder sb = new StringBuilder("drta[");
        while (true) {
            int length = strArrSplit.length;
            if (i >= length) {
                sb.append("]");
                return sb.toString();
            }
            sb.append(strArrSplit[i]);
            sb.append("=");
            sb.append(objArr[i]);
            if (i != length - 1) {
                sb.append(", ");
            }
            i++;
        }
    }
}
