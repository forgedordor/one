package defpackage;

import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ywc extends fcyz implements fdat {
    final /* synthetic */ ywm a;
    final /* synthetic */ Intent b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ywc(ywm ywmVar, Intent intent, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = ywmVar;
        this.b = intent;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ywc) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        eiid.o(this.a.b, this.b);
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new ywc(this.a, this.b, fcxyVar);
    }
}
