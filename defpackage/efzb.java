package defpackage;

import android.content.Intent;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efzb implements efyt {
    public static final ekrg a = ekrg.c("com/google/apps/tiktok/account/api/controller/AccountRequirementManagerImpl");
    public final List b = new ArrayList();
    private final efyf c;
    private final eosc d;

    public efzb(efyf efyfVar, eosc eoscVar) {
        this.c = efyfVar;
        this.d = eoscVar;
    }

    private final ListenableFuture h(final efwo efwoVar, ekgb ekgbVar) {
        ekgbVar.getClass();
        if (efwoVar == null) {
            return eork.h(new egdj());
        }
        ListenableFuture listenableFutureG = g(efwoVar, ekgbVar, null);
        ejvr ejvrVarA = eiid.a(new ejvr() { // from class: efyz
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                throw new egdj((Throwable) obj);
            }
        });
        eoqg eoqgVar = eoqg.a;
        return eooq.f(eooh.f(listenableFutureG, Throwable.class, ejvrVarA, eoqgVar), eiid.a(new ejvr() { // from class: efza
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                if (((egbd) obj).c()) {
                    return efwoVar;
                }
                throw new egdj("Requirements not met for account.");
            }
        }), eoqgVar);
    }

    @Override // defpackage.efyt
    public final ListenableFuture a(efwo efwoVar) {
        int i = ekgb.d;
        return h(efwoVar, ekoe.a);
    }

    @Override // defpackage.efyt
    public final void b(efys efysVar) {
        ecem.c();
        List list = this.b;
        synchronized (list) {
            list.add(efysVar);
        }
    }

    @Override // defpackage.efyt
    public final void c(efys efysVar) {
        ecem.c();
        List list = this.b;
        synchronized (list) {
            list.remove(efysVar);
        }
    }

    @Override // defpackage.efyt
    public final void d() {
        eork.n(eiid.c(new eooy() { // from class: efyv
            @Override // defpackage.eooy
            public final ListenableFuture a() {
                ekgb ekgbVarN;
                ListenableFuture listenableFutureI;
                List list = this.a.b;
                synchronized (list) {
                    ekgbVarN = ekgb.n(list);
                }
                ArrayList arrayList = new ArrayList(ekgbVarN.size());
                int size = ekgbVarN.size();
                for (int i = 0; i < size; i++) {
                    try {
                        listenableFutureI = ((efys) ekgbVarN.get(i)).g();
                    } catch (Throwable th) {
                        ((ekrd) ((ekrd) ((ekrd) efzb.a.i()).g(th)).h("com/google/apps/tiktok/account/api/controller/AccountRequirementManagerImpl", "notifyRequirementStateChanged", (char) 198, "AccountRequirementManagerImpl.java")).q("OnRequirementStateChanged observer failed.");
                        listenableFutureI = eork.i(null);
                    }
                    arrayList.add(listenableFutureI);
                }
                return eork.a(arrayList).a(new eopa(null), eoqg.a);
            }
        }), this.d);
    }

    @Override // defpackage.efyt
    public final ekgb e() {
        int i = ekgb.d;
        return ekoe.a;
    }

    @Override // defpackage.efyt
    public final ListenableFuture f(efwo efwoVar, ekgb ekgbVar) {
        return h(efwoVar, ekgbVar);
    }

    @Override // defpackage.efyt
    public final ListenableFuture g(final efwo efwoVar, final List list, final Intent intent) {
        eieu eieuVarK = eiiy.k("Validate Requirements");
        try {
            ListenableFuture listenableFutureG = eooq.g(this.c.a(efwoVar, new efyr(intent)), eiid.d(new eooz() { // from class: efyu
                @Override // defpackage.eooz
                public final ListenableFuture a(Object obj) {
                    List<efyq> list2 = list;
                    ArrayList arrayList = new ArrayList(list2.size());
                    for (final efyq efyqVar : list2) {
                        final Intent intent2 = intent;
                        final efwo efwoVar2 = efwoVar;
                        arrayList.add(new eooy() { // from class: efyw
                            @Override // defpackage.eooy
                            public final ListenableFuture a() {
                                return efyqVar.a(efwoVar2, new efyr(intent2));
                            }
                        });
                    }
                    ejwm ejwmVar = new ejwm() { // from class: efyx
                        @Override // defpackage.ejwm
                        public final boolean a(Object obj2) {
                            return !((egbd) obj2).c();
                        }
                    };
                    eoqg eoqgVar = eoqg.a;
                    return eooq.f(egax.a(arrayList, ejwmVar, eoqgVar), eiid.a(new ejvr() { // from class: efyy
                        @Override // defpackage.ejvr
                        public final Object apply(Object obj2) {
                            egbd egbdVar = (egbd) obj2;
                            return egbdVar == null ? egbd.d() : egbdVar;
                        }
                    }), eoqgVar);
                }
            }), eoqg.a);
            eieuVarK.b(listenableFutureG);
            eieuVarK.close();
            return listenableFutureG;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
