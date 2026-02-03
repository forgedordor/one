package defpackage;

import android.graphics.Rect;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jgp extends jgm {
    public static jgp b;
    public jyi c;
    public jsl d;

    public jgp() {
        new Rect();
    }

    private final int e(int i, int i2) {
        jyi jyiVar = this.c;
        jyi jyiVar2 = null;
        if (jyiVar == null) {
            fdbq.c("layoutResult");
            jyiVar = null;
        }
        int iJ = jyiVar.j(i);
        jyi jyiVar3 = this.c;
        if (jyiVar3 == null) {
            fdbq.c("layoutResult");
            jyiVar3 = null;
        }
        if (i2 != jyiVar3.u(iJ)) {
            jyi jyiVar4 = this.c;
            if (jyiVar4 == null) {
                fdbq.c("layoutResult");
            } else {
                jyiVar2 = jyiVar4;
            }
            return jyiVar2.j(i);
        }
        jyi jyiVar5 = this.c;
        if (jyiVar5 == null) {
            fdbq.c("layoutResult");
        } else {
            jyiVar2 = jyiVar5;
        }
        return jyiVar2.g(i, false) - 1;
    }

    @Override // defpackage.jgr
    public final int[] c(int i) {
        int iF;
        jyi jyiVar = null;
        if (a().length() > 0 && i < a().length()) {
            try {
                jsl jslVar = this.d;
                if (jslVar == null) {
                    fdbq.c("node");
                    jslVar = null;
                }
                ihu ihuVarC = jslVar.c();
                int iRound = Math.round(ihuVarC.e - ihuVarC.c);
                int iF2 = fddu.f(0, i);
                jyi jyiVar2 = this.c;
                if (jyiVar2 == null) {
                    fdbq.c("layoutResult");
                    jyiVar2 = null;
                }
                int iH = jyiVar2.h(iF2);
                jyi jyiVar3 = this.c;
                if (jyiVar3 == null) {
                    fdbq.c("layoutResult");
                    jyiVar3 = null;
                }
                float fE = jyiVar3.e(iH) + iRound;
                jyi jyiVar4 = this.c;
                if (jyiVar4 == null) {
                    fdbq.c("layoutResult");
                    jyiVar4 = null;
                }
                jyi jyiVar5 = this.c;
                if (jyiVar5 == null) {
                    fdbq.c("layoutResult");
                    jyiVar5 = null;
                }
                if (fE < jyiVar4.e(jyiVar5.f() - 1)) {
                    jyi jyiVar6 = this.c;
                    if (jyiVar6 == null) {
                        fdbq.c("layoutResult");
                    } else {
                        jyiVar = jyiVar6;
                    }
                    iF = jyiVar.i(fE);
                } else {
                    jyi jyiVar7 = this.c;
                    if (jyiVar7 == null) {
                        fdbq.c("layoutResult");
                    } else {
                        jyiVar = jyiVar7;
                    }
                    iF = jyiVar.f();
                }
                return b(iF2, e(iF - 1, 1) + 1);
            } catch (IllegalStateException unused) {
            }
        }
        return null;
    }

    @Override // defpackage.jgr
    public final int[] d(int i) {
        int i2;
        jyi jyiVar = null;
        if (a().length() > 0 && i > 0) {
            try {
                jsl jslVar = this.d;
                if (jslVar == null) {
                    fdbq.c("node");
                    jslVar = null;
                }
                ihu ihuVarC = jslVar.c();
                int iRound = Math.round(ihuVarC.e - ihuVarC.c);
                int iG = fddu.g(a().length(), i);
                jyi jyiVar2 = this.c;
                if (jyiVar2 == null) {
                    fdbq.c("layoutResult");
                    jyiVar2 = null;
                }
                int iH = jyiVar2.h(iG);
                jyi jyiVar3 = this.c;
                if (jyiVar3 == null) {
                    fdbq.c("layoutResult");
                    jyiVar3 = null;
                }
                float fE = jyiVar3.e(iH) - iRound;
                if (fE > 0.0f) {
                    jyi jyiVar4 = this.c;
                    if (jyiVar4 == null) {
                        fdbq.c("layoutResult");
                    } else {
                        jyiVar = jyiVar4;
                    }
                    i2 = jyiVar.i(fE);
                } else {
                    i2 = 0;
                }
                if (iG == a().length() && i2 < iH) {
                    i2++;
                }
                return b(e(i2, 2), iG);
            } catch (IllegalStateException unused) {
            }
        }
        return null;
    }
}
