package defpackage;

import android.view.View;
import android.view.ViewParent;
import com.google.android.apps.messaging.R;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jon implements View.OnAttachStateChangeListener {
    final /* synthetic */ jgl a;

    public jon(jgl jglVar) {
        this.a = jglVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        jgl jglVar = this.a;
        Iterator itA = lfj.a(jglVar).a();
        while (itA.hasNext()) {
            Object obj = (ViewParent) itA.next();
            if (obj instanceof View) {
                View view2 = (View) obj;
                view2.getClass();
                Object tag = view2.getTag(R.id.is_pooling_container_tag);
                Boolean bool = tag instanceof Boolean ? (Boolean) tag : null;
                if (bool != null && bool.booleanValue()) {
                    return;
                }
            }
        }
        jglVar.f();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
