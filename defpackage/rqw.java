package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;

/* compiled from: PG */
/* loaded from: classes.dex */
final class rqw extends rtp {
    final int a;
    public Bitmap b;
    private final Handler d;
    private final long e;

    public rqw(Handler handler, int i, long j) {
        this.d = handler;
        this.a = i;
        this.e = j;
    }

    @Override // defpackage.rua
    public final /* bridge */ /* synthetic */ void b(Object obj, ruk rukVar) {
        this.b = (Bitmap) obj;
        Handler handler = this.d;
        handler.sendMessageAtTime(handler.obtainMessage(1, this), this.e);
    }

    @Override // defpackage.rua
    public final void e(Drawable drawable) {
        this.b = null;
    }
}
