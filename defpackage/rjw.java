package defpackage;

import android.content.res.AssetManager;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rjw implements rlr, rjv {
    private final AssetManager a;

    public rjw(AssetManager assetManager) {
        this.a = assetManager;
    }

    @Override // defpackage.rjv
    public final rfg a(AssetManager assetManager, String str) {
        return new rfn(assetManager, str);
    }

    @Override // defpackage.rlr
    public final rlq b(rlz rlzVar) {
        return new rjy(this.a, this);
    }
}
