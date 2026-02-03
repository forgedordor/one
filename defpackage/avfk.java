package defpackage;

import android.net.Uri;
import android.provider.ContactsContract;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class avfk extends fcyz implements fdat {
    int a;
    final /* synthetic */ avgc b;
    final /* synthetic */ List c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public avfk(fcxy fcxyVar, avgc avgcVar, List list) {
        super(2, fcxyVar);
        this.b = avgcVar;
        this.c = list;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((avfk) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
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
            eieu eieuVarA = eiiy.a("Cp2DataService#queryContactsExist");
            try {
                avgc avgcVar = this.b;
                List list = this.c;
                Uri uri = ContactsContract.Contacts.CONTENT_URI;
                uri.getClass();
                this.d = eieuVarA;
                this.a = 1;
                Object objY = avgcVar.y(list, uri, false, this);
                if (objY == fcylVar) {
                    return fcylVar;
                }
                closeable = eieuVarA;
                obj = objY;
            } catch (Throwable th4) {
                closeable = eieuVarA;
                th = th4;
                throw th;
            }
        }
        List list2 = (List) obj;
        List list3 = this.c;
        ArrayList arrayList = new ArrayList(fcva.p(list3, 10));
        Iterator it = list3.iterator();
        while (it.hasNext()) {
            arrayList.add(Boolean.valueOf(list2.contains(new Long(((Number) it.next()).longValue()))));
        }
        fczl.a(closeable, null);
        return arrayList;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        avfk avfkVar = new avfk(fcxyVar, this.b, this.c);
        avfkVar.d = obj;
        return avfkVar;
    }
}
