package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dyvo implements rlr {
    private final Context a;
    private final dyyv b;

    public dyvo(Context context, dyyv dyyvVar) {
        this.a = context;
        this.b = dyyvVar;
    }

    @Override // defpackage.rlr
    public final rlq b(rlz rlzVar) {
        return new dyvy(this.a, this.b);
    }
}
