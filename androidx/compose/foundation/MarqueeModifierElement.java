package androidx.compose.foundation;

import androidx.car.app.model.Alert;
import defpackage.dns;
import defpackage.dob;
import defpackage.doc;
import defpackage.fdbq;
import defpackage.icr;
import defpackage.jdy;
import defpackage.kir;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class MarqueeModifierElement extends jdy<dob> {
    private final int d;
    private final doc g;
    private final int a = Alert.DURATION_SHOW_INDEFINITELY;
    private final int b = 0;
    private final int c = 1200;
    private final float f = 30.0f;

    public MarqueeModifierElement(int i, doc docVar) {
        this.d = i;
        this.g = docVar;
    }

    @Override // defpackage.jdy
    public final /* bridge */ /* synthetic */ icr d() {
        return new dob(this.d, this.g);
    }

    @Override // defpackage.jdy
    public final /* bridge */ /* synthetic */ void e(icr icrVar) {
        dob dobVar = (dob) icrVar;
        dobVar.f.b(this.g);
        dobVar.g.b(new dns());
        int i = dobVar.a;
        int i2 = this.d;
        if (i == Integer.MAX_VALUE && dobVar.b == 1200 && dobVar.c == i2 && kir.b(dobVar.d, 30.0f)) {
            return;
        }
        dobVar.a = Alert.DURATION_SHOW_INDEFINITELY;
        dobVar.b = 1200;
        dobVar.c = i2;
        dobVar.d = 30.0f;
        dobVar.l();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarqueeModifierElement)) {
            return false;
        }
        MarqueeModifierElement marqueeModifierElement = (MarqueeModifierElement) obj;
        int i = marqueeModifierElement.a;
        int i2 = marqueeModifierElement.b;
        if (!dns.a(0)) {
            return false;
        }
        int i3 = marqueeModifierElement.c;
        if (this.d != marqueeModifierElement.d || !fdbq.f(this.g, marqueeModifierElement.g)) {
            return false;
        }
        float f = marqueeModifierElement.f;
        return kir.b(30.0f, 30.0f);
    }

    public final int hashCode() {
        return ((((this.d - 2147476239) * 31) + hashCode()) * 31) + Float.floatToIntBits(30.0f);
    }

    public final String toString() {
        return "MarqueeModifierElement(iterations=2147483647, animationMode=" + ((Object) dns.b()) + ", delayMillis=1200, initialDelayMillis=" + this.d + ", spacing=" + this.g + ", velocity=" + ((Object) kir.a(30.0f)) + ')';
    }
}
