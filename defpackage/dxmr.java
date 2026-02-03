package defpackage;

import android.content.Context;
import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dxmr implements dxmn {
    public static final eksp a = eksp.c("GnpSdk");
    public final Context b;
    public final Class c;
    public final dxtx d;
    private final fcyh e;

    public dxmr(Context context, fcyh fcyhVar, Class cls, dxtx dxtxVar) {
        context.getClass();
        fcyhVar.getClass();
        cls.getClass();
        dxtxVar.getClass();
        this.b = context;
        this.e = fcyhVar;
        this.c = cls;
        this.d = dxtxVar;
    }

    @Override // defpackage.dxmn
    public final Object a(dxml dxmlVar, dxhe dxheVar, Bundle bundle, Long l, fcxy fcxyVar) {
        return fdin.a(this.e, new dxmq(dxmlVar, this, dxheVar, bundle, l, null), fcxyVar);
    }

    @Override // defpackage.dxmn
    public final Object b(int i, fcxy fcxyVar) {
        Object objA = fdin.a(this.e, new dxmp(this, i, null), fcxyVar);
        return objA == fcyl.a ? objA : fctx.a;
    }
}
