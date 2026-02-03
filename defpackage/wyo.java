package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wyo extends fcyz implements fdat {
    int a;
    final /* synthetic */ wyy b;
    final /* synthetic */ vvr c;
    final /* synthetic */ wmv d;
    final /* synthetic */ String e;
    private /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wyo(fcxy fcxyVar, wyy wyyVar, vvr vvrVar, wmv wmvVar, String str) {
        super(2, fcxyVar);
        this.b = wyyVar;
        this.c = vvrVar;
        this.d = wmvVar;
        this.e = str;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((wyo) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        wyy wyyVar = this.b;
        vvr vvrVar = this.c;
        wmv wmvVar = this.d;
        String str = this.e;
        this.a = 1;
        Object objA = wyyVar.f.a(vvrVar, wmvVar, str, this);
        return objA == fcylVar ? fcylVar : objA;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        wyo wyoVar = new wyo(fcxyVar, this.b, this.c, this.d, this.e);
        wyoVar.f = obj;
        return wyoVar;
    }
}
