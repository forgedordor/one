package defpackage;

import android.database.Cursor;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class agmc extends fcyy implements fdat {
    int a;
    final /* synthetic */ Cursor b;
    final /* synthetic */ fdap c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public agmc(Cursor cursor, fdap fdapVar, fcxy fcxyVar) {
        super(fcxyVar);
        this.b = cursor;
        this.c = fdapVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((agmc) c((fdex) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fdex fdexVar;
        Object objInvoke;
        fcyl fcylVar = fcyl.a;
        if (this.a == 0) {
            fctl.b(obj);
            fdexVar = (fdex) this.d;
            if (this.b != null) {
            }
            return fctx.a;
        }
        fdexVar = (fdex) this.d;
        fctl.b(obj);
        do {
            Cursor cursor = this.b;
            if (!cursor.moveToNext()) {
                return fctx.a;
            }
            objInvoke = this.c.invoke(cursor);
            this.d = fdexVar;
            this.a = 1;
        } while (fdexVar.a(objInvoke, this) != fcylVar);
        return fcylVar;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        agmc agmcVar = new agmc(this.b, this.c, fcxyVar);
        agmcVar.d = obj;
        return agmcVar;
    }
}
