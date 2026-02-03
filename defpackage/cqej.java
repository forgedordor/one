package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cqej {
    private final crmx a;
    private final alrj b;

    public cqej(crmx crmxVar, alrj alrjVar) {
        this.a = crmxVar;
        this.b = alrjVar;
    }

    public static final int c(Optional optional) {
        if (optional.isEmpty()) {
            return 0;
        }
        return ((dgiq) optional.get()).o().mMaxSize1toM;
    }

    public static final int d(Optional optional) {
        if (optional.isEmpty()) {
            return 0;
        }
        return ((dgiq) optional.get()).o().mMaxAdhocGroupSize;
    }

    public static final int e(Optional optional) {
        if (optional.isEmpty()) {
            return 0;
        }
        return ((dgiq) optional.get()).o().mMaxSize1to1;
    }

    @Deprecated
    public final Optional a(dgiq dgiqVar) {
        String strB = b(dgiqVar);
        return ejwk.c(strB) ? Optional.empty() : Optional.of(this.b.r(strB));
    }

    public final String b(dgiq dgiqVar) {
        dgis dgisVarM = dgiqVar.m();
        if (dgisVarM == null) {
            return "";
        }
        String strW = dgisVarM.w();
        return !ejwk.c(strW) ? ejwk.b(dhjv.k(strW, this.a)) : "";
    }
}
