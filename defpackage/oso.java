package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final /* synthetic */ class oso implements fdpm, fdbl {
    final /* synthetic */ owr a;

    public oso(owr owrVar) {
        this.a = owrVar;
    }

    @Override // defpackage.fdbl
    public final fcsy b() {
        return new fdbo(2, this.a, owr.class, "send", "send(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof fdpm) && (obj instanceof fdbl)) {
            return fdbq.f(b(), ((fdbl) obj).b());
        }
        return false;
    }

    @Override // defpackage.fdpm
    public final /* bridge */ /* synthetic */ Object fO(Object obj, fcxy fcxyVar) {
        Object objA = this.a.a((oux) obj, fcxyVar);
        return objA == fcyl.a ? objA : fctx.a;
    }

    public final int hashCode() {
        return b().hashCode();
    }
}
