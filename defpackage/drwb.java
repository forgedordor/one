package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class drwb extends qya {
    public final String a;
    public final Class b;
    public final drvq c;
    public final drvw d;

    public drwb(String str, Class cls, drvq drvqVar, drvw drvwVar) {
        this.a = str;
        this.b = cls;
        this.c = drvqVar;
        this.d = drvwVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof drwb)) {
            return false;
        }
        drwb drwbVar = (drwb) obj;
        return Objects.equals(this.a, drwbVar.a) && Objects.equals(this.b, drwbVar.b) && Objects.equals(this.c, drwbVar.c) && Objects.equals(this.d, drwbVar.d);
    }

    public final int hashCode() {
        return (((((Objects.hashCode(this.a) * 31) + Objects.hashCode(this.b)) * 31) + Objects.hashCode(this.c)) * 31) + Objects.hashCode(this.d);
    }

    public final String toString() {
        int i = 0;
        Object[] objArr = {this.a, this.b, this.c, this.d};
        String[] strArrSplit = "sectionName;notificationClass;notification;listener".split(";");
        StringBuilder sb = new StringBuilder("drwb[");
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
