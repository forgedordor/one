package defpackage;

import android.net.Uri;
import android.provider.ContactsContract;
import java.io.Closeable;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class avep extends fcyz implements fdat {
    int a;
    final /* synthetic */ avgc b;
    Object c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public avep(fcxy fcxyVar, avgc avgcVar) {
        super(2, fcxyVar);
        this.b = avgcVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((avep) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.io.Closeable] */
    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        avep avepVar;
        eieu eieuVar;
        List listAh;
        List list;
        eieu eieuVar2;
        fcyl fcylVar = fcyl.a;
        ?? r1 = this.a;
        try {
            if (r1 == 0) {
                fctl.b(obj);
                eieu eieuVarA = eiiy.a("Cp2DataService#queryAllContactsIds");
                avgc avgcVar = this.b;
                ehvv ehvvVarC = avgc.C(avef.a);
                Uri uri = ContactsContract.CommonDataKinds.Phone.CONTENT_URI;
                uri.getClass();
                aver averVar = aver.a;
                this.d = eieuVarA;
                this.a = 1;
                obj = avgcVar.z(uri, new String[]{"_id"}, ehvvVarC, averVar, this);
                avepVar = this;
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
            avepVar = this;
            eieuVar = r12;
            listAh = (List) obj;
            avgc avgcVar2 = avepVar.b;
            eieuVar2 = eieuVar;
            if (((Boolean) avgcVar2.g.b()).booleanValue()) {
                ehvv ehvvVarC2 = avgc.C(avef.b);
                Uri uri2 = ContactsContract.CommonDataKinds.Email.CONTENT_URI;
                uri2.getClass();
                aveq aveqVar = aveq.a;
                avepVar.d = eieuVar;
                avepVar.c = listAh;
                avepVar.a = 2;
                Object objZ = avgcVar2.z(uri2, new String[]{"_id"}, ehvvVarC2, aveqVar, avepVar);
                if (objZ != fcylVar) {
                    list = listAh;
                    obj = objZ;
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
        avep avepVar = new avep(fcxyVar, this.b);
        avepVar.d = obj;
        return avepVar;
    }
}
