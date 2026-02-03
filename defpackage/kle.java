package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class kle extends fdbr implements fdat {
    public static final kle a = new kle();

    public kle() {
        super(2);
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        kio kioVar = (kio) obj2;
        klr klrVarA = kli.a((jcr) obj);
        if (kioVar != klrVarA.k) {
            klrVarA.k = kioVar;
            fdap fdapVar = klrVarA.l;
            if (fdapVar != null) {
                fdapVar.invoke(kioVar);
            }
        }
        return fctx.a;
    }
}
