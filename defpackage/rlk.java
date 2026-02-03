package defpackage;

import android.content.Context;
import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rlk implements rlq {
    private final Context a;

    public rlk(Context context) {
        this.a = context;
    }

    @Override // defpackage.rlq
    public final /* bridge */ /* synthetic */ rlp a(Object obj, int i, int i2, rex rexVar) {
        Uri uri = (Uri) obj;
        return new rlp(new ruq(uri), new rlj(this.a, uri));
    }

    @Override // defpackage.rlq
    public final /* synthetic */ boolean b(Object obj) {
        return rfw.a((Uri) obj);
    }
}
