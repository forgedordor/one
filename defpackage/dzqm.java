package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dzqm implements dzix {
    final /* synthetic */ eosd a;
    final /* synthetic */ dzqo b;

    public dzqm(dzqo dzqoVar, eosd eosdVar) {
        this.a = eosdVar;
        this.b = dzqoVar;
    }

    @Override // defpackage.dzix
    public final void i(final dzfh dzfhVar) {
        dzqo dzqoVar = this.b;
        dzqoVar.d.a(3, dzfhVar.a);
        dzqoVar.a();
        dzqoVar.f = this.a.schedule(new Runnable() { // from class: dzqk
            @Override // java.lang.Runnable
            public final void run() {
                this.a.b.d.a(5, dzfhVar.a);
            }
        }, 10L, TimeUnit.SECONDS);
    }

    @Override // defpackage.dzix
    public final void j(final dzfh dzfhVar) {
        dzqo dzqoVar = this.b;
        dzqoVar.d.a(4, dzfhVar.a);
        dzqoVar.a();
        dzqoVar.e = this.a.schedule(new Runnable() { // from class: dzql
            @Override // java.lang.Runnable
            public final void run() {
                this.a.b.d.a(6, dzfhVar.a);
            }
        }, 10L, TimeUnit.SECONDS);
    }
}
