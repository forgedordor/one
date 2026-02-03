package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dxmi extends fcyz implements fdat {
    Object a;
    Object b;
    Object c;
    Object d;
    int e;
    final /* synthetic */ dxmj f;
    final /* synthetic */ String g;
    final /* synthetic */ String h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dxmi(dxmj dxmjVar, String str, String str2, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.f = dxmjVar;
        this.g = str;
        this.h = str2;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dxmi) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        dxft dxftVarE;
        Object obj2;
        Object obj3;
        feav feavVar;
        Object obj4;
        fcyl fcylVar = fcyl.a;
        if (this.e != 0) {
            obj3 = this.d;
            obj2 = this.c;
            Object obj5 = this.b;
            Object obj6 = this.a;
            fctl.b(obj);
            obj4 = obj5;
            feavVar = obj6;
        } else {
            fctl.b(obj);
            if (!fbce.b()) {
                dxmj dxmjVar = this.f;
                String str = this.g;
                String str2 = this.h;
                str.getClass();
                synchronized (dxmjVar.d) {
                    dxftVarE = dxmjVar.e(str, str2);
                }
                return dxftVarE;
            }
            dxmj dxmjVar2 = this.f;
            obj2 = this.g;
            String str3 = this.h;
            feav feavVar2 = dxmjVar2.e;
            this.a = feavVar2;
            this.b = dxmjVar2;
            this.c = obj2;
            this.d = str3;
            this.e = 1;
            if (feavVar2.b(this) == fcylVar) {
                return fcylVar;
            }
            obj3 = str3;
            obj4 = dxmjVar2;
            feavVar = feavVar2;
        }
        try {
            eksp ekspVar = dxmj.a;
            return ((dxmj) obj4).e((String) obj2, (String) obj3);
        } finally {
            feavVar.d();
        }
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dxmi(this.f, this.g, this.h, fcxyVar);
    }
}
