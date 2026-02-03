package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dyqp implements eora {
    final /* synthetic */ View a;
    final /* synthetic */ dyqq b;

    public dyqp(dyqq dyqqVar, View view) {
        this.a = view;
        this.b = dyqqVar;
    }

    @Override // defpackage.eora
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        if (((Boolean) obj).booleanValue()) {
            dyqq dyqqVar = this.b;
            dyqqVar.b.a.onClick(this.a);
        }
        this.b.a();
    }

    @Override // defpackage.eora
    public final void hi(Throwable th) {
        this.b.a();
    }
}
