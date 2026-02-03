package defpackage;

import android.content.Context;
import android.content.res.Resources;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rkt implements rlq {
    private final Context a;
    private final rks b;

    public rkt(Context context, rks rksVar) {
        this.a = context.getApplicationContext();
        this.b = rksVar;
    }

    @Override // defpackage.rlq
    public final /* bridge */ /* synthetic */ rlp a(Object obj, int i, int i2, rex rexVar) {
        Integer num = (Integer) obj;
        Resources.Theme theme = (Resources.Theme) rexVar.b(rqk.a);
        return new rlp(new ruq(num), new rkr(theme, theme != null ? theme.getResources() : this.a.getResources(), this.b, num.intValue()));
    }

    @Override // defpackage.rlq
    public final /* bridge */ /* synthetic */ boolean b(Object obj) {
        return true;
    }
}
