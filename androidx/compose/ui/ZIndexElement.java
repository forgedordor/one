package androidx.compose.ui;

import defpackage.icr;
import defpackage.idd;
import defpackage.jdy;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ZIndexElement extends jdy<idd> {
    private final float a;

    public ZIndexElement(float f) {
        this.a = f;
    }

    @Override // defpackage.jdy
    public final /* bridge */ /* synthetic */ icr d() {
        return new idd(this.a);
    }

    @Override // defpackage.jdy
    public final /* bridge */ /* synthetic */ void e(icr icrVar) {
        ((idd) icrVar).a = this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ZIndexElement) && Float.compare(this.a, ((ZIndexElement) obj).a) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.a);
    }

    public final String toString() {
        return "ZIndexElement(zIndex=" + this.a + ')';
    }
}
