package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* loaded from: classes.dex */
final class qaj extends fcyz implements fdat {
    int a;
    final /* synthetic */ fdat b;
    final /* synthetic */ kog c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qaj(fdat fdatVar, kog kogVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = fdatVar;
        this.c = kogVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((qaj) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        try {
            if (this.a != 0) {
                fctl.b(obj);
            } else {
                fctl.b(obj);
                fdjx fdjxVar = (fdjx) this.d;
                fdat fdatVar = this.b;
                this.a = 1;
                obj = fdatVar.a(fdjxVar, this);
                if (obj == fcylVar) {
                    return fcylVar;
                }
            }
            this.c.b(obj);
        } catch (CancellationException unused) {
            this.c.d();
        } catch (Throwable th) {
            this.c.c(th);
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        qaj qajVar = new qaj(this.b, this.c, fcxyVar);
        qajVar.d = obj;
        return qajVar;
    }
}
