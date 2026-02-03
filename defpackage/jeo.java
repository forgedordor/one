package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jeo extends fdbr implements fdae {
    final /* synthetic */ jer a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jeo(jer jerVar) {
        super(0);
        this.a = jerVar;
    }

    @Override // defpackage.fdae
    public final /* bridge */ /* synthetic */ Object invoke() {
        jer jerVar = this.a.x;
        if (jerVar != null) {
            jerVar.am();
        }
        return fctx.a;
    }
}
