package defpackage;

import android.content.res.ColorStateList;
import android.view.View;
import android.view.Window;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eeez extends eeep {
    private final Boolean a;
    private final lgt b;
    private Window c;
    private boolean d;

    public eeez(View view, lgt lgtVar) {
        this.b = lgtVar;
        eesc eescVar = BottomSheetBehavior.v(view).e;
        ColorStateList colorStateListD = eescVar != null ? eescVar.D() : view.getBackgroundTintList();
        if (colorStateListD != null) {
            this.a = Boolean.valueOf(eehg.i(colorStateListD.getDefaultColor()));
            return;
        }
        Integer numG = eemo.g(view);
        if (numG != null) {
            this.a = Boolean.valueOf(eehg.i(numG.intValue()));
        } else {
            this.a = null;
        }
    }

    private final void e(View view) {
        lgt lgtVar = this.b;
        if (view.getTop() < lgtVar.d()) {
            Window window = this.c;
            if (window != null) {
                Boolean bool = this.a;
                eele.a(window, bool == null ? this.d : bool.booleanValue());
            }
            view.setPadding(view.getPaddingLeft(), lgtVar.d() - view.getTop(), view.getPaddingRight(), view.getPaddingBottom());
            return;
        }
        if (view.getTop() != 0) {
            Window window2 = this.c;
            if (window2 != null) {
                eele.a(window2, this.d);
            }
            view.setPadding(view.getPaddingLeft(), 0, view.getPaddingRight(), view.getPaddingBottom());
        }
    }

    @Override // defpackage.eeep
    public final void a(View view) {
        e(view);
    }

    @Override // defpackage.eeep
    public final void b(View view, int i) {
        e(view);
    }

    @Override // defpackage.eeep
    public final void c(View view) {
        e(view);
    }

    final void d(Window window) {
        if (this.c == window) {
            return;
        }
        this.c = window;
        if (window != null) {
            this.d = new lhb(window, window.getDecorView()).d();
        }
    }
}
