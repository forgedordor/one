package defpackage;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewTreeObserver;
import com.google.android.apps.messaging.R;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class rts implements rua {
    protected final View a;
    private final rtr b;

    public rts(View view) {
        rvi.f(view);
        this.a = view;
        this.b = new rtr(view);
    }

    protected abstract void c();

    @Override // defpackage.rua
    public final void d(rtz rtzVar) {
        rtr rtrVar = this.b;
        int iB = rtrVar.b();
        int iA = rtrVar.a();
        if (rtr.d(iB, iA)) {
            rtzVar.g(iB, iA);
            return;
        }
        List list = rtrVar.c;
        if (!list.contains(rtzVar)) {
            list.add(rtzVar);
        }
        if (rtrVar.d == null) {
            ViewTreeObserver viewTreeObserver = rtrVar.b.getViewTreeObserver();
            rtrVar.d = new rtq(rtrVar);
            viewTreeObserver.addOnPreDrawListener(rtrVar.d);
        }
    }

    @Override // defpackage.rua
    public final void e(Drawable drawable) {
        this.b.c();
        c();
    }

    @Override // defpackage.rua
    public final rte eW() {
        Object tag = this.a.getTag(R.id.glide_custom_view_target_tag);
        if (tag == null) {
            return null;
        }
        if (tag instanceof rte) {
            return (rte) tag;
        }
        throw new IllegalArgumentException("You must not pass non-R.id ids to setTag(id)");
    }

    @Override // defpackage.rua
    public final void g(rtz rtzVar) {
        this.b.c.remove(rtzVar);
    }

    @Override // defpackage.rua
    public final void h(rte rteVar) {
        this.a.setTag(R.id.glide_custom_view_target_tag, rteVar);
    }

    public final String toString() {
        return "Target for: ".concat(this.a.toString());
    }

    @Override // defpackage.rrx
    public final void m() {
    }

    @Override // defpackage.rrx
    public final void n() {
    }

    @Override // defpackage.rrx
    public final void o() {
    }

    @Override // defpackage.rua
    public final void f(Drawable drawable) {
    }
}
