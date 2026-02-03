package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Build;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rng implements rlq {
    private final Context a;
    private final rlq b;
    private final rlq c;
    private final Class d;

    public rng(Context context, rlq rlqVar, rlq rlqVar2, Class cls) {
        this.a = context.getApplicationContext();
        this.b = rlqVar;
        this.c = rlqVar2;
        this.d = cls;
    }

    @Override // defpackage.rlq
    public final /* bridge */ /* synthetic */ rlp a(Object obj, int i, int i2, rex rexVar) {
        Uri uri = (Uri) obj;
        return new rlp(new ruq(uri), new rnf(this.a, this.b, this.c, uri, i, i2, rexVar, this.d));
    }

    @Override // defpackage.rlq
    public final /* bridge */ /* synthetic */ boolean b(Object obj) {
        return Build.VERSION.SDK_INT >= 29 && rfw.a((Uri) obj);
    }
}
