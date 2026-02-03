package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aajx extends fcyz implements fdaw {
    /* synthetic */ boolean a;
    /* synthetic */ Object b;
    /* synthetic */ Object c;
    /* synthetic */ Object d;
    final /* synthetic */ aajy e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aajx(aajy aajyVar, fcxy fcxyVar) {
        super(5, fcxyVar);
        this.e = aajyVar;
    }

    @Override // defpackage.fdaw
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        aajx aajxVar = new aajx(this.e, (fcxy) obj5);
        aajxVar.a = zBooleanValue;
        aajxVar.b = (aahj) obj2;
        aajxVar.c = (dlnq) obj3;
        aajxVar.d = (List) obj4;
        return aajxVar.b(fctx.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [dlnq] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, java.util.List] */
    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        boolean z = this.a;
        Object obj2 = this.b;
        Object obj3 = this.c;
        ?? r4 = this.d;
        ?? r2 = obj3;
        if (obj3 == null) {
            r2 = dlnk.a;
        }
        aahj aahjVar = (aahj) obj2;
        return new dloh(r2, new dihq(aahjVar.a, aahjVar.b, false, false, false, aahjVar.d, null, false, null, aahjVar.e, 988), r4, false, z, new aajw(this.e), new dlog(null), 8);
    }
}
