package defpackage;

import java.util.ArrayDeque;
import java.util.Queue;

/* compiled from: PG */
/* loaded from: classes.dex */
final class mmc implements mmi {
    public final may a;
    public final mmk b;
    private final mou c;
    private final Queue d = new ArrayDeque();
    private int e;

    public mmc(may mayVar, mmk mmkVar, mou mouVar) {
        this.a = mayVar;
        this.b = mmkVar;
        this.c = mouVar;
    }

    @Override // defpackage.mmi
    public final synchronized void c() {
        Queue queue = this.d;
        final mol molVar = (mol) queue.poll();
        if (molVar == null) {
            this.e++;
            return;
        }
        mou mouVar = this.c;
        mouVar.d(new mot() { // from class: mmb
            @Override // defpackage.mot
            public final void a() {
                mmc mmcVar = this.a;
                mmk mmkVar = mmcVar.b;
                may mayVar = mmcVar.a;
                mol molVar2 = molVar;
                mmkVar.d(mayVar, molVar2.a, molVar2.b);
            }
        });
        mol molVar2 = (mol) queue.peek();
        if (molVar2 == null || molVar2.b != Long.MIN_VALUE) {
            return;
        }
        mmk mmkVar = this.b;
        mmkVar.getClass();
        mouVar.d(new mlz(mmkVar));
        queue.remove();
    }

    public final synchronized int d() {
        return this.d.size();
    }

    public final synchronized void e(final maz mazVar, final long j) {
        if (this.e <= 0) {
            this.d.add(new mol(mazVar, j));
        } else {
            this.c.d(new mot() { // from class: mma
                @Override // defpackage.mot
                public final void a() {
                    mmc mmcVar = this.a;
                    mmcVar.b.d(mmcVar.a, mazVar, j);
                }
            });
            this.e--;
        }
    }

    public final synchronized void f() {
        Queue queue = this.d;
        if (!queue.isEmpty()) {
            queue.add(new mol(maz.a, Long.MIN_VALUE));
            return;
        }
        mou mouVar = this.c;
        mmk mmkVar = this.b;
        mmkVar.getClass();
        mouVar.d(new mlz(mmkVar));
    }

    @Override // defpackage.mmi
    public final synchronized void w() {
        this.e = 0;
        this.d.clear();
    }

    @Override // defpackage.mmi
    public final /* synthetic */ void b(maz mazVar) {
    }
}
