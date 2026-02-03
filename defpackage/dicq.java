package defpackage;

import android.R;
import android.app.Activity;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsets;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dicq {
    public final Window a;
    public ejwi b = ejud.a;
    final /* synthetic */ dicr c;

    public dicq(dicr dicrVar, Window window) {
        this.c = dicrVar;
        this.a = window;
    }

    public final void a() {
        Log.d("SystemUiManager", "ClientAppWindow#maybeRegisterOnSystemUiVisibilityChangeListener()");
        dicr dicrVar = this.c;
        if (dicrVar.b.g()) {
            final View decorView = this.a.getDecorView();
            if (Build.VERSION.SDK_INT <= 27) {
                ((Activity) dicrVar.b.c()).runOnUiThread(new Runnable() { // from class: dici
                    @Override // java.lang.Runnable
                    public final void run() {
                        final dicq dicqVar = this.a;
                        decorView.setOnSystemUiVisibilityChangeListener(new View.OnSystemUiVisibilityChangeListener() { // from class: dicn
                            @Override // android.view.View.OnSystemUiVisibilityChangeListener
                            public final void onSystemUiVisibilityChange(int i) {
                                dicq dicqVar2 = dicqVar;
                                dicr dicrVar2 = dicqVar2.c;
                                if (!dicrVar2.f.g() || ((Integer) dicrVar2.f.c()).intValue() == i) {
                                    return;
                                }
                                Log.d("SystemUiManager", String.format("#OnSystemUiVisibilityChange(): restore SystemUiVisibility from %d to %d.", Integer.valueOf(i), dicrVar2.f.c()));
                                dicqVar2.f(((Integer) dicrVar2.f.c()).intValue());
                            }
                        });
                    }
                });
            }
        }
    }

    public final void b() {
        Log.d("SystemUiManager", "ClientAppWindow#maybeUnregisterOnSystemUiVisibilityChangeListener()");
        dicr dicrVar = this.c;
        if (!dicrVar.b.g() || Build.VERSION.SDK_INT > 27) {
            return;
        }
        ((Activity) dicrVar.b.c()).runOnUiThread(new Runnable() { // from class: dicp
            @Override // java.lang.Runnable
            public final void run() {
                this.a.a.getDecorView().setOnSystemUiVisibilityChangeListener(new View.OnSystemUiVisibilityChangeListener() { // from class: dicj
                    @Override // android.view.View.OnSystemUiVisibilityChangeListener
                    public final void onSystemUiVisibilityChange(int i) {
                    }
                });
            }
        });
    }

    public final void c() {
        Log.d("SystemUiManager", "ClientAppWindow#registerOnApplyWindowInsetsListener()");
        dicr dicrVar = this.c;
        if (dicrVar.b.g()) {
            final View decorView = this.a.getDecorView();
            this.b = ejwi.j(Integer.valueOf(((ViewGroup.MarginLayoutParams) decorView.findViewById(R.id.content).getLayoutParams()).topMargin));
            ((Activity) dicrVar.b.c()).runOnUiThread(new Runnable() { // from class: dicl
                @Override // java.lang.Runnable
                public final void run() {
                    View viewFindViewById = decorView.findViewById(R.id.content);
                    final dicq dicqVar = this.a;
                    viewFindViewById.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: dicg
                        @Override // android.view.View.OnApplyWindowInsetsListener
                        public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                            Log.d("SystemUiManager", "#OnApplyWindowInsets(): top inset height = " + windowInsets.getSystemWindowInsetTop());
                            ejwi ejwiVarJ = ejwi.j(Integer.valueOf(windowInsets.getSystemWindowInsetTop()));
                            dicq dicqVar2 = dicqVar;
                            dicqVar2.c.e = ejwiVarJ;
                            dicqVar2.h();
                            return windowInsets;
                        }
                    });
                }
            });
        }
    }

    public final void d() {
        Log.d("SystemUiManager", "ClientAppWindow#reinstateContentViewTopMargin()");
        dicr dicrVar = this.c;
        if (dicrVar.b.g()) {
            ((Activity) dicrVar.b.c()).runOnUiThread(new Runnable() { // from class: dico
                @Override // java.lang.Runnable
                public final void run() {
                    dicq dicqVar = this.a;
                    ((ViewGroup.MarginLayoutParams) dicqVar.a.getDecorView().findViewById(R.id.content).getLayoutParams()).topMargin = ((Integer) dicqVar.b.e(0)).intValue();
                    dicqVar.b = ejud.a;
                }
            });
        }
    }

    public final void e() {
        dicr dicrVar = this.c;
        final boolean z = dicrVar.a.get();
        Log.d("SystemUiManager", String.format("ClientAppWindow#reinstateSystemUiVisibility(): wasSystemBarHidden = %b", Boolean.valueOf(z)));
        if (dicrVar.b.g()) {
            ((Activity) dicrVar.b.c()).runOnUiThread(new Runnable() { // from class: dick
                @Override // java.lang.Runnable
                public final void run() {
                    Window window = this.a.a;
                    int systemUiVisibility = window.getDecorView().getSystemUiVisibility();
                    boolean z2 = z;
                    int i = systemUiVisibility & (~dicr.f(z2));
                    Log.d("SystemUiManager", String.format("ClientAppWindow#reinstateSystemUiVisibility():visibility = %d, restoreSystemNavBar = %b", Integer.valueOf(i), Boolean.valueOf(z2)));
                    window.getDecorView().setSystemUiVisibility(i);
                }
            });
        }
    }

    public final void f(final int i) {
        Integer numValueOf = Integer.valueOf(i);
        dicr dicrVar = this.c;
        Log.d("SystemUiManager", String.format("ClientAppWindow#setSystemUiVisibility(%d): activityOptional.isPresent() = %b", numValueOf, Boolean.valueOf(dicrVar.b.g())));
        if (dicrVar.b.g()) {
            ((Activity) dicrVar.b.c()).runOnUiThread(new Runnable() { // from class: dicf
                @Override // java.lang.Runnable
                public final void run() {
                    Window window = this.a.a;
                    int i2 = i;
                    Log.d("SystemUiManager", String.format("ClientAppWindow#setSystemUiVisibility: window = %s, uiOptions = %d", window, Integer.valueOf(i2)));
                    window.getDecorView().setSystemUiVisibility(i2);
                }
            });
        }
    }

    public final void g() {
        Log.d("SystemUiManager", "ClientAppWindow#unregisterOnApplyWindowInsetsListener()");
        dicr dicrVar = this.c;
        if (dicrVar.b.g()) {
            ((Activity) dicrVar.b.c()).runOnUiThread(new Runnable() { // from class: dich
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.a.getDecorView().findViewById(R.id.content).setOnApplyWindowInsetsListener(null);
                }
            });
        }
    }

    public final void h() {
        Log.d("SystemUiManager", "ClientAppWindow#updateContentViewTopMargin()");
        dicr dicrVar = this.c;
        if (dicrVar.b.g() && this.b.g() && dicrVar.e.g()) {
            ((Activity) dicrVar.b.c()).runOnUiThread(new Runnable() { // from class: dicm
                @Override // java.lang.Runnable
                public final void run() {
                    dicq dicqVar = this.a;
                    ((ViewGroup.MarginLayoutParams) dicqVar.a.getDecorView().findViewById(R.id.content).getLayoutParams()).topMargin = ((Integer) dicqVar.b.c()).intValue() + ((Integer) dicqVar.c.e.c()).intValue();
                }
            });
        }
    }
}
