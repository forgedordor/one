package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import j$.util.Objects;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ngz extends mpc implements Handler.Callback {
    private IOException A;
    private final mrk B;
    public long j;
    private final mix k;
    private ngr l;
    private final ngy m;
    private boolean n;
    private int o;
    private nvb p;
    private nvg q;
    private nvh r;
    private nvh s;
    private int t;
    private final Handler u;
    private final msa v;
    private boolean w;
    private boolean x;
    private mau y;
    private long z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ngz(mrk mrkVar, Looper looper) {
        Handler handler;
        super(3);
        ngy ngyVar = ngy.b;
        mee.f(mrkVar);
        this.B = mrkVar;
        if (looper == null) {
            handler = null;
        } else {
            String str = mgb.a;
            handler = new Handler(looper, this);
        }
        this.u = handler;
        this.m = ngyVar;
        this.k = new mix(1);
        this.v = new msa();
        this.j = -9223372036854775807L;
        this.z = -9223372036854775807L;
    }

    private final long W() {
        if (this.t == -1) {
            return Long.MAX_VALUE;
        }
        mee.f(this.r);
        if (this.t < this.r.a()) {
            return this.r.c(this.t);
        }
        return Long.MAX_VALUE;
    }

    private final void X() {
        boolean z = true;
        if (!Objects.equals(this.y.o, "application/cea-608") && !Objects.equals(this.y.o, "application/x-mp4-cea-608") && !Objects.equals(this.y.o, "application/cea-708")) {
            z = false;
        }
        mee.d(z, "Legacy decoding is disabled, can't handle " + this.y.o + " samples (expected application/x-media3-cues).");
    }

    private final void Y() {
        int i = ekgb.d;
        ekgb ekgbVar = ekoe.a;
        ai(this.z);
        af(new mdw(ekgbVar));
    }

    private final void Z(nvc nvcVar) {
        mff.d("TextRenderer", "Subtitle decoding failed. streamFormat=".concat(String.valueOf(String.valueOf(this.y))), nvcVar);
        Y();
        ae();
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0042 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void aa() {
        /*
            r6 = this;
            r0 = 1
            r6.n = r0
            mau r1 = r6.y
            defpackage.mee.f(r1)
            java.lang.String r2 = r1.o
            if (r2 == 0) goto L5a
            int r3 = r2.hashCode()
            r4 = 930165504(0x37713300, float:1.4376594E-5)
            r5 = 2
            if (r3 == r4) goto L35
            r4 = 1566015601(0x5d578071, float:9.7053348E17)
            if (r3 == r4) goto L2b
            r4 = 1566016562(0x5d578432, float:9.7059952E17)
            if (r3 == r4) goto L21
            goto L3f
        L21:
            java.lang.String r3 = "application/cea-708"
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L3f
            r3 = r5
            goto L40
        L2b:
            java.lang.String r3 = "application/cea-608"
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L3f
            r3 = 0
            goto L40
        L35:
            java.lang.String r3 = "application/x-mp4-cea-608"
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L3f
            r3 = r0
            goto L40
        L3f:
            r3 = -1
        L40:
            if (r3 == 0) goto L51
            if (r3 == r0) goto L51
            if (r3 == r5) goto L47
            goto L5a
        L47:
            int r0 = r1.L
            java.util.List r1 = r1.r
            nvy r2 = new nvy
            r2.<init>(r0, r1)
            goto L76
        L51:
            int r0 = r1.L
            nvt r1 = new nvt
            r1.<init>(r2, r0)
            r2 = r1
            goto L76
        L5a:
            ngy r0 = r6.m
            ngx r0 = (defpackage.ngx) r0
            nuw r0 = r0.a
            boolean r3 = r0.c(r1)
            if (r3 == 0) goto L7e
            nvn r0 = r0.b(r1)
            ngs r2 = new ngs
            java.lang.Class r1 = r0.getClass()
            r1.getSimpleName()
            r2.<init>(r0)
        L76:
            r6.p = r2
            long r0 = r6.f
            r2.f(r0)
            return
        L7e:
            java.lang.String r0 = java.lang.String.valueOf(r2)
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Attempted to create decoder for unsupported MIME type: "
            java.lang.String r0 = r2.concat(r0)
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ngz.aa():void");
    }

    private final void ab(final mdw mdwVar) {
        final ekgb ekgbVar = mdwVar.b;
        mez mezVar = new mez() { // from class: mrh
            @Override // defpackage.mez
            public final void a(Object obj) {
                int i = mrk.b;
                ((mce) obj).e(ekgbVar);
            }
        };
        mrn mrnVar = this.B.a;
        mfc mfcVar = mrnVar.h;
        mfcVar.f(27, mezVar);
        mrnVar.y = mdwVar;
        mfcVar.f(27, new mez() { // from class: mrd
            @Override // defpackage.mez
            public final void a(Object obj) {
                int i = mrk.b;
                ((mce) obj).d(mdwVar);
            }
        });
    }

    private final void ac() {
        this.q = null;
        this.t = -1;
        nvh nvhVar = this.r;
        if (nvhVar != null) {
            nvhVar.h();
            this.r = null;
        }
        nvh nvhVar2 = this.s;
        if (nvhVar2 != null) {
            nvhVar2.h();
            this.s = null;
        }
    }

    private final void ad() {
        ac();
        nvb nvbVar = this.p;
        mee.f(nvbVar);
        nvbVar.e();
        this.p = null;
        this.o = 0;
    }

    private final void ae() {
        ad();
        aa();
    }

    private final void af(mdw mdwVar) {
        Handler handler = this.u;
        if (handler != null) {
            handler.obtainMessage(1, mdwVar).sendToTarget();
        } else {
            ab(mdwVar);
        }
    }

    private static boolean ag(nva nvaVar, long j) {
        return nvaVar == null || nvaVar.c(nvaVar.a() + (-1)) <= j;
    }

    private static boolean ah(mau mauVar) {
        return Objects.equals(mauVar.o, "application/x-media3-cues");
    }

    private static final void ai(long j) {
        mee.c(j != -9223372036854775807L);
    }

    @Override // defpackage.mpc
    protected final void B(mau[] mauVarArr, long j, long j2, nen nenVar) {
        mau mauVar = mauVarArr[0];
        this.y = mauVar;
        this.A = null;
        if (ah(mauVar)) {
            this.l = this.y.M == 1 ? new ngv() : new ngw();
            return;
        }
        X();
        if (this.p != null) {
            this.o = 1;
        } else {
            aa();
        }
    }

    @Override // defpackage.mth, defpackage.mtk
    public final String R() {
        return "TextRenderer";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01af  */
    @Override // defpackage.mth
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void S(long r10, long r12) {
        /*
            Method dump skipped, instructions count: 562
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ngz.S(long, long):void");
    }

    @Override // defpackage.mth
    public final boolean T() {
        return this.x;
    }

    @Override // defpackage.mth
    public final boolean U() {
        if (this.y == null) {
            return true;
        }
        if (this.A == null) {
            try {
                t();
            } catch (IOException e) {
                this.A = e;
            }
        }
        if (this.A != null) {
            mau mauVar = this.y;
            mee.f(mauVar);
            if (ah(mauVar)) {
                ngr ngrVar = this.l;
                mee.f(ngrVar);
                return ngrVar.a(this.z) != Long.MIN_VALUE;
            }
            if (this.x || (this.w && ag(this.r, this.z) && ag(this.s, this.z) && this.q != null)) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.mtk
    public final int V(mau mauVar) {
        if (!ah(mauVar)) {
            ngy ngyVar = this.m;
            String str = mauVar.o;
            if (!((ngx) ngyVar).a.c(mauVar) && !Objects.equals(str, "application/cea-608") && !Objects.equals(str, "application/x-mp4-cea-608") && !Objects.equals(str, "application/cea-708")) {
                return mti.a(mbw.k(str) ? 1 : 0);
            }
        }
        return mti.a(mauVar.O == 0 ? 4 : 2);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 1) {
            throw new IllegalStateException();
        }
        ab((mdw) message.obj);
        return true;
    }

    @Override // defpackage.mpc
    protected final void u() {
        this.y = null;
        this.A = null;
        this.j = -9223372036854775807L;
        Y();
        this.z = -9223372036854775807L;
        if (this.p != null) {
            ad();
        }
    }

    @Override // defpackage.mpc
    protected final void w(long j, boolean z) {
        this.z = j;
        ngr ngrVar = this.l;
        if (ngrVar != null) {
            ngrVar.d();
        }
        Y();
        this.w = false;
        this.x = false;
        this.j = -9223372036854775807L;
        mau mauVar = this.y;
        if (mauVar == null || ah(mauVar)) {
            return;
        }
        if (this.o != 0) {
            ae();
            return;
        }
        ac();
        nvb nvbVar = this.p;
        mee.f(nvbVar);
        nvbVar.c();
        nvbVar.f(this.f);
    }
}
