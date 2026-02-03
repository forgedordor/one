package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nvf implements nnr {
    private final nvn c;
    private nox f;
    private int g;
    private byte[] e = mgb.b;
    private final mfr d = new mfr();
    public final List a = new ArrayList();
    private int h = 0;
    private long[] i = mgb.c;
    public long b = -9223372036854775807L;

    public nvf(nvn nvnVar) {
        this.c = nvnVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x011a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x011b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x007a A[EXC_TOP_SPLITTER, PHI: r15
      0x007a: PHI (r15v3 long) = (r15v4 long), (r15v5 long) binds: [B:31:0x0077, B:28:0x006f] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    @Override // defpackage.nnr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int a(defpackage.nns r24, defpackage.non r25) throws defpackage.mby {
        /*
            Method dump skipped, instructions count: 284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nvf.a(nns, non):int");
    }

    @Override // defpackage.nnr
    public final void c(nnu nnuVar) {
        mee.c(this.h == 0);
        this.f = nnuVar.p(0, 3);
        this.h = 1;
    }

    @Override // defpackage.nnr
    public final void d() {
        if (this.h == 5) {
            return;
        }
        this.c.c();
        this.h = 5;
    }

    @Override // defpackage.nnr
    public final void e(long j, long j2) {
        int i = this.h;
        boolean z = false;
        if (i != 0 && i != 5) {
            z = true;
        }
        mee.c(z);
        this.b = j2;
        int i2 = this.h;
        if (i2 == 2) {
            this.h = 1;
        } else if (i2 == 4) {
            this.h = 3;
        }
    }

    @Override // defpackage.nnr
    public final boolean f(nns nnsVar) {
        return true;
    }

    public final void h(nve nveVar) {
        mee.g(this.f);
        byte[] bArr = nveVar.b;
        int length = bArr.length;
        mfr mfrVar = this.d;
        mfrVar.H(bArr);
        this.f.m(mfrVar, length);
        this.f.o(nveVar.a, 1, length, 0, null);
    }

    @Override // defpackage.nnr
    public final /* synthetic */ List x() {
        int i = ekgb.d;
        return ekoe.a;
    }

    @Override // defpackage.nnr
    public final /* synthetic */ void g() {
    }
}
