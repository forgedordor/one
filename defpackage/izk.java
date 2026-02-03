package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class izk extends fdbr implements fdat {
    final /* synthetic */ izl a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public izk(izl izlVar) {
        super(2);
        this.a = izlVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        jcr jcrVar = (jcr) obj;
        iwy iwyVar = jcrVar.x;
        izl izlVar = this.a;
        if (iwyVar == null) {
            iwy iwyVar2 = new iwy(jcrVar, izlVar.a);
            jcrVar.x = iwyVar2;
            iwyVar = iwyVar2;
        }
        izlVar.b = iwyVar;
        izlVar.a().h();
        iwy iwyVarA = izlVar.a();
        izo izoVar = izlVar.a;
        if (iwyVarA.c != izoVar) {
            iwyVarA.c = izoVar;
            iwyVarA.i(false);
            jcr.ay(iwyVarA.a, false, 7);
        }
        return fctx.a;
    }
}
