package defpackage;

import android.net.Uri;
import android.provider.ContactsContract;
import j$.time.MonthDay;
import j$.time.format.DateTimeFormatter;
import java.io.Closeable;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aglz extends fcyz implements fdat {
    int a;
    final /* synthetic */ agmd b;
    final /* synthetic */ MonthDay c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aglz(fcxy fcxyVar, agmd agmdVar, MonthDay monthDay) {
        super(2, fcxyVar);
        this.b = agmdVar;
        this.c = monthDay;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aglz) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [int, java.io.Closeable] */
    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        Closeable closeableH;
        fcyl fcylVar = fcyl.a;
        ?? r1 = this.a;
        try {
            if (r1 != 0) {
                closeableH = (Closeable) this.d;
                fctl.b(obj);
            } else {
                fctl.b(obj);
                closeableH = eiiy.h("Cp2BirthdayQueries#getContactsWithBirthday");
                agmd agmdVar = this.b;
                if (!((crma) agmdVar.c.b()).h()) {
                    ((eksl) agmd.a.f()).q("No permission for syncing birthdays from contacts");
                    fcvo fcvoVar = fcvo.a;
                    fczl.a(closeableH, null);
                    return fcvoVar;
                }
                ((eksl) agmd.a.f()).q("Syncing birthdays from contacts");
                String str = DateTimeFormatter.ofPattern("MM-dd").withZone(agmdVar.e.a).format(this.c);
                ehvw ehvwVar = new ehvw();
                ehvwVar.b("mimetype = ?");
                ehvwVar.c("vnd.android.cursor.item/contact_event");
                ehvwVar.b(" AND data2 = 3");
                ehvwVar.b(" AND data1 LIKE ?");
                ehvwVar.c(a.v(str, "%"));
                ehvv ehvvVarA = ehvwVar.a();
                Uri uri = ContactsContract.Data.CONTENT_URI;
                uri.getClass();
                agma agmaVar = agma.a;
                this.d = closeableH;
                this.a = 1;
                obj = agmdVar.a(uri, new String[]{"contact_id"}, ehvvVarA, agmaVar, this);
                if (obj == fcylVar) {
                    return fcylVar;
                }
            }
            List list = (List) obj;
            fczl.a(closeableH, null);
            return list;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                fczl.a(r1, th);
                throw th2;
            }
        }
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        aglz aglzVar = new aglz(fcxyVar, this.b, this.c);
        aglzVar.d = obj;
        return aglzVar;
    }
}
