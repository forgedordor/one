package defpackage;

import com.google.android.gms.asterism.SetAsterismConsentRequest;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class davu extends fcyz implements fdat {
    int a;
    final /* synthetic */ davx b;
    final /* synthetic */ SetAsterismConsentRequest c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public davu(fcxy fcxyVar, davx davxVar, SetAsterismConsentRequest setAsterismConsentRequest) {
        super(2, fcxyVar);
        this.b = davxVar;
        this.c = setAsterismConsentRequest;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((davu) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        defn defnVarA = ((dblg) this.b.a.b()).a(this.c);
        this.a = 1;
        Object objA = auwr.a(defnVarA, this);
        return objA == fcylVar ? fcylVar : objA;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        davu davuVar = new davu(fcxyVar, this.b, this.c);
        davuVar.d = obj;
        return davuVar;
    }
}
