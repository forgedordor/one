package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eiqa extends eiqk {
    private Optional a = Optional.empty();

    @Override // defpackage.eiqk, defpackage.eiqy
    public final /* bridge */ /* synthetic */ Object a() {
        return new eiqb(this.a);
    }

    @Override // defpackage.eiqk
    public final void b(eixz eixzVar) {
        this.a = Optional.of(eixzVar);
    }
}
