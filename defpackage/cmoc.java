package defpackage;

import android.content.ContentUris;
import android.database.Cursor;
import android.provider.Telephony;
import com.google.android.ims.rcsservice.businessinfo.BusinessInfoDatabaseConstants;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cmoc extends cmoa {
    private static String[] n;
    public final fcsu a;
    public String b;
    public alqm c;
    public String d;
    public String e;
    public long f;
    public long g;
    public int h;
    public long i;
    public int j;
    public boolean k;
    public boolean l;
    public int m;
    private final cnrp o;
    private long p;

    public cmoc(cnrp cnrpVar) {
        this.o = cnrpVar;
        this.a = cnrpVar.a;
    }

    public static String[] h(cmqj cmqjVar) {
        if (n == null) {
            String[] strArr = {"_id", BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.TYPE, "address", "body", "date", "thread_id", "status", "read", "seen", "date_sent", "sub_id", "subject"};
            if (!cmqjVar.O()) {
                strArr[9] = "date";
            }
            n = strArr;
        }
        return n;
    }

    @Override // defpackage.cmnu
    public final int a() {
        return 0;
    }

    @Override // defpackage.cmnu
    public final int b() {
        return this.j;
    }

    @Override // defpackage.cmnu
    public final long c() {
        return this.f;
    }

    @Override // defpackage.cmnu
    public final String d() {
        return this.b;
    }

    @Override // defpackage.cmoa
    public final int e() {
        return this.m;
    }

    @Override // defpackage.cmoa
    public final long f() {
        return this.i;
    }

    public final void g(Cursor cursor, int i) {
        this.p = cursor.getLong(0);
        int i2 = cursor.getInt(10);
        if (i2 >= 0) {
            i = i2;
        }
        this.m = i;
        final String string = cursor.getString(2);
        this.c = this.o.a(string, this.m, new fcsu() { // from class: cmob
            @Override // defpackage.fcsu
            public final Object b() {
                cmoc cmocVar = this.a;
                fcsu fcsuVar = cmocVar.a;
                return ((alrj) fcsuVar.b()).x(((alrj) fcsuVar.b()).u(string, cmocVar.m));
            }
        });
        this.d = string;
        this.e = cursor.getString(3);
        this.f = cursor.getLong(4);
        this.g = cursor.getLong(9);
        this.h = cursor.getInt(1);
        this.i = cursor.getLong(5);
        this.j = cursor.getInt(6);
        this.k = cursor.getInt(7) != 0;
        this.l = cursor.getInt(8) != 0;
        this.b = ContentUris.withAppendedId(Telephony.Sms.CONTENT_URI, this.p).toString();
        cursor.getString(11);
        Optional.empty();
    }
}
