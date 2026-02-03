package defpackage;

import android.content.ComponentName;
import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class syy extends fcyz implements fdat {
    final /* synthetic */ syz a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public syy(syz syzVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = syzVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((syy) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        syz syzVar = this.a;
        eieu eieuVarH = eiiy.h("MessagingTemplateScreenServiceEnabler#setComponentBasedOnPhenotypeFlag#scopeBody");
        try {
            Context context = syzVar.b;
            ComponentName componentName = new ComponentName(context, "com.google.android.apps.messaging.auto.MessagingTemplateScreenServiceModule");
            ((eksl) syz.a.f()).r("phenotype flag changed, setting component to new state %b", 1);
            context.getPackageManager().setComponentEnabledSetting(componentName, 1, 1);
            fczl.a(eieuVarH, null);
            return fctx.a;
        } finally {
        }
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new syy(this.a, fcxyVar);
    }
}
