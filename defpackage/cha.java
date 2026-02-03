package defpackage;

import android.util.Size;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cha implements bkf {
    public final bir c;
    private final List d;
    private final fctc e;
    private final Map f;

    public cha(bir birVar, List list) {
        birVar.getClass();
        list.getClass();
        this.c = birVar;
        this.d = list;
        this.e = fctd.a(new fdae() { // from class: cgz
            @Override // defpackage.fdae
            public final Object invoke() {
                return this.a.c.o(34);
            }
        });
        this.f = new LinkedHashMap();
    }

    private final bkj c(int i) throws Throwable {
        int i2;
        Object next;
        int i3;
        bhg bhgVar;
        Map map = this.f;
        Integer numValueOf = Integer.valueOf(i);
        if (map.containsKey(numValueOf)) {
            return (bkj) map.get(numValueOf);
        }
        Iterator it = this.d.iterator();
        while (true) {
            if (!it.hasNext()) {
                i2 = i;
                next = null;
                break;
            }
            next = it.next();
            bxo bxoVar = (bxo) next;
            bxoVar.getClass();
            i2 = i;
            if (((bxn) bxoVar).b() == i2) {
                break;
            }
        }
        bxn bxnVar = next instanceof bxn ? (bxn) next : null;
        if (bxnVar == null) {
            bhgVar = null;
        } else {
            for (Size size : bxnVar.d()) {
                if (((List) this.e.a()).contains(size)) {
                    int width = size.getWidth();
                    int height = size.getHeight();
                    if (fdbq.f(bxnVar, bxo.e)) {
                        i3 = 40000000;
                    } else if (fdbq.f(bxnVar, bxo.d)) {
                        i3 = 10000000;
                    } else if (fdbq.f(bxnVar, bxo.c)) {
                        i3 = 4000000;
                    } else {
                        if (!fdbq.f(bxnVar, bxo.b)) {
                            Objects.toString(bxnVar);
                            throw new IllegalArgumentException("Undefined bitrate for quality: ".concat(bxnVar.toString()));
                        }
                        i3 = 2000000;
                    }
                    int i4 = i3;
                    bhgVar = new bhg(2, "video/avc", i4, 30, width, height, -1, 8, 0, 0);
                    cgt cgtVarJ = cgv.j(bhgVar.b);
                    if (cgtVarJ != null && cgtVarJ.i(width, height)) {
                        Integer num = (Integer) cgtVarJ.c().clamp(Integer.valueOf(i4));
                        if (num == null || num.intValue() != i4) {
                            num.getClass();
                            bhgVar = new bhg(2, "video/avc", num.intValue(), 30, width, height, -1, 8, 0, 0);
                        }
                    } else {
                        bhgVar = null;
                    }
                    if (bhgVar != null) {
                        break;
                    }
                }
            }
            bhgVar = null;
        }
        bkh bkhVarE = bhgVar != null ? bkh.e(60, 2, fcva.b(new bhe(3, "audio/mp4a-latm", 96000, 44100, 1, 2)), fcva.b(bhgVar)) : null;
        map.put(Integer.valueOf(i2), bkhVarE);
        return bkhVarE;
    }

    @Override // defpackage.bkf
    public final bkj a(int i) {
        return c(i);
    }

    @Override // defpackage.bkf
    public final boolean b(int i) {
        return c(i) != null;
    }
}
