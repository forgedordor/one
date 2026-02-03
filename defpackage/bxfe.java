package defpackage;

import android.content.Context;
import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bxfe extends bxgl {
    private final Uri a;
    private final bxfg b;

    public bxfe(bxfg bxfgVar, Uri uri) {
        cqaz.l(uri);
        this.b = bxfgVar;
        this.a = uri;
    }

    @Override // defpackage.bxgl
    public final bxgk g(Context context) {
        bxfg bxfgVar = this.b;
        cpbn cpbnVar = (cpbn) bxfgVar.b.b();
        cpbnVar.getClass();
        bxfo bxfoVar = (bxfo) bxfgVar.c.b();
        bxfoVar.getClass();
        bxfn bxfnVar = (bxfn) bxfgVar.d.b();
        bxfnVar.getClass();
        context.getClass();
        return new bxfd(bxfgVar.a, cpbnVar, bxfoVar, bxfnVar, bxfgVar.e, context, this, this.a);
    }
}
