package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class osp extends fcyz implements fdau {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ osu c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public osp(fcxy fcxyVar, osu osuVar) {
        super(3, fcxyVar);
        this.c = osuVar;
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        osp ospVar = new osp((fcxy) obj3, this.c);
        ospVar.d = (fdpm) obj;
        ospVar.b = obj2;
        return ospVar.b(fctx.a);
    }

    /* JADX WARN: Type inference failed for: r7v2, types: [fdpm, java.lang.Object] */
    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            ?? r7 = this.d;
            osh oshVar = (osh) this.b;
            ots otsVar = oshVar.a;
            fdlr fdlrVar = oshVar.c;
            oux ouxVar = new oux(new fdtm(otsVar.i, new osn(null)), new osj(this.c), new osi(otsVar));
            this.a = 1;
            if (r7.fO(ouxVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }
}
