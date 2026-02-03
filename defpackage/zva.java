package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zva extends fcyz implements fdau {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ fctc c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zva(fcxy fcxyVar, fctc fctcVar) {
        super(3, fcxyVar);
        this.c = fctcVar;
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        zva zvaVar = new zva((fcxy) obj3, this.c);
        zvaVar.d = (fdpm) obj;
        zvaVar.b = obj2;
        return zvaVar.b(fctx.a);
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [fdpm, java.lang.Object] */
    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            ?? r4 = this.d;
            fdpl fdplVarC = ((Boolean) this.b).booleanValue() ? zvc.c(this.c) : new fdpu(null);
            this.a = 1;
            if (fdpy.c(r4, fdplVarC, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }
}
