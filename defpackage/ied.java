package defpackage;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Trace;
import android.view.View;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import androidx.compose.ui.platform.AndroidComposeView;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ied implements View.OnAttachStateChangeListener, lun {
    public final AndroidComposeView a;
    public jog e;
    public boolean f;
    private final fdae i;
    private jqf j;
    private long n;
    private final List k = new ArrayList();
    public int h = 1;
    public boolean b = true;
    private final fdoa l = fdod.a(1, 0, 6);
    public final Handler c = new Handler(Looper.getMainLooper());
    private ctj m = ctk.a();
    public final cuh d = new cuh((byte[]) null);
    public final Runnable g = new Runnable() { // from class: idx
        @Override // java.lang.Runnable
        public final void run() {
            char c;
            long j;
            long j2;
            long j3;
            ctj ctjVar;
            int[] iArr;
            long[] jArr;
            ctj ctjVar2;
            int[] iArr2;
            long[] jArr2;
            long j4;
            int i;
            int i2;
            long[] jArr3;
            long j5;
            char c2;
            long j6;
            ied iedVar = this.a;
            if (iedVar.n()) {
                Trace.beginSection("ContentCapture:changeChecker");
                try {
                    AndroidComposeView androidComposeView = iedVar.a;
                    androidComposeView.q(true);
                    cuh cuhVar = iedVar.d;
                    int[] iArr3 = cuhVar.b;
                    long[] jArr4 = cuhVar.a;
                    int length = jArr4.length - 2;
                    char c3 = 7;
                    long j7 = -9187201950435737472L;
                    int i3 = 8;
                    if (length >= 0) {
                        int i4 = 0;
                        j2 = 128;
                        while (true) {
                            long j8 = jArr4[i4];
                            j3 = 255;
                            if ((((~j8) << c3) & j8 & j7) != j7) {
                                int i5 = 8 - ((~(i4 - length)) >>> 31);
                                int i6 = 0;
                                while (i6 < i5) {
                                    if ((j8 & 255) < 128) {
                                        c2 = c3;
                                        int i7 = iArr3[(i4 << 3) + i6];
                                        j6 = j7;
                                        if (!iedVar.g().b(i7)) {
                                            iedVar.i(i7);
                                            iedVar.j();
                                        }
                                    } else {
                                        c2 = c3;
                                        j6 = j7;
                                    }
                                    j8 >>= 8;
                                    i6++;
                                    c3 = c2;
                                    j7 = j6;
                                }
                                c = c3;
                                j = j7;
                                if (i5 != 8) {
                                    break;
                                }
                            } else {
                                c = c3;
                                j = j7;
                            }
                            if (i4 == length) {
                                break;
                            }
                            i4++;
                            c3 = c;
                            j7 = j;
                        }
                    } else {
                        c = 7;
                        j = -9187201950435737472L;
                        j2 = 128;
                        j3 = 255;
                    }
                    Trace.beginSection("ContentCapture:sendAppearEvents");
                    iedVar.k(androidComposeView.q.a(), iedVar.e);
                    Trace.endSection();
                    ctj ctjVarG = iedVar.g();
                    int[] iArr4 = ctjVarG.b;
                    long[] jArr5 = ctjVarG.a;
                    int length2 = jArr5.length - 2;
                    if (length2 >= 0) {
                        int i8 = 0;
                        while (true) {
                            long j9 = jArr5[i8];
                            if ((((~j9) << c) & j9 & j) != j) {
                                int i9 = 8 - ((~(i8 - length2)) >>> 31);
                                int i10 = 0;
                                while (i10 < i9) {
                                    if ((j9 & j3) < j2) {
                                        int i11 = iArr4[(i8 << 3) + i10];
                                        jog jogVar = (jog) iedVar.d.a(i11);
                                        jsn jsnVar = (jsn) ctjVarG.a(i11);
                                        jsl jslVar = jsnVar != null ? jsnVar.a : null;
                                        if (jslVar == null) {
                                            itw.b("no value for specified key");
                                            throw new fcta();
                                        }
                                        if (jogVar == null) {
                                            jsc jscVar = jslVar.c;
                                            cuz cuzVar = jscVar.a;
                                            Object[] objArr = cuzVar.b;
                                            long[] jArr6 = cuzVar.a;
                                            int i12 = i3;
                                            int length3 = jArr6.length - 2;
                                            ctjVar2 = ctjVarG;
                                            iArr2 = iArr4;
                                            if (length3 >= 0) {
                                                int i13 = 0;
                                                while (true) {
                                                    long j10 = jArr6[i13];
                                                    j4 = j9;
                                                    if ((((~j10) << c) & j10 & j) != j) {
                                                        int i14 = 8 - ((~(i13 - length3)) >>> 31);
                                                        for (int i15 = 0; i15 < i14; i15++) {
                                                            if ((j10 & j3) < j2) {
                                                                j5 = j10;
                                                                jtn jtnVar = (jtn) objArr[(i13 << 3) + i15];
                                                                jtn jtnVar2 = jte.A;
                                                                if (fdbq.f(jtnVar, jtnVar2)) {
                                                                    List list = (List) jsd.a(jscVar, jtnVar2);
                                                                    iedVar.l(jslVar.e, String.valueOf(list != null ? (juo) fcva.P(list) : null));
                                                                }
                                                            } else {
                                                                j5 = j10;
                                                            }
                                                            j10 = j5 >> i12;
                                                        }
                                                        i = i12;
                                                        if (i14 != i) {
                                                            jArr2 = jArr5;
                                                            break;
                                                        }
                                                    }
                                                    if (i13 == length3) {
                                                        break;
                                                    }
                                                    i13++;
                                                    j9 = j4;
                                                    i12 = 8;
                                                }
                                            } else {
                                                j4 = j9;
                                            }
                                            jArr2 = jArr5;
                                        } else {
                                            ctjVar2 = ctjVarG;
                                            iArr2 = iArr4;
                                            j4 = j9;
                                            jsc jscVar2 = jslVar.c;
                                            cuz cuzVar2 = jscVar2.a;
                                            Object[] objArr2 = cuzVar2.b;
                                            long[] jArr7 = cuzVar2.a;
                                            int length4 = jArr7.length - 2;
                                            if (length4 >= 0) {
                                                int i16 = 0;
                                                while (true) {
                                                    long j11 = jArr7[i16];
                                                    long[] jArr8 = jArr7;
                                                    Object[] objArr3 = objArr2;
                                                    if ((((~j11) << c) & j11 & j) != j) {
                                                        int i17 = 8 - ((~(i16 - length4)) >>> 31);
                                                        int i18 = 0;
                                                        while (i18 < i17) {
                                                            if ((j11 & j3) < j2) {
                                                                i2 = i18;
                                                                jtn jtnVar3 = (jtn) objArr3[(i16 << 3) + i18];
                                                                jArr3 = jArr5;
                                                                jtn jtnVar4 = jte.A;
                                                                if (fdbq.f(jtnVar3, jtnVar4)) {
                                                                    List list2 = (List) jsd.a(jogVar.a, jtnVar4);
                                                                    juo juoVar = list2 != null ? (juo) fcva.P(list2) : null;
                                                                    List list3 = (List) jsd.a(jscVar2, jtnVar4);
                                                                    juo juoVar2 = list3 != null ? (juo) fcva.P(list3) : null;
                                                                    if (!fdbq.f(juoVar, juoVar2)) {
                                                                        iedVar.l(jslVar.e, String.valueOf(juoVar2));
                                                                    }
                                                                }
                                                            } else {
                                                                i2 = i18;
                                                                jArr3 = jArr5;
                                                            }
                                                            j11 >>= 8;
                                                            i18 = i2 + 1;
                                                            jArr5 = jArr3;
                                                        }
                                                        jArr2 = jArr5;
                                                        if (i17 != 8) {
                                                            i = 8;
                                                            break;
                                                        }
                                                    } else {
                                                        jArr2 = jArr5;
                                                    }
                                                    if (i16 == length4) {
                                                        break;
                                                    }
                                                    i16++;
                                                    objArr2 = objArr3;
                                                    jArr7 = jArr8;
                                                    jArr5 = jArr2;
                                                }
                                            } else {
                                                jArr2 = jArr5;
                                            }
                                        }
                                        i = 8;
                                    } else {
                                        ctjVar2 = ctjVarG;
                                        iArr2 = iArr4;
                                        jArr2 = jArr5;
                                        j4 = j9;
                                        i = i3;
                                    }
                                    j9 = j4 >> i;
                                    i10++;
                                    i3 = i;
                                    ctjVarG = ctjVar2;
                                    iArr4 = iArr2;
                                    jArr5 = jArr2;
                                }
                                ctjVar = ctjVarG;
                                iArr = iArr4;
                                jArr = jArr5;
                                if (i9 != i3) {
                                    break;
                                }
                            } else {
                                ctjVar = ctjVarG;
                                iArr = iArr4;
                                jArr = jArr5;
                            }
                            if (i8 == length2) {
                                break;
                            }
                            i8++;
                            ctjVarG = ctjVar;
                            iArr4 = iArr;
                            jArr5 = jArr;
                            i3 = 8;
                        }
                    }
                    cuh cuhVar2 = iedVar.d;
                    cuhVar2.e();
                    ctj ctjVarG2 = iedVar.g();
                    int[] iArr5 = ctjVarG2.b;
                    Object[] objArr4 = ctjVarG2.c;
                    long[] jArr9 = ctjVarG2.a;
                    int length5 = jArr9.length - 2;
                    if (length5 >= 0) {
                        int i19 = 0;
                        while (true) {
                            long j12 = jArr9[i19];
                            if ((((~j12) << c) & j12 & j) != j) {
                                int i20 = 8 - ((~(i19 - length5)) >>> 31);
                                for (int i21 = 0; i21 < i20; i21++) {
                                    if ((j12 & j3) < j2) {
                                        int i22 = (i19 << 3) + i21;
                                        cuhVar2.f(iArr5[i22], new jog(((jsn) objArr4[i22]).a, iedVar.g()));
                                    }
                                    j12 >>= 8;
                                }
                                if (i20 != 8) {
                                    break;
                                }
                            }
                            if (i19 == length5) {
                                break;
                            } else {
                                i19++;
                            }
                        }
                    }
                    iedVar.e = new jog(iedVar.a.q.a(), iedVar.g());
                    iedVar.f = false;
                } catch (Throwable th) {
                    throw th;
                } finally {
                    Trace.endSection();
                }
            }
        }
    };

    public ied(AndroidComposeView androidComposeView, fdae fdaeVar) {
        this.a = androidComposeView;
        this.i = fdaeVar;
        this.e = new jog(androidComposeView.q.a(), ctk.a());
    }

    private final void o(jsl jslVar, fdat fdatVar) {
        List listJ = jslVar.j();
        int size = listJ.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = listJ.get(i2);
            if (g().b(((jsl) obj).e)) {
                fdatVar.a(Integer.valueOf(i), obj);
                i++;
            }
        }
    }

    private final void p() {
        jqf jqfVar = this.j;
        if (jqfVar != null && Build.VERSION.SDK_INT >= 29) {
            List list = this.k;
            if (list.isEmpty()) {
                return;
            }
            int size = list.size();
            for (int i = 0; i < size; i++) {
                iee ieeVar = (iee) list.get(i);
                if (ieeVar.c - 1 != 0) {
                    AutofillId autofillIdA = jqfVar.a(ieeVar.a);
                    if (autofillIdA != null && Build.VERSION.SDK_INT >= 29) {
                        ied$$ExternalSyntheticApiModelOutline0.m(jqfVar.a).notifyViewDisappeared(autofillIdA);
                    }
                } else {
                    jqh jqhVar = ieeVar.b;
                    if (jqhVar != null && Build.VERSION.SDK_INT >= 29) {
                        ied$$ExternalSyntheticApiModelOutline0.m(jqfVar.a).notifyViewAppeared((ViewStructure) jqhVar.a);
                    }
                }
            }
            if (Build.VERSION.SDK_INT >= 29) {
                ied$$ExternalSyntheticApiModelOutline0.m(jqfVar.a).notifyViewsDisappeared(iy$$ExternalSyntheticApiModelOutline1.m511m(jqg.a(jqfVar.b).a), new long[]{Long.MIN_VALUE});
            }
            list.clear();
        }
    }

    private final void q(jsl jslVar) {
        if (n()) {
            i(jslVar.e);
            List listJ = jslVar.j();
            int size = listJ.size();
            for (int i = 0; i < size; i++) {
                q((jsl) listJ.get(i));
            }
        }
    }

    @Override // defpackage.lun
    public final void f(lvj lvjVar) {
        q(this.a.q.a());
        p();
        this.j = null;
    }

    public final ctj g() {
        if (this.b) {
            this.b = false;
            this.m = jsp.c(this.a.q);
            this.n = System.currentTimeMillis();
        }
        return this.m;
    }

    @Override // defpackage.lun
    public final void gG(lvj lvjVar) {
        this.j = (jqf) this.i.invoke();
        m(-1, this.a.q.a());
        p();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x007e -> B:17:0x0043). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(defpackage.fcxy r8) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r8 instanceof defpackage.iea
            if (r0 == 0) goto L13
            r0 = r8
            iea r0 = (defpackage.iea) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            iea r0 = new iea
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            fdnq r2 = r0.d
            defpackage.fctl.b(r8)
            goto L43
        L2c:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L34:
            fdnq r2 = r0.d
            defpackage.fctl.b(r8)
            goto L50
        L3a:
            defpackage.fctl.b(r8)
            fdoa r8 = r7.l
            fdoc r2 = r8.r()
        L43:
            r8 = r2
            fdnq r8 = (defpackage.fdnq) r8
            r0.d = r8
            r0.c = r4
            java.lang.Object r8 = r2.a(r0)
            if (r8 == r1) goto L84
        L50:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L81
            r2.b()
            boolean r8 = r7.n()
            if (r8 == 0) goto L64
            r7.p()
        L64:
            boolean r8 = r7.f
            if (r8 != 0) goto L71
            r7.f = r4
            android.os.Handler r8 = r7.c
            java.lang.Runnable r5 = r7.g
            r8.post(r5)
        L71:
            r8 = r2
            fdnq r8 = (defpackage.fdnq) r8
            r0.d = r8
            r0.c = r3
            r5 = 100
            java.lang.Object r8 = defpackage.fdkj.c(r5, r0)
            if (r8 != r1) goto L43
            goto L84
        L81:
            fctx r8 = defpackage.fctx.a
            return r8
        L84:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ied.h(fcxy):java.lang.Object");
    }

    public final void i(int i) {
        this.k.add(new iee(i, this.n, 2, null));
    }

    public final void j() {
        this.l.b(fctx.a);
    }

    public final void k(jsl jslVar, jog jogVar) {
        o(jslVar, new ieb(jogVar, this));
        List listJ = jslVar.j();
        int size = listJ.size();
        for (int i = 0; i < size; i++) {
            jsl jslVar2 = (jsl) listJ.get(i);
            ctj ctjVarG = g();
            int i2 = jslVar2.e;
            if (ctjVarG.b(i2)) {
                cuh cuhVar = this.d;
                if (cuhVar.b(i2)) {
                    Object objA = cuhVar.a(i2);
                    if (objA == null) {
                        itw.b("node not present in pruned tree before this change");
                        throw new fcta();
                    }
                    k(jslVar2, (jog) objA);
                } else {
                    continue;
                }
            }
        }
    }

    public final void l(int i, String str) {
        jqf jqfVar;
        if (Build.VERSION.SDK_INT >= 29 && (jqfVar = this.j) != null) {
            AutofillId autofillIdA = jqfVar.a(i);
            if (autofillIdA == null) {
                itw.b("Invalid content capture ID");
                throw new fcta();
            }
            if (Build.VERSION.SDK_INT >= 29) {
                ied$$ExternalSyntheticApiModelOutline0.m(jqfVar.a).notifyViewTextChanged(autofillIdA, str);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0184  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m(int r17, defpackage.jsl r18) {
        /*
            Method dump skipped, instructions count: 434
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ied.m(int, jsl):void");
    }

    public final boolean n() {
        return this.j != null;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.c.removeCallbacks(this.g);
        this.j = null;
    }

    @Override // defpackage.lun
    public final /* synthetic */ void c(lvj lvjVar) {
    }

    @Override // defpackage.lun
    public final /* synthetic */ void d(lvj lvjVar) {
    }

    @Override // defpackage.lun
    public final /* synthetic */ void fh(lvj lvjVar) {
    }

    @Override // defpackage.lun
    public final /* synthetic */ void gF(lvj lvjVar) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
