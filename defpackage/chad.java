package defpackage;

import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class chad extends fcyz implements fdau {
    int a;
    /* synthetic */ Object b;
    private /* synthetic */ Object c;

    public chad(fcxy fcxyVar) {
        super(3, fcxyVar);
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        chad chadVar = new chad((fcxy) obj3);
        chadVar.c = (fdpm) obj;
        chadVar.b = (Object[]) obj2;
        return chadVar.b(fctx.a);
    }

    /* JADX WARN: Type inference failed for: r9v2, types: [fdpm, java.lang.Object] */
    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            ?? r9 = this.c;
            chah[] chahVarArr = (chah[]) this.b;
            chahVarArr.getClass();
            if (chahVarArr.length == 0) {
                throw new NoSuchElementException();
            }
            chah chahVar = chahVarArr[0];
            int iC = fcur.C(chahVarArr);
            if (iC > 0) {
                int i2 = 1;
                while (true) {
                    chah chahVar2 = chahVarArr[i2];
                    if (chahVar.compareTo(chahVar2) > 0) {
                        chahVar = chahVar2;
                    }
                    if (i2 == iC) {
                        break;
                    }
                    i2++;
                }
            }
            this.a = 1;
            if (r9.fO(chahVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }
}
