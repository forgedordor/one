package defpackage;

import android.view.View;
import android.widget.Magnifier;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dox implements dot {
    public static final dox a = new dox();

    private dox() {
    }

    @Override // defpackage.dot
    public final boolean a() {
        return true;
    }

    @Override // defpackage.dot
    public final /* bridge */ /* synthetic */ dou b(View view, boolean z, long j, float f, float f2, boolean z2, kio kioVar, float f3) {
        if (z) {
            return new dow(new Magnifier(view));
        }
        long jEr = kioVar.er(j);
        float fEn = kioVar.en(f);
        float fEn2 = kioVar.en(f2);
        Magnifier.Builder builder = new Magnifier.Builder(view);
        if (jEr != 9205357640488583168L) {
            builder.setSize(fdcu.b(Float.intBitsToFloat((int) (jEr >> 32))), fdcu.b(Float.intBitsToFloat((int) (jEr & 4294967295L))));
        }
        if (!Float.isNaN(fEn)) {
            builder.setCornerRadius(fEn);
        }
        if (!Float.isNaN(fEn2)) {
            builder.setElevation(fEn2);
        }
        if (!Float.isNaN(f3)) {
            builder.setInitialZoom(f3);
        }
        builder.setClippingEnabled(z2);
        return new dow(builder.build());
    }
}
