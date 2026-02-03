package defpackage;

import android.content.Context;
import android.os.Build;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import org.chromium.net.NetError;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dpgp {
    public static final void a(boolean z, hcr hcrVar, final fdat fdatVar, hml hmlVar, final int i, final int i2) {
        boolean zA;
        int i3;
        int i4;
        hcr hcrVarA;
        final hcr hcrVar2;
        fdatVar.getClass();
        int i5 = i & 6;
        hml hmlVarC = hmlVar.c(-364459343);
        if (i5 == 0) {
            int i6 = 2;
            if ((i2 & 1) == 0) {
                zA = z;
                if (hmlVarC.E(zA)) {
                    i6 = 4;
                }
            } else {
                zA = z;
            }
            i3 = i6 | i;
        } else {
            zA = z;
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= 16;
        }
        if ((i & 384) == 0) {
            i3 |= true != hmlVarC.F(fdatVar) ? 128 : 256;
        }
        if ((i3 & 147) == 146 && hmlVarC.I()) {
            hmlVarC.s();
            hcrVar2 = hcrVar;
        } else {
            int i7 = i2 & 1;
            hmlVarC.t();
            if ((i & 1) == 0 || hmlVarC.G()) {
                if (i7 != 0) {
                    i3 &= -15;
                    zA = dlv.a(hmlVarC);
                }
                i4 = i3 & NetError.ERR_SSL_VERSION_OR_CIPHER_MISMATCH;
                hcrVarA = dtip.a();
            } else {
                hmlVarC.s();
                if (i7 != 0) {
                    i3 &= -15;
                }
                i4 = i3 & NetError.ERR_SSL_VERSION_OR_CIPHER_MISMATCH;
                hcrVarA = hcrVar;
            }
            hmlVarC.l();
            Context context = (Context) hmlVarC.e(AndroidCompositionLocals_androidKt.b);
            boolean z2 = Build.VERSION.SDK_INT >= 31;
            gmg.c((z2 && zA) ? gje.b(context) : z2 ? gje.c(context) : zA ? gdd.d(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, -1, 15) : gdd.e(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, -1, 15), null, hcrVarA, fdatVar, hmlVarC, (i4 << 3) & 7168);
            hcrVar2 = hcrVarA;
        }
        final boolean z3 = zA;
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dpgo
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    boolean z4 = z3;
                    hcr hcrVar3 = hcrVar2;
                    dpgp.a(z4, hcrVar3, fdatVar, (hml) obj, hpy.a(i | 1), i2);
                    return fctx.a;
                }
            };
        }
    }
}
