package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class znn extends fcyz implements fdat {
    /* synthetic */ Object a;
    final /* synthetic */ znp b;
    final /* synthetic */ ajma c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public znn(znp znpVar, ajma ajmaVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = znpVar;
        this.c = ajmaVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((znn) c((ajly) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        ajly ajlyVar = (ajly) this.a;
        final znp znpVar = this.b;
        anej anejVar = znpVar.i;
        int iA = anejVar.a();
        int iC = anejVar.c();
        int iC2 = anejVar.c();
        ouv ouvVar = new ouv(iC, 0, false, iA, anejVar.b(), iC2 + iC2, 6);
        final ajma ajmaVar = this.c;
        return ooy.a(new fdqt(new fdtm(new ouu(ouvVar, ajlyVar, new fdae() { // from class: znk
            @Override // defpackage.fdae
            public final Object invoke() {
                znp znpVar2 = znpVar;
                zmp zmpVar = znpVar2.e;
                if (zmpVar != null) {
                    zmpVar.close();
                }
                ajma ajmaVar2 = ajmaVar;
                znw znwVar = znpVar2.h;
                dzuc dzucVar = (dzuc) znwVar.a.b();
                dzucVar.getClass();
                zog zogVar = (zog) znwVar.b.b();
                zogVar.getClass();
                zoa zoaVar = (zoa) znwVar.c.b();
                zoaVar.getClass();
                zoj zojVar = (zoj) znwVar.d.b();
                zojVar.getClass();
                zok zokVar = (zok) znwVar.e.b();
                zokVar.getClass();
                znu znuVar = new znu(dzucVar, ajmaVar2, zogVar, zoaVar, zojVar, zokVar);
                znpVar2.e = znuVar;
                znpVar2.d.set(true);
                return znuVar;
            }
        }).a, new znl(null)), new znm(znpVar, null)), znpVar.b);
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        znn znnVar = new znn(this.b, this.c, fcxyVar);
        znnVar.a = obj;
        return znnVar;
    }
}
