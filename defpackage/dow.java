package defpackage;

import android.widget.Magnifier;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dow extends dou {
    public dow(Magnifier magnifier) {
        super(magnifier);
    }

    @Override // defpackage.dou
    public final void c(long j, float f) {
        if (!Float.isNaN(f)) {
            this.a.setZoom(f);
        }
        this.a.show(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (4294967295L & j)));
    }
}
