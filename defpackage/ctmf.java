package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ctmf extends fcyz implements fdau {
    /* synthetic */ Object a;
    /* synthetic */ Object b;

    public ctmf(fcxy fcxyVar) {
        super(3, fcxyVar);
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        ctmf ctmfVar = new ctmf((fcxy) obj3);
        ctmfVar.a = (Map) obj;
        ctmfVar.b = (Map) obj2;
        return ctmfVar.b(fctx.a);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.Map] */
    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        return fcwa.j(this.a, this.b);
    }
}
