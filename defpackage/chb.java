package defpackage;

import android.util.Range;
import android.util.Size;
import androidx.camera.video.internal.compat.quirk.ExtraSupportedQualityQuirk;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class chb implements bkf {
    private final bkf c;
    private Map d;

    public chb(bkf bkfVar, bly blyVar, bir birVar) throws Throwable {
        Map map;
        this.c = bkfVar;
        List listC = blyVar.c(ExtraSupportedQualityQuirk.class);
        if (listC.isEmpty()) {
            return;
        }
        lcg.c(listC.size() == 1);
        if (ExtraSupportedQualityQuirk.a()) {
            map = null;
            if ("1".equals(birVar.l()) && !bkfVar.b(4)) {
                bkj bkjVarA = bkfVar.a(1);
                bki bkiVar = (bkjVarA == null || bkjVarA.d().isEmpty()) ? null : (bki) bkjVarA.d().get(0);
                if (bkiVar != null) {
                    cgt cgtVarJ = cgv.j(bkiVar.j());
                    Range rangeC = cgtVarJ != null ? cgtVarJ.c() : cax.e;
                    Size size = bsd.d;
                    bkh bkhVarE = bkh.e(bkjVarA.a(), bkjVarA.b(), bkjVarA.c(), Collections.singletonList(new bhg(bkiVar.d(), bkiVar.j(), cdk.a(bkiVar.b(), bkiVar.a(), bkiVar.a(), bkiVar.e(), bkiVar.e(), size.getWidth(), bkiVar.i(), size.getHeight(), bkiVar.g(), rangeC), bkiVar.e(), size.getWidth(), size.getHeight(), bkiVar.h(), bkiVar.a(), bkiVar.c(), bkiVar.f())));
                    HashMap map2 = new HashMap();
                    map2.put(4, bkhVarE);
                    if (bsd.a(size) > bsd.a(bkiVar.k())) {
                        map2.put(1, bkhVarE);
                    }
                    map = map2;
                }
            }
        } else {
            map = Collections.EMPTY_MAP;
        }
        if (map != null) {
            this.d = new HashMap(map);
        }
    }

    @Override // defpackage.bkf
    public final bkj a(int i) {
        return c(i);
    }

    @Override // defpackage.bkf
    public final boolean b(int i) {
        return c(i) != null;
    }

    public final bkj c(int i) {
        Map map = this.d;
        if (map != null) {
            Integer numValueOf = Integer.valueOf(i);
            if (map.containsKey(numValueOf)) {
                return (bkj) this.d.get(numValueOf);
            }
        }
        return this.c.a(i);
    }
}
