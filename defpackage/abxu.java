package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.concurrent.Executor;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abxu implements efzm {
    public static final cqce a = cqce.g("BugleGaia", "AccountChangedLoggingCallbacks");
    public final fcsu b;
    public final fcsu c;
    private final fcsu d;
    private final fcsu e;
    private final fcsu f;
    private final fcsu g;
    private Optional h = Optional.empty();

    public abxu(fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5, fcsu fcsuVar6) {
        this.d = fcsuVar;
        this.b = fcsuVar2;
        this.e = fcsuVar3;
        this.c = fcsuVar4;
        this.f = fcsuVar5;
        this.g = fcsuVar6;
    }

    @Override // defpackage.efzm
    public final void a(final efzk efzkVar) {
        String strB = efzkVar.b();
        if (this.h.isPresent()) {
            String strB2 = ((efzk) this.h.get()).b();
            if (!strB2.equals(strB)) {
                if (strB2.equals("google")) {
                    fcsu fcsuVar = this.c;
                    final cdku cdkuVar = (cdku) fcsuVar.b();
                    auvh.h(cdkuVar.c.j(new ejvr() { // from class: cdkh
                        @Override // defpackage.ejvr
                        public final Object apply(Object obj) {
                            cdjq cdjqVar = (cdjq) ((cdjt) obj).toBuilder();
                            cdjqVar.copyOnWrite();
                            cdjt cdjtVar = (cdjt) cdjqVar.instance;
                            cdjtVar.b |= 16;
                            cdjtVar.f = false;
                            return (cdjt) cdjqVar.build();
                        }
                    }).h(new ejvr() { // from class: cdki
                        @Override // defpackage.ejvr
                        public final Object apply(Object obj) {
                            cdkuVar.e();
                            return null;
                        }
                    }, cdkuVar.d));
                    auvh.h(((cdku) fcsuVar.b()).c(false));
                }
                final boolean zEquals = strB.equals("google");
                final long epochMilli = ((cogw) this.d.b()).f().toEpochMilli();
                final cdku cdkuVar2 = (cdku) this.c.b();
                auvh.h(cdkuVar2.c.j(new ejvr() { // from class: cdkj
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj) {
                        cdjq cdjqVar = (cdjq) ((cdjt) obj).toBuilder();
                        cdjqVar.copyOnWrite();
                        cdjt cdjtVar = (cdjt) cdjqVar.instance;
                        cdjtVar.b |= 8;
                        cdjtVar.e = zEquals;
                        return (cdjt) cdjqVar.build();
                    }
                }).h(new ejvr() { // from class: cdkk
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj) {
                        cdkuVar2.e();
                        return null;
                    }
                }, cdkuVar2.d).i(new eooz() { // from class: abxr
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj) {
                        final cdku cdkuVar3 = (cdku) this.a.c.b();
                        final long jRound = Math.round((epochMilli / 1000.0d) / 3600.0d) * 3600000;
                        return cdkuVar3.c.j(new ejvr() { // from class: cdjx
                            @Override // defpackage.ejvr
                            public final Object apply(Object obj2) {
                                cdjq cdjqVar = (cdjq) ((cdjt) obj2).toBuilder();
                                cdjqVar.copyOnWrite();
                                cdjt cdjtVar = (cdjt) cdjqVar.instance;
                                cdjtVar.b |= 4;
                                cdjtVar.d = jRound;
                                return (cdjt) cdjqVar.build();
                            }
                        }).h(new ejvr() { // from class: cdjy
                            @Override // defpackage.ejvr
                            public final Object apply(Object obj2) {
                                cdkuVar3.e();
                                return null;
                            }
                        }, cdkuVar3.d);
                    }
                }, (Executor) this.g.b()).e(Exception.class, new ejvr() { // from class: abxs
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj) {
                        abxu.a.s("Failed to update sign in status", (Exception) obj);
                        return null;
                    }
                }, (Executor) this.f.b()));
            }
        } else {
            final boolean zEquals2 = strB.equals("google");
            final long epochMilli2 = ((cogw) this.d.b()).f().toEpochMilli();
            final cdku cdkuVar22 = (cdku) this.c.b();
            auvh.h(cdkuVar22.c.j(new ejvr() { // from class: cdkj
                @Override // defpackage.ejvr
                public final Object apply(Object obj) {
                    cdjq cdjqVar = (cdjq) ((cdjt) obj).toBuilder();
                    cdjqVar.copyOnWrite();
                    cdjt cdjtVar = (cdjt) cdjqVar.instance;
                    cdjtVar.b |= 8;
                    cdjtVar.e = zEquals2;
                    return (cdjt) cdjqVar.build();
                }
            }).h(new ejvr() { // from class: cdkk
                @Override // defpackage.ejvr
                public final Object apply(Object obj) {
                    cdkuVar22.e();
                    return null;
                }
            }, cdkuVar22.d).i(new eooz() { // from class: abxr
                @Override // defpackage.eooz
                public final ListenableFuture a(Object obj) {
                    final cdku cdkuVar3 = (cdku) this.a.c.b();
                    final long jRound = Math.round((epochMilli2 / 1000.0d) / 3600.0d) * 3600000;
                    return cdkuVar3.c.j(new ejvr() { // from class: cdjx
                        @Override // defpackage.ejvr
                        public final Object apply(Object obj2) {
                            cdjq cdjqVar = (cdjq) ((cdjt) obj2).toBuilder();
                            cdjqVar.copyOnWrite();
                            cdjt cdjtVar = (cdjt) cdjqVar.instance;
                            cdjtVar.b |= 4;
                            cdjtVar.d = jRound;
                            return (cdjt) cdjqVar.build();
                        }
                    }).h(new ejvr() { // from class: cdjy
                        @Override // defpackage.ejvr
                        public final Object apply(Object obj2) {
                            cdkuVar3.e();
                            return null;
                        }
                    }, cdkuVar3.d);
                }
            }, (Executor) this.g.b()).e(Exception.class, new ejvr() { // from class: abxs
                @Override // defpackage.ejvr
                public final Object apply(Object obj) {
                    abxu.a.s("Failed to update sign in status", (Exception) obj);
                    return null;
                }
            }, (Executor) this.f.b()));
        }
        if (abxb.a()) {
            this.h.ifPresent(new Consumer() { // from class: abxt
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void z(Object obj) {
                    efzk efzkVar2 = (efzk) obj;
                    int iA = efzkVar2.a().a();
                    efzk efzkVar3 = efzkVar;
                    int iA2 = efzkVar3.a().a();
                    String strB3 = efzkVar2.b();
                    String strB4 = efzkVar3.b();
                    if (iA == iA2) {
                        return;
                    }
                    abxu abxuVar = this.a;
                    if (strB3.equals("google") && strB4.equals("google")) {
                        acci acciVar = (acci) abxuVar.b.b();
                        elze elzeVar = (elze) elzg.a.createBuilder();
                        elzeVar.copyOnWrite();
                        elzg elzgVar = (elzg) elzeVar.instance;
                        elzgVar.c = 1;
                        elzgVar.b |= 1;
                        acciVar.a((elzg) elzeVar.build());
                        return;
                    }
                    if (strB3.equals("pseudonymous") && strB4.equals("google")) {
                        acci acciVar2 = (acci) abxuVar.b.b();
                        elze elzeVar2 = (elze) elzg.a.createBuilder();
                        elzeVar2.copyOnWrite();
                        elzg elzgVar2 = (elzg) elzeVar2.instance;
                        elzgVar2.c = 2;
                        elzgVar2.b |= 1;
                        acciVar2.a((elzg) elzeVar2.build());
                        return;
                    }
                    if (strB3.equals("google") && strB4.equals("pseudonymous")) {
                        acci acciVar3 = (acci) abxuVar.b.b();
                        elze elzeVar3 = (elze) elzg.a.createBuilder();
                        elzeVar3.copyOnWrite();
                        elzg elzgVar3 = (elzg) elzeVar3.instance;
                        elzgVar3.c = 3;
                        elzgVar3.b |= 1;
                        acciVar3.a((elzg) elzeVar3.build());
                    }
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            this.h = Optional.of(efzkVar);
        }
        ((ains) this.e.b()).c("Bugle.Account.Changed.Count");
    }

    @Override // defpackage.efzm
    public final void b() {
        ((ains) this.e.b()).c("Bugle.Account.Loading.Count");
    }

    @Override // defpackage.efzm
    public final void c(efyg efygVar) {
        ((ains) this.e.b()).c("Bugle.Account.Error.Count");
    }

    @Override // defpackage.efzm
    public final /* synthetic */ void d() {
    }
}
