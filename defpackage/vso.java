package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
final /* synthetic */ class vso extends fdbo implements fdap {
    public vso(Object obj) {
        super(1, obj, vsx.class, "onInteractive", "onInteractive(Landroid/content/Context;)V", 0);
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Context context = (Context) obj;
        context.getClass();
        vsx vsxVar = (vsx) this.g;
        vsxVar.c.c(context);
        if (vsxVar.d.a()) {
            vsxVar.g.a(aadk.a);
        }
        return fctx.a;
    }
}
