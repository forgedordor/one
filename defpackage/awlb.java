package defpackage;

import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class awlb extends fcyz implements fdat {
    int a;
    final /* synthetic */ awlc b;
    final /* synthetic */ Function c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public awlb(awlc awlcVar, Function function, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = awlcVar;
        this.c = function;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((awlb) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            awlc awlcVar = this.b;
            awla awlaVar = new awla(this.c, null);
            this.a = 1;
            if (awlcVar.b(awlaVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        return null;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new awlb(this.b, this.c, fcxyVar);
    }
}
