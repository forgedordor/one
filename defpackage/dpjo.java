package defpackage;

import android.R;
import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dpjo implements dpji {
    public static final ekrg a = ekrg.c("com/google/android/libraries/compose/ui/keyboard/detector/KeyboardDetectorPopupWindowStrategy");
    private final fctc b;
    private final fctc c;
    private final fctc d;
    private final fctc e;
    private boolean f;

    public dpjo(final Activity activity, final dpks dpksVar) {
        activity.getClass();
        this.b = fctd.a(new fdae() { // from class: dpjj
            @Override // defpackage.fdae
            public final Object invoke() {
                PopupWindow popupWindow = new PopupWindow(new View(activity), 0, -1);
                popupWindow.setSoftInputMode(16);
                popupWindow.setInputMethodMode(1);
                return popupWindow;
            }
        });
        this.c = fctd.a(new fdae() { // from class: dpjk
            @Override // defpackage.fdae
            public final Object invoke() {
                View contentView = this.c().getContentView();
                dpks dpksVar2 = dpksVar;
                Activity activity2 = (Activity) dpksVar2.a.b();
                activity2.getClass();
                dngc dngcVar = (dngc) dpksVar2.b.b();
                dngcVar.getClass();
                contentView.getClass();
                return new dpkr(activity2, dngcVar, contentView);
            }
        });
        this.d = fctd.a(new fdae() { // from class: dpjl
            @Override // defpackage.fdae
            public final Object invoke() {
                return (ViewGroup) activity.findViewById(R.id.content);
            }
        });
        this.e = fctd.a(new fdae() { // from class: dpjm
            @Override // defpackage.fdae
            public final Object invoke() {
                View view = new View(activity);
                view.setTag("KEYBOARD_DETECTION");
                view.setLayoutParams(new ViewGroup.LayoutParams(0, 0));
                return view;
            }
        });
    }

    private final View d() {
        return (View) this.e.a();
    }

    private final ViewGroup e() {
        return (ViewGroup) this.d.a();
    }

    private final dpkr f() {
        return (dpkr) this.c.a();
    }

    @Override // defpackage.dpji
    public final void a(dpje dpjeVar) {
        if (this.f) {
            throw new IllegalStateException("Detector was already attached");
        }
        f().h = dpjeVar;
        c().getContentView().getViewTreeObserver().addOnGlobalLayoutListener(f());
        ViewGroup viewGroupE = e();
        if (viewGroupE.isAttachedToWindow()) {
            ((ekrd) a.h().h("com/google/android/libraries/compose/ui/keyboard/detector/KeyboardDetectorPopupWindowStrategy", "attachPopupWindow", 64, "KeyboardDetectorPopupWindowStrategy.kt")).q("Starting keyboard detection");
            c().showAtLocation(viewGroupE.getRootView(), 0, 0, 0);
        } else {
            viewGroupE.addOnAttachStateChangeListener(new dpjn(viewGroupE, this));
        }
        d().setOnApplyWindowInsetsListener(f());
        e().addView(d());
        this.f = true;
    }

    @Override // defpackage.dpji
    public final void b() {
        if (!this.f) {
            throw new IllegalStateException("Detector wasn't attached");
        }
        d().getViewTreeObserver().removeOnGlobalLayoutListener(f());
        e().removeView(d());
        c().getContentView().getViewTreeObserver().removeOnGlobalLayoutListener(f());
        if (c().isShowing()) {
            c().dismiss();
        }
        this.f = false;
    }

    public final PopupWindow c() {
        return (PopupWindow) this.b.a();
    }
}
