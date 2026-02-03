package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adag implements aczd {
    private final eygg a;

    public adag(eygg eyggVar) {
        eyggVar.getClass();
        this.a = eyggVar;
    }

    @Override // defpackage.aczd
    public final acyy a() {
        return new adaf();
    }

    @Override // defpackage.aczd
    public final /* synthetic */ acyz b() {
        return new adah(ekoj.a);
    }

    @Override // defpackage.aczd
    public final egzv c(final acxm acxmVar) {
        return new egzv<adah>() { // from class: adag.1
            @Override // defpackage.egzv
            public final void a(Throwable th) {
                throw new IllegalStateException("onError() aggregatorDataSource=TYPING_INDICATOR_KEY", th);
            }

            @Override // defpackage.egzv
            public final /* synthetic */ void b(Object obj) {
                adah adahVar = (adah) obj;
                adahVar.getClass();
                acxm acxmVar2 = acxmVar;
                aczf aczfVar = acxmVar2.d().a;
                Integer num = aczfVar.b;
                aoio aoioVar = aczfVar.c;
                ekgp ekgpVar = adahVar.a;
                acxmVar2.d().a = acza.a(ekgpVar, num, aoioVar);
                acxmVar2.l("TYPING_INDICATOR_KEY");
            }

            @Override // defpackage.egzv
            public final /* synthetic */ void hn() {
            }
        };
    }

    @Override // defpackage.aczd
    public final eygg d() {
        return this.a;
    }

    @Override // defpackage.aczd
    public final String e() {
        return "TYPING_INDICATOR_KEY";
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
