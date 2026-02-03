package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;
import com.google.android.libraries.onegoogle.tooltip.TooltipView;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dzef {
    public final ViewTreeObserver.OnPreDrawListener a;
    public final View b;
    public final View c;
    public ejwi d;
    public final dzdq e;

    public dzef(View view, dzdq dzdqVar) {
        this.c = view;
        View rootView = view.getRootView();
        this.b = rootView;
        this.d = a(view);
        this.e = dzdqVar;
        ViewTreeObserver.OnPreDrawListener onPreDrawListener = new ViewTreeObserver.OnPreDrawListener() { // from class: dzee
            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public final boolean onPreDraw() {
                dzef dzefVar = this.a;
                ejwi ejwiVarA = dzef.a(dzefVar.c);
                if (!ejwiVarA.g() || ejwiVarA.equals(dzefVar.d)) {
                    return true;
                }
                dzefVar.d = ejwiVarA;
                dzdq dzdqVar2 = dzefVar.e;
                Object objC = dzefVar.d.c();
                dzdt dzdtVar = dzdqVar2.a;
                TooltipView tooltipView = dzdtVar.d;
                if (tooltipView == null) {
                    return true;
                }
                tooltipView.b((Rect) objC);
                dzdtVar.d.requestLayout();
                return true;
            }
        };
        this.a = onPreDrawListener;
        ViewTreeObserver viewTreeObserver = rootView.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.addOnPreDrawListener(onPreDrawListener);
        }
    }

    public static ejwi a(View view) {
        View rootView = view.getRootView();
        Rect rect = new Rect(0, 0, view.getWidth(), view.getHeight());
        while (view != rootView) {
            View view2 = (View) view.getParent();
            if (view2 == null) {
                return ejud.a;
            }
            rect.offset(view.getLeft() - view2.getScrollX(), view.getTop() - view2.getScrollY());
            view = view2;
        }
        return ejwi.j(rect);
    }
}
