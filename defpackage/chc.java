package defpackage;

import android.util.Size;
import androidx.camera.video.internal.compat.quirk.StretchedVideoResolutionQuirk;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class chc implements bkf {
    private final bkf c;
    private final bly d;
    private final Map e = new HashMap();

    public chc(bkf bkfVar, bly blyVar) {
        this.c = bkfVar;
        this.d = blyVar;
    }

    @Override // defpackage.bkf
    public final bkj a(int i) {
        return c(i);
    }

    @Override // defpackage.bkf
    public final boolean b(int i) {
        return this.c.b(i) && c(i) != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final bkj c(int i) {
        Size size;
        Map map = this.e;
        Integer numValueOf = Integer.valueOf(i);
        if (map.containsKey(numValueOf)) {
            return (bkj) map.get(numValueOf);
        }
        bkf bkfVar = this.c;
        bkh bkhVarE = null;
        if (bkfVar.b(i)) {
            bkj bkjVarC = ((chb) bkfVar).c(i);
            bkjVarC.getClass();
            Iterator it = this.d.c(StretchedVideoResolutionQuirk.class).iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (((StretchedVideoResolutionQuirk) it.next()) != null) {
                    if (i == 4) {
                        size = new Size(640, 480);
                    } else if (i == 5) {
                        size = new Size(960, 720);
                    } else {
                        if (i != 6) {
                            break;
                        }
                        size = new Size(1440, 1080);
                    }
                }
            }
            size = null;
            if (size == null) {
                bkhVarE = bkjVarC;
            } else {
                ArrayList arrayList = new ArrayList();
                for (bki bkiVar : bkjVarC.d()) {
                    arrayList.add(new bhg(bkiVar.d(), bkiVar.j(), bkiVar.b(), bkiVar.e(), size.getWidth(), size.getHeight(), bkiVar.h(), bkiVar.a(), bkiVar.c(), bkiVar.f()));
                }
                if (!arrayList.isEmpty()) {
                    bkhVarE = bkh.e(bkjVarC.a(), bkjVarC.b(), bkjVarC.c(), arrayList);
                }
            }
        }
        map.put(Integer.valueOf(i), bkhVarE);
        return bkhVarE;
    }
}
