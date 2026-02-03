package defpackage;

import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes2.dex */
class acrc implements egps<Void, Intent> {
    final /* synthetic */ acrt a;

    public acrc(acrt acrtVar) {
        this.a = acrtVar;
    }

    @Override // defpackage.egps
    public final /* bridge */ /* synthetic */ void c(Object obj, Object obj2) {
        this.a.b.startActivityForResult((Intent) obj2, 2);
    }

    @Override // defpackage.egps
    public final /* bridge */ /* synthetic */ void f(Object obj, Throwable th) {
    }

    @Override // defpackage.egps
    public final /* synthetic */ void b(Object obj) {
    }
}
