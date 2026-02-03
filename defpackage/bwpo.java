package defpackage;

import java.io.Closeable;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bwpo extends fcyz implements fdat {
    int a;
    final /* synthetic */ bwps b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bwpo(bwps bwpsVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = bwpsVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bwpo) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        Closeable closeable;
        fcyl fcylVar = fcyl.a;
        if (this.a != 0) {
            closeable = (Closeable) this.c;
            try {
                fctl.b(obj);
            } catch (Throwable th) {
                th = th;
                try {
                    throw th;
                } catch (Throwable th2) {
                    fczl.a(closeable, th);
                    throw th2;
                }
            }
        } else {
            fctl.b(obj);
            fdjx fdjxVar = (fdjx) this.c;
            bwps bwpsVar = this.b;
            eieu eieuVarH = eiiy.h("DetailsPageE2eeInfoDataSource#loadData");
            try {
                this.c = eieuVarH;
                this.a = 1;
                obj = bwpsVar.e(fdjxVar, this);
                if (obj == fcylVar) {
                    return fcylVar;
                }
                closeable = eieuVarH;
            } catch (Throwable th3) {
                th = th3;
                closeable = eieuVarH;
                throw th;
            }
        }
        egyh egyhVar = (egyh) obj;
        fczl.a(closeable, null);
        return egyhVar;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        bwpo bwpoVar = new bwpo(this.b, fcxyVar);
        bwpoVar.c = obj;
        return bwpoVar;
    }
}
