package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final /* synthetic */ class chwn {
    static {
        ejxr ejxrVar = chwq.a;
    }

    public static enxu a() {
        enxt enxtVar = (enxt) enxu.a.createBuilder();
        enxv enxvVar = (enxv) enxw.a.createBuilder();
        enxvVar.copyOnWrite();
        enxw enxwVar = (enxw) enxvVar.instance;
        enxwVar.b |= 1;
        enxwVar.c = -1;
        enxvVar.copyOnWrite();
        enxw enxwVar2 = (enxw) enxvVar.instance;
        enxwVar2.e = 2;
        enxwVar2.b |= 4;
        enxw enxwVar3 = (enxw) enxvVar.build();
        enxtVar.copyOnWrite();
        enxu enxuVar = (enxu) enxtVar.instance;
        enxwVar3.getClass();
        enxuVar.c = enxwVar3;
        enxuVar.b |= 1;
        return (enxu) enxtVar.build();
    }

    public static chvf b(boolean z, Uri uri) {
        chve chveVarJ = chvf.j(true != z ? 3 : 1, 0);
        ((chue) chveVarJ).c = uri;
        chveVarJ.b(1);
        return chveVarJ.a();
    }
}
