package defpackage;

import android.content.Context;
import android.view.OrientationEventListener;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dmsp extends OrientationEventListener {
    final /* synthetic */ dmsq a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dmsp(dmsq dmsqVar, Context context) {
        super(context, 3);
        this.a = dmsqVar;
    }

    @Override // android.view.OrientationEventListener
    public final void onOrientationChanged(int i) {
        if (i == -1) {
            return;
        }
        fduf fdufVar = this.a.a;
        int i2 = (i - ((dmso) fdufVar.c()).e) % 360;
        int i3 = i2 + (((((-i2) | i2) & (i2 ^ 360)) >> 31) & 360);
        if (Math.min(i3, 360 - i3) >= 70) {
            fdufVar.f((i < 45 || i >= 136) ? (i < 135 || i >= 226) ? (i < 225 || i >= 316) ? dmso.a : dmso.d : dmso.c : dmso.b);
        }
    }
}
