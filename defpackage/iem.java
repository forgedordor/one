package defpackage;

import android.view.DragEvent;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class iem {
    public static final long a(ief iefVar) {
        DragEvent dragEvent = iefVar.a;
        float x = dragEvent.getX();
        float y = dragEvent.getY();
        return (Float.floatToRawIntBits(x) << 32) | (Float.floatToRawIntBits(y) & 4294967295L);
    }
}
