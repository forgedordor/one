package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class drna extends qya {
    public final String a;
    public final ekgb b;

    public drna(String str, ekgb ekgbVar) {
        this.a = str;
        this.b = ekgbVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof drna)) {
            return false;
        }
        drna drnaVar = (drna) obj;
        return Objects.equals(this.a, drnaVar.a) && Objects.equals(this.b, drnaVar.b);
    }

    public final int hashCode() {
        return (Objects.hashCode(this.a) * 31) + Objects.hashCode(this.b);
    }

    public final String toString() {
        int i = 0;
        Object[] objArr = {this.a, this.b};
        String[] strArrSplit = "primary;secondaries".split(";");
        StringBuilder sb = new StringBuilder("drna[");
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
