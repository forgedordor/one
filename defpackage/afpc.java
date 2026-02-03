package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class afpc extends fcyz implements fdau {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ afpe c;
    final /* synthetic */ List d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afpc(fcxy fcxyVar, afpe afpeVar, List list) {
        super(3, fcxyVar);
        this.c = afpeVar;
        this.d = list;
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        afpc afpcVar = new afpc((fcxy) obj3, this.c, this.d);
        afpcVar.e = (fdpm) obj;
        afpcVar.b = (Object[]) obj2;
        return afpcVar.b(fctx.a);
    }

    /* JADX WARN: Type inference failed for: r8v2, types: [fdpm, java.lang.Object] */
    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            ?? r8 = this.e;
            djcq djcqVar = new djcq(fcur.M((dilm[]) this.b), afoz.a, new afpa(this.c, this.d));
            this.a = 1;
            if (r8.fO(djcqVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }
}
