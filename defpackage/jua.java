package defpackage;

import android.os.Handler;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jua {
    public final jty a;
    public final jud b;
    public boolean c;
    public Object d;
    private final cuu e;
    private boolean f;
    private boolean g;
    private long h;
    private final fdae i;
    private final ihp j;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public jua() {
        this(null);
        ctk.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00df  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void g(defpackage.jcr r18, long r19, boolean r21) {
        /*
            Method dump skipped, instructions count: 248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jua.g(jcr, long, boolean):void");
    }

    private final void h(jcr jcrVar) {
        hum humVarQ = jcrVar.q();
        Object[] objArr = humVarQ.a;
        int i = humVarQ.b;
        for (int i2 = 0; i2 < i; i2++) {
            jcr jcrVar2 = (jcr) objArr[i2];
            g(jcrVar2, jcrVar2.x().z, false);
            h(jcrVar2);
        }
    }

    private static final long i(jcr jcrVar) {
        float[] fArrM;
        int iA;
        jer jerVarX = jcrVar.x();
        jer jerVarW = jcrVar.w();
        long jB = 0;
        while (jerVarW != null && jerVarW != jerVarX) {
            jfe jfeVar = jerVarW.E;
            jB = kjc.b(jB, jerVarW.z);
            jerVarW = jerVarW.x;
            if (jfeVar != null && (iA = jub.a((fArrM = jfeVar.m()))) != 3) {
                if ((iA & 2) == 0) {
                    return 9223372034707292159L;
                }
                jB = iju.a(fArrM, jB);
            }
        }
        return kjc.c(jB);
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0154  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a() {
        /*
            Method dump skipped, instructions count: 350
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jua.a():void");
    }

    public final void b() {
        this.f = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.lang.Object, java.lang.Runnable] */
    public final void c(jcr jcrVar) {
        this.f = true;
        int i = jcrVar.c & 67108863;
        jty jtyVar = this.a;
        long[] jArr = jtyVar.a;
        int i2 = jtyVar.c;
        boolean z = false;
        int i3 = 0;
        while (true) {
            if (i3 >= jArr.length - 2 || i3 >= i2) {
                break;
            }
            int i4 = i3 + 2;
            long j = jArr[i4];
            if ((((int) j) & 67108863) == i) {
                jArr[i4] = 2305843009213693952L | j;
                break;
            }
            i3 += 3;
        }
        ?? r11 = this.d;
        boolean z2 = r11 != 0;
        long j2 = this.b.b;
        if (j2 >= 0) {
            z = z2;
        } else if (z2) {
            return;
        }
        if (this.h == j2 && z) {
            return;
        }
        if (r11 != 0) {
            ibu.a.removeCallbacks(r11);
        }
        Handler handler = ibu.a;
        long jCurrentTimeMillis = System.currentTimeMillis();
        long jMax = Math.max(j2, 16 + jCurrentTimeMillis);
        this.h = jMax;
        final fdae fdaeVar = this.i;
        Runnable runnable = new Runnable() { // from class: ibt
            @Override // java.lang.Runnable
            public final void run() {
                Handler handler2 = ibu.a;
                fdaeVar.invoke();
            }
        };
        ibu.a.postDelayed(runnable, jMax - jCurrentTimeMillis);
        this.d = runnable;
    }

    public final void d(jcr jcrVar) {
        long jI = i(jcrVar);
        if (!jub.b(jI)) {
            h(jcrVar);
            return;
        }
        jcrVar.f = jI;
        jcrVar.aB();
        hum humVarQ = jcrVar.q();
        Object[] objArr = humVarQ.a;
        int i = humVarQ.b;
        for (int i2 = 0; i2 < i; i2++) {
            jcr jcrVar2 = (jcr) objArr[i2];
            e(jcrVar2, jcrVar2.x().z, false);
        }
        c(jcrVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:74:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01f7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(defpackage.jcr r33, long r34, boolean r36) {
        /*
            Method dump skipped, instructions count: 543
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jua.e(jcr, long, boolean):void");
    }

    public final void f(jcr jcrVar) {
        int i = jcrVar.c & 67108863;
        jty jtyVar = this.a;
        long[] jArr = jtyVar.a;
        int i2 = jtyVar.c;
        int i3 = 0;
        while (true) {
            if (i3 >= jArr.length - 2 || i3 >= i2) {
                break;
            }
            int i4 = i3 + 2;
            if ((((int) jArr[i4]) & 67108863) == i) {
                jArr[i3] = -1;
                jArr[i3 + 1] = -1;
                jArr[i4] = 2305843009213693951L;
                break;
            }
            i3 += 3;
        }
        b();
        this.g = true;
    }

    public jua(byte[] bArr) {
        this.a = new jty();
        this.b = new jud();
        this.e = new cuu((byte[]) null);
        this.h = -1L;
        this.i = new jtz(this);
        this.j = new ihp();
    }
}
