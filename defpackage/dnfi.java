package defpackage;

import android.database.Cursor;
import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dnfi extends fcyz implements fdap {
    Object a;
    Object b;
    Object c;
    int d;
    final /* synthetic */ Cursor e;
    final /* synthetic */ dnfr f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dnfi(Cursor cursor, dnfr dnfrVar, fcxy fcxyVar) {
        super(1, fcxyVar);
        this.e = cursor;
        this.f = dnfrVar;
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        Object dnceVar;
        Object obj2;
        Object obj3;
        fcyl fcylVar = fcyl.a;
        if (this.d != 0) {
            obj3 = this.c;
            obj2 = this.b;
            dnceVar = this.a;
            fctl.b(obj);
        } else {
            fctl.b(obj);
            Cursor cursor = this.e;
            dnceVar = new dnce(cursor.getLong(1));
            Instant instantOfEpochMilli = Instant.ofEpochMilli(cursor.getLong(2));
            instantOfEpochMilli.getClass();
            String string = !cursor.isNull(3) ? cursor.getString(3) : null;
            dnfr dnfrVar = this.f;
            String string2 = cursor.getString(0);
            string2.getClass();
            this.a = dnceVar;
            this.b = instantOfEpochMilli;
            this.c = string;
            this.d = 1;
            obj = dnfrVar.e.c.a(string2, this);
            if (obj == fcylVar) {
                return fcylVar;
            }
            obj2 = instantOfEpochMilli;
            obj3 = string;
        }
        return new dneb(obj, (dnce) dnceVar, (Instant) obj2, (String) obj3);
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new dnfi(this.e, this.f, (fcxy) obj).b(fctx.a);
    }
}
