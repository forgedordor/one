package defpackage;

import android.content.Context;
import android.net.Uri;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cpcw extends rsp {
    final /* synthetic */ cpcv a;
    final /* synthetic */ cpct b;
    final /* synthetic */ cpcy c;

    public cpcw(cpcv cpcvVar, cpct cpctVar, cpcy cpcyVar) {
        this.a = cpcvVar;
        this.b = cpctVar;
        this.c = cpcyVar;
    }

    @Override // defpackage.rsp
    public final void d(Context context, raw rawVar, rbn rbnVar) {
        context.getClass();
        rbnVar.g(ejha.class, InputStream.class, this.a);
        rbnVar.g(djsq.class, InputStream.class, this.b);
        rbnVar.g(Uri.class, InputStream.class, this.c);
    }
}
