package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dkto {
    public static final ics a(ics icsVar, ije ijeVar, ije ijeVar2, boolean z) {
        icsVar.getClass();
        return icsVar.a(new icl("com.google.android.libraries.communications.ux.components.placeholder.defaultPlaceholder", ijeVar, ijeVar2, new dktd(ijeVar2, ijeVar, z)));
    }

    public static final ijz b(imz imzVar, ikp ikpVar, long j, dktc dktcVar, float f, ijz ijzVar, kji kjiVar, ihz ihzVar) {
        ijz ijzVarA = null;
        if (ikpVar == ikj.a) {
            imzVar.r(j, 0L, (126 & 4) != 0 ? imy.c(imzVar.b(), 0L) : 0L, (126 & 8) != 0 ? 1.0f : 0.0f, (126 & 16) != 0 ? inc.a : null, (126 & 32) != 0 ? null : null, (126 & 64) != 0 ? 3 : 0);
            imy.i(imzVar, dktcVar.c(f, imzVar.b()), 0L, 0L, dktcVar.a(f), null, 0, 118);
            return null;
        }
        if (ihz.e(imzVar.b(), ihzVar) && imzVar.q() == kjiVar) {
            ijzVarA = ijzVar;
        }
        if (ijzVarA == null) {
            ijzVarA = ikpVar.a(imzVar.b(), imzVar.q(), imzVar);
        }
        ika.c(imzVar, ijzVarA, j);
        ika.b(imzVar, ijzVarA, dktcVar.c(f, imzVar.b()), dktcVar.a(f));
        return ijzVarA;
    }

    public static final /* synthetic */ dktc c(long j, hml hmlVar) {
        hmlVar.v(-830956014);
        fctc fctcVar = dktb.a;
        dff dffVar = (dff) dktb.b.a();
        dffVar.getClass();
        dktp dktpVar = new dktp(j, dffVar);
        hmlVar.o();
        return dktpVar;
    }

    public static /* synthetic */ ics d(ics icsVar, ije ijeVar, int i) {
        if (1 == (i & 1)) {
            ijeVar = null;
        }
        return a(icsVar, ijeVar, null, false);
    }
}
