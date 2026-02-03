package defpackage;

import android.view.View;
import com.google.android.material.appbar.AppBarLayout;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aidu extends fdcy {
    final /* synthetic */ aidv a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aidu(Object obj, aidv aidvVar) {
        super(obj);
        this.a = aidvVar;
    }

    @Override // defpackage.fdcy
    protected final void a(fdeh fdehVar, Object obj, Object obj2) {
        AppBarLayout appBarLayout;
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        if (zBooleanValue && (appBarLayout = this.a.d) != null) {
            appBarLayout.n(false, false);
        }
        int i = true != zBooleanValue ? 8 : 0;
        aidv aidvVar = this.a;
        Iterator itA = new lfd(aidvVar.b).a();
        while (itA.hasNext()) {
            View view = (View) itA.next();
            if (!fdbq.f(view, aidvVar.f)) {
                view.setVisibility(i);
            }
        }
    }

    @Override // defpackage.fdcy
    protected final boolean b(Object obj, Object obj2) {
        return !fdbq.f(obj, obj2);
    }
}
