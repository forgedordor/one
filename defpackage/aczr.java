package defpackage;

import android.content.Context;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aczr implements aczd {
    public final Context a;
    private final eygg b;

    public aczr(Context context, eygg eyggVar) {
        context.getClass();
        eyggVar.getClass();
        this.a = context;
        this.b = eyggVar;
    }

    @Override // defpackage.aczd
    public final acyy a() {
        return new aczq(this);
    }

    @Override // defpackage.aczd
    public final /* synthetic */ acyz b() {
        return new aczs(null);
    }

    @Override // defpackage.aczd
    public final egzv c(final acxm acxmVar) {
        return new egzv<aczs>() { // from class: aczr.1
            @Override // defpackage.egzv
            public final void a(Throwable th) {
                throw new IllegalStateException("onError() aggregatorDataSource=RCS_AVAILABILITY_DATA_SOURCE_KEY", th);
            }

            @Override // defpackage.egzv
            public final /* synthetic */ void b(Object obj) {
                aczs aczsVar = (aczs) obj;
                aczsVar.getClass();
                acxm acxmVar2 = acxmVar;
                aczf aczfVar = acxmVar2.d().a;
                ekgp ekgpVar = aczfVar.a;
                Integer num = aczfVar.b;
                aoio aoioVar = aczsVar.a;
                acxmVar2.d().a = acza.a(ekgpVar, num, aoioVar);
                acxmVar2.l("RCS_AVAILABILITY_DATA_SOURCE_KEY");
            }

            @Override // defpackage.egzv
            public final /* synthetic */ void hn() {
            }
        };
    }

    @Override // defpackage.aczd
    public final eygg d() {
        return this.b;
    }

    @Override // defpackage.aczd
    public final String e() {
        return "RCS_AVAILABILITY_DATA_SOURCE_KEY";
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
