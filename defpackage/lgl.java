package defpackage;

import android.view.WindowInsets;

/* compiled from: PG */
/* loaded from: classes.dex */
class lgl extends lgk {
    private kzc d;
    private kzc e;
    private kzc h;

    public lgl(lgt lgtVar, WindowInsets windowInsets) {
        super(lgtVar, windowInsets);
        this.d = null;
        this.e = null;
        this.h = null;
    }

    @Override // defpackage.lgi, defpackage.lgp
    public lgt e(int i, int i2, int i3, int i4) {
        return lgt.o(this.a.inset(i, i2, i3, i4));
    }

    @Override // defpackage.lgp
    public kzc w() {
        if (this.e == null) {
            this.e = kzc.e(this.a.getMandatorySystemGestureInsets());
        }
        return this.e;
    }

    @Override // defpackage.lgp
    public kzc x() {
        if (this.d == null) {
            this.d = kzc.e(this.a.getSystemGestureInsets());
        }
        return this.d;
    }

    @Override // defpackage.lgp
    public kzc y() {
        if (this.h == null) {
            this.h = kzc.e(this.a.getTappableElementInsets());
        }
        return this.h;
    }

    public lgl(lgt lgtVar, lgl lglVar) {
        super(lgtVar, lglVar);
        this.d = null;
        this.e = null;
        this.h = null;
    }

    @Override // defpackage.lgj, defpackage.lgp
    public void s(kzc kzcVar) {
    }
}
