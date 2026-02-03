package defpackage;

import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class nuz extends mja implements nvb {
    protected nuz() {
        super(new nvg[2], new nvh[2]);
        mee.c(this.b == this.a.length);
        for (mix mixVar : this.a) {
            mixVar.h(1024);
        }
    }

    @Override // defpackage.mja
    protected final /* synthetic */ miv g(Throwable th) {
        return new nvc(th);
    }

    @Override // defpackage.mja
    protected final /* bridge */ /* synthetic */ miv h(mix mixVar, miy miyVar, boolean z) {
        nvg nvgVar = (nvg) mixVar;
        nvh nvhVar = (nvh) miyVar;
        try {
            ByteBuffer byteBuffer = nvgVar.d;
            mee.f(byteBuffer);
            nvhVar.i(nvgVar.f, p(byteBuffer.array(), byteBuffer.limit(), z), nvgVar.h);
            nvhVar.d = false;
            return null;
        } catch (nvc e) {
            return e;
        }
    }

    @Override // defpackage.mja
    protected final /* synthetic */ mix i() {
        return new nvg();
    }

    @Override // defpackage.mja
    protected final /* synthetic */ miy k() {
        return new nuy(this);
    }

    protected abstract nva p(byte[] bArr, int i, boolean z);

    @Override // defpackage.nvb
    public final void q(long j) {
    }
}
