package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dca extends fdbr implements fdae {
    final /* synthetic */ dbr a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dca(dbr dbrVar) {
        super(0);
        this.a = dbrVar;
    }

    @Override // defpackage.fdae
    public final /* bridge */ /* synthetic */ Object invoke() {
        return Boolean.valueOf(this.a.c());
    }
}
