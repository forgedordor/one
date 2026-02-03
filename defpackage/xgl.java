package defpackage;

import android.content.Context;
import android.widget.Toast;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class xgl extends fcyz implements fdat {
    final /* synthetic */ Context a;
    final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xgl(Context context, int i, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = context;
        this.b = i;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((xgl) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        Context context = this.a;
        Toast.makeText(context, context.getString(this.b), 0).show();
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new xgl(this.a, this.b, fcxyVar);
    }
}
