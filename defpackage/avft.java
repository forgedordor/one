package defpackage;

import android.provider.ContactsContract;
import j$.time.Instant;
import java.io.Closeable;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class avft extends fcyz implements fdat {
    int a;
    final /* synthetic */ Instant b;
    final /* synthetic */ avgc c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public avft(fcxy fcxyVar, Instant instant, avgc avgcVar) {
        super(2, fcxyVar);
        this.b = instant;
        this.c = avgcVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((avft) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
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
            eieu eieuVarA = eiiy.a("Cp2DataService#queryDeletedContactsCount");
            try {
                ehvw ehvwVar = new ehvw();
                ehvwVar.b("contact_deleted_timestamp > ?");
                ehvwVar.c(String.valueOf(this.b.toEpochMilli()));
                ehvv ehvvVarA = ehvwVar.a();
                avgc avgcVar = this.c;
                eopy eopyVarA = avgcVar.e.a(ContactsContract.DeletedContacts.CONTENT_URI, new String[]{"contact_id"}, ehvvVarA, null);
                final avfv avfvVar = avfv.a;
                eoqt eoqtVarG = eopyVarA.e(new eopo() { // from class: avgb
                    @Override // defpackage.eopo
                    public final /* synthetic */ Object a(eopt eoptVar, Object obj2) {
                        return avfvVar.a(eoptVar, obj2);
                    }
                }, avgcVar.d).g();
                eoqtVarG.getClass();
                this.d = eieuVarA;
                this.a = 1;
                Object objC = fdxs.c(eoqtVarG, this);
                if (objC == fcylVar) {
                    return fcylVar;
                }
                closeable = eieuVarA;
                obj = objC;
            } catch (Throwable th4) {
                closeable = eieuVarA;
                th = th4;
                throw th;
            }
        }
        Integer num = (Integer) obj;
        fczl.a(closeable, null);
        return num;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        avft avftVar = new avft(fcxyVar, this.b, this.c);
        avftVar.d = obj;
        return avftVar;
    }
}
