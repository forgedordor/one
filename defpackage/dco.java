package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dco extends fdbr implements fdap {
    final /* synthetic */ dcf a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dco(dcf dcfVar) {
        super(1);
        this.a = dcfVar;
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new dcn(this.a);
    }
}
