package defpackage;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qqp {
    public static final qrk a(qnm qnmVar, boolean z, boolean z2, qrn qrnVar, float f, int i, hml hmlVar, int i2, int i3) {
        qqr qqrVar;
        Object[] objArr;
        hmlVar.v(683659508);
        int i4 = (i3 & 64) != 0 ? 1 : i;
        if (i4 <= 0) {
            throw new IllegalArgumentException("Iterations must be a positive number (0).");
        }
        float f2 = (i3 & 32) != 0 ? 1.0f : f;
        if (Math.abs(f2) > Float.MAX_VALUE) {
            throw new IllegalArgumentException("Speed must be a finite number. It is " + f2 + ".");
        }
        boolean z3 = (!((i3 & 2) == 0)) | z;
        qqr qqrVarC = qrb.c(hmlVar);
        hmlVar.v(1849434622);
        hmw hmwVar = (hmw) hmlVar;
        Object objS = hmwVar.S();
        Object obj = hmk.a;
        if (objS == obj) {
            hpl hplVar = new hpl(Boolean.valueOf(z3), hsi.a);
            hmwVar.af(hplVar);
            objS = hplVar;
        }
        qrn qrnVar2 = (i3 & 16) != 0 ? null : qrnVar;
        hox hoxVar = (hox) objS;
        hmwVar.ab();
        hmlVar.v(-133181515);
        float fB = f2 / qwz.b((Context) hmlVar.e(AndroidCompositionLocals_androidKt.b));
        hmwVar.ab();
        boolean z4 = true;
        Object[] objArr2 = {qnmVar, Boolean.valueOf(z3), qrnVar2, Float.valueOf(fB), Integer.valueOf(i4)};
        hmlVar.v(-1224400529);
        boolean z5 = (((i2 & 112) ^ 48) > 32 && hmlVar.E(z3)) || (i2 & 48) == 32;
        boolean z6 = (!((i3 & 4) == 0)) | z2;
        boolean zD = ((((i2 & 896) ^ 384) > 256 && hmlVar.E(z6)) || (i2 & 384) == 256) | z5 | hmlVar.D(qqrVarC) | hmlVar.F(qnmVar) | ((((3670016 & i2) ^ 1572864) > 1048576 && hmlVar.B(i4)) || (i2 & 1572864) == 1048576) | ((((i2 & 7168) ^ 3072) > 2048 && hmlVar.E(false)) || (i2 & 3072) == 2048) | hmlVar.A(fB);
        if ((((57344 & i2) ^ 24576) <= 16384 || !hmlVar.D(qrnVar2)) && (i2 & 24576) != 16384) {
            z4 = false;
        }
        boolean zB = zD | z4 | hmlVar.B(0) | hmlVar.E(false);
        Object objS2 = hmwVar.S();
        if (zB || objS2 == obj) {
            qqrVar = qqrVarC;
            qrn qrnVar3 = qrnVar2;
            objArr = objArr2;
            qqo qqoVar = new qqo(z3, z6, qqrVar, qnmVar, i4, fB, qrnVar3, hoxVar, null);
            hmwVar.af(qqoVar);
            objS2 = qqoVar;
        } else {
            objArr = objArr2;
            qqrVar = qqrVarC;
        }
        hmwVar.ab();
        hob.h(objArr, (fdat) objS2, hmlVar);
        hmwVar.ab();
        return qqrVar;
    }
}
