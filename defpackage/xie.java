package defpackage;

import android.database.Cursor;
import android.net.Uri;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xie extends fcyz implements fdat {
    int a;
    final /* synthetic */ xij b;
    final /* synthetic */ Uri c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xie(fcxy fcxyVar, xij xijVar, Uri uri) {
        super(2, fcxyVar);
        this.b = xijVar;
        this.c = uri;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((xie) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        final cywg cywgVar = this.b.h;
        eijs eijsVar = new eijs(cywgVar.a.b(this.c, new String[]{"_id", "display_name"}, null, null, null));
        eopo eopoVar = new eopo() { // from class: cywc
            @Override // defpackage.eopo
            public final Object a(eopt eoptVar, Object obj2) {
                Cursor cursor = (Cursor) obj2;
                cursor.getClass();
                cursor.moveToNext();
                return new cyvg(cursor.getLong(0), cursor.getString(1));
            }
        };
        Executor executor = cywgVar.b;
        final eiju eijuVarH = eijsVar.f(eopoVar, executor).h();
        final eiju eijuVarI = eijuVarH.i(new eooz() { // from class: cywd
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj2) {
                long jA = ((cywf) obj2).a();
                cywg cywgVar2 = cywgVar;
                return cywgVar2.b(cywgVar2.a(jA, "vnd.android.cursor.item/phone_v2", new String[]{"data1", "data2", "data3"}).f(new eopo() { // from class: cyvy
                    @Override // defpackage.eopo
                    public final Object a(eopt eoptVar, Object obj3) {
                        Cursor cursor = (Cursor) obj3;
                        cursor.getClass();
                        ekhv ekhvVar = new ekhv();
                        while (cursor.moveToNext()) {
                            ekhvVar.c(new cyvh(cursor.getString(0), cursor.getInt(1), cursor.getString(2)));
                        }
                        return ekhvVar.g();
                    }
                }, cywgVar2.b).h());
            }
        }, executor);
        final eiju eijuVarI2 = eijuVarH.i(new eooz() { // from class: cywe
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj2) {
                long jA = ((cywf) obj2).a();
                cywg cywgVar2 = cywgVar;
                return cywgVar2.b(cywgVar2.a(jA, "vnd.android.cursor.item/email_v2", new String[]{"data1", "data2", "data3"}).f(new eopo() { // from class: cyvt
                    @Override // defpackage.eopo
                    public final Object a(eopt eoptVar, Object obj3) {
                        Cursor cursor = (Cursor) obj3;
                        cursor.getClass();
                        ekhv ekhvVar = new ekhv();
                        while (cursor.moveToNext()) {
                            ekhvVar.c(new cyvh(cursor.getString(0), cursor.getInt(1), cursor.getString(2)));
                        }
                        return ekhvVar.g();
                    }
                }, cywgVar2.b).h());
            }
        }, executor);
        final eiju eijuVarI3 = eijuVarH.i(new eooz() { // from class: cyvm
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj2) {
                long jA = ((cywf) obj2).a();
                cywg cywgVar2 = cywgVar;
                return cywgVar2.b(cywgVar2.a(jA, "vnd.android.cursor.item/postal-address_v2", new String[]{"data1", "data2", "data3"}).f(new eopo() { // from class: cyvw
                    @Override // defpackage.eopo
                    public final Object a(eopt eoptVar, Object obj3) {
                        Cursor cursor = (Cursor) obj3;
                        cursor.getClass();
                        ekhv ekhvVar = new ekhv();
                        while (cursor.moveToNext()) {
                            ekhvVar.c(new cyvh(cursor.getString(0), cursor.getInt(1), cursor.getString(2)));
                        }
                        return ekhvVar.g();
                    }
                }, cywgVar2.b).h());
            }
        }, executor);
        final eiju eijuVarI4 = eijuVarH.i(new eooz() { // from class: cyvn
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj2) {
                long jA = ((cywf) obj2).a();
                cywg cywgVar2 = cywgVar;
                return cywgVar2.b(cywgVar2.a(jA, "vnd.android.cursor.item/im", new String[]{"data1", "data5", "data6"}).f(new eopo() { // from class: cyvl
                    @Override // defpackage.eopo
                    public final Object a(eopt eoptVar, Object obj3) {
                        Cursor cursor = (Cursor) obj3;
                        cursor.getClass();
                        ekhv ekhvVar = new ekhv();
                        while (cursor.moveToNext()) {
                            ekhvVar.c(new cyvh(cursor.getString(0), cursor.getInt(1), cursor.getString(2)));
                        }
                        return ekhvVar.g();
                    }
                }, cywgVar2.b).h());
            }
        }, executor);
        final eiju eijuVarI5 = eijuVarH.i(new eooz() { // from class: cyvo
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj2) {
                long jA = ((cywf) obj2).a();
                cywg cywgVar2 = cywgVar;
                return cywgVar2.b(cywgVar2.a(jA, "vnd.android.cursor.item/organization", new String[]{"data1", "data4"}).f(new eopo() { // from class: cyvv
                    @Override // defpackage.eopo
                    public final Object a(eopt eoptVar, Object obj3) {
                        Cursor cursor = (Cursor) obj3;
                        cursor.getClass();
                        ekhv ekhvVar = new ekhv();
                        while (cursor.moveToNext()) {
                            ekhvVar.c(new cyvh(cursor.getString(0), 0, cursor.getString(1)));
                        }
                        return ekhvVar.g();
                    }
                }, cywgVar2.b).h());
            }
        }, executor);
        final eiju eijuVarI6 = eijuVarH.i(new eooz() { // from class: cyvp
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj2) {
                long jA = ((cywf) obj2).a();
                cywg cywgVar2 = cywgVar;
                return cywgVar2.b(cywgVar2.a(jA, "vnd.android.cursor.item/website", new String[]{"data1", "data2", "data3"}).f(new eopo() { // from class: cyvu
                    @Override // defpackage.eopo
                    public final Object a(eopt eoptVar, Object obj3) {
                        Cursor cursor = (Cursor) obj3;
                        cursor.getClass();
                        ekhv ekhvVar = new ekhv();
                        while (cursor.moveToNext()) {
                            ekhvVar.c(new cyvh(cursor.getString(0), cursor.getInt(1), cursor.getString(2)));
                        }
                        return ekhvVar.g();
                    }
                }, cywgVar2.b).h());
            }
        }, executor);
        final eiju eijuVarI7 = eijuVarH.i(new eooz() { // from class: cyvq
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj2) {
                long jA = ((cywf) obj2).a();
                cywg cywgVar2 = cywgVar;
                return cywgVar2.b(cywgVar2.a(jA, "vnd.android.cursor.item/contact_event", new String[]{"data1", "data2", "data3"}).f(new eopo() { // from class: cywa
                    @Override // defpackage.eopo
                    public final Object a(eopt eoptVar, Object obj3) {
                        Cursor cursor = (Cursor) obj3;
                        cursor.getClass();
                        ekhv ekhvVar = new ekhv();
                        while (cursor.moveToNext()) {
                            ekhvVar.c(new cyvh(cursor.getString(0), cursor.getInt(1), cursor.getString(2)));
                        }
                        return ekhvVar.g();
                    }
                }, cywgVar2.b).h());
            }
        }, executor);
        final eiju eijuVarI8 = eijuVarH.i(new eooz() { // from class: cyvr
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj2) {
                long jA = ((cywf) obj2).a();
                cywg cywgVar2 = cywgVar;
                return cywgVar2.b(cywgVar2.a(jA, "vnd.android.cursor.item/note", new String[]{"data1"}).f(new eopo() { // from class: cyvx
                    @Override // defpackage.eopo
                    public final Object a(eopt eoptVar, Object obj3) {
                        Cursor cursor = (Cursor) obj3;
                        cursor.getClass();
                        ekhv ekhvVar = new ekhv();
                        while (cursor.moveToNext()) {
                            ekhvVar.c(new cyvh(cursor.getString(0), 0, null));
                        }
                        return ekhvVar.g();
                    }
                }, cywgVar2.b).h());
            }
        }, executor);
        eiju eijuVarA = eijx.k(eijuVarI, eijuVarI2, eijuVarI3, eijuVarI4, eijuVarI5, eijuVarI6, eijuVarI7, eijuVarI8).a(new Callable() { // from class: cyvs
            @Override // java.util.concurrent.Callable
            public final Object call() {
                try {
                    cywf cywfVar = (cywf) eork.q(eijuVarH);
                    eiju eijuVar = eijuVarI;
                    String strB = cywfVar.b();
                    ekhx ekhxVar = (ekhx) eork.q(eijuVar);
                    if (ekhxVar == null) {
                        throw new NullPointerException("Null phones");
                    }
                    ekhx ekhxVar2 = (ekhx) eork.q(eijuVarI2);
                    if (ekhxVar2 == null) {
                        throw new NullPointerException("Null emails");
                    }
                    ekhx ekhxVar3 = (ekhx) eork.q(eijuVarI3);
                    if (ekhxVar3 == null) {
                        throw new NullPointerException("Null addresses");
                    }
                    ekhx ekhxVar4 = (ekhx) eork.q(eijuVarI4);
                    if (ekhxVar4 == null) {
                        throw new NullPointerException("Null ims");
                    }
                    ekhx ekhxVar5 = (ekhx) eork.q(eijuVarI5);
                    if (ekhxVar5 == null) {
                        throw new NullPointerException("Null organizations");
                    }
                    ekhx ekhxVar6 = (ekhx) eork.q(eijuVarI6);
                    if (ekhxVar6 == null) {
                        throw new NullPointerException("Null websites");
                    }
                    ekhx ekhxVar7 = (ekhx) eork.q(eijuVarI7);
                    if (ekhxVar7 == null) {
                        throw new NullPointerException("Null events");
                    }
                    ekhx ekhxVar8 = (ekhx) eork.q(eijuVarI8);
                    if (ekhxVar8 != null) {
                        return new cyvf(strB, ekhxVar, ekhxVar2, ekhxVar3, ekhxVar4, ekhxVar5, ekhxVar6, ekhxVar7, ekhxVar8);
                    }
                    throw new NullPointerException("Null notes");
                } catch (ExecutionException unused) {
                    return null;
                }
            }
        }, executor);
        eijuVarA.getClass();
        this.a = 1;
        Object objC = fdxs.c(eijuVarA, this);
        return objC == fcylVar ? fcylVar : objC;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        xie xieVar = new xie(fcxyVar, this.b, this.c);
        xieVar.d = obj;
        return xieVar;
    }
}
