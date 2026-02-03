package defpackage;

import android.content.res.AssetManager;
import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rjy implements rlq {
    private final AssetManager a;
    private final rjv b;

    public rjy(AssetManager assetManager, rjv rjvVar) {
        this.a = assetManager;
        this.b = rjvVar;
    }

    @Override // defpackage.rlq
    public final /* bridge */ /* synthetic */ rlp a(Object obj, int i, int i2, rex rexVar) {
        Uri uri = (Uri) obj;
        return new rlp(new ruq(uri), this.b.a(this.a, uri.toString().substring(22)));
    }

    @Override // defpackage.rlq
    public final /* bridge */ /* synthetic */ boolean b(Object obj) {
        Uri uri = (Uri) obj;
        return "file".equals(uri.getScheme()) && !uri.getPathSegments().isEmpty() && "android_asset".equals(uri.getPathSegments().get(0));
    }
}
