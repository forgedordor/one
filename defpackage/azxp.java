package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class azxp implements fdae {
    final /* synthetic */ azvv a;
    final /* synthetic */ azxr b;

    public azxp(azvv azvvVar, azxr azxrVar) {
        this.a = azvvVar;
        this.b = azxrVar;
    }

    @Override // defpackage.fdae
    public final /* bridge */ /* synthetic */ Object invoke() throws Exception {
        aysy aysyVar;
        if (this.a.c) {
            final aysy aysyVar2 = this.b.b;
            final dqsy dqsyVarB = aysyVar2.b();
            final dqsy dqsyVarA = aysyVar2.a();
            try {
                aysyVar2.d(dqsyVarB, dqsyVarA, "backupDb");
                AutoCloseable autoCloseable = new AutoCloseable() { // from class: aysw
                    public final /* synthetic */ String d = "backupDb";

                    @Override // java.lang.AutoCloseable
                    public final void close() {
                        aysyVar2.f(dqsyVarB, dqsyVarA, this.d);
                    }
                };
                azxr azxrVar = this.b;
                try {
                    try {
                        azxrVar.b(this.a);
                        fdaa.a(autoCloseable, null);
                    } catch (Exception e) {
                        if (((arjh) azxrVar.h.b()).a() && (e instanceof aysn)) {
                            throw e;
                        }
                        throw new aysm(e);
                    }
                } finally {
                }
            } catch (Exception e2) {
                throw new aysx(e2);
            }
        } else {
            try {
                azxr azxrVar2 = this.b;
                aysy aysyVar3 = azxrVar2.b;
                aysyVar3.d(aysyVar3.b(), aysyVar3.a(), "backupDb");
                azxrVar2.b(this.a);
                aysyVar = this.b.b;
            } catch (Throwable th) {
                try {
                    this.b.i.n(th, "Restore from backup failed!");
                    aysyVar = this.b.b;
                } catch (Throwable th2) {
                    this.b.b.e();
                    throw th2;
                }
            }
            aysyVar.e();
        }
        return fctx.a;
    }
}
