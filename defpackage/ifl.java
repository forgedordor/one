package defpackage;

import androidx.compose.ui.draw.ShadowGraphicsLayerElement;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ifl {
    public static /* synthetic */ ics a(ics icsVar, float f, ikp ikpVar, long j, long j2, int i) {
        if ((i & 2) != 0) {
            ikpVar = ikj.a;
        }
        ikp ikpVar2 = ikpVar;
        boolean z = false;
        if ((i & 4) != 0 && Float.compare(f, 0.0f) > 0) {
            z = true;
        }
        if ((i & 8) != 0) {
            j = ijo.a;
        }
        long j3 = j;
        if ((i & 16) != 0) {
            j2 = ijo.a;
        }
        long j4 = j2;
        if (Float.compare(f, 0.0f) <= 0) {
            if (!z) {
                return icsVar;
            }
            z = true;
        }
        return icsVar.a(new ShadowGraphicsLayerElement(f, ikpVar2, z, j3, j4));
    }
}
