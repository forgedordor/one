package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class srl extends fcyz implements fdat {
    final /* synthetic */ srn a;
    final /* synthetic */ Context b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public srl(srn srnVar, Context context, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = srnVar;
        this.b = context;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((srl) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        return Boolean.valueOf(((cqcz) this.a.c.b()).b.h(this.b, 224200000) == 0);
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new srl(this.a, this.b, fcxyVar);
    }
}
