package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fgqo extends fgmz {
    private static final long serialVersionUID = -3513011772763289092L;
    private final String e;
    private final int f;
    private final int g;

    public fgqo(String str, String str2, int i, int i2) {
        super(str);
        this.e = str2;
        this.f = i;
        this.g = i2;
    }

    @Override // defpackage.fgmz
    public final int a(long j) {
        return this.f;
    }

    @Override // defpackage.fgmz
    public final int b(long j) {
        return this.f;
    }

    @Override // defpackage.fgmz
    public final int c(long j) {
        return this.g;
    }

    @Override // defpackage.fgmz
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof fgqo) {
            fgqo fgqoVar = (fgqo) obj;
            if (this.c.equals(fgqoVar.c) && this.g == fgqoVar.g && this.f == fgqoVar.f) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.fgmz
    public final String g(long j) {
        return this.e;
    }

    @Override // defpackage.fgmz
    public final int hashCode() {
        return this.c.hashCode() + (this.g * 37) + (this.f * 31);
    }

    @Override // defpackage.fgmz
    public final boolean k() {
        return true;
    }

    @Override // defpackage.fgmz
    public final long e(long j) {
        return j;
    }

    @Override // defpackage.fgmz
    public final long f(long j) {
        return j;
    }
}
