package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dgxv implements dgxj {
    private final dgxm a;
    private final deyw b;

    public dgxv(dgxm dgxmVar, deyw deywVar) {
        this.a = dgxmVar;
        this.b = deywVar;
    }

    @Override // defpackage.dgxj
    public final dgxi a(dfys dfysVar, dgwg dgwgVar, dhjt dhjtVar, dgiq dgiqVar, dhaw dhawVar, Context context) {
        return new dgxn(dfysVar, dgwgVar, this.a, dhjtVar, context, this.b);
    }
}
