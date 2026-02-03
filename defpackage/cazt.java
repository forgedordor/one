package defpackage;

import java.io.Closeable;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cazt extends fcyz implements fdat {
    int a;
    final /* synthetic */ cazw b;
    final /* synthetic */ cbdg c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cazt(fcxy fcxyVar, cazw cazwVar, cbdg cbdgVar) {
        super(2, fcxyVar);
        this.b = cazwVar;
        this.c = cbdgVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cazt) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        Closeable closeable;
        Throwable th;
        fcyl fcylVar = fcyl.a;
        if (this.a != 0) {
            closeable = (Closeable) this.d;
            try {
                fctl.b(obj);
            } catch (Throwable th2) {
                th = th2;
                try {
                    throw th;
                } catch (Throwable th3) {
                    fczl.a(closeable, th);
                    throw th3;
                }
            }
        } else {
            fctl.b(obj);
            eieu eieuVarH = eiiy.h("WorkQueueBatchingImpl#schedulingDeferred");
            try {
                eiju eijuVarA = this.b.b.a(this.c);
                eijuVarA.getClass();
                this.d = eieuVarH;
                this.a = 1;
                if (fdxs.c(eijuVarA, this) == fcylVar) {
                    return fcylVar;
                }
                closeable = eieuVarH;
            } catch (Throwable th4) {
                closeable = eieuVarH;
                th = th4;
                throw th;
            }
        }
        fczl.a(closeable, null);
        return true;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        cazt caztVar = new cazt(fcxyVar, this.b, this.c);
        caztVar.d = obj;
        return caztVar;
    }
}
