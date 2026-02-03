package defpackage;

import android.view.View;
import android.widget.Magnifier;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dov implements dot {
    public static final dov a = new dov();

    private dov() {
    }

    @Override // defpackage.dot
    public final boolean a() {
        return false;
    }

    @Override // defpackage.dot
    public final /* bridge */ /* synthetic */ dou b(View view, boolean z, long j, float f, float f2, boolean z2, kio kioVar, float f3) {
        return new dou(new Magnifier(view));
    }
}
