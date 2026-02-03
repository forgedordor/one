package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jgo extends jgm {
    public static jgo b;
    public jyi c;

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
        int iH;
        if (a().length() > 0 && i < a().length()) {
            if (i < 0) {
                jyi jyiVar = this.c;
                if (jyiVar == null) {
                    fdbq.c("layoutResult");
                    jyiVar = null;
                }
                iH = jyiVar.h(0);
            } else {
                jyi jyiVar2 = this.c;
                if (jyiVar2 == null) {
                    fdbq.c("layoutResult");
                    jyiVar2 = null;
                }
                int iH2 = jyiVar2.h(i);
                iH = e(iH2, 2) == i ? iH2 : iH2 + 1;
            }
            jyi jyiVar3 = this.c;
            if (jyiVar3 == null) {
                fdbq.c("layoutResult");
                jyiVar3 = null;
            }
            if (iH < jyiVar3.f()) {
                return b(e(iH, 2), e(iH, 1) + 1);
            }
        }
        return null;
    }

    @Override // defpackage.jgr
    public final int[] d(int i) {
        int iH;
        if (a().length() > 0 && i > 0) {
            if (i > a().length()) {
                jyi jyiVar = this.c;
                if (jyiVar == null) {
                    fdbq.c("layoutResult");
                    jyiVar = null;
                }
                iH = jyiVar.h(a().length());
            } else {
                jyi jyiVar2 = this.c;
                if (jyiVar2 == null) {
                    fdbq.c("layoutResult");
                    jyiVar2 = null;
                }
                int iH2 = jyiVar2.h(i);
                iH = e(iH2, 1) + 1 == i ? iH2 : iH2 - 1;
            }
            if (iH >= 0) {
                return b(e(iH, 2), e(iH, 1) + 1);
            }
        }
        return null;
    }
}
