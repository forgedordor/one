package defpackage;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bug {
    public final btz a;
    final biu b;
    public buf c;

    public bug(biu biuVar, btz btzVar) {
        this.b = biuVar;
        this.a = btzVar;
    }

    public final buf a(bue bueVar) {
        final btv btvVar;
        Rect rectF;
        box.b();
        this.c = new buf();
        bsh bshVar = (bsh) bueVar;
        Iterator it = bshVar.b.iterator();
        while (true) {
            btvVar = bshVar.a;
            if (it.hasNext()) {
                buy buyVar = (buy) it.next();
                buf bufVar = this.c;
                Rect rectD = buyVar.d();
                int iB = buyVar.b();
                boolean zG = buyVar.g();
                Matrix matrix = new Matrix(btvVar.b);
                Matrix matrixD = boy.d(new RectF(rectD), boy.g(buyVar.e()), iB, zG);
                matrix.postConcat(matrixD);
                lcg.a(boy.o(boy.h(rectD, iB), false, buyVar.e()));
                if (buyVar.h()) {
                    Rect rectD2 = buyVar.d();
                    Rect rect = btvVar.d;
                    lcg.b(rectD2.contains(rect), String.format("Output crop rect %s must contain input crop rect %s", buyVar.d(), rect));
                    rectF = new Rect();
                    RectF rectF2 = new RectF(rect);
                    matrixD.mapRect(rectF2);
                    rectF2.round(rectF);
                } else {
                    rectF = boy.f(buyVar.e());
                }
                Rect rect2 = rectF;
                bmr bmrVarG = btvVar.g.g();
                bmrVarG.d(buyVar.e());
                bufVar.put(buyVar, new btv(buyVar.c(), buyVar.a(), bmrVarG.a(), matrix, false, rect2, btvVar.i - iB, -1, btvVar.e != zG));
            } else {
                try {
                    break;
                } catch (bci e) {
                    bbs.d("SurfaceProcessorNode", "Failed to send SurfaceRequest to SurfaceProcessor.", e);
                }
            }
        }
        this.a.a(btvVar.a(this.b));
        Iterator it2 = this.c.entrySet().iterator();
        while (it2.hasNext()) {
            final Map.Entry entry = (Map.Entry) it2.next();
            b(btvVar, entry);
            ((btv) entry.getValue()).e(new Runnable() { // from class: bua
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.b(btvVar, entry);
                }
            });
        }
        final buf bufVar2 = this.c;
        btvVar.l.add(new lbz() { // from class: bub
            @Override // defpackage.lbz
            public final void accept(Object obj) {
                bdn bdnVar = (bdn) obj;
                for (Map.Entry entry2 : bufVar2.entrySet()) {
                    int iA = bdnVar.a() - ((buy) entry2.getKey()).b();
                    if (((buy) entry2.getKey()).g()) {
                        iA = -iA;
                    }
                    RectF rectF3 = boy.a;
                    ((btv) entry2.getValue()).k(boy.b(iA), -1);
                }
            }
        });
        return this.c;
    }

    public final void b(btv btvVar, Map.Entry entry) {
        btv btvVar2 = (btv) entry.getValue();
        bqk.i(btvVar2.d(((buy) entry.getKey()).a(), new ayr(btvVar.g.d(), ((buy) entry.getKey()).d(), btvVar.c ? this.b : null, ((buy) entry.getKey()).b(), ((buy) entry.getKey()).g()), null), new bud(this, btvVar2), bpn.a());
    }

    public final void c() {
        this.a.g();
        box.c(new Runnable() { // from class: buc
            @Override // java.lang.Runnable
            public final void run() {
                buf bufVar = this.a.c;
                if (bufVar != null) {
                    Iterator it = bufVar.values().iterator();
                    while (it.hasNext()) {
                        ((btv) it.next()).g();
                    }
                }
            }
        });
    }
}
