package defpackage;

import android.graphics.Matrix;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jow extends fdbr implements fdat {
    public static final jow a = new jow();

    public jow() {
        super(2);
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        ((Matrix) obj2).set(((View) obj).getMatrix());
        return fctx.a;
    }
}
