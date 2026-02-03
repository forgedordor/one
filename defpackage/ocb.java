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
final class ocb extends odm implements ocx {
    private static final ByteBuffer e = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());
    private final mau f;
    private final AtomicLong g;
    private final Queue h;
    private final Queue i;
    private volatile boolean j;
    private long k;
    private boolean l;
    private long m;
    private mix n;

    public ocb(mau mauVar, odx odxVar, odh odhVar, ocv ocvVar) {
        super(mauVar, odhVar);
        this.f = mauVar;
        this.g = new AtomicLong();
        this.h = new ConcurrentLinkedQueue();
        this.i = new ConcurrentLinkedQueue();
        ocvVar.a(odxVar);
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
        if (this.n == null) {
            mix mixVar = (mix) this.h.poll();
            this.n = mixVar;
            if (!this.l) {
                if (mixVar == null) {
                    mix mixVar2 = new mix(2);
                    this.n = mixVar2;
                    mixVar2.d = e;
                } else {
                    long j = this.m;
                    mee.f(mixVar.d);
                    this.m = j - r0.capacity();
                }
            }
        }
        return this.n;
    }

    @Override // defpackage.odi
    public final void e(obt obtVar, long j, mau mauVar, boolean z) {
        AtomicLong atomicLong = this.g;
        this.k = atomicLong.get();
        atomicLong.addAndGet(j);
    }

    @Override // defpackage.odl
    public final /* synthetic */ void f() {
        odk.e();
    }

    @Override // defpackage.odl
    public final /* synthetic */ int h(Bitmap bitmap, men menVar) {
        return odk.c();
    }

    @Override // defpackage.odl
    public final void i() {
        mix mixVar = this.n;
        mee.f(mixVar);
        this.n = null;
        boolean z = true;
        if (mixVar.eS()) {
            this.j = true;
        } else {
            mixVar.f += this.k;
            this.i.add(mixVar);
        }
        if (this.l) {
            return;
        }
        int size = this.h.size() + this.i.size();
        long j = this.m;
        mee.f(mixVar.d);
        long jCapacity = j + r0.capacity();
        this.m = jCapacity;
        if (size < 10 || (size < 200 && jCapacity < 2097152)) {
            z = false;
        }
        this.l = z;
    }

    @Override // defpackage.odl
    public final /* synthetic */ boolean j() {
        return odk.d();
    }

    @Override // defpackage.odm
    protected final mau p() {
        return this.f;
    }

    @Override // defpackage.odm
    protected final mix q() {
        return (mix) this.i.peek();
    }

    @Override // defpackage.odm
    protected final void s() {
        mix mixVar = (mix) this.i.remove();
        mixVar.eP();
        mixVar.f = 0L;
        this.h.add(mixVar);
    }

    @Override // defpackage.odm
    protected final boolean t() {
        return this.j && this.i.isEmpty();
    }

    @Override // defpackage.odm
    public final void d() {
    }

    @Override // defpackage.odm
    public final ocx r(obt obtVar, mau mauVar, int i) {
        return this;
    }
}
