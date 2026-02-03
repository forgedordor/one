package defpackage;

import com.google.android.libraries.onegoogle.owners.mdi.MdiNotAvailableException;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dzar implements dyyv {
    public final dyyv a;
    final /* synthetic */ dzas b;
    private final dyyv c;
    private eksp d;

    public dzar(dzas dzasVar, dyyv dyyvVar, dyyv dyyvVar2) {
        this.b = dzasVar;
        this.c = dyyvVar;
        this.a = dyyvVar2;
    }

    private final ListenableFuture i(final ejvr ejvrVar) {
        return eika.f((ListenableFuture) ejvrVar.apply(this.c), MdiNotAvailableException.class, new eooz() { // from class: dzaq
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                dzar dzarVar = this.a;
                dzarVar.h((MdiNotAvailableException) obj);
                return (ListenableFuture) ejvrVar.apply(dzarVar.a);
            }
        }, eoqg.a);
    }

    private final ListenableFuture j(final dzaj dzajVar, final String str, final int i) {
        return eika.f(dzajVar.a(this.c, str, i), MdiNotAvailableException.class, new eooz() { // from class: dzap
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                dzar dzarVar = this.a;
                dzarVar.h((MdiNotAvailableException) obj);
                return dzajVar.a(dzarVar.a, str, i);
            }
        }, eoqg.a);
    }

    @Override // defpackage.dyyv
    public final ListenableFuture a() {
        return i(new ejvr() { // from class: dzal
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return ((dyyv) obj).a();
            }
        });
    }

    @Override // defpackage.dyyv
    public final ListenableFuture b(final String str) {
        return eika.f(this.c.b(str), MdiNotAvailableException.class, new eooz() { // from class: dzak
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                dzar dzarVar = this.a;
                dzarVar.h((MdiNotAvailableException) obj);
                return dzarVar.a.b(str);
            }
        }, eoqg.a);
    }

    @Override // defpackage.dyyv
    public final ListenableFuture c() {
        return i(new ejvr() { // from class: dzam
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return ((dyyv) obj).c();
            }
        });
    }

    @Override // defpackage.dyyv
    public final void d(eglg eglgVar) {
        List list = this.b.b;
        synchronized (list) {
            list.add(eglgVar);
            this.c.d(eglgVar);
        }
    }

    @Override // defpackage.dyyv
    public final void e(eglg eglgVar) {
        List list = this.b.b;
        synchronized (list) {
            list.remove(eglgVar);
            this.c.e(eglgVar);
        }
    }

    @Override // defpackage.dyyv
    public final ListenableFuture f(String str, int i) {
        return j(new dzaj() { // from class: dzan
            @Override // defpackage.dzaj
            public final ListenableFuture a(dyyv dyyvVar, String str2, int i2) {
                return dyyvVar.f(str2, i2);
            }
        }, str, i);
    }

    @Override // defpackage.dyyv
    public final ListenableFuture g(String str, int i) {
        return j(new dzaj() { // from class: dzao
            @Override // defpackage.dzaj
            public final ListenableFuture a(dyyv dyyvVar, String str2, int i2) {
                return dyyvVar.g(str2, i2);
            }
        }, str, i);
    }

    public final void h(Exception exc) {
        dzas dzasVar = this.b;
        List list = dzasVar.b;
        synchronized (list) {
            if (this.d == null) {
                this.d = eksp.c("OneGoogle");
            }
            ((eksl) ((eksl) this.d.j()).h("com/google/android/libraries/onegoogle/owners/mdi/SafeMdiOwnersProvider$SafeDelegate", "enableSafeDelegate", 190, "SafeMdiOwnersProvider.java")).t("MDI Profile Sync not available on device. Reverting to backup implementation. Exception: %s", dyqf.a(exc));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                this.a.d((eglg) it.next());
            }
            dzasVar.a = this.a;
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                this.c.e((eglg) it2.next());
            }
            list.clear();
        }
    }
}
