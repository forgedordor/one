package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ypz extends fcyz implements fdat {
    int a;
    /* synthetic */ boolean b;
    final /* synthetic */ yqa c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ypz(yqa yqaVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.c = yqaVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        return ((ypz) c(bool, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        boolean z;
        fcyl fcylVar = fcyl.a;
        if (this.a != 0) {
            z = this.b;
            fctl.b(obj);
        } else {
            fctl.b(obj);
            z = this.b;
        }
        while (z) {
            yqa yqaVar = this.c;
            yqaVar.i.f(yqaVar.d != null ? new Long(r2.getCurrentPosition()) : new Long(0L));
            this.b = true;
            this.a = 1;
            if (fdkj.c(100L, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        ypz ypzVar = new ypz(this.c, fcxyVar);
        ypzVar.b = ((Boolean) obj).booleanValue();
        return ypzVar;
    }
}
