package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class mdn implements mdm {
    protected mdk b;
    protected mdk c;
    public ByteBuffer d;
    private mdk e;
    private mdk f;
    private ByteBuffer g;
    private boolean h;

    public mdn() {
        ByteBuffer byteBuffer = a;
        this.g = byteBuffer;
        this.d = byteBuffer;
        mdk mdkVar = mdk.a;
        this.e = mdkVar;
        this.f = mdkVar;
        this.b = mdkVar;
        this.c = mdkVar;
    }

    @Override // defpackage.mdm
    public final mdk b(mdk mdkVar) {
        this.e = mdkVar;
        this.f = j(mdkVar);
        return h() ? this.f : mdk.a;
    }

    @Override // defpackage.mdm
    public ByteBuffer c() {
        ByteBuffer byteBuffer = this.d;
        this.d = a;
        return byteBuffer;
    }

    @Override // defpackage.mdm
    public final void d() {
        this.d = a;
        this.h = false;
        this.b = this.e;
        this.c = this.f;
        l();
    }

    @Override // defpackage.mdm
    public final void e() {
        this.h = true;
        m();
    }

    @Override // defpackage.mdm
    public final void g() {
        d();
        this.g = a;
        mdk mdkVar = mdk.a;
        this.e = mdkVar;
        this.f = mdkVar;
        this.b = mdkVar;
        this.c = mdkVar;
        n();
    }

    @Override // defpackage.mdm
    public boolean h() {
        return this.f != mdk.a;
    }

    @Override // defpackage.mdm
    public boolean i() {
        return this.h && this.d == a;
    }

    protected mdk j(mdk mdkVar) {
        throw null;
    }

    protected final ByteBuffer k(int i) {
        if (this.g.capacity() < i) {
            this.g = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
        } else {
            this.g.clear();
        }
        ByteBuffer byteBuffer = this.g;
        this.d = byteBuffer;
        return byteBuffer;
    }

    protected void l() {
    }

    protected void m() {
    }

    protected void n() {
    }

    @Override // defpackage.mdm
    public /* synthetic */ long a(long j) {
        return j;
    }
}
