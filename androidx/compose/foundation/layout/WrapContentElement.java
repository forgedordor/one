package androidx.compose.foundation.layout;

import defpackage.eib;
import defpackage.fdat;
import defpackage.fdbq;
import defpackage.icr;
import defpackage.jdy;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class WrapContentElement extends jdy<eib> {
    private final fdat a;
    private final Object b;
    private final int c;

    public WrapContentElement(int i, fdat fdatVar, Object obj) {
        this.c = i;
        this.a = fdatVar;
        this.b = obj;
    }

    @Override // defpackage.jdy
    public final /* bridge */ /* synthetic */ icr d() {
        return new eib(this.c, this.a);
    }

    @Override // defpackage.jdy
    public final /* bridge */ /* synthetic */ void e(icr icrVar) {
        eib eibVar = (eib) icrVar;
        eibVar.b = this.c;
        eibVar.a = this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        WrapContentElement wrapContentElement = (WrapContentElement) obj;
        return this.c == wrapContentElement.c && fdbq.f(this.b, wrapContentElement.b);
    }

    public final int hashCode() {
        return (((this.c * 31) + 1237) * 31) + this.b.hashCode();
    }
}
