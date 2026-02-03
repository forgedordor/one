package defpackage;

import android.content.res.AssetManager;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qsn {
    public final AssetManager d;
    public final qsx a = new qsx();
    public final Map b = new HashMap();
    public final Map c = new HashMap();
    public String e = ".ttf";

    public qsn(Drawable.Callback callback) {
        if (callback instanceof View) {
            this.d = ((View) callback).getContext().getAssets();
        } else {
            qws.a("LottieDrawable must be inside of a view for images to work.");
            this.d = null;
        }
    }
}
