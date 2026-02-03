package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xwc extends fcyz implements fdau {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ xwm c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xwc(fcxy fcxyVar, xwm xwmVar) {
        super(3, fcxyVar);
        this.c = xwmVar;
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        xwc xwcVar = new xwc((fcxy) obj3, this.c);
        xwcVar.d = (fdpm) obj;
        xwcVar.b = obj2;
        return xwcVar.b(fctx.a);
    }

    /* JADX WARN: Type inference failed for: r7v2, types: [fdpm, java.lang.Object] */
    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        dirx dirxVarA;
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            ?? r7 = this.d;
            ajlt ajltVar = (ajlt) this.b;
            if (ajltVar != null) {
                xwm xwmVar = this.c;
                dirxVarA = yql.a(xwmVar.c, ajltVar, new dirz(2, 2), new Float(1.0f), 24);
            } else {
                dirxVarA = null;
            }
            fdpu fdpuVar = new fdpu(dirxVarA);
            this.a = 1;
            if (fdpy.c(r7, fdpuVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }
}
