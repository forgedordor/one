package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.util.Base64;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.Stack;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ryv {
    private static HashSet h;
    public final Canvas a;
    public final rwh b;
    public ryk c;
    public ryr d;
    public Stack e;
    public Stack f;
    public Stack g;

    protected ryv(Canvas canvas, rwh rwhVar) {
        this.a = canvas;
        this.b = rwhVar;
    }

    private final void A(rwp rwpVar, String str) {
        rxs rxsVarA = rwpVar.t.a(str);
        if (rxsVarA == null) {
            h("Gradient reference '%s' not found", str);
            return;
        }
        if (!(rxsVarA instanceof rwp)) {
            e("Gradient href attributes must point to other gradient elements", new Object[0]);
            return;
        }
        if (rxsVarA == rwpVar) {
            e("Circular reference in gradient href attribute '%s'", str);
            return;
        }
        rwp rwpVar2 = (rwp) rxsVarA;
        if (rwpVar.b == null) {
            rwpVar.b = rwpVar2.b;
        }
        if (rwpVar.c == null) {
            rwpVar.c = rwpVar2.c;
        }
        if (rwpVar.e == 0) {
            rwpVar.e = rwpVar2.e;
        }
        if (rwpVar.a.isEmpty()) {
            rwpVar.a = rwpVar2.a;
        }
        try {
            if (rwpVar instanceof rxr) {
                rxr rxrVar = (rxr) rwpVar;
                rxr rxrVar2 = (rxr) rxsVarA;
                if (rxrVar.f == null) {
                    rxrVar.f = rxrVar2.f;
                }
                if (rxrVar.g == null) {
                    rxrVar.g = rxrVar2.g;
                }
                if (rxrVar.h == null) {
                    rxrVar.h = rxrVar2.h;
                }
                if (rxrVar.i == null) {
                    rxrVar.i = rxrVar2.i;
                }
            } else {
                rxv rxvVar = (rxv) rwpVar;
                rxv rxvVar2 = (rxv) rxsVarA;
                if (rxvVar.f == null) {
                    rxvVar.f = rxvVar2.f;
                }
                if (rxvVar.g == null) {
                    rxvVar.g = rxvVar2.g;
                }
                if (rxvVar.h == null) {
                    rxvVar.h = rxvVar2.h;
                }
                if (rxvVar.i == null) {
                    rxvVar.i = rxvVar2.i;
                }
                if (rxvVar.j == null) {
                    rxvVar.j = rxvVar2.j;
                }
            }
        } catch (ClassCastException unused) {
        }
        String str2 = rwpVar2.d;
        if (str2 != null) {
            A(rwpVar, str2);
        }
    }

    private final void B(rxd rxdVar, String str) {
        rxs rxsVarA = rxdVar.t.a(str);
        if (rxsVarA == null) {
            h("Pattern reference '%s' not found", str);
            return;
        }
        if (!(rxsVarA instanceof rxd)) {
            e("Pattern href attributes must point to other pattern elements", new Object[0]);
            return;
        }
        if (rxsVarA == rxdVar) {
            e("Circular reference in pattern href attribute '%s'", str);
            return;
        }
        rxd rxdVar2 = (rxd) rxsVarA;
        if (rxdVar.a == null) {
            rxdVar.a = rxdVar2.a;
        }
        if (rxdVar.b == null) {
            rxdVar.b = rxdVar2.b;
        }
        if (rxdVar.c == null) {
            rxdVar.c = rxdVar2.c;
        }
        if (rxdVar.d == null) {
            rxdVar.d = rxdVar2.d;
        }
        if (rxdVar.e == null) {
            rxdVar.e = rxdVar2.e;
        }
        if (rxdVar.f == null) {
            rxdVar.f = rxdVar2.f;
        }
        if (rxdVar.g == null) {
            rxdVar.g = rxdVar2.g;
        }
        if (rxdVar.i.isEmpty()) {
            rxdVar.i = rxdVar2.i;
        }
        if (rxdVar.w == null) {
            rxdVar.w = rxdVar2.w;
        }
        if (rxdVar.v == null) {
            rxdVar.v = rxdVar2.v;
        }
        String str2 = rxdVar2.h;
        if (str2 != null) {
            B(rxdVar, str2);
        }
    }

    private static synchronized void C() {
        HashSet hashSet = new HashSet();
        h = hashSet;
        hashSet.add("Structure");
        h.add("BasicStructure");
        h.add("ConditionalProcessing");
        h.add("Image");
        h.add("Style");
        h.add("ViewportAttribute");
        h.add("Shape");
        h.add("BasicText");
        h.add("PaintAttribute");
        h.add("BasicPaintAttribute");
        h.add("OpacityAttribute");
        h.add("BasicGraphicsAttribute");
        h.add("Marker");
        h.add("Gradient");
        h.add("Pattern");
        h.add("Clip");
        h.add("BasicClip");
        h.add("Mask");
        h.add("View");
    }

    private final void D() {
        this.f.pop();
        this.g.pop();
    }

    private final void E(rxo rxoVar) {
        this.f.push(rxoVar);
        this.g.push(this.a.getMatrix());
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void F(rxs rxsVar) {
        rwu rwuVar;
        rwu rwuVar2;
        rwu rwuVar3;
        String str;
        int iIndexOf;
        Set setG;
        rwu rwuVar4;
        if (rxsVar instanceof rwy) {
            return;
        }
        M();
        d(rxsVar);
        if (rxsVar instanceof rxk) {
            rxk rxkVar = (rxk) rxsVar;
            G(rxkVar, rxkVar.c, rxkVar.d);
        } else {
            if (rxsVar instanceof ryi) {
                ryi ryiVar = (ryi) rxsVar;
                rwu rwuVar5 = ryiVar.e;
                if ((rwuVar5 == null || !rwuVar5.f()) && ((rwuVar4 = ryiVar.f) == null || !rwuVar4.f())) {
                    O(this.d, ryiVar);
                    if (Q()) {
                        rxs rxsVarA = ryiVar.t.a(ryiVar.a);
                        if (rxsVarA == null) {
                            e("Use reference '%s' not found", ryiVar.a);
                        } else {
                            Matrix matrix = ryiVar.b;
                            if (matrix != null) {
                                this.a.concat(matrix);
                            }
                            Matrix matrix2 = new Matrix();
                            rwu rwuVar6 = ryiVar.c;
                            float fC = rwuVar6 != null ? rwuVar6.c(this) : 0.0f;
                            rwu rwuVar7 = ryiVar.d;
                            matrix2.preTranslate(fC, rwuVar7 != null ? rwuVar7.d(this) : 0.0f);
                            Canvas canvas = this.a;
                            canvas.concat(matrix2);
                            s(ryiVar);
                            boolean zR = R();
                            E(ryiVar);
                            if (rxsVarA instanceof rxk) {
                                M();
                                rxk rxkVar2 = (rxk) rxsVarA;
                                rwu rwuVar8 = ryiVar.e;
                                if (rwuVar8 == null) {
                                    rwuVar8 = rxkVar2.c;
                                }
                                rwu rwuVar9 = ryiVar.f;
                                if (rwuVar9 == null) {
                                    rwuVar9 = rxkVar2.d;
                                }
                                G(rxkVar2, rwuVar8, rwuVar9);
                                L();
                            } else if (rxsVarA instanceof rxy) {
                                rwu rwuVar10 = ryiVar.e;
                                if (rwuVar10 == null) {
                                    rwuVar10 = new rwu(100.0f, 9);
                                }
                                rwu rwuVar11 = ryiVar.f;
                                if (rwuVar11 == null) {
                                    rwuVar11 = new rwu(100.0f, 9);
                                }
                                M();
                                rxy rxyVar = (rxy) rxsVarA;
                                if (!rwuVar10.f() && !rwuVar11.f()) {
                                    rwg rwgVar = rxyVar.v;
                                    if (rwgVar == null) {
                                        rwgVar = rwg.b;
                                    }
                                    O(this.d, rxyVar);
                                    float fC2 = rwuVar10.c(this);
                                    float fC3 = rwuVar11.c(this);
                                    ryr ryrVar = this.d;
                                    ryrVar.f = new rwh(0.0f, 0.0f, fC2, fC3);
                                    if (!ryrVar.a.o.booleanValue()) {
                                        rwh rwhVar = this.d.f;
                                        K(rwhVar.a, rwhVar.b, rwhVar.c, rwhVar.d);
                                    }
                                    rwh rwhVar2 = rxyVar.w;
                                    if (rwhVar2 != null) {
                                        canvas.concat(U(this.d.f, rwhVar2, rwgVar));
                                        this.d.g = rxyVar.w;
                                    }
                                    boolean zR2 = R();
                                    H(rxyVar, true);
                                    if (zR2) {
                                        Z();
                                    }
                                    N(rxyVar);
                                }
                                L();
                            } else {
                                F(rxsVarA);
                            }
                            D();
                            if (zR) {
                                Z();
                            }
                            N(ryiVar);
                        }
                    }
                }
            } else if (rxsVar instanceof rxx) {
                rxx rxxVar = (rxx) rxsVar;
                O(this.d, rxxVar);
                if (Q()) {
                    Matrix matrix3 = rxxVar.b;
                    if (matrix3 != null) {
                        this.a.concat(matrix3);
                    }
                    s(rxxVar);
                    boolean zR3 = R();
                    String language = Locale.getDefault().getLanguage();
                    Iterator it = rxxVar.i.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        rxs rxsVar2 = (rxs) it.next();
                        if (rxsVar2 instanceof rxl) {
                            rxl rxlVar = (rxl) rxsVar2;
                            if (rxlVar.c() == null && ((setG = rxlVar.g()) == null || (!setG.isEmpty() && setG.contains(language)))) {
                                Set setD = rxlVar.d();
                                if (setD != null) {
                                    if (h == null) {
                                        C();
                                    }
                                    if (setD.isEmpty() || !h.containsAll(setD)) {
                                    }
                                }
                                Set setF = rxlVar.f();
                                if (setF == null) {
                                    Set setE = rxlVar.e();
                                    if (setE == null) {
                                        F(rxsVar2);
                                        break;
                                    }
                                    setE.isEmpty();
                                } else {
                                    setF.isEmpty();
                                }
                            }
                        }
                    }
                    if (zR3) {
                        Z();
                    }
                    N(rxxVar);
                }
            } else if (rxsVar instanceof rwr) {
                rwr rwrVar = (rwr) rxsVar;
                O(this.d, rwrVar);
                if (Q()) {
                    Matrix matrix4 = rwrVar.b;
                    if (matrix4 != null) {
                        this.a.concat(matrix4);
                    }
                    s(rwrVar);
                    boolean zR4 = R();
                    H(rwrVar, true);
                    if (zR4) {
                        Z();
                    }
                    N(rwrVar);
                }
            } else if (rxsVar instanceof rwt) {
                rwt rwtVar = (rwt) rxsVar;
                rwu rwuVar12 = rwtVar.d;
                if (rwuVar12 != null && !rwuVar12.f() && (rwuVar3 = rwtVar.e) != null && !rwuVar3.f() && (str = rwtVar.a) != null) {
                    rwg rwgVar2 = rwtVar.v;
                    if (rwgVar2 == null) {
                        rwgVar2 = rwg.b;
                    }
                    Bitmap bitmapDecodeByteArray = null;
                    if (str.startsWith("data:") && str.length() >= 14 && (iIndexOf = str.indexOf(44)) != -1 && iIndexOf >= 12 && ";base64".equals(str.substring(iIndexOf - 7, iIndexOf))) {
                        byte[] bArrDecode = Base64.decode(str.substring(iIndexOf + 1), 0);
                        bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
                    }
                    if (bitmapDecodeByteArray != null) {
                        O(this.d, rwtVar);
                        if (Q() && i()) {
                            Matrix matrix5 = rwtVar.f;
                            if (matrix5 != null) {
                                this.a.concat(matrix5);
                            }
                            rwu rwuVar13 = rwtVar.b;
                            float fC4 = rwuVar13 != null ? rwuVar13.c(this) : 0.0f;
                            rwu rwuVar14 = rwtVar.c;
                            float fD = rwuVar14 != null ? rwuVar14.d(this) : 0.0f;
                            float fC5 = rwtVar.d.c(this);
                            float fC6 = rwtVar.e.c(this);
                            ryr ryrVar2 = this.d;
                            ryrVar2.f = new rwh(fC4, fD, fC5, fC6);
                            if (!ryrVar2.a.o.booleanValue()) {
                                rwh rwhVar3 = this.d.f;
                                K(rwhVar3.a, rwhVar3.b, rwhVar3.c, rwhVar3.d);
                            }
                            rwtVar.n = new rwh(0.0f, 0.0f, bitmapDecodeByteArray.getWidth(), bitmapDecodeByteArray.getHeight());
                            Canvas canvas2 = this.a;
                            canvas2.concat(U(this.d.f, rwtVar.n, rwgVar2));
                            N(rwtVar);
                            s(rwtVar);
                            boolean zR5 = R();
                            P();
                            canvas2.drawBitmap(bitmapDecodeByteArray, 0.0f, 0.0f, new Paint());
                            if (zR5) {
                                Z();
                            }
                        }
                    }
                }
            } else if (rxsVar instanceof rxa) {
                rxa rxaVar = (rxa) rxsVar;
                if (rxaVar.a != null) {
                    O(this.d, rxaVar);
                    if (Q() && i()) {
                        ryr ryrVar3 = this.d;
                        if (ryrVar3.c || ryrVar3.b) {
                            Matrix matrix6 = rxaVar.e;
                            if (matrix6 != null) {
                                this.a.concat(matrix6);
                            }
                            Path path = new ryn(rxaVar.a).a;
                            if (rxaVar.n == null) {
                                rxaVar.n = T(path);
                            }
                            N(rxaVar);
                            u(rxaVar);
                            s(rxaVar);
                            boolean zR6 = R();
                            ryr ryrVar4 = this.d;
                            if (ryrVar4.b) {
                                int i = ryrVar4.a.D;
                                Path.FillType fillType = (i != 0 && i + (-1) == 1) ? Path.FillType.EVEN_ODD : Path.FillType.WINDING;
                                path.setFillType(fillType);
                                w(rxaVar, path);
                            }
                            if (this.d.c) {
                                x(path);
                            }
                            J(rxaVar);
                            if (zR6) {
                                Z();
                            }
                        }
                    }
                }
            } else if (rxsVar instanceof rxg) {
                rxg rxgVar = (rxg) rxsVar;
                rwu rwuVar15 = rxgVar.c;
                if (rwuVar15 != null && (rwuVar2 = rxgVar.d) != null && !rwuVar15.f() && !rwuVar2.f()) {
                    O(this.d, rxgVar);
                    if (Q() && i()) {
                        Matrix matrix7 = rxgVar.e;
                        if (matrix7 != null) {
                            this.a.concat(matrix7);
                        }
                        Path pathO = o(rxgVar);
                        N(rxgVar);
                        u(rxgVar);
                        s(rxgVar);
                        boolean zR7 = R();
                        if (this.d.b) {
                            w(rxgVar, pathO);
                        }
                        if (this.d.c) {
                            x(pathO);
                        }
                        if (zR7) {
                            Z();
                        }
                    }
                }
            } else if (rxsVar instanceof rwj) {
                rwj rwjVar = (rwj) rxsVar;
                rwu rwuVar16 = rwjVar.c;
                if (rwuVar16 != null && !rwuVar16.f()) {
                    O(this.d, rwjVar);
                    if (Q() && i()) {
                        Matrix matrix8 = rwjVar.e;
                        if (matrix8 != null) {
                            this.a.concat(matrix8);
                        }
                        Path pathL = l(rwjVar);
                        N(rwjVar);
                        u(rwjVar);
                        s(rwjVar);
                        boolean zR8 = R();
                        if (this.d.b) {
                            w(rwjVar, pathL);
                        }
                        if (this.d.c) {
                            x(pathL);
                        }
                        if (zR8) {
                            Z();
                        }
                    }
                }
            } else if (rxsVar instanceof rwo) {
                rwo rwoVar = (rwo) rxsVar;
                rwu rwuVar17 = rwoVar.c;
                if (rwuVar17 != null && (rwuVar = rwoVar.d) != null && !rwuVar17.f() && !rwuVar.f()) {
                    O(this.d, rwoVar);
                    if (Q() && i()) {
                        Matrix matrix9 = rwoVar.e;
                        if (matrix9 != null) {
                            this.a.concat(matrix9);
                        }
                        Path pathM = m(rwoVar);
                        N(rwoVar);
                        u(rwoVar);
                        s(rwoVar);
                        boolean zR9 = R();
                        if (this.d.b) {
                            w(rwoVar, pathM);
                        }
                        if (this.d.c) {
                            x(pathM);
                        }
                        if (zR9) {
                            Z();
                        }
                    }
                }
            } else if (rxsVar instanceof rwv) {
                rwv rwvVar = (rwv) rxsVar;
                O(this.d, rwvVar);
                if (Q() && i() && this.d.c) {
                    Matrix matrix10 = rwvVar.e;
                    if (matrix10 != null) {
                        this.a.concat(matrix10);
                    }
                    rwu rwuVar18 = rwvVar.a;
                    float fC7 = rwuVar18 == null ? 0.0f : rwuVar18.c(this);
                    rwu rwuVar19 = rwvVar.b;
                    float fD2 = rwuVar19 == null ? 0.0f : rwuVar19.d(this);
                    rwu rwuVar20 = rwvVar.c;
                    float fC8 = rwuVar20 == null ? 0.0f : rwuVar20.c(this);
                    rwu rwuVar21 = rwvVar.d;
                    fD = rwuVar21 != null ? rwuVar21.d(this) : 0.0f;
                    if (rwvVar.n == null) {
                        rwvVar.n = new rwh(Math.min(fC7, fD2), Math.min(fD2, fD), Math.abs(fC8 - fC7), Math.abs(fD - fD2));
                    }
                    Path path2 = new Path();
                    path2.moveTo(fC7, fD2);
                    path2.lineTo(fC8, fD);
                    N(rwvVar);
                    u(rwvVar);
                    s(rwvVar);
                    boolean zR10 = R();
                    x(path2);
                    J(rwvVar);
                    if (zR10) {
                        Z();
                    }
                }
            } else if (rxsVar instanceof rxf) {
                rxf rxfVar = (rxf) rxsVar;
                O(this.d, rxfVar);
                if (Q() && i()) {
                    ryr ryrVar5 = this.d;
                    if (ryrVar5.c || ryrVar5.b) {
                        Matrix matrix11 = rxfVar.e;
                        if (matrix11 != null) {
                            this.a.concat(matrix11);
                        }
                        if (rxfVar.a.length >= 2) {
                            Path pathN = n(rxfVar);
                            N(rxfVar);
                            u(rxfVar);
                            s(rxfVar);
                            boolean zR11 = R();
                            if (this.d.b) {
                                w(rxfVar, pathN);
                            }
                            if (this.d.c) {
                                x(pathN);
                            }
                            J(rxfVar);
                            if (zR11) {
                                Z();
                            }
                        }
                    }
                }
            } else if (rxsVar instanceof rxe) {
                rxe rxeVar = (rxe) rxsVar;
                O(this.d, rxeVar);
                if (Q() && i()) {
                    ryr ryrVar6 = this.d;
                    if (ryrVar6.c || ryrVar6.b) {
                        Matrix matrix12 = rxeVar.e;
                        if (matrix12 != null) {
                            this.a.concat(matrix12);
                        }
                        if (rxeVar.a.length >= 2) {
                            Path pathN2 = n(rxeVar);
                            N(rxeVar);
                            u(rxeVar);
                            s(rxeVar);
                            boolean zR12 = R();
                            if (this.d.b) {
                                w(rxeVar, pathN2);
                            }
                            if (this.d.c) {
                                x(pathN2);
                            }
                            J(rxeVar);
                            if (zR12) {
                                Z();
                            }
                        }
                    }
                }
            } else if (rxsVar instanceof ryb) {
                ryb rybVar = (ryb) rxsVar;
                O(this.d, rybVar);
                if (Q()) {
                    Matrix matrix13 = rybVar.a;
                    if (matrix13 != null) {
                        this.a.concat(matrix13);
                    }
                    List list = rybVar.b;
                    float fC9 = (list == null || list.size() == 0) ? 0.0f : ((rwu) rybVar.b.get(0)).c(this);
                    List list2 = rybVar.c;
                    float fD3 = (list2 == null || list2.size() == 0) ? 0.0f : ((rwu) rybVar.c.get(0)).d(this);
                    List list3 = rybVar.d;
                    float fC10 = (list3 == null || list3.size() == 0) ? 0.0f : ((rwu) rybVar.d.get(0)).c(this);
                    List list4 = rybVar.e;
                    if (list4 != null && list4.size() != 0) {
                        fD = ((rwu) rybVar.e.get(0)).d(this);
                    }
                    int iS = S();
                    if (iS != 1) {
                        float fJ = j(rybVar);
                        if (iS == 2) {
                            fJ /= 2.0f;
                        }
                        fC9 -= fJ;
                    }
                    if (rybVar.n == null) {
                        rys rysVar = new rys(this, fC9, fD3);
                        y(rybVar, rysVar);
                        RectF rectF = rysVar.c;
                        rybVar.n = new rwh(rectF.left, rectF.top, rectF.width(), rectF.height());
                    }
                    N(rybVar);
                    u(rybVar);
                    s(rybVar);
                    boolean zR13 = R();
                    y(rybVar, new ryp(this, fC9 + fC10, fD3 + fD));
                    if (zR13) {
                        Z();
                    }
                }
            }
        }
        L();
    }

    private final void G(rxk rxkVar, rwu rwuVar, rwu rwuVar2) {
        f(rxkVar, rwuVar, rwuVar2, rxkVar.w, rxkVar.v);
    }

    private final void H(rxo rxoVar, boolean z) {
        if (z) {
            E(rxoVar);
        }
        Iterator it = rxoVar.n().iterator();
        while (it.hasNext()) {
            F((rxs) it.next());
        }
        if (z) {
            D();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00f6 A[PHI: r1
      0x00f6: PHI (r1v1 float) = (r1v0 float), (r1v2 float) binds: [B:61:0x00eb, B:65:0x00f5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0102  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void I(defpackage.rww r13, defpackage.rym r14) {
        /*
            Method dump skipped, instructions count: 328
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ryv.I(rww, rym):void");
    }

    private final void J(rwq rwqVar) {
        rww rwwVar;
        rww rwwVar2;
        rww rwwVar3;
        List arrayList;
        int size;
        rxj rxjVar = this.d.a;
        String str = rxjVar.q;
        if (str == null && rxjVar.r == null && rxjVar.s == null) {
            return;
        }
        if (str == null) {
            rwwVar = null;
        } else {
            rxs rxsVarA = rwqVar.t.a(str);
            if (rxsVarA != null) {
                rwwVar = (rww) rxsVarA;
            } else {
                e("Marker reference '%s' not found", this.d.a.q);
                rwwVar = null;
            }
        }
        String str2 = this.d.a.r;
        if (str2 == null) {
            rwwVar2 = null;
        } else {
            rxs rxsVarA2 = rwqVar.t.a(str2);
            if (rxsVarA2 != null) {
                rwwVar2 = (rww) rxsVarA2;
            } else {
                e("Marker reference '%s' not found", this.d.a.r);
                rwwVar2 = null;
            }
        }
        String str3 = this.d.a.s;
        if (str3 == null) {
            rwwVar3 = null;
        } else {
            rxs rxsVarA3 = rwqVar.t.a(str3);
            if (rxsVarA3 != null) {
                rwwVar3 = (rww) rxsVarA3;
            } else {
                e("Marker reference '%s' not found", this.d.a.s);
                rwwVar3 = null;
            }
        }
        if (rwqVar instanceof rxa) {
            arrayList = new ryl(((rxa) rwqVar).a).a;
        } else {
            int i = 2;
            if (rwqVar instanceof rwv) {
                rwv rwvVar = (rwv) rwqVar;
                rwu rwuVar = rwvVar.a;
                float fC = rwuVar != null ? rwuVar.c(this) : 0.0f;
                rwu rwuVar2 = rwvVar.b;
                float fD = rwuVar2 != null ? rwuVar2.d(this) : 0.0f;
                rwu rwuVar3 = rwvVar.c;
                float fC2 = rwuVar3 != null ? rwuVar3.c(this) : 0.0f;
                rwu rwuVar4 = rwvVar.d;
                fD = rwuVar4 != null ? rwuVar4.d(this) : 0.0f;
                arrayList = new ArrayList(2);
                float f = fC2 - fC;
                float f2 = fD - fD;
                arrayList.add(new rym(fC, fD, f, f2));
                arrayList.add(new rym(fC2, fD, f, f2));
            } else {
                rxe rxeVar = (rxe) rwqVar;
                int length = rxeVar.a.length;
                if (length < 2) {
                    arrayList = null;
                } else {
                    ArrayList arrayList2 = new ArrayList();
                    float[] fArr = rxeVar.a;
                    rym rymVar = new rym(fArr[0], fArr[1], 0.0f, 0.0f);
                    float f3 = 0.0f;
                    while (i < length) {
                        float[] fArr2 = rxeVar.a;
                        float f4 = fArr2[i];
                        float f5 = fArr2[i + 1];
                        rymVar.b(f4, f5);
                        arrayList2.add(rymVar);
                        rym rymVar2 = new rym(f4, f5, f4 - rymVar.a, f5 - rymVar.b);
                        i += 2;
                        f3 = f5;
                        fD = f4;
                        rymVar = rymVar2;
                    }
                    if (rxeVar instanceof rxf) {
                        float[] fArr3 = rxeVar.a;
                        float f6 = fArr3[0];
                        if (fD != f6) {
                            float f7 = fArr3[1];
                            if (f3 != f7) {
                                rymVar.b(f6, f7);
                                arrayList2.add(rymVar);
                                rym rymVar3 = new rym(f6, f7, f6 - rymVar.a, f7 - rymVar.b);
                                rymVar3.a((rym) arrayList2.get(0));
                                arrayList2.add(rymVar3);
                                arrayList2.set(0, rymVar3);
                            }
                        }
                    } else {
                        arrayList2.add(rymVar);
                    }
                    arrayList = arrayList2;
                }
            }
        }
        if (arrayList == null || (size = arrayList.size()) == 0) {
            return;
        }
        rxj rxjVar2 = this.d.a;
        rxjVar2.s = null;
        rxjVar2.r = null;
        rxjVar2.q = null;
        if (rwwVar != null) {
            I(rwwVar, (rym) arrayList.get(0));
        }
        if (rwwVar2 != null) {
            int i2 = size - 1;
            for (int i3 = 1; i3 < i2; i3++) {
                I(rwwVar2, (rym) arrayList.get(i3));
            }
        }
        if (rwwVar3 != null) {
            I(rwwVar3, (rym) arrayList.get(size - 1));
        }
    }

    private final void K(float f, float f2, float f3, float f4) {
        rwi rwiVar = this.d.a.p;
        float fD = f4 + f2;
        float fC = f3 + f;
        if (rwiVar != null) {
            f += rwiVar.d.c(this);
            f2 += this.d.a.p.a.d(this);
            fC -= this.d.a.p.b.c(this);
            fD -= this.d.a.p.c.d(this);
        }
        this.a.clipRect(f, f2, fC, fD);
    }

    private final void L() {
        this.a.restore();
        this.d = (ryr) this.e.pop();
    }

    private final void M() {
        this.a.save();
        this.e.push(this.d);
        this.d = (ryr) this.d.clone();
    }

    private final void N(rxp rxpVar) {
        if (rxpVar.u == null || rxpVar.n == null) {
            return;
        }
        Matrix matrix = new Matrix();
        if (((Matrix) this.g.peek()).invert(matrix)) {
            rwh rwhVar = rxpVar.n;
            float f = rwhVar.a;
            float f2 = rwhVar.b;
            float fA = rwhVar.a();
            rwh rwhVar2 = rxpVar.n;
            float f3 = rwhVar2.b;
            float fA2 = rwhVar2.a();
            float fB = rxpVar.n.b();
            rwh rwhVar3 = rxpVar.n;
            float[] fArr = {f, f2, fA, f3, fA2, fB, rwhVar3.a, rwhVar3.b()};
            matrix.preConcat(this.a.getMatrix());
            matrix.mapPoints(fArr);
            float f4 = fArr[0];
            float f5 = fArr[1];
            RectF rectF = new RectF(f4, f5, f4, f5);
            for (int i = 2; i <= 6; i += 2) {
                if (fArr[i] < rectF.left) {
                    rectF.left = fArr[i];
                }
                if (fArr[i] > rectF.right) {
                    rectF.right = fArr[i];
                }
                int i2 = i + 1;
                if (fArr[i2] < rectF.top) {
                    rectF.top = fArr[i2];
                }
                if (fArr[i2] > rectF.bottom) {
                    rectF.bottom = fArr[i2];
                }
            }
            rxp rxpVar2 = (rxp) this.f.peek();
            rwh rwhVar4 = rxpVar2.n;
            if (rwhVar4 == null) {
                rxpVar2.n = rwh.c(rectF.left, rectF.top, rectF.right, rectF.bottom);
                return;
            }
            rwh rwhVarC = rwh.c(rectF.left, rectF.top, rectF.right, rectF.bottom);
            float f6 = rwhVarC.a;
            float f7 = rwhVar4.a;
            if (f6 < f7) {
                rwhVar4.a = f6;
            } else {
                f6 = f7;
            }
            float f8 = rwhVarC.b;
            float f9 = rwhVar4.b;
            if (f8 < f9) {
                rwhVar4.b = f8;
            } else {
                f8 = f9;
            }
            if (rwhVarC.a() > rwhVar4.a()) {
                rwhVar4.c = rwhVarC.a() - f6;
            }
            if (rwhVarC.b() > rwhVar4.b()) {
                rwhVar4.d = rwhVarC.b() - f8;
            }
        }
    }

    private final void O(ryr ryrVar, rxq rxqVar) {
        rxo rxoVar = rxqVar.u;
        rxj rxjVar = ryrVar.a;
        rxjVar.t = Boolean.TRUE;
        rxjVar.o = rxoVar == null ? Boolean.TRUE : Boolean.FALSE;
        rxjVar.p = null;
        rxjVar.x = null;
        Float fValueOf = Float.valueOf(1.0f);
        rxjVar.j = fValueOf;
        rxjVar.v = rwl.a;
        rxjVar.w = fValueOf;
        rxjVar.y = null;
        rxjVar.z = null;
        rxjVar.A = fValueOf;
        rxjVar.B = null;
        rxjVar.C = fValueOf;
        rxjVar.L = 1;
        rxj rxjVar2 = rxqVar.q;
        if (rxjVar2 != null) {
            g(ryrVar, rxjVar2);
        }
        List list = this.c.c.a;
        if (list != null && !list.isEmpty()) {
            for (rvy rvyVar : this.c.c.a) {
                rwa rwaVar = rvyVar.a;
                ArrayList arrayList = new ArrayList();
                for (Object obj = rxqVar.u; obj != null; obj = ((rxs) obj).u) {
                    arrayList.add(0, obj);
                }
                int size = arrayList.size() - 1;
                if (rwaVar.a() == 1 ? rwc.e(rwaVar.b(0), arrayList, size, rxqVar) : rwc.d(rwaVar, rwaVar.a() - 1, arrayList, size, rxqVar)) {
                    g(ryrVar, rvyVar.b);
                }
            }
        }
        rxj rxjVar3 = rxqVar.r;
        if (rxjVar3 != null) {
            g(ryrVar, rxjVar3);
        }
    }

    private final void P() {
        int iW;
        rxj rxjVar = this.d.a;
        rxt rxtVar = rxjVar.B;
        if (rxtVar instanceof rwl) {
            iW = ((rwl) rxtVar).b;
        } else if (!(rxtVar instanceof rwm)) {
            return;
        } else {
            iW = rxjVar.k.b;
        }
        Float f = rxjVar.C;
        if (f != null) {
            iW |= W(f.floatValue()) << 24;
        }
        this.a.drawColor(iW);
    }

    private final boolean Q() {
        Boolean bool = this.d.a.t;
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    private final boolean R() {
        ryr ryrVar = this.d;
        if (ryrVar.a.y != null) {
            boolean z = ryrVar.i;
            h("Masks are not supported when using getPicture()", new Object[0]);
        }
        if (this.d.a.j.floatValue() >= 1.0f) {
            ryr ryrVar2 = this.d;
            if (ryrVar2.a.y != null) {
                boolean z2 = ryrVar2.i;
            }
            return false;
        }
        this.a.saveLayerAlpha(null, W(this.d.a.j.floatValue()), 31);
        this.e.push(this.d);
        ryr ryrVar3 = (ryr) this.d.clone();
        this.d = ryrVar3;
        if (ryrVar3.a.y == null) {
            return true;
        }
        boolean z3 = ryrVar3.i;
        return true;
    }

    private final int S() {
        int i;
        rxj rxjVar = this.d.a;
        return (rxjVar.I == 1 || (i = rxjVar.J) == 2) ? rxjVar.J : i == 1 ? 3 : 1;
    }

    private static final rwh T(Path path) {
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        return new rwh(rectF.left, rectF.top, rectF.width(), rectF.height());
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x004d, code lost:
    
        if (r7 != 9) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final android.graphics.Matrix U(defpackage.rwh r9, defpackage.rwh r10, defpackage.rwg r11) {
        /*
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r0.<init>()
            rwf r1 = r11.c
            if (r1 != 0) goto La
            return r0
        La:
            float r2 = r9.c
            float r3 = r10.c
            float r2 = r2 / r3
            float r3 = r9.d
            float r4 = r10.d
            float r3 = r3 / r4
            float r4 = r10.a
            float r4 = -r4
            float r5 = r10.b
            float r5 = -r5
            rwg r6 = defpackage.rwg.a
            boolean r6 = r11.equals(r6)
            if (r6 != 0) goto L78
            int r11 = r11.d
            r6 = 2
            if (r11 != r6) goto L2c
            float r11 = java.lang.Math.max(r2, r3)
            goto L30
        L2c:
            float r11 = java.lang.Math.min(r2, r3)
        L30:
            float r2 = r9.c
            float r2 = r2 / r11
            float r3 = r9.d
            float r3 = r3 / r11
            int r7 = r1.ordinal()
            r8 = 1073741824(0x40000000, float:2.0)
            if (r7 == r6) goto L54
            r6 = 3
            if (r7 == r6) goto L50
            r6 = 5
            if (r7 == r6) goto L54
            r6 = 6
            if (r7 == r6) goto L50
            r6 = 8
            if (r7 == r6) goto L54
            r6 = 9
            if (r7 == r6) goto L50
            goto L59
        L50:
            float r6 = r10.c
            float r6 = r6 - r2
            goto L58
        L54:
            float r6 = r10.c
            float r6 = r6 - r2
            float r6 = r6 / r8
        L58:
            float r4 = r4 - r6
        L59:
            int r1 = r1.ordinal()
            switch(r1) {
                case 4: goto L65;
                case 5: goto L65;
                case 6: goto L65;
                case 7: goto L61;
                case 8: goto L61;
                case 9: goto L61;
                default: goto L60;
            }
        L60:
            goto L6a
        L61:
            float r10 = r10.d
            float r10 = r10 - r3
            goto L69
        L65:
            float r10 = r10.d
            float r10 = r10 - r3
            float r10 = r10 / r8
        L69:
            float r5 = r5 - r10
        L6a:
            float r10 = r9.a
            float r9 = r9.b
            r0.preTranslate(r10, r9)
            r0.preScale(r11, r11)
            r0.preTranslate(r4, r5)
            return r0
        L78:
            float r10 = r9.a
            float r9 = r9.b
            r0.preTranslate(r10, r9)
            r0.preScale(r2, r3)
            r0.preTranslate(r4, r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ryv.U(rwh, rwh, rwg):android.graphics.Matrix");
    }

    private static final Typeface V(String str, Integer num, int i) {
        int i2 = 2;
        if (num.intValue() > 500) {
            i2 = i == 2 ? 3 : 1;
        } else if (i != 2) {
            i2 = 0;
        }
        if (str.equals("serif")) {
            return Typeface.create(Typeface.SERIF, i2);
        }
        if (str.equals("sans-serif")) {
            return Typeface.create(Typeface.SANS_SERIF, i2);
        }
        if (str.equals("monospace")) {
            return Typeface.create(Typeface.MONOSPACE, i2);
        }
        if (str.equals("cursive")) {
            return Typeface.create(Typeface.SANS_SERIF, i2);
        }
        if (str.equals("fantasy")) {
            return Typeface.create(Typeface.SANS_SERIF, i2);
        }
        return null;
    }

    private static final int W(float f) {
        int i = (int) (f * 256.0f);
        if (i < 0) {
            return 0;
        }
        if (i > 255) {
            return 255;
        }
        return i;
    }

    private final void X(rxs rxsVar, ryr ryrVar) {
        ArrayList arrayList = new ArrayList();
        while (true) {
            if (rxsVar instanceof rxq) {
                arrayList.add(0, (rxq) rxsVar);
            }
            Object obj = rxsVar.u;
            if (obj == null) {
                break;
            } else {
                rxsVar = (rxs) obj;
            }
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            O(ryrVar, (rxq) arrayList.get(i));
        }
        ryrVar.g = this.c.a.w;
        if (ryrVar.g == null) {
            ryrVar.g = this.b;
        }
        ryrVar.f = this.b;
        boolean z = this.d.i;
        ryrVar.i = false;
    }

    private static final boolean Y(rxj rxjVar, long j) {
        return (j & rxjVar.a) != 0;
    }

    private final void Z() {
        ryr ryrVar = this.d;
        if (ryrVar.a.y != null) {
            boolean z = ryrVar.i;
        }
        L();
    }

    private static final void aa(ryr ryrVar, boolean z, rxt rxtVar) {
        int i;
        rxj rxjVar = ryrVar.a;
        boolean z2 = rxtVar instanceof rwl;
        float fFloatValue = (z ? rxjVar.c : rxjVar.e).floatValue();
        if (z2) {
            i = ((rwl) rxtVar).b;
        } else if (!(rxtVar instanceof rwm)) {
            return;
        } else {
            i = ryrVar.a.k.b;
        }
        int iW = i | (W(fFloatValue) << 24);
        if (z) {
            ryrVar.d.setColor(iW);
        } else {
            ryrVar.e.setColor(iW);
        }
    }

    public static void c(float f, float f2, float f3, float f4, float f5, boolean z, boolean z2, float f6, float f7, rxc rxcVar) {
        float f8;
        float f9;
        if (f == f6 && f2 == f7) {
            return;
        }
        if (f3 == 0.0f || f4 == 0.0f) {
            rxcVar.e(f6, f7);
            return;
        }
        float fAbs = Math.abs(f3);
        float fAbs2 = Math.abs(f4);
        double radians = (float) Math.toRadians(f5 % 360.0d);
        float fCos = (float) Math.cos(radians);
        float fSin = (float) Math.sin(radians);
        float f10 = fAbs * fAbs;
        float f11 = fAbs2 * fAbs2;
        float f12 = (f - f6) / 2.0f;
        float f13 = (f2 - f7) / 2.0f;
        float f14 = ((-fSin) * f12) + (fCos * f13);
        float f15 = f14 * f14;
        float f16 = (f12 * fCos) + (f13 * fSin);
        float f17 = f16 * f16;
        float f18 = (f17 / f10) + (f15 / f11);
        if (f18 > 1.0f) {
            double d = f18;
            f8 = 2.0f;
            f9 = f15;
            fAbs *= (float) Math.sqrt(d);
            fAbs2 *= (float) Math.sqrt(d);
            f11 = fAbs2 * fAbs2;
            f10 = fAbs * fAbs;
        } else {
            f8 = 2.0f;
            f9 = f15;
        }
        float f19 = z == z2 ? -1.0f : 1.0f;
        float f20 = f10 * f9;
        float f21 = f17 * f11;
        float f22 = (((f10 * f11) - f20) - f21) / (f20 + f21);
        if (f22 < 0.0f) {
            f22 = 0.0f;
        }
        float f23 = (f + f6) / f8;
        float f24 = (f2 + f7) / f8;
        float fSqrt = (float) (f19 * Math.sqrt(f22));
        float f25 = ((fAbs * f14) / fAbs2) * fSqrt;
        float f26 = fCos * f25;
        float f27 = fSqrt * (-((fAbs2 * f16) / fAbs));
        float f28 = fSin * f27;
        float f29 = fSin * f25;
        float f30 = fCos * f27;
        float f31 = f16 - f25;
        float f32 = f14 - f27;
        float f33 = -f16;
        float f34 = -f14;
        float f35 = f31 / fAbs;
        float f36 = f32 / fAbs2;
        float f37 = (f35 * f35) + (f36 * f36);
        float degrees = (float) Math.toDegrees((f36 < 0.0f ? -1.0f : 1.0f) * Math.acos(f35 / ((float) Math.sqrt(f37))));
        float f38 = (f33 - f25) / fAbs;
        float f39 = (f34 - f27) / fAbs2;
        float fSqrt2 = (float) Math.sqrt(f37 * ((f38 * f38) + (f39 * f39)));
        float degrees2 = (float) Math.toDegrees(((f35 * f39) - (f36 * f38) < 0.0f ? -1.0f : 1.0f) * Math.acos(((f35 * f38) + (f36 * f39)) / fSqrt2));
        if (z2) {
            if (degrees2 < 0.0f) {
                degrees2 += 360.0f;
            }
        } else if (degrees2 > 0.0f) {
            degrees2 -= 360.0f;
        }
        double d2 = degrees2 % 360.0f;
        int iCeil = (int) Math.ceil(Math.abs(d2) / 90.0d);
        double radians2 = Math.toRadians(degrees % 360.0f);
        double radians3 = (float) (Math.toRadians(d2) / iCeil);
        double d3 = radians3 / 2.0d;
        double dSin = Math.sin(d3) * 1.3333333333333333d;
        double dCos = Math.cos(d3) + 1.0d;
        int i = iCeil * 6;
        float[] fArr = new float[i];
        int i2 = 0;
        int i3 = 0;
        while (i2 < iCeil) {
            double d4 = dSin / dCos;
            int i4 = iCeil;
            int i5 = i2;
            double d5 = (i2 * r4) + radians2;
            double dCos2 = Math.cos(d5);
            double dSin2 = Math.sin(d5);
            fArr[i3] = (float) (dCos2 - (d4 * dSin2));
            fArr[i3 + 1] = (float) (dSin2 + (dCos2 * d4));
            double d6 = d5 + radians3;
            double dCos3 = Math.cos(d6);
            double dSin3 = Math.sin(d6);
            fArr[i3 + 2] = (float) (dCos3 + (d4 * dSin3));
            fArr[i3 + 3] = (float) (dSin3 - (d4 * dCos3));
            int i6 = i3 + 5;
            fArr[i3 + 4] = (float) dCos3;
            i3 += 6;
            fArr[i6] = (float) dSin3;
            i2 = i5 + 1;
            iCeil = i4;
            dCos = dCos;
            f28 = f28;
            f23 = f23;
            radians2 = radians2;
        }
        Matrix matrix = new Matrix();
        matrix.postScale(fAbs, fAbs2);
        matrix.postRotate(f5);
        matrix.postTranslate(f23 + (f26 - f28), f24 + f29 + f30);
        matrix.mapPoints(fArr);
        if (i >= 2) {
            fArr[i - 2] = f6;
            fArr[i - 1] = f7;
        }
        for (int i7 = 0; i7 < i; i7 += 6) {
            rxcVar.c(fArr[i7], fArr[i7 + 1], fArr[i7 + 2], fArr[i7 + 3], fArr[i7 + 4], fArr[i7 + 5]);
        }
    }

    public static void e(String str, Object... objArr) {
        Log.e("SVGAndroidRenderer", String.format(str, objArr));
    }

    public static void h(String str, Object... objArr) {
        Log.w("SVGAndroidRenderer", String.format(str, objArr));
    }

    private final float j(ryd rydVar) {
        ryu ryuVar = new ryu(this);
        y(rydVar, ryuVar);
        return ryuVar.a;
    }

    private final Path.FillType k() {
        int i = this.d.a.K;
        return (i != 0 && i + (-1) == 1) ? Path.FillType.EVEN_ODD : Path.FillType.WINDING;
    }

    private final Path l(rwj rwjVar) {
        rwu rwuVar = rwjVar.a;
        float fC = rwuVar != null ? rwuVar.c(this) : 0.0f;
        rwu rwuVar2 = rwjVar.b;
        float fD = rwuVar2 != null ? rwuVar2.d(this) : 0.0f;
        float fA = rwjVar.c.a(this);
        float f = fC - fA;
        float f2 = fD - fA;
        float f3 = fC + fA;
        float f4 = fD + fA;
        if (rwjVar.n == null) {
            float f5 = fA + fA;
            rwjVar.n = new rwh(f, f2, f5, f5);
        }
        float f6 = fA * 0.5522848f;
        Path path = new Path();
        path.moveTo(fC, f2);
        float f7 = fC + f6;
        float f8 = fD - f6;
        path.cubicTo(f7, f2, f3, f8, f3, fD);
        float f9 = fD + f6;
        path.cubicTo(f3, f9, f7, f4, fC, f4);
        float f10 = fC - f6;
        path.cubicTo(f10, f4, f, f9, f, fD);
        path.cubicTo(f, f8, f10, f2, fC, f2);
        path.close();
        return path;
    }

    private final Path m(rwo rwoVar) {
        rwu rwuVar = rwoVar.a;
        float fC = rwuVar != null ? rwuVar.c(this) : 0.0f;
        rwu rwuVar2 = rwoVar.b;
        float fD = rwuVar2 != null ? rwuVar2.d(this) : 0.0f;
        float fC2 = rwoVar.c.c(this);
        float fD2 = rwoVar.d.d(this);
        float f = fC - fC2;
        float f2 = fD - fD2;
        float f3 = fC + fC2;
        float f4 = fD + fD2;
        if (rwoVar.n == null) {
            rwoVar.n = new rwh(f, f2, fC2 + fC2, fD2 + fD2);
        }
        float f5 = fC2 * 0.5522848f;
        float f6 = fD2 * 0.5522848f;
        Path path = new Path();
        path.moveTo(fC, f2);
        float f7 = fC + f5;
        float f8 = fD - f6;
        path.cubicTo(f7, f2, f3, f8, f3, fD);
        float f9 = fD + f6;
        path.cubicTo(f3, f9, f7, f4, fC, f4);
        float f10 = fC - f5;
        path.cubicTo(f10, f4, f, f9, f, fD);
        path.cubicTo(f, f8, f10, f2, fC, f2);
        path.close();
        return path;
    }

    private final Path n(rxe rxeVar) {
        Path path = new Path();
        float[] fArr = rxeVar.a;
        path.moveTo(fArr[0], fArr[1]);
        int i = 2;
        while (true) {
            float[] fArr2 = rxeVar.a;
            if (i >= fArr2.length) {
                break;
            }
            path.lineTo(fArr2[i], fArr2[i + 1]);
            i += 2;
        }
        if (rxeVar instanceof rxf) {
            path.close();
        }
        if (rxeVar.n == null) {
            rxeVar.n = T(path);
        }
        path.setFillType(k());
        return path;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00cc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final android.graphics.Path o(defpackage.rxg r20) {
        /*
            Method dump skipped, instructions count: 224
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ryv.o(rxg):android.graphics.Path");
    }

    private final ryr p(rxs rxsVar) {
        ryr ryrVar = new ryr();
        g(ryrVar, rxj.a());
        X(rxsVar, ryrVar);
        return ryrVar;
    }

    private final String q(String str, boolean z, boolean z2) {
        if (this.d.h) {
            return str.replaceAll("[\\n\\t]", " ");
        }
        String strReplaceAll = str.replaceAll("\\n", "").replaceAll("\\t", " ");
        if (z) {
            strReplaceAll = strReplaceAll.replaceAll("^\\s+", "");
        }
        if (z2) {
            strReplaceAll = strReplaceAll.replaceAll("\\s+$", "");
        }
        return strReplaceAll.replaceAll("\\s{2,}", " ");
    }

    private final void r(rxs rxsVar, boolean z, Path path, Matrix matrix) {
        Path pathN;
        if (Q()) {
            Canvas canvas = this.a;
            canvas.save();
            this.e.push(this.d);
            ryr ryrVar = (ryr) this.d.clone();
            this.d = ryrVar;
            if (rxsVar instanceof ryi) {
                if (z) {
                    ryi ryiVar = (ryi) rxsVar;
                    O(ryrVar, ryiVar);
                    if (Q() && i()) {
                        Matrix matrix2 = ryiVar.b;
                        if (matrix2 != null) {
                            matrix.preConcat(matrix2);
                        }
                        rxs rxsVarA = ryiVar.t.a(ryiVar.a);
                        if (rxsVarA == null) {
                            e("Use reference '%s' not found", ryiVar.a);
                        } else {
                            s(ryiVar);
                            r(rxsVarA, false, path, matrix);
                        }
                    }
                } else {
                    e("<use> elements inside a <clipPath> cannot reference another <use>", new Object[0]);
                }
            } else if (rxsVar instanceof rxa) {
                rxa rxaVar = (rxa) rxsVar;
                O(ryrVar, rxaVar);
                if (Q() && i()) {
                    Matrix matrix3 = rxaVar.e;
                    if (matrix3 != null) {
                        matrix.preConcat(matrix3);
                    }
                    Path path2 = new ryn(rxaVar.a).a;
                    if (rxaVar.n == null) {
                        rxaVar.n = T(path2);
                    }
                    s(rxaVar);
                    path.setFillType(k());
                    path.addPath(path2, matrix);
                }
            } else if (rxsVar instanceof ryb) {
                ryb rybVar = (ryb) rxsVar;
                O(ryrVar, rybVar);
                if (Q()) {
                    Matrix matrix4 = rybVar.a;
                    if (matrix4 != null) {
                        matrix.preConcat(matrix4);
                    }
                    List list = rybVar.b;
                    float fD = 0.0f;
                    float fC = (list == null || list.size() == 0) ? 0.0f : ((rwu) rybVar.b.get(0)).c(this);
                    List list2 = rybVar.c;
                    float fD2 = (list2 == null || list2.size() == 0) ? 0.0f : ((rwu) rybVar.c.get(0)).d(this);
                    List list3 = rybVar.d;
                    float fC2 = (list3 == null || list3.size() == 0) ? 0.0f : ((rwu) rybVar.d.get(0)).c(this);
                    List list4 = rybVar.e;
                    if (list4 != null && list4.size() != 0) {
                        fD = ((rwu) rybVar.e.get(0)).d(this);
                    }
                    if (this.d.a.J != 1) {
                        float fJ = j(rybVar);
                        if (this.d.a.J == 2) {
                            fJ /= 2.0f;
                        }
                        fC -= fJ;
                    }
                    if (rybVar.n == null) {
                        rys rysVar = new rys(this, fC, fD2);
                        y(rybVar, rysVar);
                        RectF rectF = rysVar.c;
                        rybVar.n = new rwh(rectF.left, rectF.top, rectF.width(), rectF.height());
                    }
                    s(rybVar);
                    Path path3 = new Path();
                    y(rybVar, new ryq(this, fC + fC2, fD2 + fD, path3));
                    path.setFillType(k());
                    path.addPath(path3, matrix);
                }
            } else if (rxsVar instanceof rwq) {
                rwq rwqVar = (rwq) rxsVar;
                O(ryrVar, rwqVar);
                if (Q() && i()) {
                    Matrix matrix5 = rwqVar.e;
                    if (matrix5 != null) {
                        matrix.preConcat(matrix5);
                    }
                    if (rwqVar instanceof rxg) {
                        pathN = o((rxg) rwqVar);
                    } else if (rwqVar instanceof rwj) {
                        pathN = l((rwj) rwqVar);
                    } else if (rwqVar instanceof rwo) {
                        pathN = m((rwo) rwqVar);
                    } else if (rwqVar instanceof rxe) {
                        pathN = n((rxe) rwqVar);
                    }
                    s(rwqVar);
                    path.setFillType(pathN.getFillType());
                    path.addPath(pathN, matrix);
                }
            } else {
                e("Invalid %s element found in clipPath definition", rxsVar.getClass().getSimpleName());
            }
            canvas.restore();
            this.d = (ryr) this.e.pop();
        }
    }

    private final void s(rxp rxpVar) {
        t(rxpVar, rxpVar.n);
    }

    private final void t(rxp rxpVar, rwh rwhVar) {
        String str = this.d.a.x;
        if (str == null) {
            return;
        }
        rxs rxsVarA = rxpVar.t.a(str);
        if (rxsVarA == null) {
            e("ClipPath reference '%s' not found", this.d.a.x);
            return;
        }
        rwk rwkVar = (rwk) rxsVarA;
        if (rwkVar.i.isEmpty()) {
            this.a.clipRect(0, 0, 0, 0);
            return;
        }
        Boolean bool = rwkVar.a;
        boolean z = bool == null || bool.booleanValue();
        if ((rxpVar instanceof rwr) && !z) {
            h("<clipPath clipPathUnits=\"objectBoundingBox\"> is not supported when referenced from container elements (like %s)", rxpVar.getClass().getSimpleName());
            return;
        }
        this.e.push(this.d);
        this.d = (ryr) this.d.clone();
        Matrix matrix = new Matrix();
        if (!z) {
            Matrix matrix2 = new Matrix();
            matrix2.preTranslate(rwhVar.a, rwhVar.b);
            matrix2.preScale(rwhVar.c, rwhVar.d);
            this.a.concat(matrix2);
            Matrix matrix3 = new Matrix();
            if (matrix2.invert(matrix3)) {
                matrix.postConcat(matrix3);
            }
        }
        Matrix matrix4 = rwkVar.b;
        if (matrix4 != null) {
            this.a.concat(matrix4);
            Matrix matrix5 = new Matrix();
            if (matrix4.invert(matrix5)) {
                matrix.postConcat(matrix5);
            }
        }
        this.d = p(rwkVar);
        s(rwkVar);
        Path path = new Path();
        Iterator it = rwkVar.i.iterator();
        while (it.hasNext()) {
            r((rxs) it.next(), true, path, new Matrix());
        }
        Canvas canvas = this.a;
        canvas.clipPath(path);
        this.d = (ryr) this.e.pop();
        canvas.concat(matrix);
    }

    private final void u(rxp rxpVar) {
        rxt rxtVar = this.d.a.b;
        if (rxtVar instanceof rwz) {
            v(true, rxpVar.n, (rwz) rxtVar);
        }
        rxt rxtVar2 = this.d.a.d;
        if (rxtVar2 instanceof rwz) {
            v(false, rxpVar.n, (rwz) rxtVar2);
        }
    }

    private final void v(boolean z, rwh rwhVar, rwz rwzVar) {
        float f;
        Paint paint;
        boolean z2;
        float f2;
        float fB;
        float f3;
        float fB2;
        float f4;
        Paint paint2;
        float fB3;
        float fB4;
        float fB5;
        float fB6;
        float f5;
        float f6;
        float f7;
        float f8;
        boolean z3 = z;
        ryk rykVar = this.c;
        String str = rwzVar.a;
        rxs rxsVarA = rykVar.a(str);
        if (rxsVarA == null) {
            e("%s reference '%s' not found", true != z3 ? "Stroke" : "Fill", str);
            rxt rxtVar = rwzVar.b;
            if (rxtVar != null) {
                aa(this.d, z3, rxtVar);
                return;
            } else if (z3) {
                this.d.b = false;
                return;
            } else {
                this.d.c = false;
                return;
            }
        }
        if (rxsVarA instanceof rxr) {
            rxr rxrVar = (rxr) rxsVarA;
            String str2 = rxrVar.d;
            if (str2 != null) {
                A(rxrVar, str2);
            }
            Boolean bool = rxrVar.b;
            boolean z4 = bool != null && bool.booleanValue();
            if (z3) {
                paint2 = this.d.d;
                z3 = true;
            } else {
                paint2 = this.d.e;
                z3 = false;
            }
            boolean z5 = z3;
            if (z4) {
                rwh rwhVarB = b();
                rwu rwuVar = rxrVar.f;
                fB3 = rwuVar != null ? rwuVar.c(this) : 0.0f;
                f = 0.0f;
                rwu rwuVar2 = rxrVar.g;
                fB4 = rwuVar2 != null ? rwuVar2.d(this) : 0.0f;
                rwu rwuVar3 = rxrVar.h;
                fB5 = rwuVar3 != null ? rwuVar3.c(this) : rwhVarB.c;
                rwu rwuVar4 = rxrVar.i;
                if (rwuVar4 != null) {
                    fB6 = rwuVar4.d(this);
                    f5 = fB5;
                    f6 = fB3;
                    f7 = fB4;
                    f8 = fB6;
                }
                f5 = fB5;
                f6 = fB3;
                f7 = fB4;
                f8 = f;
            } else {
                f = 0.0f;
                rwu rwuVar5 = rxrVar.f;
                fB3 = rwuVar5 != null ? rwuVar5.b(this, 1.0f) : 0.0f;
                rwu rwuVar6 = rxrVar.g;
                fB4 = rwuVar6 != null ? rwuVar6.b(this, 1.0f) : 0.0f;
                rwu rwuVar7 = rxrVar.h;
                fB5 = rwuVar7 != null ? rwuVar7.b(this, 1.0f) : 1.0f;
                rwu rwuVar8 = rxrVar.i;
                if (rwuVar8 != null) {
                    fB6 = rwuVar8.b(this, 1.0f);
                    f5 = fB5;
                    f6 = fB3;
                    f7 = fB4;
                    f8 = fB6;
                }
                f5 = fB5;
                f6 = fB3;
                f7 = fB4;
                f8 = f;
            }
            M();
            this.d = p(rxrVar);
            Matrix matrix = new Matrix();
            if (!z4) {
                matrix.preTranslate(rwhVar.a, rwhVar.b);
                matrix.preScale(rwhVar.c, rwhVar.d);
            }
            Matrix matrix2 = rxrVar.c;
            if (matrix2 != null) {
                matrix.preConcat(matrix2);
            }
            int size = rxrVar.a.size();
            if (size == 0) {
                L();
                if (z5) {
                    this.d.b = false;
                } else {
                    this.d.c = false;
                }
            } else {
                int[] iArr = new int[size];
                float[] fArr = new float[size];
                Iterator it = rxrVar.a.iterator();
                int i = 0;
                float f9 = -1.0f;
                while (it.hasNext()) {
                    rxi rxiVar = (rxi) ((rxs) it.next());
                    Float f10 = rxiVar.a;
                    float fFloatValue = f10 != null ? f10.floatValue() : f;
                    if (i == 0 || fFloatValue >= f9) {
                        fArr[i] = fFloatValue;
                        f9 = fFloatValue;
                    } else {
                        fArr[i] = f9;
                    }
                    M();
                    O(this.d, rxiVar);
                    rxj rxjVar = this.d.a;
                    rwl rwlVar = (rwl) rxjVar.v;
                    if (rwlVar == null) {
                        rwlVar = rwl.a;
                    }
                    iArr[i] = (W(rxjVar.w.floatValue()) << 24) | rwlVar.b;
                    L();
                    i++;
                }
                if ((f6 == f5 && f7 == f8) || size == 1) {
                    L();
                    paint2.setColor(iArr[size - 1]);
                } else {
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    int i2 = rxrVar.e;
                    if (i2 != 0) {
                        if (i2 == 2) {
                            tileMode = Shader.TileMode.MIRROR;
                        } else if (i2 == 3) {
                            tileMode = Shader.TileMode.REPEAT;
                        }
                    }
                    L();
                    LinearGradient linearGradient = new LinearGradient(f6, f7, f5, f8, iArr, fArr, tileMode);
                    linearGradient.setLocalMatrix(matrix);
                    paint2.setShader(linearGradient);
                }
            }
        } else {
            f = 0.0f;
        }
        if (rxsVarA instanceof rxv) {
            rxv rxvVar = (rxv) rxsVarA;
            String str3 = rxvVar.d;
            if (str3 != null) {
                A(rxvVar, str3);
            }
            Boolean bool2 = rxvVar.b;
            boolean z6 = bool2 != null && bool2.booleanValue();
            if (z3) {
                paint = this.d.d;
                z2 = true;
            } else {
                paint = this.d.e;
                z2 = false;
            }
            if (z6) {
                rwu rwuVar9 = new rwu(50.0f, 9);
                rwu rwuVar10 = rxvVar.f;
                float fC = rwuVar10 != null ? rwuVar10.c(this) : rwuVar9.c(this);
                rwu rwuVar11 = rxvVar.g;
                float fD = rwuVar11 != null ? rwuVar11.d(this) : rwuVar9.d(this);
                rwu rwuVar12 = rxvVar.h;
                fB2 = rwuVar12 != null ? rwuVar12.a(this) : rwuVar9.a(this);
                f3 = fC;
                f4 = fD;
            } else {
                rwu rwuVar13 = rxvVar.f;
                if (rwuVar13 != null) {
                    f2 = 1.0f;
                    fB = rwuVar13.b(this, 1.0f);
                } else {
                    f2 = 1.0f;
                    fB = 0.5f;
                }
                rwu rwuVar14 = rxvVar.g;
                float fB7 = rwuVar14 != null ? rwuVar14.b(this, f2) : 0.5f;
                rwu rwuVar15 = rxvVar.h;
                f3 = fB;
                fB2 = rwuVar15 != null ? rwuVar15.b(this, f2) : 0.5f;
                f4 = fB7;
            }
            M();
            this.d = p(rxvVar);
            Matrix matrix3 = new Matrix();
            if (!z6) {
                matrix3.preTranslate(rwhVar.a, rwhVar.b);
                matrix3.preScale(rwhVar.c, rwhVar.d);
            }
            Matrix matrix4 = rxvVar.c;
            if (matrix4 != null) {
                matrix3.preConcat(matrix4);
            }
            int size2 = rxvVar.a.size();
            if (size2 == 0) {
                L();
                if (z2) {
                    this.d.b = false;
                } else {
                    this.d.c = false;
                }
            } else {
                int[] iArr2 = new int[size2];
                float[] fArr2 = new float[size2];
                Iterator it2 = rxvVar.a.iterator();
                int i3 = 0;
                float f11 = -1.0f;
                while (it2.hasNext()) {
                    rxi rxiVar2 = (rxi) ((rxs) it2.next());
                    Float f12 = rxiVar2.a;
                    float fFloatValue2 = f12 != null ? f12.floatValue() : f;
                    if (i3 == 0 || fFloatValue2 >= f11) {
                        fArr2[i3] = fFloatValue2;
                        f11 = fFloatValue2;
                    } else {
                        fArr2[i3] = f11;
                    }
                    M();
                    O(this.d, rxiVar2);
                    rxj rxjVar2 = this.d.a;
                    rwl rwlVar2 = (rwl) rxjVar2.v;
                    if (rwlVar2 == null) {
                        rwlVar2 = rwl.a;
                    }
                    iArr2[i3] = (W(rxjVar2.w.floatValue()) << 24) | rwlVar2.b;
                    L();
                    i3++;
                }
                if (fB2 == f || size2 == 1) {
                    L();
                    paint.setColor(iArr2[size2 - 1]);
                } else {
                    Shader.TileMode tileMode2 = Shader.TileMode.CLAMP;
                    int i4 = rxvVar.e;
                    if (i4 != 0) {
                        if (i4 == 2) {
                            tileMode2 = Shader.TileMode.MIRROR;
                        } else if (i4 == 3) {
                            tileMode2 = Shader.TileMode.REPEAT;
                        }
                    }
                    L();
                    RadialGradient radialGradient = new RadialGradient(f3, f4, fB2, iArr2, fArr2, tileMode2);
                    radialGradient.setLocalMatrix(matrix3);
                    paint.setShader(radialGradient);
                }
            }
        }
        if (rxsVarA instanceof rxh) {
            rxh rxhVar = (rxh) rxsVarA;
            if (z3) {
                if (Y(rxhVar.q, 2147483648L)) {
                    ryr ryrVar = this.d;
                    rxj rxjVar3 = ryrVar.a;
                    rxt rxtVar2 = rxhVar.q.z;
                    rxjVar3.b = rxtVar2;
                    ryrVar.b = rxtVar2 != null;
                }
                if (Y(rxhVar.q, 4294967296L)) {
                    this.d.a.c = rxhVar.q.A;
                }
                if (Y(rxhVar.q, 6442450944L)) {
                    ryr ryrVar2 = this.d;
                    aa(ryrVar2, true, ryrVar2.a.b);
                    return;
                }
                return;
            }
            if (Y(rxhVar.q, 2147483648L)) {
                ryr ryrVar3 = this.d;
                rxj rxjVar4 = ryrVar3.a;
                rxt rxtVar3 = rxhVar.q.z;
                rxjVar4.d = rxtVar3;
                ryrVar3.c = rxtVar3 != null;
            }
            if (Y(rxhVar.q, 4294967296L)) {
                this.d.a.e = rxhVar.q.A;
            }
            if (Y(rxhVar.q, 6442450944L)) {
                ryr ryrVar4 = this.d;
                aa(ryrVar4, false, ryrVar4.a.d);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:78:0x0183  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void w(defpackage.rxp r22, android.graphics.Path r23) {
        /*
            Method dump skipped, instructions count: 575
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ryv.w(rxp, android.graphics.Path):void");
    }

    private final void x(Path path) {
        ryr ryrVar = this.d;
        if (ryrVar.a.L != 2) {
            this.a.drawPath(path, ryrVar.e);
            return;
        }
        Canvas canvas = this.a;
        Matrix matrix = canvas.getMatrix();
        Path path2 = new Path();
        path.transform(matrix, path2);
        canvas.setMatrix(new Matrix());
        Shader shader = this.d.e.getShader();
        Matrix matrix2 = new Matrix();
        if (shader != null) {
            shader.getLocalMatrix(matrix2);
            Matrix matrix3 = new Matrix(matrix2);
            matrix3.postConcat(matrix);
            shader.setLocalMatrix(matrix3);
        }
        canvas.drawPath(path2, this.d.e);
        canvas.setMatrix(matrix);
        if (shader != null) {
            shader.setLocalMatrix(matrix2);
        }
    }

    private final void y(ryd rydVar, ryt rytVar) {
        float f;
        float fD;
        float fC;
        if (Q()) {
            Iterator it = rydVar.i.iterator();
            boolean z = true;
            while (it.hasNext()) {
                rxs rxsVar = (rxs) it.next();
                if (rxsVar instanceof ryg) {
                    rytVar.a(q(((ryg) rxsVar).a, z, !it.hasNext()));
                } else if (rytVar.b((ryd) rxsVar)) {
                    if (rxsVar instanceof rye) {
                        M();
                        rye ryeVar = (rye) rxsVar;
                        O(this.d, ryeVar);
                        if (Q() && i()) {
                            rxs rxsVarA = ryeVar.t.a(ryeVar.a);
                            if (rxsVarA == null) {
                                e("TextPath reference '%s' not found", ryeVar.a);
                            } else {
                                rxa rxaVar = (rxa) rxsVarA;
                                Path path = new ryn(rxaVar.a).a;
                                Matrix matrix = rxaVar.e;
                                if (matrix != null) {
                                    path.transform(matrix);
                                }
                                PathMeasure pathMeasure = new PathMeasure(path, false);
                                rwu rwuVar = ryeVar.b;
                                fD = rwuVar != null ? rwuVar.b(this, pathMeasure.getLength()) : 0.0f;
                                int iS = S();
                                if (iS != 1) {
                                    float fJ = j(ryeVar);
                                    if (iS == 2) {
                                        fJ /= 2.0f;
                                    }
                                    fD -= fJ;
                                }
                                u(ryeVar.c);
                                boolean zR = R();
                                y(ryeVar, new ryo(this, path, fD));
                                if (zR) {
                                    Z();
                                }
                            }
                        }
                        L();
                    } else if (rxsVar instanceof rya) {
                        M();
                        rya ryaVar = (rya) rxsVar;
                        O(this.d, ryaVar);
                        if (Q()) {
                            boolean z2 = rytVar instanceof ryp;
                            if (z2) {
                                List list = ryaVar.b;
                                float fC2 = (list == null || list.size() == 0) ? ((ryp) rytVar).b : ((rwu) ryaVar.b.get(0)).c(this);
                                List list2 = ryaVar.c;
                                fD = (list2 == null || list2.size() == 0) ? ((ryp) rytVar).c : ((rwu) ryaVar.c.get(0)).d(this);
                                List list3 = ryaVar.d;
                                fC = (list3 == null || list3.size() == 0) ? 0.0f : ((rwu) ryaVar.d.get(0)).c(this);
                                List list4 = ryaVar.e;
                                if (list4 != null && list4.size() != 0) {
                                    fD = ((rwu) ryaVar.e.get(0)).d(this);
                                }
                                float f2 = fC2;
                                f = fD;
                                fD = f2;
                            } else {
                                f = 0.0f;
                                fD = 0.0f;
                                fC = 0.0f;
                            }
                            u(ryaVar.a);
                            if (z2) {
                                ryp rypVar = (ryp) rytVar;
                                rypVar.b = fD + fC;
                                rypVar.c = fD + f;
                            }
                            boolean zR2 = R();
                            y(ryaVar, rytVar);
                            if (zR2) {
                                Z();
                            }
                        }
                        L();
                    } else if (rxsVar instanceof rxz) {
                        M();
                        rxz rxzVar = (rxz) rxsVar;
                        O(this.d, rxzVar);
                        if (Q()) {
                            u(rxzVar.b);
                            rxs rxsVarA2 = rxsVar.t.a(rxzVar.a);
                            if (rxsVarA2 == null || !(rxsVarA2 instanceof ryd)) {
                                e("Tref reference '%s' not found", rxzVar.a);
                            } else {
                                StringBuilder sb = new StringBuilder();
                                z((ryd) rxsVarA2, sb);
                                if (sb.length() > 0) {
                                    rytVar.a(sb.toString());
                                }
                            }
                        }
                        L();
                    }
                }
                z = false;
            }
        }
    }

    private final void z(ryd rydVar, StringBuilder sb) {
        Iterator it = rydVar.i.iterator();
        boolean z = true;
        while (it.hasNext()) {
            rxs rxsVar = (rxs) it.next();
            if (rxsVar instanceof ryd) {
                z((ryd) rxsVar, sb);
            } else if (rxsVar instanceof ryg) {
                sb.append(q(((ryg) rxsVar).a, z, !it.hasNext()));
            }
            z = false;
        }
    }

    protected final float a() {
        return this.d.d.getTextSize();
    }

    protected final rwh b() {
        ryr ryrVar = this.d;
        rwh rwhVar = ryrVar.g;
        return rwhVar != null ? rwhVar : ryrVar.f;
    }

    public final void d(rxs rxsVar) {
        Boolean bool;
        if ((rxsVar instanceof rxq) && (bool = ((rxq) rxsVar).p) != null) {
            this.d.h = bool.booleanValue();
        }
    }

    public final void f(rxk rxkVar, rwu rwuVar, rwu rwuVar2, rwh rwhVar, rwg rwgVar) {
        float fD;
        if (rwuVar == null || !rwuVar.f()) {
            if (rwuVar2 == null || !rwuVar2.f()) {
                if (rwgVar == null && (rwgVar = rxkVar.v) == null) {
                    rwgVar = rwg.b;
                }
                O(this.d, rxkVar);
                if (Q()) {
                    if (rxkVar.u != null) {
                        rwu rwuVar3 = rxkVar.a;
                        float fC = rwuVar3 != null ? rwuVar3.c(this) : 0.0f;
                        rwu rwuVar4 = rxkVar.b;
                        f = fC;
                        fD = rwuVar4 != null ? rwuVar4.d(this) : 0.0f;
                    } else {
                        fD = 0.0f;
                    }
                    rwh rwhVarB = b();
                    float fC2 = rwuVar != null ? rwuVar.c(this) : rwhVarB.c;
                    float fD2 = rwuVar2 != null ? rwuVar2.d(this) : rwhVarB.d;
                    ryr ryrVar = this.d;
                    ryrVar.f = new rwh(f, fD, fC2, fD2);
                    if (!ryrVar.a.o.booleanValue()) {
                        rwh rwhVar2 = this.d.f;
                        K(rwhVar2.a, rwhVar2.b, rwhVar2.c, rwhVar2.d);
                    }
                    t(rxkVar, this.d.f);
                    if (rwhVar != null) {
                        this.a.concat(U(this.d.f, rwhVar, rwgVar));
                        this.d.g = rxkVar.w;
                    } else {
                        this.a.translate(f, fD);
                    }
                    boolean zR = R();
                    P();
                    H(rxkVar, true);
                    if (zR) {
                        Z();
                    }
                    N(rxkVar);
                }
            }
        }
    }

    public final void g(ryr ryrVar, rxj rxjVar) {
        if (Y(rxjVar, 4096L)) {
            ryrVar.a.k = rxjVar.k;
        }
        if (Y(rxjVar, 2048L)) {
            ryrVar.a.j = rxjVar.j;
        }
        if (Y(rxjVar, 1L)) {
            ryrVar.a.b = rxjVar.b;
            ryrVar.b = rxjVar.b != null;
        }
        if (Y(rxjVar, 4L)) {
            ryrVar.a.c = rxjVar.c;
        }
        if (Y(rxjVar, 6149L)) {
            aa(ryrVar, true, ryrVar.a.b);
        }
        if (Y(rxjVar, 2L)) {
            ryrVar.a.D = rxjVar.D;
        }
        if (Y(rxjVar, 8L)) {
            ryrVar.a.d = rxjVar.d;
            ryrVar.c = rxjVar.d != null;
        }
        if (Y(rxjVar, 16L)) {
            ryrVar.a.e = rxjVar.e;
        }
        if (Y(rxjVar, 6168L)) {
            aa(ryrVar, false, ryrVar.a.d);
        }
        if (Y(rxjVar, 34359738368L)) {
            ryrVar.a.L = rxjVar.L;
        }
        if (Y(rxjVar, 32L)) {
            rxj rxjVar2 = ryrVar.a;
            rxjVar2.f = rxjVar.f;
            ryrVar.e.setStrokeWidth(rxjVar2.f.a(this));
        }
        Typeface typefaceV = null;
        if (Y(rxjVar, 64L)) {
            ryrVar.a.E = rxjVar.E;
            int i = rxjVar.E;
            int i2 = i - 1;
            if (i == 0) {
                throw null;
            }
            if (i2 == 0) {
                ryrVar.e.setStrokeCap(Paint.Cap.BUTT);
            } else if (i2 == 1) {
                ryrVar.e.setStrokeCap(Paint.Cap.ROUND);
            } else if (i2 == 2) {
                ryrVar.e.setStrokeCap(Paint.Cap.SQUARE);
            }
        }
        if (Y(rxjVar, 128L)) {
            ryrVar.a.F = rxjVar.F;
            int i3 = rxjVar.F;
            int i4 = i3 - 1;
            if (i3 == 0) {
                throw null;
            }
            if (i4 == 0) {
                ryrVar.e.setStrokeJoin(Paint.Join.MITER);
            } else if (i4 == 1) {
                ryrVar.e.setStrokeJoin(Paint.Join.ROUND);
            } else if (i4 == 2) {
                ryrVar.e.setStrokeJoin(Paint.Join.BEVEL);
            }
        }
        if (Y(rxjVar, 256L)) {
            ryrVar.a.g = rxjVar.g;
            ryrVar.e.setStrokeMiter(rxjVar.g.floatValue());
        }
        if (Y(rxjVar, 512L)) {
            ryrVar.a.h = rxjVar.h;
        }
        if (Y(rxjVar, 1024L)) {
            ryrVar.a.i = rxjVar.i;
        }
        if (Y(rxjVar, 1536L)) {
            rwu[] rwuVarArr = ryrVar.a.h;
            if (rwuVarArr == null) {
                ryrVar.e.setPathEffect(null);
            } else {
                int length = rwuVarArr.length;
                int i5 = (length & 1) == 0 ? length : length + length;
                float[] fArr = new float[i5];
                float f = 0.0f;
                for (int i6 = 0; i6 < i5; i6++) {
                    float fA = ryrVar.a.h[i6 % length].a(this);
                    fArr[i6] = fA;
                    f += fA;
                }
                if (f == 0.0f) {
                    ryrVar.e.setPathEffect(null);
                } else {
                    float fA2 = ryrVar.a.i.a(this);
                    if (fA2 < 0.0f) {
                        fA2 = (fA2 % f) + f;
                    }
                    ryrVar.e.setPathEffect(new DashPathEffect(fArr, fA2));
                }
            }
        }
        if (Y(rxjVar, 16384L)) {
            float fA3 = a();
            ryrVar.a.m = rxjVar.m;
            ryrVar.d.setTextSize(rxjVar.m.b(this, fA3));
            ryrVar.e.setTextSize(rxjVar.m.b(this, fA3));
        }
        if (Y(rxjVar, 8192L)) {
            ryrVar.a.l = rxjVar.l;
        }
        if (Y(rxjVar, 32768L)) {
            if (rxjVar.n.intValue() == -1 && ryrVar.a.n.intValue() > 100) {
                ryrVar.a.n = Integer.valueOf(r0.n.intValue() - 100);
            } else if (rxjVar.n.intValue() != 1 || ryrVar.a.n.intValue() >= 900) {
                ryrVar.a.n = rxjVar.n;
            } else {
                rxj rxjVar3 = ryrVar.a;
                rxjVar3.n = Integer.valueOf(rxjVar3.n.intValue() + 100);
            }
        }
        if (Y(rxjVar, 65536L)) {
            ryrVar.a.G = rxjVar.G;
        }
        if (Y(rxjVar, 106496L)) {
            List<String> list = ryrVar.a.l;
            if (list != null && this.c != null) {
                for (String str : list) {
                    rxj rxjVar4 = ryrVar.a;
                    typefaceV = V(str, rxjVar4.n, rxjVar4.G);
                    if (typefaceV != null) {
                        break;
                    }
                }
            }
            if (typefaceV == null) {
                rxj rxjVar5 = ryrVar.a;
                typefaceV = V("sans-serif", rxjVar5.n, rxjVar5.G);
            }
            ryrVar.d.setTypeface(typefaceV);
            ryrVar.e.setTypeface(typefaceV);
        }
        if (Y(rxjVar, 131072L)) {
            ryrVar.a.H = rxjVar.H;
            ryrVar.d.setStrikeThruText(rxjVar.H == 4);
            ryrVar.d.setUnderlineText(rxjVar.H == 2);
            ryrVar.e.setStrikeThruText(rxjVar.H == 4);
            ryrVar.e.setUnderlineText(rxjVar.H == 2);
        }
        if (Y(rxjVar, 68719476736L)) {
            ryrVar.a.I = rxjVar.I;
        }
        if (Y(rxjVar, 262144L)) {
            ryrVar.a.J = rxjVar.J;
        }
        if (Y(rxjVar, 524288L)) {
            ryrVar.a.o = rxjVar.o;
        }
        if (Y(rxjVar, 2097152L)) {
            ryrVar.a.q = rxjVar.q;
        }
        if (Y(rxjVar, 4194304L)) {
            ryrVar.a.r = rxjVar.r;
        }
        if (Y(rxjVar, 8388608L)) {
            ryrVar.a.s = rxjVar.s;
        }
        if (Y(rxjVar, 16777216L)) {
            ryrVar.a.t = rxjVar.t;
        }
        if (Y(rxjVar, 33554432L)) {
            ryrVar.a.u = rxjVar.u;
        }
        if (Y(rxjVar, 1048576L)) {
            ryrVar.a.p = rxjVar.p;
        }
        if (Y(rxjVar, 268435456L)) {
            ryrVar.a.x = rxjVar.x;
        }
        if (Y(rxjVar, 536870912L)) {
            ryrVar.a.K = rxjVar.K;
        }
        if (Y(rxjVar, 1073741824L)) {
            ryrVar.a.y = rxjVar.y;
        }
        if (Y(rxjVar, 67108864L)) {
            ryrVar.a.v = rxjVar.v;
        }
        if (Y(rxjVar, 134217728L)) {
            ryrVar.a.w = rxjVar.w;
        }
        if (Y(rxjVar, 8589934592L)) {
            ryrVar.a.B = rxjVar.B;
        }
        if (Y(rxjVar, 17179869184L)) {
            ryrVar.a.C = rxjVar.C;
        }
    }

    public final boolean i() {
        Boolean bool = this.d.a.u;
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }
}
