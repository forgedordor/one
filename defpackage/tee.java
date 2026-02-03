package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tee extends fcyz implements fdau {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ tef c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tee(fcxy fcxyVar, tef tefVar) {
        super(3, fcxyVar);
        this.c = tefVar;
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        tee teeVar = new tee((fcxy) obj3, this.c);
        teeVar.d = (fdpm) obj;
        teeVar.b = obj2;
        return teeVar.b(fctx.a);
    }

    /* JADX WARN: Type inference failed for: r6v2, types: [fdpm, java.lang.Object] */
    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            ?? r6 = this.d;
            boolean zBooleanValue = ((Boolean) this.b).booleanValue();
            tef tefVar = this.c;
            if (tefVar.b) {
                tefVar.b = false;
            } else if (zBooleanValue) {
                tefVar.a.f(false);
            }
            fduf fdufVar = tefVar.a;
            this.a = 1;
            if (fdpy.c(r6, fdufVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }
}
