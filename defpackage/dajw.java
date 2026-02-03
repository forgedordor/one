package defpackage;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.widget.PopupWindow;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dajw {
    public final dajv a;

    public dajw(View view, int i, View view2, int i2) {
        view.getClass();
        view2.getClass();
        dajv dajvVar = new dajv(view2.getContext());
        dajvVar.setWillNotDraw(false);
        dajvVar.setLayerType(1, dajvVar.a);
        dajvVar.setOnClickListener(new View.OnClickListener() { // from class: daju
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                ((dajv) view3).c();
            }
        });
        this.a = dajvVar;
        dajvVar.e = view;
        dajvVar.b = new PopupWindow(dajvVar);
        dajvVar.addView(view);
        dajvVar.g = view2;
        dajvVar.d();
        dajvVar.f = i;
        dajvVar.h = i2;
    }

    public final void a() {
        this.a.c();
    }

    public final void b(int i) {
        this.a.a.setColor(i);
    }

    public final void c() {
        final dajv dajvVar = this.a;
        dajvVar.b.setClippingEnabled(true);
        dajvVar.b.setAnimationStyle(R.style.Animation.Dialog);
        dajvVar.b.setBackgroundDrawable(new ColorDrawable(0));
        dajvVar.b.setOutsideTouchable(dajvVar.c);
        dajvVar.b.setFocusable(dajvVar.d);
        dajvVar.g.post(new Runnable() { // from class: dajt
            @Override // java.lang.Runnable
            public final void run() {
                dajv dajvVar2 = dajvVar;
                View view = dajvVar2.g;
                Activity activity = null;
                if (view != null) {
                    Context context = view.getContext();
                    while (true) {
                        if (!(context instanceof Activity)) {
                            if (!(context instanceof ContextWrapper)) {
                                break;
                            } else {
                                context = ((ContextWrapper) context).getBaseContext();
                            }
                        } else {
                            activity = (Activity) context;
                            break;
                        }
                    }
                }
                if (activity == null || activity.isFinishing()) {
                    return;
                }
                dajvVar2.d();
                dajvVar2.f();
                dajvVar2.b.showAtLocation(dajvVar2.g, 0, dajvVar2.a(), dajvVar2.b());
            }
        });
    }

    public final boolean d() {
        PopupWindow popupWindow = this.a.b;
        return popupWindow != null && popupWindow.isShowing();
    }
}
