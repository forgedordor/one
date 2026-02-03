package defpackage;

import java.io.Closeable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class agly extends fcyz implements fdat {
    int a;
    final /* synthetic */ agmd b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public agly(fcxy fcxyVar, agmd agmdVar) {
        super(2, fcxyVar);
        this.b = agmdVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((agly) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
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
            eieu eieuVarH = eiiy.h("Cp2BirthdayQueries#getContactsBirthdayCoverage");
            try {
                agmd agmdVar = this.b;
                if (!((crma) agmdVar.c.b()).h()) {
                    ((eksl) agmd.a.f()).q("No permission for reading birthdays from contacts");
                    fczl.a(eieuVarH, null);
                    return null;
                }
                ((eksl) agmd.a.f()).q("Calculating birthday coverage of contacts");
                avdr avdrVar = agmdVar.d;
                this.c = eieuVarH;
                this.a = 1;
                Object objB = avdrVar.b(this);
                if (objB == fcylVar) {
                    return fcylVar;
                }
                closeable = eieuVarH;
                obj = objB;
            } catch (Throwable th4) {
                closeable = eieuVarH;
                th = th4;
                throw th;
            }
        }
        List list = (List) obj;
        if (list.isEmpty()) {
            fczl.a(closeable, null);
            return null;
        }
        int i = 0;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((avdp) it.next()).r != null && (i = i + 1) < 0) {
                    fcva.l();
                }
            }
        }
        Integer num = new Integer((i * 1000) / list.size());
        fczl.a(closeable, null);
        return num;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        agly aglyVar = new agly(fcxyVar, this.b);
        aglyVar.c = obj;
        return aglyVar;
    }
}
