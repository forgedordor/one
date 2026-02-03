package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pea extends fcyz implements fdat {
    final /* synthetic */ String[] a;
    final /* synthetic */ peb b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pea(String[] strArr, peb pebVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = strArr;
        this.b = pebVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((pea) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        String[] strArr = this.a;
        fcwm.d(Arrays.copyOf(strArr, strArr.length));
        fdue fdueVar = this.b.b;
        throw null;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new pea(this.a, this.b, fcxyVar);
    }
}
