package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bwpg extends fcyz implements fdat {
    int a;
    final /* synthetic */ bwps b;
    final /* synthetic */ List c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bwpg(fcxy fcxyVar, bwps bwpsVar, List list) {
        super(2, fcxyVar);
        this.b = bwpsVar;
        this.c = list;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bwpg) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        bwqa bwqaVar = (bwqa) this.b.c.b();
        List list = this.c;
        this.a = 1;
        Object objB = bwqaVar.b(list, this);
        return objB == fcylVar ? fcylVar : objB;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        bwpg bwpgVar = new bwpg(fcxyVar, this.b, this.c);
        bwpgVar.d = obj;
        return bwpgVar;
    }
}
