package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class awla extends fcyz implements fdat {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ Function c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public awla(Function function, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.c = function;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((awla) c(obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            Object objApply = this.c.apply(this.b);
            objApply.getClass();
            this.a = 1;
            if (fdxs.c((ListenableFuture) objApply, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        awla awlaVar = new awla(this.c, fcxyVar);
        awlaVar.b = obj;
        return awlaVar;
    }
}
