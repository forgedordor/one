package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dgvg implements Runnable {
    final /* synthetic */ dgvh a;

    public dgvg(dgvh dgvhVar) {
        this.a = dgvhVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        dgws dgwsVar = dgws.INITIAL;
        while (true) {
            try {
                try {
                    dgvh dgvhVar = this.a;
                    if (dgvhVar.a == dgws.STOPPED) {
                        break;
                    }
                    if (dgwsVar == dgvhVar.a) {
                        Object obj = dgvhVar.b;
                        synchronized (obj) {
                            try {
                                obj.wait(15000L);
                            } catch (InterruptedException unused) {
                                dhja.q("Interrupted", new Object[0]);
                            }
                        }
                    } else {
                        dgvh dgvhVar2 = this.a;
                        dgws dgwsVar2 = dgvhVar2.a;
                        dhja.c("Processing state: %s", dgwsVar2);
                        if (dgwsVar2 == dgws.INITIAL) {
                            dgvhVar2.a = dgws.STARTING;
                        } else if (dgwsVar2 == dgws.STARTING) {
                            try {
                                dgvhVar2.d();
                            } catch (Exception e) {
                                dhja.i(e, "Error while calling starting: %s", e.getMessage());
                                dgvhVar2.c = e;
                                dgvhVar2.a = dgws.STOPPING;
                            }
                            dgvh dgvhVar3 = this.a;
                            if (dgvhVar3.a == dgws.STARTING) {
                                dgvhVar3.a = dgws.RUNNING;
                                try {
                                    dgvhVar3.c();
                                } catch (Exception e2) {
                                    dhja.i(e2, "Error while calling started: %s", e2.getMessage());
                                    dgvhVar3.c = e2;
                                    dgvhVar3.a = dgws.STOPPING;
                                }
                            }
                        } else if (dgwsVar2 == dgws.RUNNING) {
                            dgvh dgvhVar4 = this.a;
                            try {
                                dgvhVar4.b();
                            } catch (Exception e3) {
                                dhja.i(e3, "Error while calling run: %s", e3.getMessage());
                                dgvhVar4.c = e3;
                                dgvhVar4.a = dgws.STOPPING;
                            }
                        } else if (dgwsVar2 == dgws.STOPPING) {
                            dgvh dgvhVar5 = this.a;
                            try {
                                try {
                                    dhja.c("On stopping", new Object[0]);
                                    Throwable th = dgvhVar5.c;
                                    if (th == null) {
                                        dgvhVar5.f();
                                    } else {
                                        dgvhVar5.g(th);
                                    }
                                } catch (Exception e4) {
                                    dhja.i(e4, "Error while calling stopping: %s", e4.getMessage());
                                    dgvhVar5.a = dgws.STOPPED;
                                }
                            } finally {
                                dgvhVar5.a = dgws.STOPPED;
                            }
                        }
                        dgwsVar = dgwsVar2;
                    }
                } catch (Exception e5) {
                    dhja.i(e5, "Error while running session: %s", e5.getMessage());
                }
            } finally {
                this.a.p();
            }
        }
    }
}
