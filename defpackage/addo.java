package defpackage;

import android.content.Context;
import android.graphics.Typeface;
import android.support.v7.widget.Toolbar;
import com.google.android.material.appbar.AppBarLayout;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class addo {
    public final eygg a;
    public final fdjx b;
    public AppBarLayout c;
    public Toolbar d;
    public final daip e;
    private Typeface f;

    public addo(daip daipVar, eygg eyggVar, fdjx fdjxVar) {
        eyggVar.getClass();
        fdjxVar.getClass();
        this.e = daipVar;
        this.a = eyggVar;
        this.b = fdjxVar;
    }

    public final Typeface a(ea eaVar) {
        if (this.f == null) {
            Context contextZ = eaVar.z();
            this.f = Typeface.createFromAsset(contextZ != null ? contextZ.getAssets() : null, "ProductSans-Regular.ttf");
        }
        Typeface typeface = this.f;
        typeface.getClass();
        return typeface;
    }
}
