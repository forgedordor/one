package defpackage;

import android.content.Context;
import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bxfh extends cqdf {
    final /* synthetic */ bxfi a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bxfh(bxfi bxfiVar) {
        super("Bugle.Async.VCardResource.destroyAsync.Duration");
        this.a = bxfiVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        for (bxfm bxfmVar : this.a.a) {
            cqaz.h();
            Uri uri = bxfmVar.c;
            Context context = bxfmVar.a;
            if (bxlf.j(uri, context)) {
                context.getContentResolver().delete(uri, null, null);
            }
        }
    }
}
