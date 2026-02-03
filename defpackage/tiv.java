package defpackage;

import android.text.TextUtils;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class tiv {
    public abstract tiw a();

    public abstract void b(int i);

    public abstract void c(boolean z);

    public abstract void d(boolean z);

    public abstract void e(ekgb ekgbVar);

    public final tiw f() {
        tiw tiwVarA = a();
        tis tisVar = (tis) tiwVarA;
        boolean z = true;
        ejwl.a(!TextUtils.isEmpty(tisVar.a));
        Optional optional = tisVar.b;
        Optional optional2 = tisVar.c;
        if (!optional.isPresent() && !optional2.isPresent()) {
            z = false;
        }
        ejwl.a(z);
        return tiwVarA;
    }

    public final void g(boolean z, boolean z2) {
        if (z) {
            c(z2);
        }
    }

    public final void h(boolean z, boolean z2) {
        if (z) {
            d(z2);
        }
    }
}
