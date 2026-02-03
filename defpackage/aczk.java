package defpackage;

import j$.util.Optional;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aczk implements aczd {
    public final fdjx a;
    public final Optional b;
    public final fcsu c;
    private final eygg d;

    public aczk(eygg eyggVar, fdjx fdjxVar, Optional optional, fcsu fcsuVar) {
        eyggVar.getClass();
        fdjxVar.getClass();
        fcsuVar.getClass();
        this.d = eyggVar;
        this.a = fdjxVar;
        this.b = optional;
        this.c = fcsuVar;
    }

    @Override // defpackage.aczd
    public final acyy a() {
        return new aczj(this);
    }

    @Override // defpackage.aczd
    public final /* synthetic */ acyz b() {
        return new aczl(null);
    }

    @Override // defpackage.aczd
    public final egzv c(final acxm acxmVar) {
        return new egzv<aczl>() { // from class: aczk.1
            @Override // defpackage.egzv
            public final void a(Throwable th) {
                throw new IllegalStateException("onError() aggregatorDataSource=GROUP_UPGRADE_KEY", th);
            }

            @Override // defpackage.egzv
            public final /* synthetic */ void b(Object obj) {
                aczl aczlVar = (aczl) obj;
                aczlVar.getClass();
                if (((apwp) aczk.this.c.b()).a()) {
                    acxm acxmVar2 = acxmVar;
                    aczf aczfVar = acxmVar2.d().a;
                    ekgp ekgpVar = aczfVar.a;
                    aoio aoioVar = aczfVar.c;
                    Integer num = aczlVar.a;
                    acxmVar2.d().a = acza.a(ekgpVar, num, aoioVar);
                    acxmVar2.l("GROUP_UPGRADE_KEY");
                }
            }

            @Override // defpackage.egzv
            public final /* synthetic */ void hn() {
            }
        };
    }

    @Override // defpackage.aczd
    public final eygg d() {
        return this.d;
    }

    @Override // defpackage.aczd
    public final String e() {
        return "GROUP_UPGRADE_KEY";
    }

    @Override // defpackage.aczd
    public final /* synthetic */ void f(lvc lvcVar, egzh egzhVar) {
        aczc.a(this, lvcVar, egzhVar);
    }

    @Override // defpackage.aczd
    public final /* synthetic */ void g(ehac ehacVar, bvel bvelVar, acxm acxmVar, AtomicBoolean atomicBoolean) {
        aczc.b(this, ehacVar, bvelVar, acxmVar, atomicBoolean);
    }
}
