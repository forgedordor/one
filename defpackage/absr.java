package defpackage;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.ImageView;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.apps.messaging.R;
import j$.util.Optional;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class absr {
    public static final cqce a = cqce.g("Bugle", "SwitcherDialogFragmentPeer");
    public volatile abgx b;
    public float[] c;
    public final absn d;
    public final fcsu e;
    public final fcsu f;
    public final fcsu g;
    public final fcsu h;
    public View i;
    public View j;
    public ImageView k;
    public ImageView l;
    public LottieAnimationView m;
    private final fcsu n;
    private final fcsu o;

    public absr(absn absnVar, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5, fcsu fcsuVar6) {
        this.d = absnVar;
        this.e = fcsuVar2;
        this.n = fcsuVar;
        this.f = fcsuVar3;
        this.o = fcsuVar4;
        this.g = fcsuVar5;
        this.h = fcsuVar6;
    }

    public static int d(abgx abgxVar) {
        int iOrdinal = abgxVar.ordinal();
        if (iOrdinal != 1) {
            return iOrdinal != 2 ? 1 : 2;
        }
        return 3;
    }

    private final void e(View view) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadii(this.c);
        gradientDrawable.setColor(((Context) this.e.b()).getColor(R.color.switcher_option_background_color));
        view.setBackground(gradientDrawable);
    }

    private final void f(View view) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        fcsu fcsuVar = this.e;
        gradientDrawable.setStroke(((Context) fcsuVar.b()).getResources().getDimensionPixelSize(R.dimen.switcher_option_background_border), ((Context) fcsuVar.b()).getColor(R.color.switcher_option_background_border));
        gradientDrawable.setCornerRadii(this.c);
        view.setBackground(gradientDrawable);
    }

    public final void a() {
        int iOrdinal = this.b.ordinal();
        if (iOrdinal != 0 && iOrdinal != 1) {
            if (iOrdinal == 2) {
                e(this.i);
                f(this.j);
                this.l.setVisibility(8);
                this.k.setVisibility(0);
                return;
            }
            if (iOrdinal != 3) {
                return;
            }
        }
        e(this.j);
        f(this.i);
        this.l.setVisibility(0);
        this.k.setVisibility(8);
    }

    public final void b(abgx abgxVar) {
        this.b = abgxVar;
        cqbd cqbdVarA = a.a();
        cqbdVarA.A("selectedMode", this.b.toString());
        cqbdVarA.r();
        a();
    }

    public final synchronized void c(abgx abgxVar) {
        fcsu fcsuVar = this.o;
        if (!((Optional) fcsuVar.b()).isPresent()) {
            a.r("SatelliteDataService is empty, cannot not setTabletMode");
            return;
        }
        cqbd cqbdVarA = a.a();
        cqbdVarA.A("Set tabletMode", this.b.toString());
        cqbdVarA.r();
        ((abgm) ((Optional) fcsuVar.b()).get()).c(abgxVar).k(auvh.b(), (Executor) this.n.b());
    }
}
