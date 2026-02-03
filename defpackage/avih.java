package defpackage;

import android.net.Uri;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class avih extends egxm {
    public static final eksp a = eksp.c("BugleContacts");
    public final fcsu b;
    public final fcsu c;
    private final fdjx d;
    private final avjl e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public avih(Executor executor, eigp eigpVar, fdjx fdjxVar, fcsu fcsuVar, avjl avjlVar, fcsu fcsuVar2) {
        super(eigpVar, "ContactChangeObserver", executor);
        executor.getClass();
        eigpVar.getClass();
        fdjxVar.getClass();
        fcsuVar.getClass();
        avjlVar.getClass();
        fcsuVar2.getClass();
        this.d = fdjxVar;
        this.b = fcsuVar;
        this.e = avjlVar;
        this.c = fcsuVar2;
    }

    @Override // defpackage.egxm
    public final void a(Uri uri) {
        int i = avdn.a;
        if (!avdn.a()) {
            b();
        }
        ((eksl) a.f()).q("Contacts change observer triggered");
        this.e.a.set(true);
        auvw.k(this.d, null, null, new avig(this, null), 3);
    }

    public final void b() {
        ((egxv) this.b.b()).e(this);
    }
}
