package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ybb extends fcyz implements fdau {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ ybd c;
    final /* synthetic */ fdae d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ybb(fcxy fcxyVar, ybd ybdVar, fdae fdaeVar) {
        super(3, fcxyVar);
        this.c = ybdVar;
        this.d = fdaeVar;
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        ybb ybbVar = new ybb((fcxy) obj3, this.c, this.d);
        ybbVar.e = (fdpm) obj;
        ybbVar.b = obj2;
        return ybbVar.b(fctx.a);
    }

    /* JADX WARN: Type inference failed for: r8v2, types: [fdpm, java.lang.Object] */
    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fdpl fdpuVar;
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            ?? r8 = this.e;
            ajlt ajltVar = (ajlt) this.b;
            if (ajltVar != null) {
                ybd ybdVar = this.c;
                fdpuVar = new yaq(new fdui(new ymp((ymr) ybdVar.e, ajltVar, null)), ajltVar, ybdVar, this.d);
            } else {
                fdpuVar = new fdpu(null);
            }
            this.a = 1;
            if (fdpy.c(r8, fdpuVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }
}
