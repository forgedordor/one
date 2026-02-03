package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fkc {
    public static final int a(int i, int i2) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            if (i3 != 1) {
                return 3;
            }
            int i4 = i - 1;
            if (i4 != 0) {
                return i4 != 1 ? 3 : 2;
            }
        }
        return 1;
    }

    public static final int b(jyi jyiVar, int i) {
        juo juoVar = jyiVar.a.a;
        if (juoVar.a() != 0) {
            int iH = jyiVar.h(i);
            if ((i != 0 && iH == jyiVar.h(i - 1)) || (i != juoVar.a() && iH == jyiVar.h(i + 1))) {
                return jyiVar.t(i);
            }
        }
        return jyiVar.u(i);
    }
}
