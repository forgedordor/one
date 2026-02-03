package defpackage;

import android.util.Log;

/* compiled from: PG */
/* loaded from: classes5.dex */
abstract class ecmo implements ecni {
    final /* synthetic */ ecmp d;

    public ecmo(ecmp ecmpVar) {
        this.d = ecmpVar;
    }

    @Override // defpackage.ecni
    public final void c() {
        Log.v("ASQLDB", ecoa.e(this.d.a.rawQuery("EXPLAIN QUERY PLAN ".concat(b()), null)));
    }
}
