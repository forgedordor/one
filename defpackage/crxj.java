package defpackage;

import android.content.ComponentName;
import android.content.Context;
import com.google.android.apps.messaging.shared.util.spam.aapm.UnusedAapmActivity;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class crxj extends fcyz implements fdat {
    final /* synthetic */ crxn a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public crxj(crxn crxnVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = crxnVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((crxj) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        Context context = this.a.b;
        context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, (Class<?>) UnusedAapmActivity.class), true != crxi.a() ? 2 : 1, 1);
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new crxj(this.a, fcxyVar);
    }
}
