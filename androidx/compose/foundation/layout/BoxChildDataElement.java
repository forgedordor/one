package androidx.compose.foundation.layout;

import defpackage.ecv;
import defpackage.fdbq;
import defpackage.iby;
import defpackage.icr;
import defpackage.jdy;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class BoxChildDataElement extends jdy<ecv> {
    private final iby a;
    private final boolean b;

    public BoxChildDataElement(iby ibyVar, boolean z) {
        this.a = ibyVar;
        this.b = z;
    }

    @Override // defpackage.jdy
    public final /* bridge */ /* synthetic */ icr d() {
        return new ecv(this.a, this.b);
    }

    @Override // defpackage.jdy
    public final /* bridge */ /* synthetic */ void e(icr icrVar) {
        ecv ecvVar = (ecv) icrVar;
        ecvVar.a = this.a;
        ecvVar.b = this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        BoxChildDataElement boxChildDataElement = obj instanceof BoxChildDataElement ? (BoxChildDataElement) obj : null;
        return boxChildDataElement != null && fdbq.f(this.a, boxChildDataElement.a) && this.b == boxChildDataElement.b;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + (true != this.b ? 1237 : 1231);
    }
}
