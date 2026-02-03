package defpackage;

import android.content.Context;
import defpackage.cybf;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cybj extends fcyz implements fdat {
    int a;
    final /* synthetic */ cybf b;
    Object c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cybj(fcxy fcxyVar, cybf cybfVar) {
        super(2, fcxyVar);
        this.b = cybfVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cybj) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        Class<cybf.a> cls;
        Object obj2;
        fcyl fcylVar = fcyl.a;
        if (this.a != 0) {
            obj2 = this.c;
            cls = (Class) this.d;
            fctl.b(obj);
        } else {
            fctl.b(obj);
            cybf cybfVar = this.b;
            cls = cybf.a.class;
            this.d = cls;
            Context context = cybfVar.c;
            this.c = context;
            this.a = 1;
            obj = cybfVar.d.c(this);
            if (obj == fcylVar) {
                return fcylVar;
            }
            obj2 = context;
        }
        return ((cybf.a) ehlh.a((Context) obj2, cls, (efwo) obj)).fU();
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        cybj cybjVar = new cybj(fcxyVar, this.b);
        cybjVar.d = obj;
        return cybjVar;
    }
}
