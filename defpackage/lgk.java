package defpackage;

import android.view.DisplayCutout;
import android.view.WindowInsets;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
class lgk extends lgj {
    public lgk(lgt lgtVar, WindowInsets windowInsets) {
        super(lgtVar, windowInsets);
    }

    @Override // defpackage.lgi, defpackage.lgp
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lgk)) {
            return false;
        }
        lgk lgkVar = (lgk) obj;
        return Objects.equals(this.a, lgkVar.a) && Objects.equals(this.b, lgkVar.b) && o(this.c, lgkVar.c);
    }

    @Override // defpackage.lgp
    public int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.lgp
    public lcz u() {
        DisplayCutout displayCutout = this.a.getDisplayCutout();
        if (displayCutout == null) {
            return null;
        }
        return new lcz(displayCutout);
    }

    @Override // defpackage.lgp
    public lgt v() {
        return lgt.o(this.a.consumeDisplayCutout());
    }

    public lgk(lgt lgtVar, lgk lgkVar) {
        super(lgtVar, lgkVar);
    }
}
