package defpackage;

import android.content.Context;
import android.net.Uri;
import java.io.File;

/* compiled from: PG */
/* loaded from: classes.dex */
class rnc implements rlr {
    private final Context a;
    private final Class b;

    public rnc(Context context, Class cls) {
        this.a = context;
        this.b = cls;
    }

    @Override // defpackage.rlr
    public final rlq b(rlz rlzVar) {
        Class cls = this.b;
        return new rng(this.a, rlzVar.a(File.class, cls), rlzVar.a(Uri.class, cls), cls);
    }
}
