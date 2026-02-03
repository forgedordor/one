package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dswa implements dswz {
    final /* synthetic */ boolean a;

    public dswa(boolean z) {
        this.a = z;
    }

    @Override // defpackage.dswz
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void b(dsvd dsvdVar) {
        dsxa dsxaVar = dsvdVar.f;
        dsxaVar.n(this);
        boolean z = false;
        if (this.a && dsxaVar.o()) {
            z = true;
        }
        if (z) {
            dsxaVar.i();
        }
        dsvdVar.g();
        if (z) {
            dsxaVar.h();
        }
    }
}
