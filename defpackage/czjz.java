package defpackage;

import android.app.Activity;
import android.content.res.Resources;
import android.support.constraint.Guideline;
import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class czjz extends czkc {
    public czjz(Activity activity, ViewGroup viewGroup, Guideline guideline, Guideline guideline2, boolean z) {
        super(activity, viewGroup, guideline, guideline2, z);
    }

    @Override // defpackage.czkc
    public final void a(int i) throws Resources.NotFoundException {
        int iB = b(0) / 2;
        Activity activity = this.a;
        int iC = dakl.c(activity);
        int i2 = this.b;
        d(cqch.c(iB, iC, i2), craf.e(activity, this.d) ? 0 : cqch.c(iB, dakl.b(activity), i2));
    }
}
