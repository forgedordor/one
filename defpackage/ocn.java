package defpackage;

import android.content.Context;
import android.media.metrics.LogSessionId;
import android.os.Looper;
import androidx.media3.exoplayer.ExoPlayer;
import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ocn implements oal {
    public final Context a;
    public final obt b;
    public final ExoPlayer c;
    public int d;
    private final oas e;

    public ocn(final Context context, obt obtVar, final nem nemVar, oau oauVar, int i, Looper looper, oak oakVar, mej mejVar, ocj ocjVar, LogSessionId logSessionId) {
        this.a = context;
        this.b = obtVar;
        oas oasVar = new oas(oauVar);
        this.e = oasVar;
        nhs nhsVar = ocjVar.a;
        final nid nidVar = new nid(context);
        nidVar.j(nhsVar);
        mpg mpgVar = new mpg();
        mpgVar.b(50000, 50000, 100, BasePaymentResult.ERROR_REQUEST_FAILED);
        mpi mpiVarA = mpgVar.a();
        boolean z = obtVar.b;
        boolean z2 = obtVar.c;
        boolean z3 = obtVar.d;
        final ocm ocmVar = new ocm(z, oasVar, i, oakVar, logSessionId);
        mpz mpzVar = new mpz(context, new ejxr() { // from class: mpr
            @Override // defpackage.ejxr
            public final Object get() {
                return ocmVar;
            }
        }, new ejxr() { // from class: mps
            @Override // defpackage.ejxr
            public final Object get() {
                return new neb(context, new nnn());
            }
        });
        mee.c(!mpzVar.v);
        mpzVar.d = new ejxr() { // from class: mpy
            @Override // defpackage.ejxr
            public final Object get() {
                return nemVar;
            }
        };
        mee.c(!mpzVar.v);
        mpzVar.e = new ejxr() { // from class: mpx
            @Override // defpackage.ejxr
            public final Object get() {
                return nidVar;
            }
        };
        mpzVar.b(mpiVarA);
        mee.c(!mpzVar.v);
        mee.f(looper);
        mpzVar.i = looper;
        mee.c(!mpzVar.v);
        mpzVar.u = false;
        mee.c(!mpzVar.v);
        if (mejVar != mej.a) {
            mee.c(!mpzVar.v);
            mpzVar.b = mejVar;
        }
        ExoPlayer exoPlayerA = mpzVar.a();
        this.c = exoPlayerA;
        exoPlayerA.M(new ocl(this, oakVar));
        this.d = 0;
    }

    @Override // defpackage.oal
    public final int e(odj odjVar) {
        if (this.d == 2) {
            ExoPlayer exoPlayer = this.c;
            long jZ = exoPlayer.z();
            odjVar.a = mgb.r(Math.min(exoPlayer.y(), jZ), jZ);
        }
        return this.d;
    }

    @Override // defpackage.oal
    public final ekgp f() {
        ekgi ekgiVar = new ekgi();
        oas oasVar = this.e;
        String str = oasVar.b;
        if (str != null) {
            ekgiVar.i(1, str);
        }
        String str2 = oasVar.c;
        if (str2 != null) {
            ekgiVar.i(2, str2);
        }
        return ekgiVar.c();
    }

    @Override // defpackage.oal
    public final void g() {
        this.c.aa();
        this.d = 0;
    }

    @Override // defpackage.oal
    public final void h() throws CloneNotSupportedException {
        ekgb ekgbVarR = ekgb.r(this.b.a);
        ExoPlayer exoPlayer = this.c;
        mrn mrnVar = (mrn) exoPlayer;
        mrnVar.ap();
        List listAe = mrnVar.ae(ekgbVarR);
        mrnVar.ap();
        mrnVar.aj(listAe, -1, -9223372036854775807L, true);
        exoPlayer.O();
        this.d = 1;
    }
}
