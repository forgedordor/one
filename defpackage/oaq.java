package defpackage;

import android.graphics.Bitmap;
import android.view.Surface;
import j$.util.concurrent.ConcurrentLinkedQueue;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* loaded from: classes.dex */
final class oaq implements ocx {
    public final mdk a;
    public final Queue b;
    public final AtomicLong c;
    public mdj d;
    public boolean e;
    public boolean f;
    public long g;
    public boolean h;
    private final Queue i;
    private final Queue j;
    private odv k;
    private mix l;
    private boolean m;
    private long n;
    private boolean o;

    public oaq(mdk mdkVar, obt obtVar, mau mauVar) throws mdl {
        mdk mdkVar2 = new mdk(mauVar);
        mee.b(oao.d(mdkVar2), mdkVar2);
        this.i = new ConcurrentLinkedQueue();
        ByteBuffer byteBufferOrder = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());
        for (int i = 0; i < 10; i++) {
            mix mixVar = new mix(2);
            mixVar.d = byteBufferOrder;
            this.i.add(mixVar);
        }
        this.j = new ConcurrentLinkedQueue();
        this.b = new ConcurrentLinkedQueue();
        this.k = new odv(mdkVar2);
        mdj mdjVarO = o(obtVar, mdkVar2, mdkVar);
        this.d = mdjVarO;
        mdjVarO.c();
        mdk mdkVar3 = this.d.a;
        this.a = mdkVar3;
        mee.b(mdkVar3.d == 2, mdkVar3);
        this.c = new AtomicLong(-9223372036854775807L);
        this.g = -9223372036854775807L;
    }

    private final long k() {
        return mgb.x(this.n / r2.e, this.k.a.b);
    }

    private final void l() {
        odv odvVar = this.k;
        odvVar.b.addAndGet(r3.e * mgb.t(this.g - k(), odvVar.a.b));
        this.o = true;
        if (this.h) {
            this.f = true;
        }
    }

    private final void m(mix mixVar) {
        mixVar.eP();
        mixVar.f = 0L;
        this.i.add(mixVar);
    }

    private final boolean n() {
        if (this.o) {
            return false;
        }
        long j = this.g;
        return j != -9223372036854775807L && j - k() > 2000;
    }

    private static mdj o(obt obtVar, mdk mdkVar, mdk mdkVar2) throws mdl {
        int i;
        ekfw ekfwVar = new ekfw();
        boolean z = obtVar.d;
        ekfwVar.j(obtVar.g.b);
        int i2 = mdkVar2.b;
        if (i2 != -1) {
            mdr mdrVar = new mdr();
            mdrVar.j(i2);
            ekfwVar.h(mdrVar);
        }
        int i3 = mdkVar2.c;
        if (i3 == 1) {
            mdo mdoVar = new mdo();
            mdoVar.o(mdp.b(1, i3));
            mdoVar.o(mdp.b(2, i3));
            ekfwVar.h(mdoVar);
        } else if (i3 == 2) {
            i3 = 2;
            mdo mdoVar2 = new mdo();
            mdoVar2.o(mdp.b(1, i3));
            mdoVar2.o(mdp.b(2, i3));
            ekfwVar.h(mdoVar2);
        }
        mdj mdjVar = new mdj(ekfwVar.g());
        mdk mdkVarA = mdjVar.a(mdkVar);
        if ((i2 == -1 || i2 == mdkVarA.b) && ((i3 == -1 || i3 == mdkVarA.c) && ((i = mdkVar2.d) == -1 || i == mdkVarA.d))) {
            return mdjVar;
        }
        throw new mdl("Audio can not be modified to match downstream format", mdkVar);
    }

    @Override // defpackage.odl
    public final /* synthetic */ int a() {
        return odk.b();
    }

    @Override // defpackage.odl
    public final /* synthetic */ Surface b() {
        return odk.a();
    }

    @Override // defpackage.odl
    public final mix c() {
        if (this.b.isEmpty()) {
            return (mix) this.i.peek();
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0102  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.nio.ByteBuffer d() {
        /*
            Method dump skipped, instructions count: 442
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oaq.d():java.nio.ByteBuffer");
    }

    @Override // defpackage.odi
    public final void e(obt obtVar, long j, mau mauVar, boolean z) {
        if (mauVar == null) {
            mee.d(j != -9223372036854775807L, "Could not generate silent audio because duration is unknown.");
        } else {
            mee.c(mbw.i(mauVar.o));
            mdk mdkVar = new mdk(mauVar);
            mee.d(oao.d(mdkVar), mdkVar);
        }
        this.b.add(new oap(obtVar, j, mauVar, z));
    }

    @Override // defpackage.odl
    public final /* synthetic */ void f() {
        odk.e();
    }

    public final boolean g() {
        ByteBuffer byteBuffer;
        if (!this.m) {
            return false;
        }
        mix mixVar = this.l;
        if ((mixVar == null || (byteBuffer = mixVar.d) == null || !byteBuffer.hasRemaining()) && !this.k.b() && this.j.isEmpty()) {
            return this.d.h() && !this.d.g();
        }
        return true;
    }

    @Override // defpackage.odl
    public final /* synthetic */ int h(Bitmap bitmap, men menVar) {
        return odk.c();
    }

    @Override // defpackage.odl
    public final void i() {
        mee.c(this.b.isEmpty());
        mix mixVar = (mix) this.i.remove();
        this.j.add(mixVar);
        this.c.compareAndSet(-9223372036854775807L, mixVar.f);
    }

    @Override // defpackage.odl
    public final /* synthetic */ boolean j() {
        return odk.d();
    }
}
