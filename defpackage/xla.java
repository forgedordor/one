package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
final /* synthetic */ class xla extends fdbo implements fdau {
    public xla(Object obj) {
        super(3, obj, xlm.class, "onError", "onError(Landroid/content/Context;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        Context context = (Context) obj;
        int iIntValue = ((Number) obj2).intValue();
        fcxy fcxyVar = (fcxy) obj3;
        xlm xlmVar = (xlm) this.g;
        if (((xmd) xlmVar.d.b()).h()) {
            return fctx.a;
        }
        xlmVar.b(context, iIntValue);
        Object objD = ((dqex) xlmVar.j.b()).b.d(fcxyVar);
        return objD != fcyl.a ? fctx.a : objD;
    }
}
