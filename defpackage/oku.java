package defpackage;

import android.view.View;
import com.google.android.apps.messaging.R;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class oku {
    public static final void a(View view, ojc ojcVar) {
        view.setTag(R.id.nav_controller_view_tag, ojcVar);
    }

    public static final ojc b(View view) {
        return (ojc) fdey.f(fdey.k(fdey.e(view, new fdap() { // from class: oks
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                View view2 = (View) obj;
                view2.getClass();
                Object parent = view2.getParent();
                if (parent instanceof View) {
                    return (View) parent;
                }
                return null;
            }
        }), new fdap() { // from class: okt
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                View view2 = (View) obj;
                view2.getClass();
                Object tag = view2.getTag(R.id.nav_controller_view_tag);
                if (tag instanceof WeakReference) {
                    return (ojc) ((WeakReference) tag).get();
                }
                if (tag instanceof ojc) {
                    return (ojc) tag;
                }
                return null;
            }
        }));
    }
}
