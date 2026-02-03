package defpackage;

import android.content.Context;

/* compiled from: PG */
@Deprecated
/* loaded from: classes.dex */
public final class mhw implements mhk {
    private final Context a;
    private final mhk b;

    public mhw(Context context, String str) {
        mhx mhxVar = new mhx();
        mhxVar.a = str;
        this.a = context.getApplicationContext();
        this.b = mhxVar;
    }

    @Override // defpackage.mhk
    public final /* bridge */ /* synthetic */ mhl a() {
        return new mhv(this.a, ((mhx) this.b).a());
    }
}
