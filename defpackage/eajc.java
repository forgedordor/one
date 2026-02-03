package defpackage;

import com.android.vcard.VCardConfig;
import com.google.android.gms.common.api.Status;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class eajc implements eant {
    public final eawu a;
    public final eawo b;
    public final eanu c;

    public eajc(eawu eawuVar, eawo eawoVar, eanu eanuVar) {
        this.a = eawuVar;
        this.b = eawoVar;
        this.c = eanuVar;
    }

    public static final int f(defn defnVar) {
        if (defnVar.m()) {
            return 2;
        }
        Exception excH = defnVar.h();
        excH.getClass();
        int iA = (excH instanceof dcff ? (dcff) excH : new dcff(new Status(13, excH.getMessage()))).a();
        if (iA != 7) {
            return iA != 15 ? 1 : 3;
        }
        return 4;
    }

    public final eohj a() {
        Locale localeB = this.c.b();
        Locale locale = Locale.getDefault();
        eohj eohjVar = (eohj) eohl.a.createBuilder();
        String string = localeB.toString();
        eohjVar.copyOnWrite();
        eohl eohlVar = (eohl) eohjVar.instance;
        string.getClass();
        eohlVar.b |= 2;
        eohlVar.d = string;
        if (!localeB.equals(locale)) {
            String string2 = locale.toString();
            eohjVar.copyOnWrite();
            eohl eohlVar2 = (eohl) eohjVar.instance;
            string2.getClass();
            eohlVar2.b |= 4;
            eohlVar2.e = string2;
        }
        return eohjVar;
    }

    public final void b(eogi eogiVar, int i) {
        e(eogiVar, 2, i, eaiu.a);
    }

    @Override // defpackage.eant
    public final void c(eava eavaVar, int i, int i2) {
        eogx eogxVar = (eogx) eogy.a.createBuilder();
        eogxVar.copyOnWrite();
        eogy.a((eogy) eogxVar.instance);
        eohh eohhVar = (eohh) eohi.a.createBuilder();
        eohhVar.a(eanh.b(((eaua) eavaVar).b));
        eohi eohiVar = (eohi) eohhVar.build();
        eogxVar.copyOnWrite();
        eogy eogyVar = (eogy) eogxVar.instance;
        eohiVar.getClass();
        eogyVar.c = eohiVar;
        eogyVar.b |= 4;
        eogy eogyVar2 = (eogy) eogxVar.build();
        eohj eohjVarA = a();
        eohjVarA.copyOnWrite();
        eohl eohlVar = (eohl) eohjVarA.instance;
        eohl eohlVar2 = eohl.a;
        eohlVar.c = 4;
        eohlVar.b |= 1;
        eohjVarA.copyOnWrite();
        eohl eohlVar3 = (eohl) eohjVarA.instance;
        eogyVar2.getClass();
        eohlVar3.f = eogyVar2;
        eohlVar3.b |= 128;
        eohl eohlVar4 = (eohl) eohjVarA.build();
        eogr eogrVarA = eawv.a(this.b, i, i2);
        eogrVarA.copyOnWrite();
        eogw eogwVar = (eogw) eogrVarA.instance;
        eogw eogwVar2 = eogw.a;
        eogwVar.d = 1;
        eogwVar.b |= 2;
        eogrVarA.copyOnWrite();
        eogw eogwVar3 = (eogw) eogrVarA.instance;
        eohlVar4.getClass();
        eogwVar3.f = eohlVar4;
        eogwVar3.b |= 64;
        String strA = this.c.a();
        eogrVarA.copyOnWrite();
        eogw eogwVar4 = (eogw) eogrVarA.instance;
        strA.getClass();
        eogwVar4.b |= 1073741824;
        eogwVar4.m = strA;
        this.a.a(eogrVarA);
    }

    @Override // defpackage.eant
    public final void d(defn defnVar, long j, long j2, int i, int i2, eaiu eaiuVar) {
        boolean zM = defnVar.m();
        eogd eogdVar = (eogd) eoge.a.createBuilder();
        eogdVar.copyOnWrite();
        eoge eogeVar = (eoge) eogdVar.instance;
        eogeVar.b |= 1;
        eogeVar.c = 1;
        eogdVar.copyOnWrite();
        eoge eogeVar2 = (eoge) eogdVar.instance;
        eogeVar2.b |= 2;
        eogeVar2.d = zM ? 1 : 0;
        eoge eogeVar3 = (eoge) eogdVar.build();
        eogf eogfVar = (eogf) eogi.a.createBuilder();
        eogfVar.copyOnWrite();
        eogi eogiVar = (eogi) eogfVar.instance;
        eogiVar.c = 7;
        eogiVar.b |= 1;
        eogfVar.copyOnWrite();
        eogi eogiVar2 = (eogi) eogfVar.instance;
        eogeVar3.getClass();
        eogiVar2.f = eogeVar3;
        eogiVar2.b |= 32;
        int iF = f(defnVar);
        eogfVar.copyOnWrite();
        eogi eogiVar3 = (eogi) eogfVar.instance;
        eogiVar3.d = iF - 1;
        eogiVar3.b |= 2;
        eogfVar.copyOnWrite();
        eogi eogiVar4 = (eogi) eogfVar.instance;
        eogiVar4.b |= 4;
        eogiVar4.e = (int) (j2 - j);
        e((eogi) eogfVar.build(), i, i2, eaiuVar);
    }

    public final void e(eogi eogiVar, int i, int i2, eaiu eaiuVar) {
        eogr eogrVarB = eawv.b(this.b, i, i2, eaiuVar);
        eogrVarB.copyOnWrite();
        eogw eogwVar = (eogw) eogrVarB.instance;
        eogw eogwVar2 = eogw.a;
        eogwVar.d = 16;
        eogwVar.b |= 2;
        eogrVarB.copyOnWrite();
        eogw eogwVar3 = (eogw) eogrVarB.instance;
        eogiVar.getClass();
        eogwVar3.i = eogiVar;
        eogwVar3.b |= VCardConfig.FLAG_REFRAIN_IMAGE_EXPORT;
        String strA = this.c.a();
        eogrVarB.copyOnWrite();
        eogw eogwVar4 = (eogw) eogrVarB.instance;
        strA.getClass();
        eogwVar4.b |= 1073741824;
        eogwVar4.m = strA;
        this.a.a(eogrVarB);
    }

    @Override // defpackage.eant
    public final void g(eavg eavgVar, int i) {
        eogj eogjVar = (eogj) eogk.a.createBuilder();
        List<String> list = ((eaug) eavgVar).a;
        if (!list.isEmpty()) {
            for (String str : list) {
                eogjVar.copyOnWrite();
                eogk eogkVar = (eogk) eogjVar.instance;
                str.getClass();
                evtg evtgVar = eogkVar.b;
                if (!evtgVar.c()) {
                    eogkVar.b = evsn.mutableCopy(evtgVar);
                }
                eogkVar.b.add(str);
            }
        }
        eogk eogkVar2 = (eogk) eogjVar.build();
        eogp eogpVar = (eogp) eogq.a.createBuilder();
        if (eogkVar2 != null) {
            eogpVar.copyOnWrite();
            eogq eogqVar = (eogq) eogpVar.instance;
            eogqVar.c = eogkVar2;
            eogqVar.b |= 4;
        }
        eogq eogqVar2 = (eogq) eogpVar.build();
        eohj eohjVarA = a();
        eohjVarA.copyOnWrite();
        eohl eohlVar = (eohl) eohjVarA.instance;
        eohl eohlVar2 = eohl.a;
        eohlVar.c = 5;
        eohlVar.b |= 1;
        eohjVarA.copyOnWrite();
        eohl eohlVar3 = (eohl) eohjVarA.instance;
        eogqVar2.getClass();
        eohlVar3.g = eogqVar2;
        eohlVar3.b |= 256;
        eohl eohlVar4 = (eohl) eohjVarA.build();
        eogr eogrVarA = eawv.a(this.b, i, 3);
        eogrVarA.copyOnWrite();
        eogw eogwVar = (eogw) eogrVarA.instance;
        eogw eogwVar2 = eogw.a;
        eogwVar.d = 1;
        eogwVar.b |= 2;
        eogrVarA.copyOnWrite();
        eogw eogwVar3 = (eogw) eogrVarA.instance;
        eohlVar4.getClass();
        eogwVar3.f = eohlVar4;
        eogwVar3.b |= 64;
        String strA = this.c.a();
        eogrVarA.copyOnWrite();
        eogw eogwVar4 = (eogw) eogrVarA.instance;
        strA.getClass();
        eogwVar4.b |= 1073741824;
        eogwVar4.m = strA;
        this.a.a(eogrVarA);
    }

    @Override // defpackage.eant
    public final void h(eava eavaVar, int i) {
        eogx eogxVar = (eogx) eogy.a.createBuilder();
        eogxVar.copyOnWrite();
        eogy.a((eogy) eogxVar.instance);
        eohh eohhVar = (eohh) eohi.a.createBuilder();
        eohhVar.a(eanh.b(((eaua) eavaVar).b));
        eohi eohiVar = (eohi) eohhVar.build();
        eogxVar.copyOnWrite();
        eogy eogyVar = (eogy) eogxVar.instance;
        eohiVar.getClass();
        eogyVar.c = eohiVar;
        eogyVar.b |= 4;
        eogy eogyVar2 = (eogy) eogxVar.build();
        eohj eohjVarA = a();
        eohjVarA.copyOnWrite();
        eohl eohlVar = (eohl) eohjVarA.instance;
        eohl eohlVar2 = eohl.a;
        eohlVar.c = 4;
        eohlVar.b |= 1;
        eohjVarA.copyOnWrite();
        eohl eohlVar3 = (eohl) eohjVarA.instance;
        eogyVar2.getClass();
        eohlVar3.j = eogyVar2;
        eohlVar3.b |= 2097152;
        eohl eohlVar4 = (eohl) eohjVarA.build();
        eogr eogrVarA = eawv.a(this.b, i, 3);
        eogrVarA.copyOnWrite();
        eogw eogwVar = (eogw) eogrVarA.instance;
        eogw eogwVar2 = eogw.a;
        eogwVar.d = 1;
        eogwVar.b |= 2;
        eogrVarA.copyOnWrite();
        eogw eogwVar3 = (eogw) eogrVarA.instance;
        eohlVar4.getClass();
        eogwVar3.f = eohlVar4;
        eogwVar3.b |= 64;
        String strA = this.c.a();
        eogrVarA.copyOnWrite();
        eogw eogwVar4 = (eogw) eogrVarA.instance;
        strA.getClass();
        eogwVar4.b |= 1073741824;
        eogwVar4.m = strA;
        this.a.a(eogrVarA);
    }
}
