package defpackage;

import android.content.Context;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class egfx extends rsp {
    private final egfv a;

    public egfx(egfv egfvVar) {
        this.a = egfvVar;
    }

    @Override // defpackage.rsp
    public final void d(Context context, raw rawVar, rbn rbnVar) {
        this.a.d(context, rawVar, rbnVar);
        rbnVar.g(egjs.class, InputStream.class, new egfw());
    }
}
