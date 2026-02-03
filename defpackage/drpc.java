package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class drpc extends qya {
    public final int a;
    public final wi b;
    public final drqr c;

    public drpc(int i, wi wiVar, drqr drqrVar) {
        this.a = i;
        this.b = wiVar;
        this.c = drqrVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof drpc)) {
            return false;
        }
        drpc drpcVar = (drpc) obj;
        return this.a == drpcVar.a && Objects.equals(this.b, drpcVar.b) && Objects.equals(this.c, drpcVar.c);
    }

    public final int hashCode() {
        return (((this.a * 31) + Objects.hashCode(this.b)) * 31) + Objects.hashCode(this.c);
    }

    public final String toString() {
        int i = 0;
        Object[] objArr = {Integer.valueOf(this.a), this.b, this.c};
        String[] strArrSplit = "spanCount;recycledViewPool;delegate".split(";");
        StringBuilder sb = new StringBuilder("drpc[");
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
