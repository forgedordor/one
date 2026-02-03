package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cbmr extends fcyz implements fdau {
    /* synthetic */ Object a;
    /* synthetic */ Object b;

    public cbmr(fcxy fcxyVar) {
        super(3, fcxyVar);
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        cbmr cbmrVar = new cbmr((fcxy) obj3);
        cbmrVar.a = (Map) obj;
        cbmrVar.b = (fcti) obj2;
        return cbmrVar.b(fctx.a);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.Map] */
    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        ?? r3 = this.a;
        fcti fctiVar = (fcti) this.b;
        String str = (String) fctiVar.a;
        cbmk cbmkVar = (cbmk) fctiVar.b;
        Map mapM = fcwa.m(r3);
        mapM.put(str, cbmkVar);
        return mapM;
    }
}
