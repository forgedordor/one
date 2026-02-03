package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class fgoy extends fgoz {
    private final int b;
    private final fgna c;

    public fgoy(fgmu fgmuVar, fgna fgnaVar, fgna fgnaVar2) {
        super(fgmuVar, fgnaVar);
        if (!fgnaVar2.e()) {
            throw new IllegalArgumentException("Range duration field must be precise");
        }
        int iC = (int) (fgnaVar2.c() / this.a);
        this.b = iC;
        if (iC < 2) {
            throw new IllegalArgumentException("The effective range must be at least 2");
        }
        this.c = fgnaVar2;
    }

    @Override // defpackage.fgoo, defpackage.fgms
    public final int a(long j) {
        if (j >= 0) {
            return (int) ((j / this.a) % this.b);
        }
        int i = this.b;
        return (i - 1) + ((int) (((j + 1) / this.a) % i));
    }

    @Override // defpackage.fgoo, defpackage.fgms
    public final int c() {
        return this.b - 1;
    }

    @Override // defpackage.fgoz, defpackage.fgoo, defpackage.fgms
    public final long h(long j, int i) {
        fgot.c(this, i, 0, c());
        return j + ((i - a(j)) * this.a);
    }

    @Override // defpackage.fgms
    public final fgna s() {
        return this.c;
    }
}
