package defpackage;

import android.content.Context;
import defpackage.cydk;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cydm extends fcyz implements fdat {
    int a;
    final /* synthetic */ cydk b;
    Object c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cydm(fcxy fcxyVar, cydk cydkVar) {
        super(2, fcxyVar);
        this.b = cydkVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cydm) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        Class<cydk.a> cls;
        Object obj2;
        fcyl fcylVar = fcyl.a;
        if (this.a != 0) {
            obj2 = this.c;
            cls = (Class) this.d;
            fctl.b(obj);
        } else {
            fctl.b(obj);
            cydk cydkVar = this.b;
            cls = cydk.a.class;
            this.d = cls;
            Context context = cydkVar.c;
            this.c = context;
            this.a = 1;
            obj = cydkVar.d.c(this);
            if (obj == fcylVar) {
                return fcylVar;
            }
            obj2 = context;
        }
        return ((cydk.a) ehlh.a((Context) obj2, cls, (efwo) obj)).fV();
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        cydm cydmVar = new cydm(fcxyVar, this.b);
        cydmVar.d = obj;
        return cydmVar;
    }
}
