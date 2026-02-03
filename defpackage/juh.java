package defpackage;

import android.graphics.Canvas;
import android.text.TextUtils;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class juh implements jvi {
    public final kfz a;
    public final jzj b;
    public final CharSequence c;
    public final List d;
    private final int e;
    private final int f;
    private final long g;

    /* JADX WARN: Removed duplicated region for block: B:110:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01a6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public juh(defpackage.kfz r24, int r25, int r26, long r27) {
        /*
            Method dump skipped, instructions count: 1018
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.juh.<init>(kfz, int, int, long):void");
    }

    static /* synthetic */ jzj k(juh juhVar, int i, int i2, TextUtils.TruncateAt truncateAt, int i3, int i4, int i5, int i6, int i7) {
        return juhVar.o(i, i2, truncateAt, i3, i4, i5, i6, i7, juhVar.c);
    }

    private final jzj o(int i, int i2, TextUtils.TruncateAt truncateAt, int i3, int i4, int i5, int i6, int i7, CharSequence charSequence) {
        kfz kfzVar = this.a;
        return new jzj(charSequence, f(), i(), i, truncateAt, kfzVar.g, kfx.a(kfzVar.a), i3, i5, i6, i7, i4, i2, kfzVar.e);
    }

    private final void p(ijb ijbVar) {
        Canvas canvasA = iid.a(ijbVar);
        if (j()) {
            canvasA.save();
            canvasA.clipRect(0.0f, 0.0f, f(), b());
        }
        jzj jzjVar = this.b;
        if (canvasA.getClipBounds(jzjVar.j)) {
            int i = jzjVar.g;
            if (i != 0) {
                canvasA.translate(0.0f, i);
            }
            jzi jziVar = jzl.a;
            jziVar.a = canvasA;
            jzjVar.e.draw(jziVar);
            if (i != 0) {
                canvasA.translate(0.0f, -i);
            }
        }
        if (j()) {
            canvasA.restore();
        }
    }

    @Override // defpackage.jvi
    public final float a() {
        return e(0);
    }

    @Override // defpackage.jvi
    public final float b() {
        return this.b.h();
    }

    @Override // defpackage.jvi
    public final float c(int i, boolean z) {
        return z ? this.b.f(i, false) : this.b.g(i, false);
    }

    @Override // defpackage.jvi
    public final float d() {
        return e(g() - 1);
    }

    public final float e(int i) {
        return this.b.b(i);
    }

    @Override // defpackage.jvi
    public final float f() {
        return kil.b(this.g);
    }

    @Override // defpackage.jvi
    public final int g() {
        return this.b.f;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00c5  */
    @Override // defpackage.jvi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long h(defpackage.ihu r13, int r14, final defpackage.jyf r15) {
        /*
            Method dump skipped, instructions count: 252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.juh.h(ihu, int, jyf):long");
    }

    public final kgc i() {
        return this.a.c;
    }

    @Override // defpackage.jvi
    public final boolean j() {
        return this.b.d;
    }

    @Override // defpackage.jvi
    public final int l(int i) {
        return this.b.s(i) ? 2 : 1;
    }

    @Override // defpackage.jvi
    public final void m(ijb ijbVar, long j, iko ikoVar, khl khlVar, ina inaVar) {
        int i = i().a;
        kgc kgcVarI = i();
        kgcVarI.c(j);
        kgcVarI.e(ikoVar);
        kgcVarI.f(khlVar);
        kgcVarI.d(inaVar);
        kgcVarI.a(3);
        p(ijbVar);
        i().a(i);
    }

    @Override // defpackage.jvi
    public final void n(ijb ijbVar, iiy iiyVar, float f, iko ikoVar, khl khlVar, ina inaVar) {
        int i = i().a;
        kgc kgcVarI = i();
        float f2 = f();
        float fB = b();
        kgcVarI.b(iiyVar, (Float.floatToRawIntBits(fB) & 4294967295L) | (Float.floatToRawIntBits(f2) << 32), f);
        kgcVarI.e(ikoVar);
        kgcVarI.f(khlVar);
        kgcVarI.d(inaVar);
        kgcVarI.a(3);
        p(ijbVar);
        i().a(i);
    }
}
