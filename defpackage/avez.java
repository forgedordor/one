package defpackage;

import android.net.Uri;
import android.provider.ContactsContract;
import j$.time.Instant;
import java.io.Closeable;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class avez extends fcyz implements fdat {
    int a;
    final /* synthetic */ Instant b;
    final /* synthetic */ avgc c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public avez(fcxy fcxyVar, Instant instant, avgc avgcVar) {
        super(2, fcxyVar);
        this.b = instant;
        this.c = avgcVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((avez) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        ?? r1 = this.a;
        try {
            if (r1 != 0) {
                Closeable closeable = (Closeable) this.d;
                fctl.b(obj);
                r1 = closeable;
            } else {
                fctl.b(obj);
                eieu eieuVarA = eiiy.a("Cp2DataService#queryEmptyNumberContacts");
                ehvw ehvwVar = new ehvw();
                ehvwVar.b("contact_last_updated_timestamp > ?");
                ehvwVar.b(" AND has_phone_number = 0");
                ehvwVar.c(String.valueOf(this.b.toEpochMilli()));
                ehvv ehvvVarA = ehvwVar.a();
                avgc avgcVar = this.c;
                Uri uri = ContactsContract.Contacts.CONTENT_URI;
                uri.getClass();
                avfa avfaVar = avfa.a;
                this.d = eieuVarA;
                this.a = 1;
                obj = avgcVar.z(uri, new String[]{"_id", "contact_last_updated_timestamp"}, ehvvVarA, avfaVar, this);
                r1 = eieuVarA;
                if (obj == fcylVar) {
                    return fcylVar;
                }
            }
            List list = (List) obj;
            fczl.a(r1, null);
            return list;
        } finally {
        }
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        avez avezVar = new avez(fcxyVar, this.b, this.c);
        avezVar.d = obj;
        return avezVar;
    }
}
