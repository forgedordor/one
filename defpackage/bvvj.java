package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bvvj extends fcyz implements fdat {
    final /* synthetic */ Optional a;
    final /* synthetic */ bvvn b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bvvj(fcxy fcxyVar, Optional optional, bvvn bvvnVar) {
        super(2, fcxyVar);
        this.a = optional;
        this.b = bvvnVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bvvj) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        Optional optional = this.a;
        boolean z = true;
        if (optional.isPresent()) {
            evsx evsxVar = ((ezuu) optional.get()).b;
            evsxVar.getClass();
            if ((evsxVar.contains(new Integer(cefn.ETOUFFEE.h)) && evsxVar.contains(new Integer(cefn.ETOUFFEE_GROUPS.h))) != ((bvur) this.b.e.b()).h()) {
                z = false;
            }
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        bvvj bvvjVar = new bvvj(fcxyVar, this.a, this.b);
        bvvjVar.c = obj;
        return bvvjVar;
    }
}
