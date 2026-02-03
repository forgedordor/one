package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class elem {
    public final long a;
    public final elen b;
    private final int c = 0;
    private final int d;

    public elem(long j, elen elenVar) {
        this.a = j;
        elenVar.getClass();
        this.b = elenVar;
        this.d = 2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof elem) {
            elem elemVar = (elem) obj;
            if (this.a == elemVar.a) {
                int i = elemVar.d;
                int i2 = elemVar.c;
                if (ejwh.a(null, null) && ejwh.a(this.b, elemVar.b)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.a), 2, null, this.b});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        long j = this.a;
        sb.append(j);
        sb.append(' ');
        elen elenVar = this.b;
        if (elenVar != elen.UNIT) {
            sb.append(elenVar.name().toLowerCase());
        }
        sb.append("BYTE".toLowerCase());
        if (j != -1) {
            sb.append('s');
        }
        return sb.toString();
    }
}
