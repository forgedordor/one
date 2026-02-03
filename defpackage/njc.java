package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class njc extends Handler implements Runnable {
    public IOException a;
    public int b;
    final /* synthetic */ njg c;
    private nja d;
    private Thread e;
    private boolean f;
    private volatile boolean g;
    private final nfl h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public njc(njg njgVar, Looper looper, nfl nflVar, nja njaVar) {
        super(looper);
        this.c = njgVar;
        this.h = nflVar;
        this.d = njaVar;
    }

    private final void c() {
        nee neeVar;
        SystemClock.elapsedRealtime();
        nja njaVar = this.d;
        mee.f(njaVar);
        nfl nflVar = this.h;
        int i = this.b;
        mim mimVar = nflVar.c;
        if (i == 0) {
            long j = nflVar.a;
            neeVar = new nee(nflVar.k);
        } else {
            long j2 = nflVar.a;
            mht mhtVar = nflVar.k;
            neeVar = new nee();
        }
        nfq nfqVar = (nfq) njaVar;
        nex nexVar = nfqVar.c;
        long j3 = nflVar.j;
        nexVar.f(neeVar, new nej(-1, null, mgb.B(j3), mgb.B(nfqVar.p)), i);
        this.a = null;
        njg njgVar = this.c;
        njc njcVar = njgVar.c;
        mee.f(njcVar);
        njgVar.e.execute(njcVar);
    }

    private final void d() {
        this.c.c = null;
    }

    public final void a(boolean z) {
        this.g = z;
        this.a = null;
        if (hasMessages(1)) {
            this.f = true;
            removeMessages(1);
            if (!z) {
                sendEmptyMessage(2);
            }
        } else {
            synchronized (this) {
                this.f = true;
                this.h.h = true;
                Thread thread = this.e;
                if (thread != null) {
                    thread.interrupt();
                }
            }
        }
        if (z) {
            d();
            SystemClock.elapsedRealtime();
            nja njaVar = this.d;
            mee.f(njaVar);
            njaVar.z(this.h, true);
            this.d = null;
        }
    }

    public final void b(long j) {
        njg njgVar = this.c;
        mee.c(njgVar.c == null);
        njgVar.c = this;
        if (j > 0) {
            sendEmptyMessageDelayed(1, j);
        } else {
            c();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, nge, nja] */
    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        long j;
        njb njbVar;
        noq noqVar;
        if (this.g) {
            return;
        }
        if (message.what == 1) {
            c();
            return;
        }
        if (message.what == 4) {
            throw ((Error) message.obj);
        }
        d();
        SystemClock.elapsedRealtime();
        ?? r2 = this.d;
        mee.f(r2);
        if (this.f) {
            r2.z(this.h, false);
            return;
        }
        int i = message.what;
        long j2 = 0;
        if (i == 2) {
            try {
                nfl nflVar = this.h;
                if (((nfq) r2).p == -9223372036854775807L && ((nfq) r2).o != null) {
                    long jD = ((nfq) r2).d(true);
                    if (jD != Long.MIN_VALUE) {
                        j2 = jD + 10000;
                    }
                    ((nfq) r2).p = j2;
                    ((nfq) r2).d.a(j2, ((nfq) r2).o, ((nfq) r2).q);
                }
                mim mimVar = nflVar.c;
                long j3 = nflVar.a;
                mht mhtVar = nflVar.k;
                ((nfq) r2).c.d(new nee(), new nej(-1, null, mgb.B(nflVar.j), mgb.B(((nfq) r2).p)));
                ((nfq) r2).w = true;
                nek nekVar = ((nfq) r2).k;
                mee.f(nekVar);
                nekVar.b(r2);
                return;
            } catch (RuntimeException e) {
                mff.d("LoadTask", "Unexpected exception handling load completed", e);
                this.c.d = new njf(e);
                return;
            }
        }
        if (i != 3) {
            return;
        }
        IOException iOException = (IOException) message.obj;
        this.a = iOException;
        int i2 = this.b + 1;
        this.b = i2;
        nfl nflVar2 = this.h;
        mim mimVar2 = nflVar2.c;
        long j4 = nflVar2.a;
        mht mhtVar2 = nflVar2.k;
        nee neeVar = new nee();
        long j5 = nflVar2.j;
        String str = mgb.a;
        long jB = nix.b(new niy(iOException, i2));
        if (jB == -9223372036854775807L) {
            njbVar = njg.b;
            j = -9223372036854775807L;
        } else {
            nfq nfqVar = (nfq) r2;
            j = -9223372036854775807L;
            int iB = nfqVar.b();
            int i3 = iB > nfqVar.v ? 1 : 0;
            if (nfqVar.s || !((noqVar = nfqVar.o) == null || noqVar.w() == -9223372036854775807L)) {
                nfqVar.v = iB;
            } else {
                boolean z = nfqVar.n;
                if (!z || nfqVar.y()) {
                    nfqVar.r = z;
                    nfqVar.t = 0L;
                    nfqVar.v = 0;
                    for (ngb ngbVar : nfqVar.m) {
                        ngbVar.k();
                    }
                    nflVar2.b(0L, 0L);
                } else {
                    nfqVar.u = true;
                    njbVar = njg.a;
                }
            }
            njbVar = new njb(i3, jB);
        }
        int i4 = njbVar.a;
        nfq nfqVar2 = (nfq) r2;
        nfqVar2.c.e(neeVar, new nej(-1, null, mgb.B(nflVar2.j), mgb.B(nfqVar2.p)), iOException, !(i4 == 0 || i4 == 1));
        if (i4 == 3) {
            this.c.d = this.a;
            return;
        }
        if (i4 != 2) {
            if (i4 == 1) {
                this.b = 1;
            }
            long jMin = njbVar.b;
            if (jMin == j) {
                jMin = Math.min((this.b - 1) * 1000, 5000);
            }
            b(jMin);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x020a A[Catch: all -> 0x0245, TRY_ENTER, TryCatch #6 {all -> 0x0245, blocks: (B:9:0x002b, B:14:0x0049, B:16:0x0053, B:17:0x005b, B:100:0x020a, B:102:0x0212, B:104:0x021b, B:112:0x0229, B:114:0x0233, B:115:0x023b, B:116:0x0240), top: B:166:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0220 A[LOOP:0: B:166:0x002b->B:106:0x0220, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:162:0x01c5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:169:0x024b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0241 A[EDGE_INSN: B:180:0x0241->B:117:0x0241 BREAK  A[LOOP:0: B:166:0x002b->B:106:0x0220], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0207 A[EDGE_INSN: B:181:0x0207->B:98:0x0207 BREAK  A[LOOP:1: B:86:0x01c3->B:184:0x01c3], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ca A[Catch: all -> 0x0222, TryCatch #1 {all -> 0x0222, blocks: (B:38:0x00c0, B:40:0x00ca, B:42:0x00d6, B:44:0x00e0, B:46:0x00ec, B:48:0x00f6, B:50:0x0102, B:52:0x010c, B:54:0x011e, B:56:0x0128, B:57:0x012e, B:66:0x015b, B:68:0x0164, B:70:0x016e, B:72:0x0172, B:74:0x018c, B:76:0x019f, B:79:0x01a7, B:81:0x01ab, B:82:0x01af, B:84:0x01b3, B:60:0x0138, B:63:0x0145, B:32:0x009b, B:35:0x00aa), top: B:158:0x00c0 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e0 A[Catch: all -> 0x0222, TryCatch #1 {all -> 0x0222, blocks: (B:38:0x00c0, B:40:0x00ca, B:42:0x00d6, B:44:0x00e0, B:46:0x00ec, B:48:0x00f6, B:50:0x0102, B:52:0x010c, B:54:0x011e, B:56:0x0128, B:57:0x012e, B:66:0x015b, B:68:0x0164, B:70:0x016e, B:72:0x0172, B:74:0x018c, B:76:0x019f, B:79:0x01a7, B:81:0x01ab, B:82:0x01af, B:84:0x01b3, B:60:0x0138, B:63:0x0145, B:32:0x009b, B:35:0x00aa), top: B:158:0x00c0 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00f6 A[Catch: all -> 0x0222, TryCatch #1 {all -> 0x0222, blocks: (B:38:0x00c0, B:40:0x00ca, B:42:0x00d6, B:44:0x00e0, B:46:0x00ec, B:48:0x00f6, B:50:0x0102, B:52:0x010c, B:54:0x011e, B:56:0x0128, B:57:0x012e, B:66:0x015b, B:68:0x0164, B:70:0x016e, B:72:0x0172, B:74:0x018c, B:76:0x019f, B:79:0x01a7, B:81:0x01ab, B:82:0x01af, B:84:0x01b3, B:60:0x0138, B:63:0x0145, B:32:0x009b, B:35:0x00aa), top: B:158:0x00c0 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x010c A[Catch: all -> 0x0222, TryCatch #1 {all -> 0x0222, blocks: (B:38:0x00c0, B:40:0x00ca, B:42:0x00d6, B:44:0x00e0, B:46:0x00ec, B:48:0x00f6, B:50:0x0102, B:52:0x010c, B:54:0x011e, B:56:0x0128, B:57:0x012e, B:66:0x015b, B:68:0x0164, B:70:0x016e, B:72:0x0172, B:74:0x018c, B:76:0x019f, B:79:0x01a7, B:81:0x01ab, B:82:0x01af, B:84:0x01b3, B:60:0x0138, B:63:0x0145, B:32:0x009b, B:35:0x00aa), top: B:158:0x00c0 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0128 A[Catch: all -> 0x0222, TRY_LEAVE, TryCatch #1 {all -> 0x0222, blocks: (B:38:0x00c0, B:40:0x00ca, B:42:0x00d6, B:44:0x00e0, B:46:0x00ec, B:48:0x00f6, B:50:0x0102, B:52:0x010c, B:54:0x011e, B:56:0x0128, B:57:0x012e, B:66:0x015b, B:68:0x0164, B:70:0x016e, B:72:0x0172, B:74:0x018c, B:76:0x019f, B:79:0x01a7, B:81:0x01ab, B:82:0x01af, B:84:0x01b3, B:60:0x0138, B:63:0x0145, B:32:0x009b, B:35:0x00aa), top: B:158:0x00c0 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x015b A[Catch: all -> 0x0222, TryCatch #1 {all -> 0x0222, blocks: (B:38:0x00c0, B:40:0x00ca, B:42:0x00d6, B:44:0x00e0, B:46:0x00ec, B:48:0x00f6, B:50:0x0102, B:52:0x010c, B:54:0x011e, B:56:0x0128, B:57:0x012e, B:66:0x015b, B:68:0x0164, B:70:0x016e, B:72:0x0172, B:74:0x018c, B:76:0x019f, B:79:0x01a7, B:81:0x01ab, B:82:0x01af, B:84:0x01b3, B:60:0x0138, B:63:0x0145, B:32:0x009b, B:35:0x00aa), top: B:158:0x00c0 }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x016e A[Catch: all -> 0x0222, TryCatch #1 {all -> 0x0222, blocks: (B:38:0x00c0, B:40:0x00ca, B:42:0x00d6, B:44:0x00e0, B:46:0x00ec, B:48:0x00f6, B:50:0x0102, B:52:0x010c, B:54:0x011e, B:56:0x0128, B:57:0x012e, B:66:0x015b, B:68:0x0164, B:70:0x016e, B:72:0x0172, B:74:0x018c, B:76:0x019f, B:79:0x01a7, B:81:0x01ab, B:82:0x01af, B:84:0x01b3, B:60:0x0138, B:63:0x0145, B:32:0x009b, B:35:0x00aa), top: B:158:0x00c0 }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01b3 A[Catch: all -> 0x0222, TRY_LEAVE, TryCatch #1 {all -> 0x0222, blocks: (B:38:0x00c0, B:40:0x00ca, B:42:0x00d6, B:44:0x00e0, B:46:0x00ec, B:48:0x00f6, B:50:0x0102, B:52:0x010c, B:54:0x011e, B:56:0x0128, B:57:0x012e, B:66:0x015b, B:68:0x0164, B:70:0x016e, B:72:0x0172, B:74:0x018c, B:76:0x019f, B:79:0x01a7, B:81:0x01ab, B:82:0x01af, B:84:0x01b3, B:60:0x0138, B:63:0x0145, B:32:0x009b, B:35:0x00aa), top: B:158:0x00c0 }] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 692
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.njc.run():void");
    }
}
