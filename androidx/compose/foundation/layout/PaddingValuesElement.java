package androidx.compose.foundation.layout;

import defpackage.egc;
import defpackage.egf;
import defpackage.fdbq;
import defpackage.icr;
import defpackage.jdy;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class PaddingValuesElement extends jdy<egf> {
    private final egc a;

    public PaddingValuesElement(egc egcVar) {
        this.a = egcVar;
    }

    @Override // defpackage.jdy
    public final /* bridge */ /* synthetic */ icr d() {
        return new egf(this.a);
    }

    @Override // defpackage.jdy
    public final /* bridge */ /* synthetic */ void e(icr icrVar) {
        ((egf) icrVar).a = this.a;
    }

    public final boolean equals(Object obj) {
        PaddingValuesElement paddingValuesElement = obj instanceof PaddingValuesElement ? (PaddingValuesElement) obj : null;
        if (paddingValuesElement == null) {
            return false;
        }
        return fdbq.f(this.a, paddingValuesElement.a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
