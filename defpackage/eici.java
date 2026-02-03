package defpackage;

import java.io.Closeable;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eici extends fcyz implements fdat {
    int a;
    final /* synthetic */ eifn b;
    final /* synthetic */ fdat c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eici(eifn eifnVar, fdat fdatVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = eifnVar;
        this.c = fdatVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((eici) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        Closeable closeable;
        fcyl fcylVar = fcyl.a;
        if (this.a != 0) {
            closeable = (Closeable) this.d;
            try {
                fctl.b(obj);
                fczl.a(closeable, null);
                return obj;
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
        fdjx fdjxVar = (fdjx) this.d;
        eifn eifnVar = this.b;
        fdat fdatVar = this.c;
        Closeable closeableM = eidc.m(eifnVar);
        try {
            this.d = closeableM;
            this.a = 1;
            obj = fdatVar.a(fdjxVar, this);
            if (obj == fcylVar) {
                return fcylVar;
            }
            closeable = closeableM;
            fczl.a(closeable, null);
            return obj;
        } catch (Throwable th3) {
            th = th3;
            closeable = closeableM;
            throw th;
        }
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        eici eiciVar = new eici(this.b, this.c, fcxyVar);
        eiciVar.d = obj;
        return eiciVar;
    }
}
