package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qgp extends fcyz implements fdau {
    int a;
    /* synthetic */ Object b;
    private /* synthetic */ Object c;

    public qgp(fcxy fcxyVar) {
        super(3, fcxyVar);
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        qgp qgpVar = new qgp((fcxy) obj3);
        qgpVar.c = (fdpm) obj;
        qgpVar.b = (Object[]) obj2;
        return qgpVar.b(fctx.a);
    }

    /* JADX WARN: Type inference failed for: r7v2, types: [fdpm, java.lang.Object] */
    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        qga qgaVar;
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            ?? r7 = this.c;
            qga[] qgaVarArr = (qga[]) this.b;
            int length = qgaVarArr.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    qgaVar = null;
                    break;
                }
                qgaVar = qgaVarArr[i2];
                if (!fdbq.f(qgaVar, qfy.a)) {
                    break;
                }
                i2++;
            }
            if (qgaVar == null) {
                qgaVar = qfy.a;
            }
            this.a = 1;
            if (r7.fO(qgaVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }
}
