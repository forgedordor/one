package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dyvt implements rlq {
    private final Context a;

    public dyvt(Context context) {
        this.a = context.getApplicationContext();
    }

    @Override // defpackage.rlq
    public final /* bridge */ /* synthetic */ rlp a(Object obj, int i, int i2, rex rexVar) {
        dyvv dyvvVar = (dyvv) obj;
        ejwl.b(i == i2, "Width and height must be the same");
        dyvk dyvkVar = new dyvk(this.a);
        if (i == Integer.MIN_VALUE) {
            i = 120;
        }
        return new rlp(dyvvVar, new dyvu(dyvkVar, dyvvVar, i));
    }

    @Override // defpackage.rlq
    public final /* bridge */ /* synthetic */ boolean b(Object obj) {
        return dyvk.b(((dyvv) obj).b());
    }
}
