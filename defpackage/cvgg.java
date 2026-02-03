package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cvgg extends fcyz implements fdau {
    int a;
    /* synthetic */ Object b;
    private /* synthetic */ Object c;

    public cvgg(fcxy fcxyVar) {
        super(3, fcxyVar);
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        cvgg cvggVar = new cvgg((fcxy) obj3);
        cvggVar.c = (fdpm) obj;
        cvggVar.b = (Object[]) obj2;
        return cvggVar.b(fctx.a);
    }

    /* JADX WARN: Type inference failed for: r6v2, types: [fdpm, java.lang.Object] */
    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            ?? r6 = this.c;
            Boolean[] boolArr = (Boolean[]) this.b;
            boolean z = false;
            boolean zBooleanValue = boolArr[0].booleanValue();
            boolean zBooleanValue2 = boolArr[1].booleanValue();
            if (zBooleanValue && zBooleanValue2) {
                z = true;
            }
            Boolean boolValueOf = Boolean.valueOf(z);
            this.a = 1;
            if (r6.fO(boolValueOf, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }
}
