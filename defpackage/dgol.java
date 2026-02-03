package defpackage;

import java.util.Deque;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dgol extends fcyz implements fdat {
    int a;
    final /* synthetic */ dgom b;
    final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dgol(dgom dgomVar, Object obj, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = dgomVar;
        this.c = obj;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dgol) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        Object obj2;
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            dgom dgomVar = this.b;
            Deque deque = dgomVar.k;
            if (deque.isEmpty()) {
                return null;
            }
            if (dgomVar.p.get()) {
                obj2 = ((fcti) deque.getLast()).b;
                deque.clear();
            } else {
                obj2 = this.c;
            }
            this.a = 1;
            if (dgomVar.j(obj2, this) == fcylVar) {
                return fcylVar;
            }
        }
        return null;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dgol(this.b, this.c, fcxyVar);
    }
}
