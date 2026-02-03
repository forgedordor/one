package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class xwl implements fdae {
    final /* synthetic */ fduf a;
    final /* synthetic */ fdae b;

    public xwl(fduf fdufVar, fdae fdaeVar) {
        this.a = fdufVar;
        this.b = fdaeVar;
    }

    @Override // defpackage.fdae
    public final /* bridge */ /* synthetic */ Object invoke() {
        fduf fdufVar = this.a;
        if (((Boolean) fdufVar.c()).booleanValue()) {
            fdufVar.f(false);
        } else {
            this.b.invoke();
        }
        return fctx.a;
    }
}
