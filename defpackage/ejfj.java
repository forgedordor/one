package defpackage;

import android.app.Application;
import j$.util.Optional;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ejfj extends lxd {
    public final Application a;
    public final fcsu b;
    public final fcsu c;
    public final fcsu d;
    public final ekrg e;
    public final fduf f;
    public final fdvc g;
    public final fdvc h;
    public final fduf i;
    public final fdvc j;
    public boolean k;
    public float l;
    public final hox m;
    public ejgh n;
    public int o;
    public final ArrayList p;
    public boolean q;
    public final fduf r;
    public final fduf s;
    public final fdvc t;
    public final fdvc u;
    public fdae v;
    public final dncj w;
    public final abvd x;
    private final fduf y;

    public ejfj(Application application, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, dncj dncjVar, fcsu fcsuVar4, fcsu fcsuVar5) {
        fcsuVar.getClass();
        fcsuVar2.getClass();
        dncjVar.getClass();
        this.a = application;
        this.b = fcsuVar2;
        this.c = fcsuVar3;
        this.w = dncjVar;
        this.d = fcsuVar4;
        this.e = ekrg.c("com/google/chat/smartmessaging/penpal/ui/EmotifyViewModel");
        fduf fdufVarA = fdvf.a(ejfe.a);
        this.f = fdufVarA;
        this.g = new fduh(fdufVarA);
        fduf fdufVarA2 = fdvf.a(null);
        this.y = fdufVarA2;
        this.h = new fduh(fdufVarA2);
        fduf fdufVarA3 = fdvf.a(null);
        this.i = fdufVarA3;
        this.j = new fduh(fdufVarA3);
        this.m = new hpl(null, hsi.a);
        this.n = new ejgh(null);
        this.p = new ArrayList();
        fduf fdufVarA4 = fdvf.a(null);
        this.r = fdufVarA4;
        fduf fdufVarA5 = fdvf.a(null);
        this.s = fdufVarA5;
        this.t = new fduh(fdufVarA4);
        this.u = new fduh(fdufVarA5);
        Object objB = fcsuVar5.b();
        objB.getClass();
        this.x = (abvd) fdct.b((Optional) objB);
        this.v = new fdae() { // from class: ejff
            @Override // defpackage.fdae
            public final Object invoke() {
                return fctx.a;
            }
        };
    }

    public final void a(ejga ejgaVar) {
        ejgaVar.getClass();
        this.y.f(ejgaVar);
    }

    @Override // defpackage.lxd
    protected final void fC() {
        ((ekrd) this.e.h().h("com/google/chat/smartmessaging/penpal/ui/EmotifyViewModel", "onCleared", 327, "EmotifyViewModel.kt")).q("ViewModel onClear called");
        this.m.b(null);
    }
}
