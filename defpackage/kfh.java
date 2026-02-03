package defpackage;

import android.graphics.Rect;
import android.view.Choreographer;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: PG */
@fcsv
/* loaded from: classes.dex */
public final class kfh implements kep {
    public final View a;
    public boolean b;
    public fdap c;
    public fdap d;
    public kew e;
    public kdy f;
    public final List g;
    public final fctc h;
    public final kdi i;
    public final hum j;
    public Runnable k;
    public final kea l;
    private final Executor m;
    private Rect n;

    public kfh(View view, iro iroVar) {
        kea keaVar = new kea(view);
        final Choreographer choreographer = Choreographer.getInstance();
        Executor executor = new Executor() { // from class: kfj
            @Override // java.util.concurrent.Executor
            public final void execute(final Runnable runnable) {
                choreographer.postFrameCallback(new Choreographer.FrameCallback() { // from class: kfi
                    @Override // android.view.Choreographer.FrameCallback
                    public final void doFrame(long j) {
                        runnable.run();
                    }
                });
            }
        };
        this.a = view;
        this.l = keaVar;
        this.m = executor;
        this.c = kfd.a;
        this.d = kfe.a;
        this.e = new kew("", jyo.a, 4);
        this.f = kdy.a;
        this.g = new ArrayList();
        this.h = fctd.b(3, new kfb(this));
        this.i = new kdi(iroVar, keaVar);
        this.j = new hum(new kfa[16]);
    }

    private final void e(kfa kfaVar) {
        this.j.n(kfaVar);
        if (this.k == null) {
            Runnable runnable = new Runnable() { // from class: kez
                @Override // java.lang.Runnable
                public final void run() {
                    View viewFindFocus;
                    kfh kfhVar = this.a;
                    kfhVar.k = null;
                    View view = kfhVar.a;
                    if (!view.isFocused() && (viewFindFocus = view.getRootView().findFocus()) != null && viewFindFocus.onCheckIsTextEditor()) {
                        kfhVar.j.g();
                        return;
                    }
                    fdci fdciVar = new fdci();
                    fdci fdciVar2 = new fdci();
                    hum humVar = kfhVar.j;
                    Object[] objArr = humVar.a;
                    int i = humVar.b;
                    for (int i2 = 0; i2 < i; i2++) {
                        kfa kfaVar2 = (kfa) objArr[i2];
                        int iOrdinal = kfaVar2.ordinal();
                        if (iOrdinal == 0) {
                            fdciVar.a = true;
                            fdciVar2.a = true;
                        } else if (iOrdinal == 1) {
                            fdciVar.a = false;
                            fdciVar2.a = false;
                        } else {
                            if (iOrdinal != 2 && iOrdinal != 3) {
                                throw new fctg();
                            }
                            if (!fdbq.f(fdciVar.a, false)) {
                                fdciVar2.a = Boolean.valueOf(kfaVar2 == kfa.c);
                            }
                        }
                    }
                    humVar.g();
                    if (fdbq.f(fdciVar.a, true)) {
                        kfhVar.a();
                    }
                    Boolean bool = (Boolean) fdciVar2.a;
                    if (bool != null) {
                        if (bool.booleanValue()) {
                            kfhVar.l.b.b();
                        } else {
                            kfhVar.l.b.a();
                        }
                    }
                    if (fdbq.f(fdciVar.a, false)) {
                        kfhVar.a();
                    }
                }
            };
            this.m.execute(runnable);
            this.k = runnable;
        }
    }

    public final void a() {
        kea keaVar = this.l;
        keaVar.a().restartInput(keaVar.a);
    }

    @Override // defpackage.kep
    @fcsv
    public final void b(ihu ihuVar) {
        Rect rect;
        float f = ihuVar.e;
        this.n = new Rect(fdcu.b(ihuVar.b), fdcu.b(ihuVar.c), fdcu.b(ihuVar.d), fdcu.b(f));
        if (!this.g.isEmpty() || (rect = this.n) == null) {
            return;
        }
        this.a.requestRectangleOnScreen(new Rect(rect));
    }

