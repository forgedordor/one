package defpackage;

import android.content.res.AssetManager;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rjx implements rlr, rjv {
    private final AssetManager a;

    public rjx(AssetManager assetManager) {
        this.a = assetManager;
    }

    @Override // defpackage.rjv
    public final rfg a(AssetManager assetManager, String str) {
        return new rfu(assetManager, str);
    }

    @Override // defpackage.rlr
    public final rlq b(rlz rlzVar) {
        return new rjy(this.a, this);
    }
}
