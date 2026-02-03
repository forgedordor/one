package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dupe implements eyif {
    private final eyik a;
    private final eyik b;
    private final eyik c;
    private final eyik d;
    private final eyik e;
    private final eyik f;

    public dupe(eyik eyikVar, eyik eyikVar2, eyik eyikVar3, eyik eyikVar4, eyik eyikVar5, eyik eyikVar6) {
        this.a = eyikVar;
        this.b = eyikVar2;
        this.c = eyikVar3;
        this.d = eyikVar4;
        this.e = eyikVar5;
        this.f = eyikVar6;
    }

    @Override // defpackage.fcsu
    public final /* bridge */ /* synthetic */ Object b() {
        ((duoq) this.a).b();
        duag duagVar = (duag) this.b.b();
        dtvq dtvqVar = (dtvq) this.c.b();
        ecjh ecjhVar = (ecjh) this.d.b();
        Executor executor = (Executor) this.e.b();
        return new dulr(duagVar, dtvqVar, ecjhVar, executor);
    }
}
