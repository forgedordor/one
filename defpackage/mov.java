package defpackage;

import android.util.Pair;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class mov extends mcl {
    private final int b;
    private final ngf c;

    public mov(ngf ngfVar) {
        this.c = ngfVar;
        this.b = ngfVar.a();
    }

    private final int A(int i, boolean z) {
        if (!z) {
            if (i >= this.b - 1) {
                return -1;
            }
            return i + 1;
        }
        ngf ngfVar = this.c;
        int i2 = ngfVar.c[i] + 1;
        int[] iArr = ngfVar.b;
        if (i2 < iArr.length) {
            return iArr[i2];
        }
        return -1;
    }

    private final int B(int i, boolean z) {
        if (!z) {
            if (i <= 0) {
                return -1;
            }
            return i - 1;
        }
        ngf ngfVar = this.c;
        int i2 = ngfVar.c[i] - 1;
        if (i2 >= 0) {
            return ngfVar.b[i2];
        }
        return -1;
    }

    public static Object x(Object obj) {
        return ((Pair) obj).second;
    }

    public static Object y(Object obj) {
        return ((Pair) obj).first;
    }

    @Override // defpackage.mcl
    public final int a(Object obj) {
        int iA;
        if (obj instanceof Pair) {
            Object objY = y(obj);
            Object objX = x(obj);
            int iR = r(objY);
            if (iR != -1 && (iA = w(iR).a(objX)) != -1) {
                return u(iR) + iA;
            }
        }
        return -1;
    }

    @Override // defpackage.mcl
    public final mcj d(int i, mcj mcjVar, boolean z) {
        int iS = s(i);
        int iV = v(iS);
        w(iS).d(i - u(iS), mcjVar, z);
        mcjVar.c += iV;
        if (z) {
            Object objZ = z(iS);
            Object obj = mcjVar.b;
            mee.f(obj);
            mcjVar.b = Pair.create(objZ, obj);
        }
        return mcjVar;
    }

    @Override // defpackage.mcl
    public final mck e(int i, mck mckVar, long j) {
        int iT = t(i);
        int iV = v(iT);
        int iU = u(iT);
        w(iT).e(i - iV, mckVar, j);
        Object objZ = z(iT);
        if (!mck.a.equals(mckVar.b)) {
            objZ = Pair.create(objZ, mckVar.b);
        }
        mckVar.b = objZ;
        mckVar.n += iU;
        mckVar.o += iU;
        return mckVar;
    }

    @Override // defpackage.mcl
    public final Object f(int i) {
        int iS = s(i);
        return Pair.create(z(iS), w(iS).f(i - u(iS)));
    }

    @Override // defpackage.mcl
    public final int g(boolean z) {
        if (this.b != 0) {
            int iA = 0;
            if (z) {
                int[] iArr = this.c.b;
                iA = iArr.length > 0 ? iArr[0] : -1;
            }
            while (w(iA).q()) {
                iA = A(iA, z);
                if (iA == -1) {
                }
            }
            return v(iA) + w(iA).g(z);
        }
        return -1;
    }

    @Override // defpackage.mcl
    public final int h(boolean z) {
        int iB;
        int i = this.b;
        if (i != 0) {
            if (z) {
                int[] iArr = this.c.b;
                int length = iArr.length;
                iB = length > 0 ? iArr[length - 1] : -1;
            } else {
                iB = i - 1;
            }
            while (w(iB).q()) {
                iB = B(iB, z);
                if (iB == -1) {
                }
            }
            return v(iB) + w(iB).h(z);
        }
        return -1;
    }

    @Override // defpackage.mcl
    public final int j(int i, int i2, boolean z) {
        int iT = t(i);
        int iV = v(iT);
        int iJ = w(iT).j(i - iV, i2 == 2 ? 0 : i2, z);
        if (iJ != -1) {
            return iV + iJ;
        }
        int iA = A(iT, z);
        while (iA != -1 && w(iA).q()) {
            iA = A(iA, z);
        }
        if (iA != -1) {
            return v(iA) + w(iA).g(z);
        }
        if (i2 == 2) {
            return g(z);
        }
        return -1;
    }

    @Override // defpackage.mcl
    public final int k(int i, int i2, boolean z) {
        int iT = t(i);
        int iV = v(iT);
        int iK = w(iT).k(i - iV, i2 == 2 ? 0 : i2, z);
        if (iK != -1) {
            return iV + iK;
        }
        int iB = B(iT, z);
        while (iB != -1 && w(iB).q()) {
            iB = B(iB, z);
        }
        if (iB != -1) {
            return v(iB) + w(iB).h(z);
        }
        if (i2 == 2) {
            return h(z);
        }
        return -1;
    }

    @Override // defpackage.mcl
    public final mcj o(Object obj, mcj mcjVar) {
        Object objY = y(obj);
        Object objX = x(obj);
        int iR = r(objY);
        int iV = v(iR);
        w(iR).o(objX, mcjVar);
        mcjVar.c += iV;
        mcjVar.b = obj;
        return mcjVar;
    }

    protected abstract int r(Object obj);

    protected abstract int s(int i);

    protected abstract int t(int i);

    protected abstract int u(int i);

    protected abstract int v(int i);

    protected abstract mcl w(int i);

    protected abstract Object z(int i);
}
