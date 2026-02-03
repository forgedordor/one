package defpackage;

import android.content.Context;
import android.view.OrientationEventListener;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class czgb extends OrientationEventListener {
    final /* synthetic */ czgf a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public czgb(czgf czgfVar, Context context) {
        super(context);
        this.a = czgfVar;
    }

    @Override // android.view.OrientationEventListener
    public final void onOrientationChanged(int i) {
        if (i == -1) {
            return;
        }
        this.a.h(i);
    }
}
