package defpackage;

import java.io.Closeable;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aveo extends fcyz implements fdat {
    int a;
    final /* synthetic */ avgc b;
    Object c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aveo(fcxy fcxyVar, avgc avgcVar) {
        super(2, fcxyVar);
        this.b = avgcVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aveo) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.io.Closeable] */
    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        eieu eieuVar;
        List listAh;
        List list;
        eieu eieuVar2;
        fcyl fcylVar = fcyl.a;
        ?? r1 = this.a;
        try {
            if (r1 == 0) {
                fctl.b(obj);
                eieu eieuVarA = eiiy.a("Cp2DataService#queryAllContacts");
                avgc avgcVar = this.b;
                avef avefVar = avef.a;
                ehvv ehvvVarC = avgc.C(avefVar);
                this.d = eieuVarA;
                this.a = 1;
                obj = avgcVar.x(ehvvVarC, avefVar, this);
                eieuVar = eieuVarA;
                if (obj != fcylVar) {
                }
                return fcylVar;
            }
            if (r1 != 1) {
                ?? r0 = this.c;
                Closeable closeable = (Closeable) this.d;
                fctl.b(obj);
                list = r0;
                r1 = closeable;
                listAh = fcva.ah(list, (List) obj);
                eieuVar2 = r1;
                fczl.a(eieuVar2, null);
                return listAh;
            }
            ?? r12 = (Closeable) this.d;
            fctl.b(obj);
            eieuVar = r12;
            listAh = (List) obj;
            avgc avgcVar2 = this.b;
            eieuVar2 = eieuVar;
            if (((Boolean) avgcVar2.g.b()).booleanValue()) {
                avef avefVar2 = avef.b;
                ehvv ehvvVarC2 = avgc.C(avefVar2);
                this.d = eieuVar;
                this.c = listAh;
                this.a = 2;
                Object objX = avgcVar2.x(ehvvVarC2, avefVar2, this);
                if (objX != fcylVar) {
                    list = listAh;
                    obj = objX;
                    r1 = eieuVar;
                    listAh = fcva.ah(list, (List) obj);
                    eieuVar2 = r1;
                }
                return fcylVar;
            }
            fczl.a(eieuVar2, null);
            return listAh;
        } finally {
        }
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        aveo aveoVar = new aveo(fcxyVar, this.b);
        aveoVar.d = obj;
        return aveoVar;
    }
}
