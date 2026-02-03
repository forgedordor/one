package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jjt extends fdbr implements fdap {
    final /* synthetic */ Context a;
    final /* synthetic */ jju b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jjt(Context context, jju jjuVar) {
        super(1);
        this.a = context;
        this.b = jjuVar;
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Context context = this.a;
        Context applicationContext = context.getApplicationContext();
        jju jjuVar = this.b;
        applicationContext.registerComponentCallbacks(jjuVar);
        return new jjs(context, jjuVar);
    }
}
