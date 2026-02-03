package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class egga implements rlq {
    public final Context a;

    public egga(Context context) {
        this.a = context;
    }

    @Override // defpackage.rlq
    public final /* bridge */ /* synthetic */ rlp a(Object obj, int i, int i2, rex rexVar) {
        return new rlp((egju) obj, new egfz(this));
    }

    @Override // defpackage.rlq
    public final /* bridge */ /* synthetic */ boolean b(Object obj) {
        return ((egju) obj).b().k.equals("google");
    }
}
