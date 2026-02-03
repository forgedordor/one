package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cynr implements efzm {
    final /* synthetic */ cyns a;

    public cynr(cyns cynsVar) {
        this.a = cynsVar;
    }

    @Override // defpackage.efzm
    public final void a(efzk efzkVar) {
        if (abxb.b()) {
            cyns cynsVar = this.a;
            cynsVar.o = Optional.of(efzkVar.a());
            cynsVar.b(cynsVar.o);
        }
    }

    @Override // defpackage.efzm
    public final void c(efyg efygVar) {
        if (abxb.b()) {
            cyns cynsVar = this.a;
            cynsVar.o = Optional.empty();
            ((abxv) cynsVar.m.b()).a(efygVar);
        }
    }

    @Override // defpackage.efzm
    public final /* synthetic */ void b() {
    }

    @Override // defpackage.efzm
    public final /* synthetic */ void d() {
    }
}
