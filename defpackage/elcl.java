package defpackage;

import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class elcl extends elck {
    final elcm a;
    final /* synthetic */ elcn b;

    public elcl(elcn elcnVar, int i) {
        this.b = elcnVar;
        this.a = new elcm(i);
    }

    @Override // defpackage.elcv
    public final void c(byte b) {
        this.a.write(b);
    }

    @Override // defpackage.elck, defpackage.elcv
    public final void f(ByteBuffer byteBuffer) {
        this.a.b(byteBuffer);
    }

    @Override // defpackage.elck, defpackage.elcv
    public final void g(byte[] bArr, int i) {
        this.a.write(bArr, 0, i);
    }

    @Override // defpackage.elcv
    public final elct r() {
        elcm elcmVar = this.a;
        return this.b.e(elcmVar.c(), elcmVar.a());
    }
}
