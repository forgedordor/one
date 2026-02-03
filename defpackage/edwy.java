package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class edwy extends fcyz implements fdax {
    /* synthetic */ Object a;
    /* synthetic */ Object b;
    /* synthetic */ Object c;
    /* synthetic */ Object d;
    /* synthetic */ boolean e;

    public edwy(fcxy fcxyVar) {
        super(6, fcxyVar);
    }

    @Override // defpackage.fdax
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        boolean zBooleanValue = ((Boolean) obj5).booleanValue();
        edwy edwyVar = new edwy((fcxy) obj6);
        edwyVar.a = (edwq) obj;
        edwyVar.b = (edxj) obj2;
        edwyVar.c = (String) obj3;
        edwyVar.d = (Uri) obj4;
        edwyVar.e = zBooleanValue;
        return edwyVar.b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        Object obj2;
        fctl.b(obj);
        Object obj3 = this.a;
        boolean z = obj3 instanceof edwo;
        Object obj4 = this.b;
        Object obj5 = this.c;
        Object obj6 = this.d;
        boolean z2 = this.e;
        if (z) {
            return edwv.a;
        }
        if (!(obj3 instanceof edwn)) {
            if (obj3 instanceof edwj) {
                return edwr.a;
            }
            if (obj3 instanceof edwp) {
                if (obj5 == null) {
                    obj5 = ((edwp) obj3).a;
                }
                return new edww((String) obj5, obj4 != null ? ((edxj) obj4).a : ((edwp) obj3).b);
            }
            if (!(obj3 instanceof edwl)) {
                throw new fctg();
            }
            if (obj5 == null) {
                obj5 = ((edwl) obj3).d;
            }
            Object obj7 = obj4 != null ? ((edxj) obj4).a : ((edwl) obj3).e;
            edwl edwlVar = (edwl) obj3;
            return new edws((String) obj5, obj7, edwlVar.a, edwlVar.b, edwlVar.c, edwlVar.j);
        }
        if (z2) {
            return edwr.a;
        }
        if (obj5 == null) {
            obj5 = ((edwn) obj3).a;
        }
        if (obj4 != null) {
            obj2 = ((edxj) obj4).a;
        } else {
            obj2 = ((edwn) obj3).b;
            obj4 = null;
        }
        edwn edwnVar = (edwn) obj3;
        Object obj8 = obj5;
        return new edwu((String) obj8, obj2, edwnVar.c, edwnVar.f, edwnVar.d, edwnVar.e, obj4 != null ? ((edxj) obj4).b : edwnVar.g, (Uri) obj6, edwnVar.h);
    }
}
