package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
final /* synthetic */ class xle extends fdbo implements fdap {
    public xle(Object obj) {
        super(1, obj, xlm.class, "onLongPress", "onLongPress(Landroid/content/Context;)Lkotlinx/coroutines/Deferred;", 0);
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Context context = (Context) obj;
        context.getClass();
        xlm xlmVar = (xlm) this.g;
        fdjx fdjxVar = xlmVar.b;
        fcyh fcyhVar = xlmVar.c;
        return fdin.b(fdjxVar, eicg.a(fcyhVar), fdjz.a, new xlk(null, xlmVar, context));
    }
}
