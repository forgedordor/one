package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ykw {
    private final cqmb a;

    public ykw(cqmb cqmbVar) {
        cqmbVar.getClass();
        this.a = cqmbVar;
    }

    public static final boolean b(ajlt ajltVar, ajlt ajltVar2) {
        long jG;
        if (ajltVar2 != null && !c(ajltVar) && !c(ajltVar2) && yji.c(ajltVar, ajltVar2)) {
            if (eotp.a("bugle.improve_bubble_grouping", "bugle")) {
                long j = fdhi.a;
                jG = fdhi.g(fdhk.f(1, fdhl.f));
            } else {
                jG = 60000;
            }
            if (Math.abs(ajltVar.o().toEpochMilli() - ajltVar2.o().toEpochMilli()) < jG) {
                return true;
            }
        }
        return false;
    }

    private static final boolean c(ajlt ajltVar) {
        amvr amvrVarG = ajltVar.g();
        if (!(amvrVarG instanceof amsy)) {
            return false;
        }
        amsy amsyVar = (amsy) amvrVarG;
        amsyVar.g();
        return (amsyVar.g().b & 1) != 0;
    }

    public final ajlt a(ajlt ajltVar) {
        amvr amvrVarG = ajltVar.g();
        if (!(amvrVarG instanceof amwf)) {
            return ajltVar;
        }
        amwf amwfVar = (amwf) amvrVarG;
        if (amwfVar.c() == null || !this.a.g(amwfVar.c())) {
            return ajltVar;
        }
        return null;
    }
}
