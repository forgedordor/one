package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kdr {
    public static final long a(long j, long j2) {
        int iB;
        int iD = jyo.d(j);
        int iC = jyo.c(j);
        if ((jyo.d(j2) < jyo.c(j)) && (jyo.d(j) < jyo.c(j2))) {
            if (jyo.g(j2, j)) {
                iD = jyo.d(j2);
                iC = iD;
            } else {
                if (jyo.g(j, j2)) {
                    iB = jyo.b(j2);
                } else {
                    int iD2 = jyo.d(j2);
                    if (iD >= jyo.c(j2) || iD2 > iD) {
                        iC = jyo.d(j2);
                    } else {
                        iD = jyo.d(j2);
                        iB = jyo.b(j2);
                    }
                }
                iC -= iB;
            }
        } else if (iC > jyo.d(j2)) {
            iD -= jyo.b(j2);
            iB = jyo.b(j2);
            iC -= iB;
        }
        return jyp.a(iD, iC);
    }
}
