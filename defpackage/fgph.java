package defpackage;

import java.io.IOException;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fgph {
    public final fgqf a;
    public final fgqd b;
    public final fgmq c;
    public final fgmz d;

    public fgph(fgqf fgqfVar, fgqd fgqdVar) {
        this.a = fgqfVar;
        this.b = fgqdVar;
        this.c = null;
        this.d = null;
    }

    private final fgqf e() {
        fgqf fgqfVar = this.a;
        if (fgqfVar != null) {
            return fgqfVar;
        }
        throw new UnsupportedOperationException("Printing not supported");
    }

    public final String a(fgni fgniVar) {
        StringBuilder sb = new StringBuilder(e().b());
        try {
            Map map = fgmw.a;
            long millis = fgniVar.getMillis();
            fgmq fgmqVarA = fgniVar.a();
            if (fgmqVarA == null) {
                fgmqVarA = fgoi.N();
            }
            fgqf fgqfVarE = e();
            fgmq fgmqVarB = b(fgmqVarA);
            fgmz fgmzVarZ = fgmqVarB.z();
            int iA = fgmzVarZ.a(millis);
            long j = iA;
            long j2 = millis + j;
            if ((millis ^ j2) >= 0 || (j ^ millis) < 0) {
                millis = j2;
            } else {
                fgmzVarZ = fgmz.a;
                iA = 0;
            }
            fgqfVarE.d(sb, millis, fgmqVarB.a(), iA, fgmzVarZ, null);
        } catch (IOException unused) {
        }
        return sb.toString();
    }

    public final fgmq b(fgmq fgmqVar) {
        fgmq fgmqVar2 = this.c;
        fgmq fgmqVarC = fgmw.c(fgmqVar);
        if (fgmqVar2 == null) {
            fgmqVar2 = fgmqVarC;
        }
        fgmz fgmzVar = this.d;
        return fgmzVar != null ? fgmqVar2.b(fgmzVar) : fgmqVar2;
    }

    public final fgph c() {
        fgmz fgmzVar = this.d;
        fgmz fgmzVar2 = fgmz.a;
        return fgmzVar == fgmzVar2 ? this : new fgph(this.a, this.b, this.c, fgmzVar2);
    }

    public final fgqe d() {
        return fgqe.b(this.b);
    }

    public fgph(fgqf fgqfVar, fgqd fgqdVar, fgmq fgmqVar, fgmz fgmzVar) {
        this.a = fgqfVar;
        this.b = fgqdVar;
        this.c = fgmqVar;
        this.d = fgmzVar;
    }
}
