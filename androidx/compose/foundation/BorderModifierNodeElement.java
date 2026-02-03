package androidx.compose.foundation;

import defpackage.dkx;
import defpackage.fdbq;
import defpackage.icr;
import defpackage.iiy;
import defpackage.ikp;
import defpackage.jdy;
import defpackage.kir;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class BorderModifierNodeElement extends jdy<dkx> {
    private final float a;
    private final iiy b;
    private final ikp c;

    public BorderModifierNodeElement(float f, iiy iiyVar, ikp ikpVar) {
        this.a = f;
        this.b = iiyVar;
        this.c = ikpVar;
    }

    @Override // defpackage.jdy
    public final /* bridge */ /* synthetic */ icr d() {
        return new dkx(this.a, this.b, this.c);
    }

    @Override // defpackage.jdy
    public final /* bridge */ /* synthetic */ void e(icr icrVar) {
        dkx dkxVar = (dkx) icrVar;
        float f = dkxVar.b;
        float f2 = this.a;
        if (!kir.b(f, f2)) {
            dkxVar.b = f2;
            dkxVar.e.a();
        }
        iiy iiyVar = this.b;
        if (!fdbq.f(dkxVar.c, iiyVar)) {
            dkxVar.c = iiyVar;
            dkxVar.e.a();
        }
        ikp ikpVar = this.c;
        if (fdbq.f(dkxVar.d, ikpVar)) {
            return;
        }
        dkxVar.d = ikpVar;
        dkxVar.e.a();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BorderModifierNodeElement)) {
            return false;
        }
        BorderModifierNodeElement borderModifierNodeElement = (BorderModifierNodeElement) obj;
        return kir.b(this.a, borderModifierNodeElement.a) && fdbq.f(this.b, borderModifierNodeElement.b) && fdbq.f(this.c, borderModifierNodeElement.c);
    }

    public final int hashCode() {
        return (((Float.floatToIntBits(this.a) * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "BorderModifierNodeElement(width=" + ((Object) kir.a(this.a)) + ", brush=" + this.b + ", shape=" + this.c + ')';
    }
}
