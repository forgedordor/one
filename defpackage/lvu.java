package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
abstract class lvu {
    final lvz c;
    boolean d;
    int e = -1;
    final /* synthetic */ lvv f;

    public lvu(lvv lvvVar, lvz lvzVar) {
        this.f = lvvVar;
        this.c = lvzVar;
    }

    public boolean c(lvj lvjVar) {
        return false;
    }

    final void d(boolean z) {
        boolean z2;
        if (z == this.d) {
            return;
        }
        this.d = z;
        lvv lvvVar = this.f;
        int i = true != z ? -1 : 1;
        int i2 = lvvVar.d;
        lvvVar.d = i + i2;
        if (!lvvVar.e) {
            lvvVar.e = true;
            while (true) {
                try {
                    int i3 = lvvVar.d;
                    if (i2 == i3) {
                        break;
                    }
                    if (i2 != 0) {
                        z2 = false;
                    } else if (i3 > 0) {
                        i2 = 0;
                        z2 = true;
                    } else {
                        i2 = 0;
                        z2 = false;
                    }
                    boolean z3 = i2 > 0 && i3 == 0;
                    if (z2) {
                        lvvVar.h();
                    } else if (z3) {
                        lvvVar.i();
                    }
                    i2 = i3;
                } finally {
                    lvvVar.e = false;
                }
            }
        }
        if (this.d) {
            this.f.e(this);
        }
    }

    public abstract boolean eA();

    public void b() {
    }
}