    @Override // defpackage.kep
    public final void c() {
        e(kfa.a);
    }

    @Override // defpackage.kep
    public final void d(kew kewVar, kdy kdyVar, fdap fdapVar, fdap fdapVar2) {
        this.b = true;
        this.e = kewVar;
        this.f = kdyVar;
        this.c = fdapVar;
        this.d = fdapVar2;
        e(kfa.a);
    }

    @Override // defpackage.kep
    public final void f() {
        this.b = false;
        this.c = kff.a;
        this.d = kfg.a;
        this.n = null;
        e(kfa.b);
    }

    @Override // defpackage.kep
    public final void g(kew kewVar, kew kewVar2) {
        boolean z = true;
        if (jyo.h(this.e.c, kewVar2.c) && fdbq.f(this.e.d, kewVar2.d)) {
            z = false;
        }
        this.e = kewVar2;
        List list = this.g;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            keq keqVar = (keq) ((WeakReference) list.get(i)).get();
            if (keqVar != null) {
                keqVar.a = kewVar2;
            }
        }
        kdi kdiVar = this.i;
        synchronized (kdiVar.a) {
            kdiVar.h = null;
            kdiVar.j = null;
            kdiVar.i = null;
            kdiVar.k = kdg.a;
            kdiVar.l = null;
            kdiVar.m = null;
        }
        if (fdbq.f(kewVar, kewVar2)) {
            if (z) {
                kea keaVar = this.l;
                long j = kewVar2.c;
                int iD = jyo.d(j);
                int iC = jyo.c(j);
                jyo jyoVar = this.e.d;
                int iD2 = jyoVar != null ? jyo.d(jyoVar.b) : -1;
                jyo jyoVar2 = this.e.d;
                keaVar.b(iD, iC, iD2, jyoVar2 != null ? jyo.c(jyoVar2.b) : -1);
                return;
            }
            return;
        }
        if (kewVar != null && (!fdbq.f(kewVar.a(), kewVar2.a()) || (jyo.h(kewVar.c, kewVar2.c) && !fdbq.f(kewVar.d, kewVar2.d)))) {
            a();
            return;
        }
        List list2 = this.g;
        int size2 = list2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            keq keqVar2 = (keq) ((WeakReference) list2.get(i2)).get();
            if (keqVar2 != null) {
                kew kewVar3 = this.e;
                kea keaVar2 = this.l;
                if (keqVar2.d) {
                    keqVar2.a = kewVar3;
                    if (keqVar2.c) {
                        keaVar2.a().updateExtractedText(keaVar2.a, keqVar2.b, keb.a(kewVar3));
                    }
                    jyo jyoVar3 = kewVar3.d;
                    int iD3 = jyoVar3 != null ? jyo.d(jyoVar3.b) : -1;
                    int iC2 = jyoVar3 != null ? jyo.c(jyoVar3.b) : -1;
                    long j2 = kewVar3.c;
                    keaVar2.b(jyo.d(j2), jyo.c(j2), iD3, iC2);
                }
            }
        }
    }

    @Override // defpackage.kep
    public final void h(kew kewVar, kel kelVar, jyi jyiVar, fdap fdapVar, ihu ihuVar, ihu ihuVar2) {
        kdi kdiVar = this.i;
        synchronized (kdiVar.a) {
            kdiVar.h = kewVar;
            kdiVar.j = kelVar;
            kdiVar.i = jyiVar;
            kdiVar.k = fdapVar;
            kdiVar.l = ihuVar;
            kdiVar.m = ihuVar2;
            if (kdiVar.c || kdiVar.b) {
                kdiVar.a();
            }
        }
    }

    @Override // defpackage.kep
    public final void i() {
        e(kfa.d);
    }

    @Override // defpackage.kep
    public final void j() {
        e(kfa.c);
    }
}
