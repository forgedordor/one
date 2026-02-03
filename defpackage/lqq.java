package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lqq {
    private static final ThreadLocal d = new ThreadLocal();
    public final int a;
    public final lqn b;
    public volatile int c = 0;

    public lqq(lqn lqnVar, int i) {
        this.b = lqnVar;
        this.a = i;
    }

    public final int a(int i) {
        lqv lqvVarF = f();
        int iB = lqvVarF.b(16);
        if (iB != 0) {
            return lqvVarF.b.getInt(lqvVarF.c(iB) + (i * 4));
        }
        return 0;
    }

    public final int b() {
        lqv lqvVarF = f();
        int iB = lqvVarF.b(16);
        if (iB != 0) {
            return lqvVarF.d(iB);
        }
        return 0;
    }

    public final int c() {
        return this.c & 3;
    }

    public final int d() {
        lqv lqvVarF = f();
        int iB = lqvVarF.b(14);
        if (iB != 0) {
            return lqvVarF.b.getShort(iB + lqvVarF.a);
        }
        return 0;
    }

    public final int e() {
        lqv lqvVarF = f();
        int iB = lqvVarF.b(4);
        if (iB != 0) {
            return lqvVarF.b.getInt(iB + lqvVarF.a);
        }
        return 0;
    }

    public final lqv f() {
        ThreadLocal threadLocal = d;
        lqv lqvVar = (lqv) threadLocal.get();
        if (lqvVar == null) {
            lqvVar = new lqv();
            threadLocal.set(lqvVar);
        }
        lqn lqnVar = this.b;
        int i = this.a;
        lqw lqwVar = lqnVar.a;
        int iB = lqwVar.b(6);
        if (iB != 0) {
            int iC = lqwVar.c(iB) + (i * 4);
            lqvVar.e(iC + lqwVar.b.getInt(iC), lqwVar.b);
        }
        return lqvVar;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", id:");
        sb.append(Integer.toHexString(e()));
        sb.append(", codepoints:");
        int iB = b();
        for (int i = 0; i < iB; i++) {
            sb.append(Integer.toHexString(a(i)));
            sb.append(" ");
        }
        return sb.toString();
    }
}
