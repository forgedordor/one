package defpackage;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cwyz implements cpch {
    private final Context a;
    private final cwyy b;

    public cwyz(Context context, cwyy cwyyVar) {
        this.a = context;
        this.b = cwyyVar;
    }

    @Override // defpackage.cpch
    public final int a() {
        return je.b;
    }

    @Override // defpackage.cpch
    public final void b() {
        this.b.b(1);
    }

    @Override // defpackage.cpch
    public final void c() {
        this.b.b(2);
    }

    @Override // defpackage.cpch
    public final void d() {
        cwyy cwyyVar = this.b;
        final cwyu cwyuVar = cwyyVar.e;
        cwyyVar.f = eijx.h(new eooy() { // from class: cwys
            @Override // defpackage.eooy
            public final ListenableFuture a() {
                return ((ecjh) cwyuVar.a.b()).a();
            }
        }, cwyuVar.b).h(new ejvr() { // from class: cwyt
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return Integer.valueOf(((cwyq) obj).c);
            }
        }, eoqg.a);
    }

    @Override // defpackage.cpch
    public final void e() {
        eiju eijuVar;
        cwyy cwyyVar = this.b;
        if (cwyyVar.g || (eijuVar = cwyyVar.f) == null) {
            ekrw ekrwVarI = cwyy.a.i();
            ekrwVarI.X(eksq.a, "Bugle");
            ((ekrd) ((ekrd) ekrwVarI).h("com/google/android/apps/messaging/ui/dark/DarkModeManager", "setDarkModeOnAppStart", 88, "DarkModeManager.java")).H("DarkModeManager: Unexpected call to setDarkModeOnAppStart. initialized: %s darkModeFuture: %s", cwyyVar.g, cwyyVar.f == null);
            return;
        }
        cwyyVar.g = true;
        if (!eijuVar.isDone()) {
            cwyyVar.f.k(new cwyx(cwyyVar), (Executor) cwyyVar.d.b());
            return;
        }
        try {
            cwyyVar.a(((Integer) eork.q(cwyyVar.f)).intValue());
        } catch (Exception e) {
            ekrw ekrwVarJ = cwyy.a.j();
            ekrwVarJ.X(eksq.a, "Bugle");
            ((ekrd) ((ekrd) ((ekrd) ekrwVarJ).g(e)).h("com/google/android/apps/messaging/ui/dark/DarkModeManager", "setDarkModeOnAppStart", 'c', "DarkModeManager.java")).q("DarkModeManager: Get DarkMode error");
        }
    }

    @Override // defpackage.cpch
    public final void f(int i) {
        this.b.b(i);
    }

    @Override // defpackage.cpch
    public final boolean g() {
        if (!craf.c) {
            return je.b == 2;
        }
        int i = je.b;
        return i != -1 ? i == 2 : (this.a.getResources().getConfiguration().uiMode & 48) == 32;
    }

    @Override // defpackage.cpch
    public final void h() {
    }
}
