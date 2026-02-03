package defpackage;

import android.content.Context;
import androidx.camera.camera2.internal.compat.quirk.PreviewUnderExposureQuirk;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class apr implements bnm {
    final aqs a;

    public apr(Context context) {
        this.a = aqs.d(context);
    }

    @Override // defpackage.bnm
    public final bjq a(bnk bnkVar, int i) {
        int i2;
        bli bliVarA = bli.a();
        bmd bmdVar = new bmd();
        bmdVar.t(atb.a(bnkVar, i));
        bliVarA.c(bni.p, bmdVar.b());
        bliVarA.c(bni.r, apq.a);
        bjj bjjVar = new bjj();
        int iOrdinal = bnkVar.ordinal();
        if (iOrdinal != 0) {
            i2 = 3;
            if (iOrdinal != 3 || awv.a(PreviewUnderExposureQuirk.class) != null) {
                i2 = 1;
            }
        } else {
            i2 = i == 2 ? 5 : 2;
        }
        bjjVar.b = i2;
        bliVarA.c(bni.q, bjjVar.b());
        bliVarA.c(bni.s, bnkVar == bnk.IMAGE_CAPTURE ? arq.b : anq.a);
        if (bnkVar == bnk.PREVIEW) {
            bliVarA.c(bku.L, this.a.b());
        }
        bliVarA.c(bku.G, Integer.valueOf(this.a.c(true).getRotation()));
        if (bnkVar == bnk.VIDEO_CAPTURE || bnkVar == bnk.STREAM_SHARING) {
            bliVarA.c(bni.w, true);
        }
        return blo.f(bliVarA);
    }
}
