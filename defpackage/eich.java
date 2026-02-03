package defpackage;

import java.io.Closeable;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eich extends fcyz implements fdat {
    int a;
    final /* synthetic */ fdat b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eich(fdat fdatVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = fdatVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((eich) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        Closeable closeable;
        fcyl fcylVar = fcyl.a;
        if (this.a != 0) {
            closeable = (Closeable) this.c;
            try {
                fctl.b(obj);
                fczl.a(closeable, null);
                return fctx.a;
            } catch (Throwable th) {
                th = th;
                try {
                    throw th;
                } catch (Throwable th2) {
                    fczl.a(closeable, th);
                    throw th2;
                }
            }
        }
        fctl.b(obj);
        fdjx fdjxVar = (fdjx) this.c;
        Closeable closeableM = eidc.m(eieo.a);
        fdat fdatVar = this.b;
        try {
            this.c = closeableM;
            this.a = 1;
            if (fdatVar.a(fdjxVar, this) == fcylVar) {
                return fcylVar;
            }
            closeable = closeableM;
            fczl.a(closeable, null);
            return fctx.a;
        } catch (Throwable th3) {
            th = th3;
            closeable = closeableM;
            throw th;
        }
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        eich eichVar = new eich(this.b, fcxyVar);
        eichVar.c = obj;
        return eichVar;
    }
}
