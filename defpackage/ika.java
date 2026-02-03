package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ika {
    public static final void a(ikd ikdVar, ijz ijzVar) {
        if (ijzVar instanceof ijx) {
            ikdVar.s(((ijx) ijzVar).a);
        } else if (ijzVar instanceof ijy) {
            ikdVar.t(((ijy) ijzVar).a);
        } else {
            if (!(ijzVar instanceof ijw)) {
                throw new fctg();
            }
            ikdVar.r(((ijw) ijzVar).a);
        }
    }

    public static /* synthetic */ void b(imz imzVar, ijz ijzVar, iiy iiyVar, float f) {
        inc incVar = inc.a;
        if (ijzVar instanceof ijx) {
            ihu ihuVar = ((ijx) ijzVar).a;
            imzVar.y(iiyVar, f(ihuVar), d(ihuVar), f, incVar, 3);
            return;
        }
        if (!(ijzVar instanceof ijy)) {
            if (!(ijzVar instanceof ijw)) {
                throw new fctg();
            }
            imzVar.x(((ijw) ijzVar).a, iiyVar, f, incVar, 3);
            return;
        }
        ijy ijyVar = (ijy) ijzVar;
        ikd ikdVar = ijyVar.b;
        if (ikdVar != null) {
            imzVar.x(ikdVar, iiyVar, f, incVar, 3);
            return;
        }
        ihw ihwVar = ijyVar.a;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (ihwVar.h >> 32));
        imzVar.I(iiyVar, g(ihwVar), e(ihwVar), (Float.floatToRawIntBits(fIntBitsToFloat) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32), f, incVar);
    }

    public static /* synthetic */ void c(imz imzVar, ijz ijzVar, long j) {
        boolean z = ijzVar instanceof ijx;
        inc incVar = inc.a;
        if (z) {
            ihu ihuVar = ((ijx) ijzVar).a;
            imzVar.r(j, f(ihuVar), d(ihuVar), 1.0f, incVar, null, 3);
            return;
        }
        if (!(ijzVar instanceof ijy)) {
            if (!(ijzVar instanceof ijw)) {
                throw new fctg();
            }
            imzVar.H(((ijw) ijzVar).a, j, 1.0f, incVar);
            return;
        }
        ijy ijyVar = (ijy) ijzVar;
        ikd ikdVar = ijyVar.b;
        if (ikdVar != null) {
            imzVar.H(ikdVar, j, 1.0f, incVar);
            return;
        }
        ihw ihwVar = ijyVar.a;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (ihwVar.h >> 32));
        imzVar.z(j, g(ihwVar), e(ihwVar), (Float.floatToRawIntBits(fIntBitsToFloat) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32), incVar, 1.0f, 3);
    }

    private static final long d(ihu ihuVar) {
        float f = ihuVar.d - ihuVar.b;
        float f2 = ihuVar.e - ihuVar.c;
        return (Float.floatToRawIntBits(f2) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
    }

    private static final long e(ihw ihwVar) {
        float fB = ihwVar.b();
        float fA = ihwVar.a();
        return (Float.floatToRawIntBits(fB) << 32) | (Float.floatToRawIntBits(fA) & 4294967295L);
    }

    private static final long f(ihu ihuVar) {
        return (Float.floatToRawIntBits(ihuVar.b) << 32) | (Float.floatToRawIntBits(ihuVar.c) & 4294967295L);
    }

    private static final long g(ihw ihwVar) {
        return (Float.floatToRawIntBits(ihwVar.a) << 32) | (Float.floatToRawIntBits(ihwVar.b) & 4294967295L);
    }
}
