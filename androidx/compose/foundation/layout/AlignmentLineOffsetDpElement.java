package androidx.compose.foundation.layout;

import defpackage.ebx;
import defpackage.eic;
import defpackage.fdbq;
import defpackage.icr;
import defpackage.itz;
import defpackage.jdy;
import defpackage.kir;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class AlignmentLineOffsetDpElement extends jdy<ebx> {
    private final itz a;
    private final float b;
    private final float c;

    public AlignmentLineOffsetDpElement(itz itzVar, float f, float f2) {
        this.a = itzVar;
        this.b = f;
        this.c = f2;
        if (!(f >= 0.0f || Float.isNaN(f)) || !(f2 >= 0.0f || Float.isNaN(f2))) {
            eic.a("Padding from alignment line must be a non-negative number");
        }
    }

    @Override // defpackage.jdy
    public final /* bridge */ /* synthetic */ icr d() {
        return new ebx(this.a, this.b, this.c);
    }

    @Override // defpackage.jdy
    public final /* bridge */ /* synthetic */ void e(icr icrVar) {
        ebx ebxVar = (ebx) icrVar;
        ebxVar.a = this.a;
        ebxVar.b = this.b;
        ebxVar.c = this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        AlignmentLineOffsetDpElement alignmentLineOffsetDpElement = obj instanceof AlignmentLineOffsetDpElement ? (AlignmentLineOffsetDpElement) obj : null;
        return alignmentLineOffsetDpElement != null && fdbq.f(this.a, alignmentLineOffsetDpElement.a) && kir.b(this.b, alignmentLineOffsetDpElement.b) && kir.b(this.c, alignmentLineOffsetDpElement.c);
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + Float.floatToIntBits(this.b)) * 31) + Float.floatToIntBits(this.c);
    }
}
