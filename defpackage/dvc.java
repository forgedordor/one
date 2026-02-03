package defpackage;

import androidx.compose.foundation.gestures.DraggableElement;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dvc {
    public static final fdau a = new dva(null);
    public static final fdau b = new dvb(null);

    public static /* synthetic */ ics a(ics icsVar, dvi dviVar, dwm dwmVar, boolean z, ebk ebkVar, boolean z2, fdau fdauVar, boolean z3, int i) {
        int i2 = i & 16;
        int i3 = i & 8;
        return icsVar.a(new DraggableElement(dviVar, dwmVar, z | (!((i & 4) == 0)), i3 != 0 ? null : ebkVar, (i2 == 0) & z2, (i & 32) != 0 ? a : null, (i & 64) != 0 ? b : fdauVar, ((i & 128) == 0) & z3));
    }
}
