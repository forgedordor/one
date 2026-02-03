package defpackage;

import android.view.View;
import com.google.android.material.appbar.AppBarLayout;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eecm implements ldn {
    final /* synthetic */ AppBarLayout a;

    public eecm(AppBarLayout appBarLayout) {
        this.a = appBarLayout;
    }

    @Override // defpackage.ldn
    public final lgt ez(View view, lgt lgtVar) {
        AppBarLayout appBarLayout = this.a;
        lgt lgtVar2 = true != appBarLayout.getFitsSystemWindows() ? null : lgtVar;
        if (!Objects.equals(appBarLayout.c, lgtVar2)) {
            appBarLayout.c = lgtVar2;
            appBarLayout.o();
            appBarLayout.requestLayout();
        }
        return lgtVar;
    }
}
