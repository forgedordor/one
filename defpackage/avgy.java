package defpackage;

import java.io.Closeable;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class avgy extends fcyz implements fdat {
    int a;
    final /* synthetic */ avhb b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public avgy(fcxy fcxyVar, avhb avhbVar) {
        super(2, fcxyVar);
        this.b = avhbVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((avgy) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        Closeable closeable;
        Throwable th;
        fcyl fcylVar = fcyl.a;
        if (this.a != 0) {
            closeable = (Closeable) this.c;
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
            eieu eieuVarH = eiiy.h("ContactsImport#schedule");
            try {
                ((eksl) avhb.a.h()).q("Scheduling contacts import");
                avhb avhbVar = this.b;
                eiju eijuVarB = avhbVar.g.b("ContactsImporter#schedule", new avha(avhbVar, evxc.c(avhbVar.d.f().toEpochMilli())));
                eijuVarB.getClass();
                this.c = eieuVarH;
                this.a = 1;
                Object objC = fdxs.c(eijuVarB, this);
                if (objC == fcylVar) {
                    return fcylVar;
                }
                closeable = eieuVarH;
                obj = objC;
            } catch (Throwable th4) {
                closeable = eieuVarH;
                th = th4;
                throw th;
            }
        }
        Void r8 = (Void) obj;
        fczl.a(closeable, null);
        return r8;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        avgy avgyVar = new avgy(fcxyVar, this.b);
        avgyVar.c = obj;
        return avgyVar;
    }
}
