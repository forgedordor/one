package androidx.compose.foundation.layout;

import defpackage.efw;
import defpackage.fdap;
import defpackage.icr;
import defpackage.jci;
import defpackage.jdy;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class OffsetPxElement extends jdy<efw> {
    private final fdap a;
    private final boolean b;

    public OffsetPxElement(fdap fdapVar, boolean z) {
        this.a = fdapVar;
        this.b = z;
    }

    @Override // defpackage.jdy
    public final /* bridge */ /* synthetic */ icr d() {
        return new efw(this.a, this.b);
    }

    @Override // defpackage.jdy
    public final /* bridge */ /* synthetic */ void e(icr icrVar) {
        efw efwVar = (efw) icrVar;
        fdap fdapVar = efwVar.a;
        boolean z = this.b;
        fdap fdapVar2 = this.a;
        if (fdapVar != fdapVar2 || efwVar.b != z) {
            jci.c(efwVar);
        }
        efwVar.a = fdapVar2;
        efwVar.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        OffsetPxElement offsetPxElement = obj instanceof OffsetPxElement ? (OffsetPxElement) obj : null;
        return offsetPxElement != null && this.a == offsetPxElement.a && this.b == offsetPxElement.b;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + (true != this.b ? 1237 : 1231);
    }

    public final String toString() {
        return "OffsetPxModifier(offset=" + this.a + ", rtlAware=" + this.b + ')';
    }
}
