package defpackage;

import androidx.compose.ui.draw.PainterElement;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class iff {
    public static /* synthetic */ ics a(ics icsVar, inz inzVar, iby ibyVar, iva ivaVar, float f, ijf ijfVar, int i) {
        if ((i & 4) != 0) {
            ibyVar = ibw.e;
        }
        iby ibyVar2 = ibyVar;
        if ((i & 8) != 0) {
            ivaVar = iuz.e;
        }
        iva ivaVar2 = ivaVar;
        boolean z = (i & 2) != 0;
        if ((i & 16) != 0) {
            f = 1.0f;
        }
        return icsVar.a(new PainterElement(inzVar, z, ibyVar2, ivaVar2, f, ijfVar));
    }
}
