package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ltn extends fdbr implements fdap {
    final /* synthetic */ Comparable a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ltn(Comparable comparable) {
        super(1);
        this.a = comparable;
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return Integer.valueOf(fcxl.a((Float) ((fcti) obj).a, this.a));
    }
}
