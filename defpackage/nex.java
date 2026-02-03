package defpackage;

import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nex {
    public final int a;
    public final nen b;
    public final CopyOnWriteArrayList c;

    public nex(CopyOnWriteArrayList copyOnWriteArrayList, nen nenVar) {
        this.c = copyOnWriteArrayList;
        this.a = 0;
        this.b = nenVar;
    }

    public final void a(final meo meoVar) {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            C0186new c0186new = (C0186new) it.next();
            final ney neyVar = c0186new.b;
            mgb.an(c0186new.a, new Runnable() { // from class: nev
                @Override // java.lang.Runnable
                public final void run() {
                    meoVar.a(neyVar);
                }
            });
        }
    }

    public final void b(final nej nejVar) {
        a(new meo() { // from class: neq
            @Override // defpackage.meo
            public final void a(Object obj) {
                ((ney) obj).eB(0, this.a.b, nejVar);
            }
        });
    }

    public final void c(final nee neeVar, final nej nejVar) {
        a(new meo() { // from class: neu
            @Override // defpackage.meo
            public final void a(Object obj) {
                ((ney) obj).eC(0, this.a.b, neeVar, nejVar);
            }
        });
    }

    public final void d(final nee neeVar, final nej nejVar) {
        a(new meo() { // from class: nes
            @Override // defpackage.meo
            public final void a(Object obj) {
                ((ney) obj).eD(0, this.a.b, neeVar, nejVar);
            }
        });
    }

    public final void e(final nee neeVar, final nej nejVar, final IOException iOException, final boolean z) {
        a(new meo() { // from class: net
            @Override // defpackage.meo
            public final void a(Object obj) {
                ((ney) obj).eE(0, this.a.b, neeVar, nejVar, iOException, z);
            }
        });
    }

    public final void f(final nee neeVar, final nej nejVar, final int i) {
        a(new meo() { // from class: ner
            @Override // defpackage.meo
            public final void a(Object obj) {
                ((ney) obj).eF(0, this.a.b, neeVar, nejVar, i);
            }
        });
    }

    public final nex g(nen nenVar) {
        return new nex(this.c, nenVar);
    }

    public nex() {
        this(new CopyOnWriteArrayList(), null);
    }
}
