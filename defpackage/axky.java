package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import java.util.concurrent.Callable;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class axky {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/datamodel/accounts/LinkedAccountManager");
    public final egir b;
    public final dqsn c;
    public final egzh d;
    public final ains e;
    private final eosc f;

    public axky(egir egirVar, eosc eoscVar, dqsn dqsnVar, egzh egzhVar, ains ainsVar) {
        this.b = egirVar;
        this.f = eoscVar;
        this.c = dqsnVar;
        this.d = egzhVar;
        this.e = ainsVar;
    }

    public static final int d() {
        String[] strArr = bpyh.a;
        bpye bpyeVar = new bpye(bpyh.a);
        bpyeVar.A("getStoredAccountId");
        boolean z = true;
        bpxu[] bpxuVarArr = {(bpxu) new Function() { // from class: axku
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((bpxt) obj).a;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }.apply(bpyh.c)};
        int iA = bpyh.b().a();
        Integer.valueOf(iA).getClass();
        int iC = -1;
        if (((Integer) bpyh.b.getOrDefault(bpxuVarArr[0].toString(), -1)).intValue() > iA) {
            dqru.x("columnReference.toString()", iA);
        }
        bpyeVar.m(bpxuVarArr);
        bpxv bpxvVar = (bpxv) bpyeVar.b().p();
        try {
            if (bpxvVar.moveToFirst()) {
                int count = bpxvVar.getCount();
                if (count > 1) {
                    z = false;
                }
                ejwl.n(z, "Expected 0 or 1 linked accounts but found %s", count);
                iC = bpxvVar.c();
            }
            bpxvVar.close();
            return iC;
        } catch (Throwable th) {
            try {
                bpxvVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final eiju a() {
        final cpyt cpytVar = new cpyt();
        return eijx.g(new Callable() { // from class: axkx
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Integer.valueOf(axky.d());
            }
        }, this.f).i(new eooz() { // from class: axko
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) throws axlg {
                Integer num = (Integer) obj;
                if (num.intValue() == -1) {
                    ekrw ekrwVarH = axky.a.h();
                    ekrwVarH.X(eksq.a, "BugleCms");
                    ((ekrd) ((ekrd) ekrwVarH).h("com/google/android/apps/messaging/shared/datamodel/accounts/LinkedAccountManager", "getLinkedAccountAsync", 164, "LinkedAccountManager.java")).q("LinkedAccountManager: No valid stored accountId, throwing NoLinkedAccountException.");
                    throw new axlg();
                }
                final cpyt cpytVar2 = cpytVar;
                final axky axkyVar = this.a;
                eiju eijuVarG = eiju.g(axkyVar.b.a(num.intValue()));
                ejvr ejvrVar = new ejvr() { // from class: axkv
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj2) {
                        efwo efwoVar = (efwo) obj2;
                        axkyVar.e.c("Bugle.Cms.LinkedAccountManager.GetLinkedAccountAsync.Success.Count");
                        return efwoVar;
                    }
                };
                eoqg eoqgVar = eoqg.a;
                return eijuVarG.h(ejvrVar, eoqgVar).f(Exception.class, new eooz() { // from class: axkw
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj2) {
                        Exception exc = (Exception) obj2;
                        axkyVar.e.c("Bugle.Cms.LinkedAccountManager.GetLinkedAccountAsync.Failure.Count");
                        cpyu.a(exc, cpytVar2);
                        return eijx.d(exc);
                    }
                }, eoqgVar);
            }
        }, eoqg.a);
    }

    public final void b() {
        ecem.b();
        ekrw ekrwVarH = a.h();
        ekrwVarH.X(eksq.a, "BugleCms");
        ((ekrd) ((ekrd) ekrwVarH).h("com/google/android/apps/messaging/shared/datamodel/accounts/LinkedAccountManager", "clearLinkedAccount", 206, "LinkedAccountManager.java")).q("LinkedAccountManager: clearLinkedAccount triggered.");
        this.c.d("clearLinkedAccount", new Runnable() { // from class: axkt
            @Override // java.lang.Runnable
            public final void run() {
                String[] strArr = bpyh.a;
                bpxz bpxzVar = new bpxz();
                bpxzVar.f("clearLinkedAccount");
                bpxzVar.d();
                if (cpyl.a()) {
                    final axky axkyVar = this.a;
                    axkyVar.c.g(new dqsm() { // from class: axkn
                        @Override // defpackage.dqsm
                        public final eieu a() {
                            return eiiy.k("LAM::clearLinkedAccount::runAfterCommit");
                        }
                    }, "LinkedAccountManager#afterClearLinkedAccount", new Runnable() { // from class: axkr
                        @Override // java.lang.Runnable
                        public final void run() {
                            ekrw ekrwVarH2 = axky.a.h();
                            ekrwVarH2.X(eksq.a, "BugleCms");
                            ((ekrd) ((ekrd) ekrwVarH2).h("com/google/android/apps/messaging/shared/datamodel/accounts/LinkedAccountManager", "clearLinkedAccount", 220, "LinkedAccountManager.java")).q("LinkedAccountManager: notify UI after clearLinkedAccount.");
                            egzh egzhVar = axkyVar.d;
                            egzhVar.a(eijx.e(null), cpyk.a);
                            egzhVar.a(eijx.e(null), cpyk.b);
                        }
                    });
                }
            }
        });
    }

    public final void c(final efwo efwoVar) {
        ecem.b();
        boolean z = false;
        if (efwoVar != null && efwoVar.a() != -1) {
            z = true;
        }
        ejwl.a(z);
        Optional optional = (Optional) this.c.c("LinkedAccountManager#setLinkedAccount", new ejxr() { // from class: axks
            @Override // defpackage.ejxr
            public final Object get() {
                efwo efwoVar2 = efwoVar;
                int iD = axky.d();
                if (iD == efwoVar2.a()) {
                    return Optional.empty();
                }
                if (iD != -1) {
                    return Optional.of(new IllegalStateException(String.format("Cannot link account; one is already linked with id: %s", Integer.valueOf(iD))));
                }
                String[] strArr = bpyh.a;
                bpxq bpxqVar = new bpxq();
                bpxqVar.b(efwoVar2.a());
                bpxn bpxnVarA = bpxqVar.a();
                final dqsy dqsyVarA = bpyh.a();
                dqru.b(bpyh.a(), "linked_account", bpxnVarA, new Function() { // from class: bpxl
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return Long.valueOf(dqsyVarA.P("linked_account", (dqst) obj));
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }, new Consumer() { // from class: bpxm
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void z(Object obj) {
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
                if (cpyl.a()) {
                    final axky axkyVar = this.a;
                    axkyVar.c.g(new dqsm() { // from class: axkp
                        @Override // defpackage.dqsm
                        public final eieu a() {
                            return eiiy.k("LAM::setLinkedAccount::runAfterCommit");
                        }
                    }, "LinkedAccountManager#afterSetLinkedAccount", new Runnable() { // from class: axkq
                        @Override // java.lang.Runnable
                        public final void run() {
                            egzh egzhVar = axkyVar.d;
                            egzhVar.a(eijx.e(null), cpyk.a);
                            egzhVar.a(eijx.e(null), cpyk.b);
                        }
                    });
                }
                return Optional.empty();
            }
        });
        if (optional != null && optional.isPresent()) {
            throw ((RuntimeException) optional.get());
        }
    }
}
