package defpackage;

import android.content.Context;
import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class baix {
    public final Context a;
    private final cpbn b;
    private final fcsu c;

    public baix(Context context, cpbn cpbnVar, fcsu fcsuVar) {
        this.a = context;
        this.b = cpbnVar;
        this.c = fcsuVar;
    }

    public final Uri a(bxfm bxfmVar) {
        cqaz.l(bxfmVar);
        String strA = cpbj.a(this.a);
        Uri uri = bxfmVar.c;
        if (strA.equals(uri.getAuthority())) {
            return uri;
        }
        return this.b.e(uri, bxfmVar.d, ((alrj) this.c.b()).f(), null);
    }
}
