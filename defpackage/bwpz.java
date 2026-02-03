package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bwpz extends fcyz implements fdat {
    final /* synthetic */ bwqa a;
    final /* synthetic */ List b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bwpz(fcxy fcxyVar, bwqa bwqaVar, List list) {
        super(2, fcxyVar);
        this.a = bwqaVar;
        this.b = list;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bwpz) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        return ((celq) this.a.a.b()).b(ekfv.a(this.b));
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        bwpz bwpzVar = new bwpz(fcxyVar, this.a, this.b);
        bwpzVar.c = obj;
        return bwpzVar;
    }
}
