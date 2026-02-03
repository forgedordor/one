package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dcb extends fdbr implements fdae {
    final /* synthetic */ dbr a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dcb(dbr dbrVar) {
        super(0);
        this.a = dbrVar;
    }

    @Override // defpackage.fdae
    public final /* bridge */ /* synthetic */ Object invoke() {
        return Boolean.valueOf(this.a.c());
    }
}
