package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jpv extends fdbr implements fdap {
    final /* synthetic */ jpw a;
    final /* synthetic */ fdat b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jpv(jpw jpwVar, fdat fdatVar) {
        super(1);
        this.a = jpwVar;
        this.b = fdatVar;
    }

    @Override // defpackage.fdap
    public final /* synthetic */ Object invoke(Object obj) {
        jpw jpwVar = this.a;
        jhd jhdVar = (jhd) obj;
        if (!jpwVar.c) {
            lvc lvcVarP = jhdVar.a.P();
            fdat fdatVar = this.b;
            jpwVar.e = fdatVar;
            if (jpwVar.d == null) {
                jpwVar.d = lvcVarP;
                lvcVarP.c(jpwVar);
            } else if (lvcVarP.a().a(lvb.c)) {
                ((hne) jpwVar.b).l(new hxd(1330788943, true, new jpu(jpwVar, fdatVar)));
            }
        }
        return fctx.a;
    }
}
