package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class czq extends fdbr implements fdap {
    final /* synthetic */ boolean a;
    final /* synthetic */ fdae b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public czq(boolean z, fdae fdaeVar) {
        super(1);
        this.a = z;
        this.b = fdaeVar;
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        ikl iklVar = (ikl) obj;
        boolean z = false;
        if (!this.a && ((Boolean) this.b.invoke()).booleanValue()) {
            z = true;
        }
        iklVar.r(z);
        return fctx.a;
    }
}
