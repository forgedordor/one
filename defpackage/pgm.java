package defpackage;

import java.util.concurrent.locks.ReentrantLock;

/* compiled from: PG */
/* loaded from: classes.dex */
final class pgm extends fcyz implements fdat {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ pgn c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pgm(pgn pgnVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.c = pgnVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((pgm) c((pft) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        pft pftVar;
        Object objC;
        ped[] pedVarArr;
        ped pedVar;
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        if (i == 0) {
            fctl.b(obj);
            pftVar = (pft) this.b;
            this.b = pftVar;
            this.a = 1;
            objC = pftVar.c();
            if (objC == fcylVar) {
                return fcylVar;
            }
        } else {
            if (i != 1) {
                fctl.b(obj);
                return fctx.a;
            }
            pftVar = (pft) this.b;
            fctl.b(obj);
            objC = obj;
        }
        if (!((Boolean) objC).booleanValue()) {
            pgn pgnVar = this.c;
            pee peeVar = pgnVar.c;
            ReentrantLock reentrantLock = peeVar.a;
            reentrantLock.lock();
            try {
                if (peeVar.d) {
                    boolean z = false;
                    peeVar.d = false;
                    long[] jArr = peeVar.b;
                    int length = jArr.length;
                    pedVarArr = new ped[length];
                    int i2 = 0;
                    boolean z2 = false;
                    while (i2 < length) {
                        boolean z3 = jArr[i2] > 0 ? true : z;
                        boolean[] zArr = peeVar.c;
                        if (z3 != zArr[i2]) {
                            zArr[i2] = z3;
                            pedVar = z3 ? ped.b : ped.c;
                            z2 = true;
                        } else {
                            pedVar = ped.a;
                        }
                        pedVarArr[i2] = pedVar;
                        i2++;
                        z = false;
                    }
                    if (true != z2) {
                        pedVarArr = null;
                    }
                } else {
                    reentrantLock.unlock();
                    pedVarArr = null;
                }
                if (pedVarArr != null) {
                    pfs pfsVar = pfs.b;
                    pgl pglVar = new pgl(pedVarArr, pgnVar, pftVar, null);
                    this.b = null;
                    this.a = 2;
                    if (pftVar.b(pfsVar, pglVar, this) == fcylVar) {
                        return fcylVar;
                    }
                }
            } finally {
                reentrantLock.unlock();
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        pgm pgmVar = new pgm(this.c, fcxyVar);
        pgmVar.b = obj;
        return pgmVar;
    }
}
