package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jjq extends fdbr implements fdap {
    final /* synthetic */ Context a;
    final /* synthetic */ jjr b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jjq(Context context, jjr jjrVar) {
        super(1);
        this.a = context;
        this.b = jjrVar;
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Context context = this.a;
        Context applicationContext = context.getApplicationContext();
        jjr jjrVar = this.b;
        applicationContext.registerComponentCallbacks(jjrVar);
        return new jjp(context, jjrVar);
    }
}
