package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class kld extends fdbr implements fdat {
    public static final kld a = new kld();

    public kld() {
        super(2);
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        ics icsVar = (ics) obj2;
        klr klrVarA = kli.a((jcr) obj);
        if (icsVar != klrVarA.i) {
            klrVarA.i = icsVar;
            fdap fdapVar = klrVarA.j;
            if (fdapVar != null) {
                fdapVar.invoke(icsVar);
            }
        }
        return fctx.a;
    }
}
