package defpackage;

import java.math.BigInteger;
import java.security.SecureRandom;

/* compiled from: PG */
/* loaded from: classes6.dex */
public abstract class ffli {
    public final fflv d;
    public ffln e;
    public ffln f;
    protected BigInteger g;
    protected BigInteger h;
    protected int i = 0;

    protected ffli(fflv fflvVar) {
        this.d = fflvVar;
    }

    public abstract ffln a(SecureRandom secureRandom);

    public ffls b(BigInteger bigInteger, BigInteger bigInteger2) {
        return e(d(bigInteger), d(bigInteger2));
    }

    public abstract int c();

    public abstract ffln d(BigInteger bigInteger);

    protected abstract ffls e(ffln fflnVar, ffln fflnVar2);

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof ffli) && h((ffli) obj);
        }
        return true;
    }

    public abstract ffls f();

    public ffls g(ffls fflsVar) {
        if (this == fflsVar.b) {
            return fflsVar;
        }
        if (fflsVar.q()) {
            return f();
        }
        ffls fflsVarM = fflsVar.m();
        return b(fflsVarM.c.d(), fflsVarM.c().d());
    }

    public final boolean h(ffli ffliVar) {
        if (this != ffliVar) {
            return ffliVar != null && this.d.equals(ffliVar.d) && this.e.d().equals(ffliVar.e.d()) && this.f.d().equals(ffliVar.f.d());
        }
        return true;
    }

    public final int hashCode() {
        return (this.d.hashCode() ^ Integer.rotateLeft(this.e.d().hashCode(), 8)) ^ Integer.rotateLeft(this.f.d().hashCode(), 16);
    }
}
