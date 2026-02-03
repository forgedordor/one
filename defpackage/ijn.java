package defpackage;

import androidx.compose.ui.graphics.BlockGraphicsLayerElement;
import androidx.compose.ui.graphics.GraphicsLayerElement;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ijn {
    public static final ics a(ics icsVar, fdap fdapVar) {
        return icsVar.a(new BlockGraphicsLayerElement(fdapVar));
    }

    public static /* synthetic */ ics b(ics icsVar, float f, float f2, float f3, float f4, ikp ikpVar, int i) {
        long j = (i & 1024) != 0 ? ikz.a : 0L;
        ikp ikpVar2 = (i & 2048) != 0 ? ikj.a : ikpVar;
        int i2 = i & 32;
        int i3 = i & 4;
        int i4 = i & 2;
        int i5 = i & 1;
        float f5 = (i & 512) != 0 ? 8.0f : 0.0f;
        float f6 = i2 != 0 ? 0.0f : f4;
        float f7 = i3 != 0 ? 1.0f : f3;
        float f8 = i4 != 0 ? 1.0f : f2;
        float f9 = 1 == i5 ? 1.0f : f;
        long j2 = ijo.a;
        return d(icsVar, f9, f8, f7, 0.0f, 0.0f, f6, 0.0f, f5, j, ikpVar2, false, j2, j2, 0);
    }

    public static /* synthetic */ ics c(ics icsVar, float f, float f2, float f3, float f4, float f5, float f6, long j, ikp ikpVar, boolean z, int i, int i2) {
        long j2 = (i2 & 1024) != 0 ? ikz.a : j;
        ikp ikpVar2 = (i2 & 2048) != 0 ? ikj.a : ikpVar;
        boolean z2 = ((i2 & 4096) == 0) & z;
        long j3 = (i2 & 16384) != 0 ? ijo.a : 0L;
        long j4 = (32768 & i2) != 0 ? ijo.a : 0L;
        int i3 = ((65536 & i2) == 0 ? 1 : 0) & i;
        int i4 = i2 & 256;
        int i5 = i2 & 16;
        int i6 = i2 & 8;
        int i7 = i2 & 4;
        int i8 = i2 & 2;
        int i9 = i2 & 1;
        float f7 = (i2 & 512) != 0 ? 8.0f : 0.0f;
        float f8 = i4 != 0 ? 0.0f : f6;
        float f9 = i5 != 0 ? 0.0f : f5;
        float f10 = i6 == 0 ? f4 : 0.0f;
        float f11 = i7 != 0 ? 1.0f : f3;
        return d(icsVar, 1 == i9 ? 1.0f : f, i8 != 0 ? 1.0f : f2, f11, f10, f9, 0.0f, f8, f7, j2, ikpVar2, z2, j3, j4, i3);
    }

    public static final ics d(ics icsVar, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, long j, ikp ikpVar, boolean z, long j2, long j3, int i) {
        return icsVar.a(new GraphicsLayerElement(f, f2, f3, f4, f5, f6, f7, f8, j, ikpVar, z, j2, j3, i));
    }
}
