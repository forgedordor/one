package defpackage;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nak {
    public final int a;
    public final nen b;
    public final CopyOnWriteArrayList c;

    public nak(CopyOnWriteArrayList copyOnWriteArrayList, nen nenVar) {
        this.c = copyOnWriteArrayList;
        this.a = 0;
        this.b = nenVar;
    }

    public final void a() {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            naj najVar = (naj) it.next();
            final nal nalVar = najVar.b;
            mgb.an(najVar.a, new Runnable() { // from class: nah
                @Override // java.lang.Runnable
                public final void run() {
                    nalVar.eG(0, this.a.b);
                }
            });
        }
    }

    public final void b() {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            naj najVar = (naj) it.next();
            final nal nalVar = najVar.b;
            mgb.an(najVar.a, new Runnable() { // from class: naf
                @Override // java.lang.Runnable
                public final void run() {
                    nalVar.eH(0, this.a.b);
                }
            });
        }
    }

    public final void c(final int i) {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            naj najVar = (naj) it.next();
            final nal nalVar = najVar.b;
            mgb.an(najVar.a, new Runnable() { // from class: nag
                @Override // java.lang.Runnable
                public final void run() {
                    nalVar.eI(0, this.a.b, i);
                }
            });
        }
    }

    public final void d(final Exception exc) {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            naj najVar = (naj) it.next();
            final nal nalVar = najVar.b;
            mgb.an(najVar.a, new Runnable() { // from class: nae
                @Override // java.lang.Runnable
                public final void run() {
                    nalVar.eJ(0, this.a.b, exc);
                }
            });
        }
    }

    public final void e() {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            naj najVar = (naj) it.next();
            final nal nalVar = najVar.b;
            mgb.an(najVar.a, new Runnable() { // from class: nai
                @Override // java.lang.Runnable
                public final void run() {
                    nalVar.eK(0, this.a.b);
                }
            });
        }
    }

    public final nak f(nen nenVar) {
        return new nak(this.c, nenVar);
    }

    public nak() {
        this(new CopyOnWriteArrayList(), null);
    }
}
