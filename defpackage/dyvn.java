package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dyvn extends rsp {
    final /* synthetic */ dyyv a;

    public dyvn(dyyv dyyvVar) {
        this.a = dyyvVar;
    }

    @Override // defpackage.rsp
    public final void d(Context context, raw rawVar, rbn rbnVar) {
        rbnVar.g(dyvv.class, Bitmap.class, new dyvo(context, this.a));
        rbnVar.g(dyvv.class, Bitmap.class, new dyvq(new dyvt(context)));
        rbnVar.g(dyvv.class, InputStream.class, new dyvp());
    }
}
