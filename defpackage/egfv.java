package defpackage;

import android.content.Context;
import android.graphics.Bitmap;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class egfv extends rsp {
    private final egfs a;

    public egfv(egfs egfsVar) {
        this.a = egfsVar;
    }

    @Override // defpackage.rsp
    public final void d(Context context, raw rawVar, rbn rbnVar) {
        rbnVar.g(egjs.class, Bitmap.class, new egfu(this.a));
    }
}
