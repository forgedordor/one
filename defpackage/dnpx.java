package defpackage;

import android.view.ViewGroup;
import com.google.android.apps.messaging.R;
import com.google.android.material.tabs.TabLayout;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dnpx implements fdpm {
    final /* synthetic */ TabLayout a;
    final /* synthetic */ dnpz b;

    public dnpx(TabLayout tabLayout, dnpz dnpzVar) {
        this.a = tabLayout;
        this.b = dnpzVar;
    }

    @Override // defpackage.fdpm
    public final /* bridge */ /* synthetic */ Object fO(Object obj, fcxy fcxyVar) {
        int iIntValue = ((Number) obj).intValue();
        TabLayout tabLayout = this.a;
        ViewGroup.LayoutParams layoutParams = tabLayout.getLayoutParams();
        layoutParams.getClass();
        float f = ((kte) layoutParams).L;
        dnpz dnpzVar = this.b;
        dnph dnphVar = dnpzVar.aq;
        if (dnphVar == null) {
            fdbq.c("views");
            dnphVar = null;
        }
        ViewGroup.LayoutParams layoutParams2 = dnphVar.d.getLayoutParams();
        layoutParams2.getClass();
        if ((iIntValue * (f / ((dnpz.e(dnpzVar).f ? ((kte) layoutParams2).L : 0.0f) + f))) / tabLayout.b() >= tabLayout.getResources().getDimensionPixelOffset(R.dimen.emoji_tab_min_width)) {
            tabLayout.s(1);
            if (tabLayout.u != 0) {
                tabLayout.u = 0;
                tabLayout.i();
            }
        } else {
            tabLayout.s(0);
        }
        return fctx.a;
    }
}
