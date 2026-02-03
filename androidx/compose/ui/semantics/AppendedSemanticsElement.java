package androidx.compose.ui.semantics;

import defpackage.fdap;
import defpackage.icr;
import defpackage.jdy;
import defpackage.jrq;
import defpackage.jsc;
import defpackage.jsg;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class AppendedSemanticsElement extends jdy<jrq> implements jsg {
    private final boolean a;
    private final fdap b;

    public AppendedSemanticsElement(boolean z, fdap fdapVar) {
        this.a = z;
        this.b = fdapVar;
    }

    @Override // defpackage.jdy
    public final /* bridge */ /* synthetic */ icr d() {
        return new jrq(this.a, false, this.b);
    }

    @Override // defpackage.jdy
    public final /* bridge */ /* synthetic */ void e(icr icrVar) {
        jrq jrqVar = (jrq) icrVar;
        jrqVar.a = this.a;
        jrqVar.b = this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppendedSemanticsElement)) {
            return false;
        }
        AppendedSemanticsElement appendedSemanticsElement = (AppendedSemanticsElement) obj;
        return this.a == appendedSemanticsElement.a && this.b == appendedSemanticsElement.b;
    }

    @Override // defpackage.jsg
    public final jsc f() {
        jsc jscVar = new jsc();
        jscVar.b = this.a;
        this.b.invoke(jscVar);
        return jscVar;
    }

    public final int hashCode() {
        return ((true != this.a ? 1237 : 1231) * 31) + this.b.hashCode();
    }
}
