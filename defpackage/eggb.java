package defpackage;

import android.content.Context;
import android.graphics.Bitmap;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eggb extends rsp implements rlr {
    private final fcsu a;

    public eggb(fcsu fcsuVar) {
        this.a = fcsuVar;
    }

    @Override // defpackage.rlr
    public final rlq b(rlz rlzVar) {
        return (rlq) this.a.b();
    }

    @Override // defpackage.rsp
    public final void d(Context context, raw rawVar, rbn rbnVar) {
        rbnVar.g(egju.class, Bitmap.class, this);
    }
}
