package defpackage;

import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.io.IOException;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes3.dex */
class cvnl implements egzv<abgx> {
    final /* synthetic */ eygg a;
    final /* synthetic */ cvnc b;

    public cvnl(eygg eyggVar, cvnc cvncVar) {
        this.a = eyggVar;
        this.b = cvncVar;
    }

    @Override // defpackage.egzv
    public final /* bridge */ /* synthetic */ void b(Object obj) throws IOException {
        if (((abgx) obj) != abgx.REMOTE) {
            this.b.H().a();
            return;
        }
        Optional optional = (Optional) this.a.b();
        final cvnc cvncVar = this.b;
        optional.ifPresent(new Consumer() { // from class: cvnk
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj2) {
                ((abdk) obj2).d(cvncVar.fg().getIntent());
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        cvncVar.fg().finish();
    }

    @Override // defpackage.egzv
    public final /* synthetic */ void hn() {
    }

    @Override // defpackage.egzv
    public final void a(Throwable th) {
    }
}
