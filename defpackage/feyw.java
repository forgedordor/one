package defpackage;

import java.io.EOFException;
import java.util.List;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class feyw extends fezf {
    public static final feyt a;
    public static final feyt b;
    private static final byte[] c;
    private static final byte[] d;
    private static final byte[] e;
    private final fffd f;
    private final feyt g;
    private final List h;
    private final feyt i;
    private long j;

    static {
        Pattern pattern = feyt.a;
        a = feys.a("multipart/mixed");
        feys.a("multipart/alternative");
        feys.a("multipart/digest");
        feys.a("multipart/parallel");
        b = feys.a("multipart/form-data");
        c = new byte[]{58, 32};
        d = new byte[]{13, 10};
        e = new byte[]{45, 45};
    }

    public feyw(fffd fffdVar, feyt feytVar, List list) {
        feytVar.getClass();
        this.f = fffdVar;
        this.g = feytVar;
        this.h = list;
        this.i = feys.a(feytVar + "; boundary=" + fffdVar.e());
        this.j = -1L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final long e(fffa fffaVar, boolean z) throws EOFException {
        ffez ffezVar;
        fffa ffezVar2;
        if (z) {
            ffezVar2 = new ffez();
            ffezVar = ffezVar2;
        } else {
            ffezVar = 0;
            ffezVar2 = fffaVar;
        }
        List list = this.h;
        int size = list.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            feyv feyvVar = (feyv) list.get(i);
            feyn feynVar = feyvVar.a;
            fezf fezfVar = feyvVar.b;
            ffezVar2.getClass();
            ffezVar2.aa(e);
            ffezVar2.L(this.f);
            byte[] bArr = d;
            ffezVar2.aa(bArr);
            int iA = feynVar.a();
            for (int i2 = 0; i2 < iA; i2++) {
                ffezVar2.ac(feynVar.c(i2));
                ffezVar2.aa(c);
                ffezVar2.ac(feynVar.d(i2));
                ffezVar2.aa(bArr);
            }
            feyt feytVarB = fezfVar.b();
            if (feytVarB != null) {
                ffezVar2.ac("Content-Type: ");
                ffezVar2.ac(feytVarB.c);
                ffezVar2.aa(bArr);
            }
            long jA = fezfVar.a();
            if (jA != -1) {
                ffezVar2.ac("Content-Length: ");
                ffezVar2.t(jA).aa(bArr);
            } else if (z) {
                ffezVar.getClass();
                ffezVar.B();
                return -1L;
            }
            ffezVar2.aa(bArr);
            if (z) {
                j += jA;
            } else {
                fezfVar.c(ffezVar2);
            }
            ffezVar2.aa(bArr);
        }
        ffezVar2.getClass();
        byte[] bArr2 = e;
        ffezVar2.aa(bArr2);
        ffezVar2.L(this.f);
        ffezVar2.aa(bArr2);
        ffezVar2.aa(d);
        if (!z) {
            return j;
        }
        ffezVar.getClass();
        long j2 = j + ffezVar.b;
        ffezVar.B();
        return j2;
    }

    @Override // defpackage.fezf
    public final long a() throws EOFException {
        long j = this.j;
        if (j != -1) {
            return j;
        }
        long jE = e(null, true);
        this.j = jE;
        return jE;
    }

    @Override // defpackage.fezf
    public final feyt b() {
        return this.i;
    }

    @Override // defpackage.fezf
    public final void c(fffa fffaVar) throws EOFException {
        e(fffaVar, false);
    }
}
