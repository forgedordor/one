package androidx.compose.ui.draw;

import defpackage.fdbq;
import defpackage.iby;
import defpackage.icr;
import defpackage.ifh;
import defpackage.ihz;
import defpackage.ijf;
import defpackage.inz;
import defpackage.iva;
import defpackage.jbq;
import defpackage.jci;
import defpackage.jdy;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class PainterElement extends jdy<ifh> {
    private final inz a;
    private final boolean b;
    private final iby c;
    private final iva d;
    private final float f;
    private final ijf g;

    public PainterElement(inz inzVar, boolean z, iby ibyVar, iva ivaVar, float f, ijf ijfVar) {
        this.a = inzVar;
        this.b = z;
        this.c = ibyVar;
        this.d = ivaVar;
        this.f = f;
        this.g = ijfVar;
    }

    @Override // defpackage.jdy
    public final /* bridge */ /* synthetic */ icr d() {
        return new ifh(this.a, this.b, this.c, this.d, this.f, this.g);
    }

    @Override // defpackage.jdy
    public final /* bridge */ /* synthetic */ void e(icr icrVar) {
        ifh ifhVar = (ifh) icrVar;
        boolean z = ifhVar.b;
        boolean z2 = this.b;
        boolean z3 = true;
        if (z == z2 && (!z2 || ihz.f(ifhVar.a.a(), this.a.a()))) {
            z3 = false;
        }
        ifhVar.a = this.a;
        ifhVar.b = z2;
        ifhVar.c = this.c;
        ifhVar.d = this.d;
        ifhVar.e = this.f;
        ifhVar.f = this.g;
        if (z3) {
            jci.b(ifhVar);
        }
        jbq.a(ifhVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PainterElement)) {
            return false;
        }
        PainterElement painterElement = (PainterElement) obj;
        return fdbq.f(this.a, painterElement.a) && this.b == painterElement.b && fdbq.f(this.c, painterElement.c) && fdbq.f(this.d, painterElement.d) && Float.compare(this.f, painterElement.f) == 0 && fdbq.f(this.g, painterElement.g);
    }

    public final int hashCode() {
        int iHashCode = (((((((this.a.hashCode() * 31) + (true != this.b ? 1237 : 1231)) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + Float.floatToIntBits(this.f);
        ijf ijfVar = this.g;
        return (iHashCode * 31) + (ijfVar == null ? 0 : ijfVar.hashCode());
    }

    public final String toString() {
        return "PainterElement(painter=" + this.a + ", sizeToIntrinsics=" + this.b + ", alignment=" + this.c + ", contentScale=" + this.d + ", alpha=" + this.f + ", colorFilter=" + this.g + ')';
    }
}
