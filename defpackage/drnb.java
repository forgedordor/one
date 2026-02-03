package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class drnb extends qya {
    public final ekgp a;
    private final String b;

    public drnb(String str, ekgp ekgpVar) {
        this.b = str;
        this.a = ekgpVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof drnb)) {
            return false;
        }
        drnb drnbVar = (drnb) obj;
        return Objects.equals(this.b, drnbVar.b) && Objects.equals(this.a, drnbVar.a);
    }

    public final int hashCode() {
        return (Objects.hashCode(this.b) * 31) + Objects.hashCode(this.a);
    }

    public final String toString() {
        int i = 0;
        Object[] objArr = {this.b, this.a};
        String[] strArrSplit = "base;variantModifierSetsToVariants".split(";");
        StringBuilder sb = new StringBuilder("drnb[");
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
