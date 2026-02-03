package defpackage;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Log;
import android.util.Size;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bvk extends bdr {
    public final bvp a;
    public bug b;
    bmd c;
    private final bvm d;
    private bug e;
    private btv f;
    private btv g;
    private bme h;

    public bvk(biu biuVar, Set set, bnm bnmVar) {
        super(m(set));
        this.d = m(set);
        this.a = new bvp(biuVar, set, bnmVar, new bvj(this));
    }

    public static List b(bdr bdrVar) {
        ArrayList arrayList = new ArrayList();
        if (!(bdrVar instanceof bvk)) {
            arrayList.add(bdrVar.l.l());
            return arrayList;
        }
        Iterator it = ((bvk) bdrVar).c().iterator();
        while (it.hasNext()) {
            arrayList.add(((bdr) it.next()).l.l());
        }
        return arrayList;
    }

    private static bvm m(Set set) {
        bli bliVar = new bvl(bli.a()).a;
        bliVar.c(bkr.D, 34);
        ArrayList arrayList = new ArrayList();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            bdr bdrVar = (bdr) it.next();
            if (bdrVar.l.t(bni.y)) {
                arrayList.add(bdrVar.l.l());
            } else {
                Log.e("StreamSharing", "A child does not have capture type.");
            }
        }
        bliVar.c(bvm.a, arrayList);
        bliVar.c(bku.I, 2);
        return new bvm(blo.f(bliVar));
    }

    private final void r(final String str, String str2, final bni bniVar, final bms bmsVar, bms bmsVar2) {
        Matrix matrix = this.o;
        biu biuVarF = F();
        biuVarF.getClass();
        boolean zH = biuVarF.H();
        Size sizeD = bmsVar.d();
        Rect rect = this.n;
        boolean z = false;
        if (rect == null) {
            rect = new Rect(0, 0, sizeD.getWidth(), sizeD.getHeight());
        }
        biu biuVarF2 = F();
        biuVarF2.getClass();
        int iA = A(biuVarF2);
        biu biuVarF3 = F();
        biuVarF3.getClass();
        btv btvVar = new btv(3, 34, bmsVar, matrix, zH, rect, iA, -1, U(biuVarF3));
        this.f = btvVar;
        biu biuVarF4 = F();
        biuVarF4.getClass();
        ayy ayyVar = this.p;
        if (ayyVar != null) {
            this.e = new bug(biuVarF4, new buj(ayyVar));
            lcg.i(this.p);
            biu biuVarF5 = F();
            lcg.i(biuVarF5);
            int iA2 = A(biuVarF5);
            lcg.i(this.p);
            Rect rectF = boy.f(btvVar.g.d());
            int i = btvVar.f;
            int i2 = btvVar.a;
            Size sizeH = boy.h(rectF, iA2);
            lcg.i(this.p);
            biu biuVarF6 = F();
            lcg.i(biuVarF6);
            if (biuVarF6.I() && biuVarF6.H()) {
                z = true;
            }
            buy buyVarK = buy.k(i, i2, rectF, sizeH, iA2, z, true);
            btvVar = (btv) this.e.a(new bsh(btvVar, Collections.singletonList(buyVarK))).get(buyVarK);
            btvVar.getClass();
        }
        this.g = btvVar;
        btv btvVar2 = this.f;
        bmd bmdVarA = bmd.a(bniVar, bmsVar.d());
        Iterator it = c().iterator();
        int iA3 = -1;
        while (it.hasNext()) {
            iA3 = bml.a(iA3, ((bdr) it.next()).l.k().b());
        }
        if (iA3 != -1) {
            bmdVarA.t(iA3);
        }
        Size sizeD2 = bmsVar.d();
        Iterator it2 = c().iterator();
        while (it2.hasNext()) {
            bml bmlVarB = bmd.a(((bdr) it2.next()).l, sizeD2).b();
            bmdVarA.d(bmlVarB.e());
            for (bhr bhrVar : bmlVarB.e) {
                bmdVarA.b.d(bhrVar);
                List list = bmdVarA.e;
                if (!list.contains(bhrVar)) {
                    list.add(bhrVar);
                }
            }
            bmdVarA.e(bmlVarB.d);
            bmdVarA.c(bmlVarB.c);
            bmdVarA.h(bmlVarB.c());
        }
        bmdVarA.n(btvVar2.c(), bmsVar.e(), -1);
        bmdVarA.k(this.a.g);
        if (bmsVar.f() != null) {
            bmdVarA.h(bmsVar.f());
        }
        bmdVarA.h = bmsVar.a();
        J(bmdVarA, bmsVar);
        this.c = bmdVarA;
        bme bmeVar = this.h;
        if (bmeVar != null) {
            bmeVar.b();
        }
        final String str3 = null;
        final bms bmsVar3 = null;
        bme bmeVar2 = new bme(new bmf(str, str3, bniVar, bmsVar, bmsVar3) { // from class: bvi
            public final /* synthetic */ String b;
            public final /* synthetic */ bni d;
            public final /* synthetic */ bms e;
            public final /* synthetic */ String c = null;
            public final /* synthetic */ bms f = null;

            {
                this.d = bniVar;
                this.e = bmsVar;
            }

            @Override // defpackage.bmf
            public final void a(bml bmlVar) {
                bvk bvkVar = this.a;
                if (bvkVar.F() == null) {
                    return;
                }
                bms bmsVar4 = this.e;
                bni bniVar2 = this.d;
                String str4 = this.b;
                bvkVar.h();
                bvkVar.R(bvkVar.a(str4, null, bniVar2, bmsVar4, null));
                bvkVar.L();
                bvp bvpVar = bvkVar.a;
                box.b();
                Iterator it3 = bvpVar.a.iterator();
                while (it3.hasNext()) {
                    bvpVar.w((bdr) it3.next());
                }
            }
        });
        this.h = bmeVar2;
        bmdVarA.f = bmeVar2;
    }

    @Override // defpackage.bdr
    public final void N() {
        Iterator it = this.a.a.iterator();
        while (it.hasNext()) {
            ((bdr) it.next()).N();
        }
    }

    public final List a(String str, String str2, bni bniVar, bms bmsVar, bms bmsVar2) {
        boolean z;
        box.b();
        r(str, null, bniVar, bmsVar, null);
        biu biuVarF = F();
        biuVarF.getClass();
        this.b = new bug(biuVarF, bsy.a(bmsVar.e()));
        Rect rect = this.n;
        btv btvVar = this.g;
        int iC = C();
        HashMap map = new HashMap();
        bvp bvpVar = this.a;
        Set set = bvpVar.a;
        Iterator it = set.iterator();
        while (true) {
            z = rect != null;
            if (!it.hasNext()) {
                break;
            }
            bdr bdrVar = (bdr) it.next();
            bvg bvgVar = bvpVar.j;
            biu biuVar = bvpVar.f;
            bgy bgyVar = ((bgz) biuVar).a;
            int iC2 = bgyVar.c(iC);
            RectF rectF = boy.a;
            float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
            Matrix matrix = btvVar.b;
            matrix.mapVectors(fArr);
            float f = fArr[0];
            float f2 = fArr[1];
            float f3 = fArr[2];
            float f4 = fArr[3];
            float f5 = f * f3;
            float f6 = f2 * f4;
            float f7 = f * f4;
            float f8 = f2 * f3;
            float f9 = (f3 * f3) + (f4 * f4);
            Set set2 = set;
            Iterator it2 = it;
            double dSqrt = Math.sqrt((f * f) + (f2 * f2)) * Math.sqrt(f9);
            float degrees = (float) Math.toDegrees(Math.atan2((f7 - f8) / dSqrt, (f5 + f6) / dSqrt));
            bni bniVar2 = (bni) bvpVar.i.get(bdrVar);
            bniVar2.getClass();
            bve bveVarD = bvgVar.d(bniVar2, btvVar.d, boy.a(matrix), z);
            Rect rect2 = bveVarD.a;
            Size size = bveVarD.b;
            int iC3 = bgyVar.c(((bku) bdrVar.l).C(0));
            bvn bvnVar = (bvn) bvpVar.c.get(bdrVar);
            bvnVar.getClass();
            bvnVar.a.a = iC3;
            int i = (btvVar.i + iC3) - iC2;
            int i2 = bdrVar instanceof bch ? 1 : bdrVar instanceof bbf ? 4 : 2;
            boolean z2 = degrees > 0.0f;
            boolean z3 = bdrVar instanceof bbf;
            int iB = boy.b(i);
            map.put(bdrVar, buy.j(i2, true != z3 ? 34 : 256, rect2, boy.k(size, iB), iB, bdrVar.U(biuVar) ^ z2));
            it = it2;
            set = set2;
        }
        Set<bdr> set3 = set;
        buf bufVarA = this.b.a(new bsh(this.g, new ArrayList(map.values())));
        HashMap map2 = new HashMap();
        for (Map.Entry entry : map.entrySet()) {
            map2.put((bdr) entry.getKey(), (btv) bufVarA.get(entry.getValue()));
        }
        btv btvVar2 = this.g;
        HashMap map3 = new HashMap();
        for (bdr bdrVar2 : set3) {
            bvg bvgVar2 = bvpVar.j;
            bni bniVar3 = (bni) bvpVar.i.get(bdrVar2);
            bniVar3.getClass();
            Size size2 = bvgVar2.d(bniVar3, btvVar2.d, boy.a(btvVar2.b), z).c;
            map3.put(bdrVar2, size2);
            bbs.a("VirtualCameraAdapter", "Selected child size: " + size2 + ", useCase: " + bdrVar2);
        }
        Map map4 = bvpVar.b;
        map4.clear();
        map4.putAll(map2);
        for (Map.Entry entry2 : map4.entrySet()) {
            bdr bdrVar3 = (bdr) entry2.getKey();
            btv btvVar3 = (btv) entry2.getValue();
            bdrVar3.l(btvVar3.d);
            bdrVar3.k(btvVar3.b);
            bmr bmrVarG = btvVar3.g.g();
            Size size3 = (Size) map3.get(bdrVar3);
            if (size3 != null) {
                bmrVarG.c(size3);
            }
            bdrVar3.S(bmrVarG.a(), null);
            bdrVar3.M();
        }
        return bvh.a(this.c.b());
    }

    @Override // defpackage.bdr
    public final Set ag() {
        HashSet hashSet = new HashSet();
        hashSet.add(3);
        return hashSet;
    }

    @Override // defpackage.bdr
    public final void ah() {
        bvp bvpVar = this.a;
        for (bdr bdrVar : bvpVar.a) {
            bvn bvnVar = (bvn) bvpVar.c.get(bdrVar);
            bvnVar.getClass();
            bdrVar.W(bvnVar, null, bdrVar.f(true, bvpVar.e));
        }
    }

    @Override // defpackage.bdr
    public final void ai() {
        Iterator it = this.a.a.iterator();
        while (it.hasNext()) {
            ((bdr) it.next()).ai();
        }
    }

    public final Set c() {
        return this.a.a;
    }

    @Override // defpackage.bdr
    public final bms d(bjq bjqVar) {
        this.c.h(bjqVar);
        R(bvh.a(this.c.b()));
        bmr bmrVarG = this.m.g();
        ((bhn) bmrVarG).b = bjqVar;
        return bmrVarG.a();
    }

    @Override // defpackage.bdr
    public final bnh e(bjq bjqVar) {
        return new bvl(bli.b(bjqVar));
    }

    @Override // defpackage.bdr
    public final bni f(boolean z, bnm bnmVar) {
        bvm bvmVar = this.d;
        bjq bjqVarA = bnmVar.a(bnf.g(bvmVar), 1);
        if (z) {
            bjqVarA = bjn.a(bjqVarA, bvmVar.b);
        }
        if (bjqVarA == null) {
            return null;
        }
        return e(bjqVarA).c();
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x017e  */
    @Override // defpackage.bdr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final defpackage.bni g(defpackage.bir r17, defpackage.bnh r18) {
        /*
            Method dump skipped, instructions count: 601
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bvk.g(bir, bnh):bni");
    }

    public final void h() {
        bme bmeVar = this.h;
        if (bmeVar != null) {
            bmeVar.b();
            this.h = null;
        }
        btv btvVar = this.f;
        if (btvVar != null) {
            btvVar.g();
            this.f = null;
        }
        btv btvVar2 = this.g;
        if (btvVar2 != null) {
            btvVar2.g();
            this.g = null;
        }
        bug bugVar = this.b;
        if (bugVar != null) {
            bugVar.c();
            this.b = null;
        }
        bug bugVar2 = this.e;
        if (bugVar2 != null) {
            bugVar2.c();
            this.e = null;
        }
    }

    @Override // defpackage.bdr
    public final void j() {
        h();
        bvp bvpVar = this.a;
        for (bdr bdrVar : bvpVar.a) {
            bvn bvnVar = (bvn) bvpVar.c.get(bdrVar);
            bvnVar.getClass();
            bdrVar.Q(bvnVar);
        }
    }

    @Override // defpackage.bdr
    protected final void p(bms bmsVar, bms bmsVar2) {
        bbs.a("StreamSharing", a.i(null, bmsVar, "onSuggestedStreamSpecUpdated: primaryStreamSpec = ", ", secondaryStreamSpec "));
        String strH = H();
        X();
        R(a(strH, null, this.l, bmsVar, null));
        K();
    }

    @Override // defpackage.bdr
    public final void q() {
        Iterator it = this.a.a.iterator();
        while (it.hasNext()) {
            ((bdr) it.next()).q();
        }
    }
}
