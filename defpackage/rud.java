package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;
import com.google.android.apps.messaging.R;
import java.util.List;

/* compiled from: PG */
@Deprecated
/* loaded from: classes.dex */
public abstract class rud extends rtn {
    protected final View a;
    public final ruc b;

    public rud(View view) {
        rvi.f(view);
        this.a = view;
        this.b = new ruc(view);
    }

    @Override // defpackage.rua
    public final void d(rtz rtzVar) {
        ruc rucVar = this.b;
        int iB = rucVar.b();
        int iA = rucVar.a();
        if (ruc.d(iB, iA)) {
            rtzVar.g(iB, iA);
            return;
        }
        List list = rucVar.c;
        if (!list.contains(rtzVar)) {
            list.add(rtzVar);
        }
        if (rucVar.e == null) {
            ViewTreeObserver viewTreeObserver = rucVar.b.getViewTreeObserver();
            rucVar.e = new rub(rucVar);
            viewTreeObserver.addOnPreDrawListener(rucVar.e);
        }
    }

    @Override // defpackage.rtn, defpackage.rua
    public final rte eW() {
        Object tag = this.a.getTag(R.id.glide_custom_view_target_tag);
        if (tag == null) {
            return null;
        }
        if (tag instanceof rte) {
            return (rte) tag;
        }
        throw new IllegalArgumentException("You must not call setTag() on a view Glide is targeting");
    }

    @Override // defpackage.rua
    public final void g(rtz rtzVar) {
        this.b.c.remove(rtzVar);
    }

    @Override // defpackage.rtn, defpackage.rua
    public final void h(rte rteVar) {
        this.a.setTag(R.id.glide_custom_view_target_tag, rteVar);
    }

    public final void l() {
        this.b.d = true;
    }

    public final String toString() {
        return "Target for: ".concat(this.a.toString());
    }
}
