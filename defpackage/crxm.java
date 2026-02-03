package defpackage;

import android.content.Context;
import android.os.Build;
import android.security.advancedprotection.AdvancedProtectionManager$Callback;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class crxm extends fcyz implements fdat {
    final /* synthetic */ crxn a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public crxm(crxn crxnVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = crxnVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((crxm) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        boolean zB = eicg.b(u());
        final crxn crxnVar = this.a;
        if (!zB) {
            throw new IllegalStateException("TikTok trace may not live through suspension without TikTok provided CoroutineContext");
        }
        eieu eieuVarH = eiiy.h("AapmManager.registerCallback");
        try {
            Context context = crxnVar.b;
            eosc eoscVar = crxnVar.e;
            final fdap fdapVar = new fdap() { // from class: crxk
                @Override // defpackage.fdap
                public final Object invoke(Object obj2) {
                    boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                    crxn crxnVar2 = crxnVar;
                    auvw.m(crxnVar2.f, null, new crxl(crxnVar2, zBooleanValue, null), 3);
                    return fctx.a;
                }
            };
            if (Build.VERSION.SDK_INT >= 36) {
                Object systemService = context.getSystemService("advanced_protection");
                systemService.getClass();
                aao$$ExternalSyntheticApiModelOutline4.m11m(systemService).registerAdvancedProtectionCallback(eoscVar, new AdvancedProtectionManager$Callback() { // from class: crxo
                    public final void onAdvancedProtectionChanged(boolean z) {
                        fdapVar.invoke(Boolean.valueOf(z));
                    }
                });
            }
            fczl.a(eieuVarH, null);
            return fctx.a;
        } finally {
        }
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new crxm(this.a, fcxyVar);
    }
}
