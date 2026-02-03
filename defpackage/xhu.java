package defpackage;

import android.view.View;
import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class xhu extends fcyz implements fdat {
    int a;
    final /* synthetic */ xgw b;
    final /* synthetic */ View c;
    final /* synthetic */ Instant d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xhu(xgw xgwVar, View view, Instant instant, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = xgwVar;
        this.c = view;
        this.d = instant;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((xhu) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            xgw xgwVar = this.b;
            View view = this.c;
            Instant instant = this.d;
            instant.getClass();
            this.a = 1;
            if (xgwVar.d(view, instant, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new xhu(this.b, this.c, this.d, fcxyVar);
    }
}
