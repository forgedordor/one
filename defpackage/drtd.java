package defpackage;

import android.graphics.Bitmap;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class drtd extends qya {
    public final drta a;
    public final Bitmap b;

    public drtd(drta drtaVar, Bitmap bitmap) {
        this.a = drtaVar;
        this.b = bitmap;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof drtd)) {
            return false;
        }
        drtd drtdVar = (drtd) obj;
        return Objects.equals(this.a, drtdVar.a) && Objects.equals(this.b, drtdVar.b);
    }

    public final int hashCode() {
        return (Objects.hashCode(this.a) * 31) + Objects.hashCode(this.b);
    }

    public final String toString() {
        int i = 0;
        Object[] objArr = {this.a, this.b};
        String[] strArrSplit = "drawParams;bitmap".split(";");
        StringBuilder sb = new StringBuilder("drtd[");
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
