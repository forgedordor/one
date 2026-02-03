package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class zbs extends fcyz implements fdau {
    /* synthetic */ boolean a;
    /* synthetic */ Object b;

    public zbs(fcxy fcxyVar) {
        super(3, fcxyVar);
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        zbs zbsVar = new zbs((fcxy) obj3);
        zbsVar.a = zBooleanValue;
        zbsVar.b = (List) obj2;
        return zbsVar.b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        return this.a ? this.b : fcvo.a;
    }
}
