package defpackage;

import com.google.common.util.concurrent.SettableFuture;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ehuh extends fbos {
    final eiik a;
    final String b;

    public ehuh(fbnh fbnhVar, String str, eiik eiikVar) {
        super(fbnhVar);
        this.b = str;
        this.a = eiikVar;
    }

    @Override // defpackage.fbot, defpackage.fbnh
    public final void a(final fbng fbngVar, final fbrg fbrgVar) {
        eiik.d(this.a, new Runnable() { // from class: ehug
            @Override // java.lang.Runnable
            public final void run() {
                this.a.b(fbngVar, fbrgVar);
            }
        }).run();
    }

    public final /* synthetic */ void b(fbng fbngVar, fbrg fbrgVar) {
        eieu eieuVarK = eiiy.k(this.b);
        try {
            SettableFuture settableFutureCreate = SettableFuture.create();
            eieuVarK.b(settableFutureCreate);
            super.a(new ehui(fbngVar, settableFutureCreate), fbrgVar);
            eieuVarK.close();
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
