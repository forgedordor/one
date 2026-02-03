package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ctys extends fcyz implements fdau {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ ctzg c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ctys(fcxy fcxyVar, ctzg ctzgVar) {
        super(3, fcxyVar);
        this.c = ctzgVar;
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        ctys ctysVar = new ctys((fcxy) obj3, this.c);
        ctysVar.d = (fdpm) obj;
        ctysVar.b = obj2;
        return ctysVar.b(fctx.a);
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [fdpm, java.lang.Object] */
    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            ?? r4 = this.d;
            fdpl fdplVarB = this.c.l.b((List) this.b);
            this.a = 1;
            if (fdpy.c(r4, fdplVarB, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }
}
