package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class iww extends fdbr implements fdae {
    final /* synthetic */ iwo a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iww(iwo iwoVar) {
        super(0);
        this.a = iwoVar;
    }

    @Override // defpackage.fdae
    public final /* bridge */ /* synthetic */ Object invoke() {
        hqx hqxVar;
        iwo iwoVar = this.a;
        if (!iwoVar.a() && (hqxVar = iwoVar.c) != null) {
            hqxVar.m();
        }
        return fctx.a;
    }
}
