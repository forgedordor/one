package defpackage;

import android.content.Context;
import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ujz implements domv {
    public final Context a;
    private final fcyh b;

    public ujz(Context context, fcyh fcyhVar) {
        context.getClass();
        fcyhVar.getClass();
        this.a = context;
        this.b = fcyhVar;
    }

    @Override // defpackage.domv
    public final Object a(doig doigVar, fcxy fcxyVar) {
        return fdin.a(eicg.a(this.b), new ujy(null, doigVar, this), fcxyVar);
    }

    @Override // defpackage.domv
    public final Object b(Uri uri) {
        bxlf.i(this.a, uri);
        return fctx.a;
    }
}
