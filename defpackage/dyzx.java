package defpackage;

import android.accounts.Account;
import android.accounts.OnAccountsUpdateListener;
import android.content.Context;
import android.util.Log;
import com.google.android.libraries.onegoogle.owners.mdi.MdiOwnersLoader;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dyzx implements dyyv {
    private final dvdg a;
    private final dyyl b;
    private final dvdd c = new dyzv(this);
    private final List d = new ArrayList();
    private final MdiOwnersLoader e;
    private final dzae f;
    private final dyzo g;

    public dyzx(Context context, dvdg dvdgVar, dyyl dyylVar, ejwi ejwiVar) {
        context.getClass();
        dvdgVar.getClass();
        this.a = dvdgVar;
        this.b = dyylVar;
        this.g = new dyzo(context, dyylVar, new OnAccountsUpdateListener() { // from class: dyzp
            @Override // android.accounts.OnAccountsUpdateListener
            public final void onAccountsUpdated(Account[] accountArr) {
                dyzx dyzxVar = this.a;
                dyzxVar.j();
                for (Account account : accountArr) {
                    dyzxVar.i(account);
                }
            }
        });
        this.e = new MdiOwnersLoader(context, dvdgVar, dyylVar, ejwiVar);
        this.f = new dzae(dvdgVar, context);
    }

    public static ListenableFuture h(ListenableFuture listenableFuture) {
        return eika.j(listenableFuture, new ejvr() { // from class: dyzq
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return ((ejwi) obj).f();
            }
        }, eoqg.a);
    }

    @Override // defpackage.dyyv
    public final ListenableFuture a() {
        return this.e.a(new ejvr() { // from class: dyzs
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return dyzx.h(((dvdf) obj).b());
            }
        });
    }

    @Override // defpackage.dyyv
    public final ListenableFuture b(final String str) {
        final MdiOwnersLoader mdiOwnersLoader = this.e;
        return eika.k(mdiOwnersLoader.b.a(), new eooz() { // from class: dzaf
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                for (Account account : (List) obj) {
                    final String str2 = str;
                    if (str2.equals(account.name)) {
                        final MdiOwnersLoader mdiOwnersLoader2 = mdiOwnersLoader;
                        final ListenableFuture listenableFutureD = mdiOwnersLoader2.a.a(account).d();
                        return eika.b(listenableFutureD).a(new Callable() { // from class: dzag
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                dyyq dyyqVarM = dyys.m();
                                dyyqVarM.b(str2);
                                mdiOwnersLoader2.b(dyyqVarM, listenableFutureD);
                                return dyyqVarM.a();
                            }
                        }, eoqg.a);
                    }
                }
                return eork.i(null);
            }
        }, eoqg.a);
    }

    @Override // defpackage.dyyv
    public final ListenableFuture c() {
        return this.e.a(new ejvr() { // from class: dyzt
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return ((dvdf) obj).d();
            }
        });
    }

    @Override // defpackage.dyyv
    public final void d(eglg eglgVar) {
        List list = this.d;
        synchronized (list) {
            if (list.isEmpty()) {
                dyzo dyzoVar = this.g;
                synchronized (dyzoVar) {
                    if (!dyzoVar.a) {
                        dyzoVar.c.addOnAccountsUpdatedListener(dyzoVar.b, null, false, new String[]{"com.google"});
                        dyzoVar.a = true;
                    }
                }
                eika.l(this.b.a(), new dyzw(this), eoqg.a);
            }
            list.add(eglgVar);
        }
    }

    @Override // defpackage.dyyv
    public final void e(eglg eglgVar) {
        List list = this.d;
        synchronized (list) {
            if (list.isEmpty()) {
                return;
            }
            list.remove(eglgVar);
            if (list.isEmpty()) {
                dyzo dyzoVar = this.g;
                synchronized (dyzoVar) {
                    if (dyzoVar.a) {
                        try {
                            dyzoVar.c.removeOnAccountsUpdatedListener(dyzoVar.b);
                        } catch (IllegalArgumentException e) {
                            Log.w("OneGoogle", "Failed to remove an OnAccountsUpdatedListener", e);
                        }
                        dyzoVar.a = false;
                    }
                }
            }
        }
    }

    @Override // defpackage.dyyv
    public final ListenableFuture f(String str, int i) {
        return this.f.a(new dzad() { // from class: dyzr
            @Override // defpackage.dzad
            public final ListenableFuture a(dvdf dvdfVar, dvde dvdeVar, int i2) {
                return dyzx.h(dvdfVar.c(dvdeVar, i2));
            }
        }, str, i);
    }

    @Override // defpackage.dyyv
    public final ListenableFuture g(String str, int i) {
        return this.f.a(new dzad() { // from class: dyzu
            @Override // defpackage.dzad
            public final ListenableFuture a(dvdf dvdfVar, dvde dvdeVar, int i2) {
                return dvdfVar.e(dvdeVar, i2);
            }
        }, str, i);
    }

    public final void i(Account account) {
        dvdf dvdfVarA = this.a.a(account);
        dvdd dvddVar = this.c;
        dvdfVarA.h(dvddVar);
        dvdfVarA.g(dvddVar, eoqg.a);
    }

    public final void j() {
        List list = this.d;
        synchronized (list) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((eglg) it.next()).a();
            }
        }
    }
}
