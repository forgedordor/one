package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.GradientDrawable;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.google.android.apps.messaging.R;
import com.google.android.material.tabs.TabLayout;
import j$.util.Optional;
import java.util.List;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class douf {
    public static final /* synthetic */ fdeh[] a;
    public final fdjx b;
    public final Optional c;
    public final dotc d;
    public List e;
    public doua g;
    public final fdcz f = new doue(this);
    private final fctc h = fctd.a(new fdae() { // from class: dotw
        @Override // defpackage.fdae
        public final Object invoke() {
            dpxa dpxaVar = new dpxa(R.attr.colorSecondary);
            douf doufVar = this.a;
            Context contextA = doufVar.a();
            contextA.getClass();
            int iA = dpxaVar.a(contextA);
            dpxa dpxaVar2 = new dpxa(R.attr.colorSurface);
            Context contextA2 = doufVar.a();
            contextA2.getClass();
            int iA2 = dpxaVar2.a(contextA2);
            int[][] iArr = {new int[]{android.R.attr.state_selected}, new int[]{-16842913}};
            dpxa dpxaVar3 = new dpxa(R.attr.colorOnSecondary);
            Context contextA3 = doufVar.a();
            contextA3.getClass();
            int iA3 = dpxaVar3.a(contextA3);
            dpxa dpxaVar4 = new dpxa(R.attr.colorOnSurface);
            Context contextA4 = doufVar.a();
            contextA4.getClass();
            return new doua(iA, iA2, new ColorStateList(iArr, new int[]{iA3, dpxaVar4.a(contextA4)}));
        }
    });
    private final fctc i = fctd.a(new fdae() { // from class: dotx
        @Override // defpackage.fdae
        public final Object invoke() {
            return Float.valueOf(this.a.b().getDimension(R.dimen.proxy_screen_tab_corner_radius_high));
        }
    });
    private final fctc j = fctd.a(new fdae() { // from class: doty
        @Override // defpackage.fdae
        public final Object invoke() {
            return Float.valueOf(this.a.b().getDimension(R.dimen.proxy_screen_tab_corner_radius_low));
        }
    });
    private final fctc k = fctd.a(new fdae() { // from class: dotz
        @Override // defpackage.fdae
        public final Object invoke() {
            return Integer.valueOf((int) this.a.b().getDimension(R.dimen.proxy_screen_tab_margin));
        }
    });

    static {
        fdbv fdbvVar = new fdbv(douf.class, "onTabSelectedListener", "getOnTabSelectedListener()Lcom/google/android/material/tabs/TabLayout$OnTabSelectedListener;", 0);
        int i = fdcj.a;
        a = new fdeh[]{fdbvVar};
    }

    public douf(fdjx fdjxVar, Optional optional, dotc dotcVar) {
        this.b = fdjxVar;
        this.c = optional;
        this.d = dotcVar;
    }

    private final float f() {
        return ((Number) this.i.a()).floatValue();
    }

    private final float g() {
        return ((Number) this.j.a()).floatValue();
    }

    private final int h() {
        return ((Number) this.k.a()).intValue();
    }

    public final Context a() {
        return this.d.j.getContext();
    }

    public final Resources b() {
        return this.d.j.getResources();
    }

    public final void c(dpxe dpxeVar) {
        List list = this.e;
        if (list == null) {
            fdbq.c("tabs");
            list = null;
        }
        Integer numValueOf = Integer.valueOf(list.indexOf(dpxeVar));
        Integer num = numValueOf.intValue() >= 0 ? numValueOf : null;
        if (num == null) {
            Objects.toString(dpxeVar);
            throw new IllegalStateException("No tab found for category ".concat(dpxeVar.toString()));
        }
        dotc dotcVar = this.d;
        int iIntValue = num.intValue();
        TabLayout tabLayout = dotcVar.j;
        tabLayout.l(tabLayout.d(iIntValue));
    }

    public final void d(TabLayout tabLayout) {
        doua douaVar = this.g;
        if (douaVar == null) {
            douaVar = (doua) this.h.a();
        }
        tabLayout.p(new ColorDrawable(0));
        int iB = tabLayout.b();
        int i = 0;
        while (i < iB) {
            eeve eeveVarD = tabLayout.d(i);
            if (eeveVarD != null) {
                int i2 = douaVar.b;
                int i3 = douaVar.a;
                boolean z = i == 0;
                boolean z2 = i == tabLayout.b() + (-1);
                eevh eevhVar = eeveVarD.i;
                if (true == eeveVarD.c()) {
                    i2 = i3;
                }
                float f = (z || eeveVarD.c()) ? f() : g();
                float f2 = (z2 || eeveVarD.c()) ? f() : g();
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setShape(0);
                gradientDrawable.setColor(i2);
                gradientDrawable.setCornerRadii(new float[]{f, f, f2, f2, f2, f2, f, f});
                eevhVar.setBackground(gradientDrawable);
                ViewGroup.LayoutParams layoutParams = eeveVarD.i.getLayoutParams();
                layoutParams.getClass();
                ((LinearLayout.LayoutParams) layoutParams).setMargins(z ? 0 : h(), 0, z2 ? 0 : h(), 0);
            }
            i++;
        }
        tabLayout.t(douaVar.c);
    }

    public final boolean e() {
        return this.d.j.getVisibility() == 0;
    }
}
