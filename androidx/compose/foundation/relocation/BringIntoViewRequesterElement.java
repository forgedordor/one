package androidx.compose.foundation.relocation;

import defpackage.eug;
import defpackage.euh;
import defpackage.fdbq;
import defpackage.icr;
import defpackage.jdy;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class BringIntoViewRequesterElement extends jdy<euh> {
    private final eug a;

    public BringIntoViewRequesterElement(eug eugVar) {
        this.a = eugVar;
    }

    @Override // defpackage.jdy
    public final /* bridge */ /* synthetic */ icr d() {
        return new euh(this.a);
    }

    @Override // defpackage.jdy
    public final /* bridge */ /* synthetic */ void e(icr icrVar) {
        ((euh) icrVar).a(this.a);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof BringIntoViewRequesterElement) && fdbq.f(this.a, ((BringIntoViewRequesterElement) obj).a);
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
