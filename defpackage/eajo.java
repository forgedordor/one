package defpackage;

import android.graphics.Bitmap;
import com.google.android.gms.common.api.Status;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class eajo {
    public final qzr a;

    public eajo(qzr qzrVar) {
        this.a = qzrVar;
    }

    static /* synthetic */ void a(defr defrVar, qzx qzxVar) {
        dcff dcffVarB;
        try {
            qzk qzkVar = qzxVar.a;
            if (qzkVar != null) {
                int i = qzkVar.a;
                dcffVarB = i != 400 ? i != 403 ? eajd.b(qzxVar) : new dcff(new Status(9011, "The provided API key is invalid.")) : new dcff(new Status(9012, "The provided parameters are invalid (did you include a max width or height?)."));
            }
            defrVar.c(dcffVarB);
        } catch (Error | RuntimeException e) {
            eawq.b(e);
            throw e;
        }
    }

    static /* synthetic */ void b(eamm eammVar, defr defrVar, Bitmap bitmap) {
        try {
            eammVar.a = bitmap;
            ejwl.m(eammVar.a != null, "Photo must be set to non-null value.");
            defrVar.d(new eamn(eammVar.a));
        } catch (Error | RuntimeException e) {
            eawq.b(e);
            throw e;
        }
    }
}
