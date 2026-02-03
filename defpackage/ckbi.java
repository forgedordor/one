package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class ckbi extends fcyz implements fdat {
    Object a;
    int b;
    final /* synthetic */ ckbk c;
    final /* synthetic */ ckbz d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ckbi(ckbk ckbkVar, ckbz ckbzVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.c = ckbkVar;
        this.d = ckbzVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ckbi) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        Object obj2;
        ckbk ckbkVar;
        fcyl fcylVar = fcyl.a;
        int i = this.b;
        if (i == 0) {
            fctl.b(obj);
            ckbk ckbkVar2 = this.c;
            this.b = 1;
            obj = ckbkVar2.i(this);
            if (obj != fcylVar) {
            }
            return fcylVar;
        }
        if (i != 1) {
            if (i != 2) {
                fctl.b(obj);
                return null;
            }
            obj2 = this.a;
            fctl.b(obj);
            if (obj2 == ckbz.TOGGLE_STATE_AUTOMATICALLY_DISABLED && this.d == ckbz.TOGGLE_STATE_ENABLED) {
                ckbkVar = this.c;
                this.a = null;
                this.b = 3;
                if (ckbkVar.r(this) != fcylVar) {
                    return fcylVar;
                }
            }
            return null;
        }
        fctl.b(obj);
        ckbk ckbkVar3 = this.c;
        ckbz ckbzVar = this.d;
        ckbz ckbzVar2 = (ckbz) obj;
        this.a = ckbzVar2;
        this.b = 2;
        if (ckbkVar3.A(ckbzVar, this) != fcylVar) {
            obj2 = ckbzVar2;
            if (obj2 == ckbz.TOGGLE_STATE_AUTOMATICALLY_DISABLED) {
                ckbkVar = this.c;
                this.a = null;
                this.b = 3;
                if (ckbkVar.r(this) != fcylVar) {
                }
            }
            return null;
        }
        return fcylVar;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new ckbi(this.c, this.d, fcxyVar);
    }
}
