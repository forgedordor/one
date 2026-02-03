package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class xsa extends fcyz implements fdau {
    /* synthetic */ boolean a;
    /* synthetic */ Object b;
    final /* synthetic */ xsc c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xsa(xsc xscVar, fcxy fcxyVar) {
        super(3, fcxyVar);
        this.c = xscVar;
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        xsa xsaVar = new xsa(this.c, (fcxy) obj3);
        xsaVar.a = zBooleanValue;
        xsaVar.b = (xsi) obj2;
        return xsaVar.b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        boolean z = this.a;
        Object obj2 = this.b;
        ((ekrd) xsc.a.h().h("com/google/android/apps/messaging/conversation2/customthemes/SelectedThemeTracker$tonalPaletteProviderFlow$1", "invokeSuspend", 105, "SelectedThemeTracker.kt")).G("RichThemeEnabled: %b, selectedThemeId: %s", z, obj2 != null ? new Integer(((xsi) obj2).a) : null);
        if (!z || obj2 == null) {
            this.c.e.a(true);
            return dlkk.a;
        }
        this.c.e.a(false);
        final dtic dticVar = ((xsi) obj2).b;
        return new fdat() { // from class: xrq
            @Override // defpackage.fdat
            public final Object a(Object obj3, Object obj4) {
                ((Boolean) obj4).booleanValue();
                ((Context) obj3).getClass();
                return dticVar;
            }
        };
    }
}
