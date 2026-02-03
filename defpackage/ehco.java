package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ehco {
    public final egzo a;
    public ehcn b;
    public ehba c;
    public boolean d = false;
    public boolean e = false;
    private final Executor f;

    public ehco(egzo egzoVar, Executor executor) {
        this.a = egzoVar;
        this.f = executor;
    }

    final void a(ehaw ehawVar) {
        ecem.c();
        ejwl.l(!this.e);
        ehcn ehcnVar = this.b;
        if (ehcnVar != null) {
            ehcnVar.close();
            egzo egzoVar = this.a;
            ehcn ehcnVar2 = this.b;
            egzoVar.e(ehcnVar2.a, ehcnVar2);
        }
        ehcn ehcnVar3 = new ehcn(this, ehawVar, this.f);
        this.b = ehcnVar3;
        this.a.d(ehcnVar3.a, ehcnVar3);
    }
}
