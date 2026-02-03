package defpackage;

import android.view.View;
import java.lang.ref.WeakReference;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dpjb extends fdcy {
    final /* synthetic */ dpjc a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dpjb(Object obj, dpjc dpjcVar) {
        super(obj);
        this.a = dpjcVar;
    }

    @Override // defpackage.fdcy
    protected final void a(fdeh fdehVar, Object obj, Object obj2) {
        dpjc dpjcVar;
        WeakReference weakReference;
        View view;
        dpjd dpjdVar = (dpjd) obj2;
        if (dpjdVar == dpjd.d && (weakReference = (dpjcVar = this.a).e) != null && (view = (View) weakReference.get()) != null) {
            if (view.hasFocus()) {
                view.clearFocus();
            }
            dpjcVar.e = null;
        }
        Iterator it = this.a.g.iterator();
        while (it.hasNext()) {
            ((dpje) it.next()).b(dpjdVar);
        }
    }

    @Override // defpackage.fdcy
    protected final boolean b(Object obj, Object obj2) {
        return !fdbq.f(obj, obj2);
    }
}
