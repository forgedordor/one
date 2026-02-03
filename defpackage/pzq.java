package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pzq extends fdbr implements fdap {
    final /* synthetic */ Object a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pzq(Object obj) {
        super(1);
        this.a = obj;
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Object obj2 = ((Object[]) this.a)[((Number) obj).intValue()];
        if (obj2 != null) {
            return (Integer) obj2;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
    }
}
