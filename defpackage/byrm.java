package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class byrm implements bypt {
    public static final eksp a = eksp.c("BugleCms");
    public static final eksp b = eksp.c("BugleCmsCall");
    public static final cqce c = cqce.g("BugleCmsFolsom", "CmsKeyHandler");
    public final auso d;
    public final cpmc e;
    public final fcsu f;
    public final cpoc g;
    public final eosc h;
    public final eosc i;
    private final aurx j;
    private final dqsn k;
    private final cpor l;

    public byrm(auso ausoVar, aurx aurxVar, fcsu fcsuVar, cpmc cpmcVar, cpoc cpocVar, cpor cporVar, dqsn dqsnVar, eosc eoscVar, eosc eoscVar2) {
        this.d = ausoVar;
        this.j = aurxVar;
        this.e = cpmcVar;
        this.k = dqsnVar;
        this.f = fcsuVar;
        this.g = cpocVar;
        this.l = cporVar;
        this.h = eoscVar;
        this.i = eoscVar2;
    }

    public static final boolean d(int i) {
        return (i & 16) == 16;
    }

    @Override // defpackage.bypt
    public final eiju a(ekgb ekgbVar, Optional optional) {
        return eijx.d(new UnsupportedOperationException());
    }

    @Override // defpackage.bypt
    public final eiju b(String str, String str2, int i, boolean z) {
        ejwl.b(!z, "processSingleItem get called from initial backup flow.");
        if (((Boolean) ((cczi) cpyl.X.get()).e()).booleanValue()) {
            if (i == 24) {
                throw new byri();
            }
            if (i == 2) {
                throw new byrj();
            }
            if (i == 20 || i == 48) {
                return eijx.e(new byqs());
            }
            throw new byrl();
        }
        if (i == 20) {
            throw new byrh();
        }
        if (i == 24) {
            throw new byri();
        }
        if (i == 48) {
            throw new byrg();
        }
        if (i == 2) {
            throw new byrj();
        }
        throw new byrl();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x017f  */
    @Override // defpackage.bypt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.eiju c(final java.lang.String r12, final java.lang.String r13, final int r14) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 403
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.byrm.c(java.lang.String, java.lang.String, int):eiju");
    }
}
