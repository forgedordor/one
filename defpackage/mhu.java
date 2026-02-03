package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mhu implements mhk {
    private final Context a;
    private final mhk b;

    public mhu(Context context) {
        mhx mhxVar = new mhx();
        this.a = context.getApplicationContext();
        this.b = mhxVar;
    }

    @Override // defpackage.mhk
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final mhv a() {
        return new mhv(this.a, ((mhx) this.b).a());
    }
}
