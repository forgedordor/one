package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cfhl implements fcrx {
    public fcrp a;
    final /* synthetic */ cfhm b;
    private final fcsf c;

    public cfhl(cfhm cfhmVar) {
        this.b = cfhmVar;
        this.c = new cfhi(cfhmVar);
    }

    @Override // defpackage.fcsf
    public final void a() {
        if (this.b.H) {
            eieu eieuVarK = eiiy.k("ReceiveMessagesResponseObserver::onCompleted");
            try {
                this.c.a();
                eieuVarK.close();
                return;
            } catch (Throwable th) {
                try {
                    eieuVarK.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        eieh eiehVarC = this.b.i.c("ReceiveMessagesResponseObserver#onCompleted", "com/google/android/apps/messaging/shared/net/handler/bindhandler/BindHandlerImpl$ReceiveMessagesResponseObserver", "onCompleted", 717);
        try {
            this.c.a();
            eiehVarC.close();
        } catch (Throwable th3) {
            try {
                eiehVarC.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    @Override // defpackage.fcsf
    public final void b(Throwable th) {
        if (this.b.H) {
            eieu eieuVarK = eiiy.k("ReceiveMessagesResponseObserver::onError");
            try {
                this.c.b(th);
                eieuVarK.close();
                return;
            } catch (Throwable th2) {
                try {
                    eieuVarK.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        }
        eieh eiehVarC = this.b.i.c("ReceiveMessagesResponseObserver#onError", "com/google/android/apps/messaging/shared/net/handler/bindhandler/BindHandlerImpl$ReceiveMessagesResponseObserver", "onError", 702);
        try {
            this.c.b(th);
            eiehVarC.close();
        } catch (Throwable th4) {
            try {
                eiehVarC.close();
            } catch (Throwable th5) {
                th4.addSuppressed(th5);
            }
            throw th4;
        }
    }

    @Override // defpackage.fcsf
    public final /* synthetic */ void c(Object obj) {
        ezlb ezlbVar = (ezlb) obj;
        if (this.b.H) {
            eieu eieuVarK = eiiy.k("ReceiveMessagesResponseObserver::onNext");
            try {
                this.c.c(ezlbVar);
                eieuVarK.close();
                return;
            } catch (Throwable th) {
                try {
                    eieuVarK.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        eieh eiehVarC = this.b.i.c("ReceiveMessagesResponseObserver#onNext", "com/google/android/apps/messaging/shared/net/handler/bindhandler/BindHandlerImpl$ReceiveMessagesResponseObserver", "onNext", 687);
        try {
            this.c.c(ezlbVar);
            eiehVarC.close();
        } catch (Throwable th3) {
            try {
                eiehVarC.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    @Override // defpackage.fcrx
    public final void d(fcrp fcrpVar) {
        this.a = fcrpVar;
    }

    public final void e() {
        if (this.a != null) {
            ekrw ekrwVarH = cfhm.c.h();
            ekrwVarH.X(eksq.a, "BugleNetwork");
            ((ekrd) ((ekrd) ekrwVarH).h("com/google/android/apps/messaging/shared/net/handler/bindhandler/BindHandlerImpl$ReceiveMessagesResponseObserver", "disconnect", 735, "BindHandlerImpl.java")).t("%s BindHandler: Cancelling stream intentionally. onError will be called but no-op", emjc.a(this.b.J));
            this.a.d("Closing Bind channel", new cfhj());
        }
    }
}
