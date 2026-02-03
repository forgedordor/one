package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class niu {
    private int a;
    private int b;
    private int c;
    private nio[] d;

    public niu() {
        mee.a(true);
        mee.a(true);
        this.c = 0;
        this.d = new nio[100];
    }

    public final synchronized int a() {
        return this.b * 65536;
    }

    public final synchronized nio b() {
        nio nioVar;
        this.b++;
        int i = this.c;
        if (i > 0) {
            nio[] nioVarArr = this.d;
            int i2 = i - 1;
            this.c = i2;
            nioVar = nioVarArr[i2];
            mee.f(nioVar);
            this.d[this.c] = null;
        } else {
            nioVar = new nio(new byte[65536]);
            int i3 = this.b;
            nio[] nioVarArr2 = this.d;
            int length = nioVarArr2.length;
            if (i3 > length) {
                this.d = (nio[]) Arrays.copyOf(nioVarArr2, length + length);
                return nioVar;
            }
        }
        return nioVar;
    }

    public final synchronized void c(nio nioVar) {
        nio[] nioVarArr = this.d;
        int i = this.c;
        this.c = i + 1;
        nioVarArr[i] = nioVar;
        this.b--;
        notifyAll();
    }

    public final synchronized void d() {
        e(0);
    }

    public final synchronized void e(int i) {
        int i2 = this.a;
        this.a = i;
        if (i < i2) {
            f();
        }
    }

    public final synchronized void f() {
        int iMax = Math.max(0, mgb.c(this.a, 65536) - this.b);
        int i = this.c;
        if (iMax >= i) {
            return;
        }
        Arrays.fill(this.d, iMax, i, (Object) null);
        this.c = iMax;
    }

    public final synchronized void g(nfv nfvVar) {
        while (nfvVar != null) {
            nio[] nioVarArr = this.d;
            int i = this.c;
            this.c = i + 1;
            nio nioVar = nfvVar.c;
            mee.f(nioVar);
            nioVarArr[i] = nioVar;
            this.b--;
            nfvVar = nfvVar.d;
            if (nfvVar == null || nfvVar.c == null) {
                nfvVar = null;
            }
        }
        notifyAll();
    }
}
