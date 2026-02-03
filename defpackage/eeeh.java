package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eeeh implements eemm {
    @Override // defpackage.eemm
    public final void a(View view, lgt lgtVar, eemn eemnVar) {
        eemnVar.d += lgtVar.a();
        int layoutDirection = view.getLayoutDirection();
        int iB = lgtVar.b();
        int iC = lgtVar.c();
        int i = eemnVar.a + (layoutDirection == 1 ? iC : iB);
        eemnVar.a = i;
        if (layoutDirection != 1) {
            iB = iC;
        }
        int i2 = eemnVar.c + iB;
        eemnVar.c = i2;
        view.setPaddingRelative(i, eemnVar.b, i2, eemnVar.d);
    }
}
