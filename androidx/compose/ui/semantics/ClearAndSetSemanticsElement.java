package androidx.compose.ui.semantics;

import defpackage.fdap;
import defpackage.icr;
import defpackage.jdy;
import defpackage.jrq;
import defpackage.jsc;
import defpackage.jsg;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ClearAndSetSemanticsElement extends jdy<jrq> implements jsg {
    private final fdap a;

    public ClearAndSetSemanticsElement(fdap fdapVar) {
        this.a = fdapVar;
    }

    @Override // defpackage.jdy
    public final /* bridge */ /* synthetic */ icr d() {
        return new jrq(false, true, this.a);
    }

    @Override // defpackage.jdy
    public final /* bridge */ /* synthetic */ void e(icr icrVar) {
        ((jrq) icrVar).b = this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ClearAndSetSemanticsElement) && this.a == ((ClearAndSetSemanticsElement) obj).a;
    }

    @Override // defpackage.jsg
    public final jsc f() {
        jsc jscVar = new jsc();
        jscVar.b = false;
        jscVar.c = true;
        this.a.invoke(jscVar);
        return jscVar;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
