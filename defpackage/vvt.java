package defpackage;

import com.google.android.apps.messaging.conversation2.bottomcontent.composerow.draft.attachment.RichLocation;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vvt {
    public static final dltc a(vvs vvsVar) {
        vvsVar.getClass();
        if (vvsVar instanceof vvr) {
            return ((vvr) vvsVar).a.fo();
        }
        if (vvsVar instanceof vvn) {
            return ((vvn) vvsVar).b.fo();
        }
        if (vvsVar instanceof vvo) {
            return ((vvo) vvsVar).e;
        }
        if (vvsVar instanceof vvm) {
            return ((vvm) vvsVar).b.a();
        }
        throw new fctg();
    }

    public static final doif b(vvs vvsVar) {
        vvsVar.getClass();
        if (vvsVar instanceof vvr) {
            return f(((vvr) vvsVar).a);
        }
        if (vvsVar instanceof vvn) {
            return f(((vvn) vvsVar).b);
        }
        if (vvsVar instanceof vvo) {
            return ((vvo) vvsVar).b.b;
        }
        if (vvsVar instanceof vvm) {
            return f(((vvm) vvsVar).b);
        }
        throw new fctg();
    }

    public static final doif c(dltd dltdVar) {
        dltdVar.getClass();
        if (dltdVar instanceof dltn) {
            return ((dltn) dltdVar).b().b;
        }
        if (dltdVar instanceof dohs) {
            return ((dohs) dltdVar).m();
        }
        if (dltdVar instanceof RichLocation) {
            return ((RichLocation) dltdVar).d.b;
        }
        return null;
    }

    public static final doig d(dltd dltdVar, doht dohtVar, long j) {
        if (dltdVar instanceof dltn) {
            return ((dltn) dltdVar).b();
        }
        if (dltdVar instanceof dohr) {
            return doij.c((dohs) dltdVar, dohtVar, Long.valueOf(j)).b();
        }
        if (dltdVar instanceof dohq) {
            return ((dohq) dltdVar).b();
        }
        if (dltdVar instanceof RichLocation) {
            return ((RichLocation) dltdVar).d;
        }
        throw new UnsupportedOperationException("Cannot get MediaType for ".concat(String.valueOf(dltdVar.fq())));
    }

    public static final boolean e(vvs vvsVar) {
        vvsVar.getClass();
        doif doifVarB = b(vvsVar);
        return (fdbq.f(doifVarB, doid.a) || fdbq.f(doifVarB, doie.a)) && !fdbq.f(a(vvsVar), dltl.a);
    }

    private static final doif f(dltd dltdVar) {
        if (c(dltdVar) == null) {
            throw new UnsupportedOperationException("Cannot get type for ".concat(String.valueOf(dltdVar.fq())));
        }
        doif doifVarC = c(dltdVar);
        doifVarC.getClass();
        return doifVarC;
    }
}
