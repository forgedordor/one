package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dyvy implements rlq {
    public final dyyv a;
    private final Context b;

    public dyvy(Context context, dyyv dyyvVar) {
        this.b = context;
        this.a = dyyvVar;
    }

    @Override // defpackage.rlq
    public final /* bridge */ /* synthetic */ rlp a(Object obj, int i, int i2, rex rexVar) {
        dyvv dyvvVar = (dyvv) obj;
        ejwl.b(i == i2, "Width and height must be the same");
        return new rlp(dyvvVar, new dyvx(this, dyvvVar, i == Integer.MIN_VALUE ? 120 : dyyk.b(this.b, i)));
    }

    @Override // defpackage.rlq
    public final /* bridge */ /* synthetic */ boolean b(Object obj) {
        return ((dyvb) ((dyvv) obj).b()).d;
    }
}
