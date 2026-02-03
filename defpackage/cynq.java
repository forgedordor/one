package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cynq extends abs {
    final /* synthetic */ cyns a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cynq(cyns cynsVar) {
        super(true);
        this.a = cynsVar;
    }

    @Override // defpackage.abs
    public final void b() {
        cyns cynsVar = this.a;
        if (cynsVar.b != 2) {
            cynsVar.d.h(false);
            cynsVar.e.c().d();
        } else if (abxb.b() && cynsVar.o.isPresent()) {
            cynsVar.c(cynsVar.o);
        } else {
            cynsVar.c(Optional.empty());
        }
    }
}
