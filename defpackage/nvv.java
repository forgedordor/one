package defpackage;

import android.text.Layout;
import java.util.Comparator;

/* compiled from: PG */
/* loaded from: classes.dex */
final class nvv {
    public static final Comparator a = new Comparator() { // from class: nvu
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return Integer.compare(((nvv) obj2).c, ((nvv) obj).c);
        }
    };
    public final mdu b;
    public final int c;

    public nvv(CharSequence charSequence, Layout.Alignment alignment, float f, int i, float f2, int i2, boolean z, int i3, int i4) {
        mdt mdtVar = new mdt();
        mdtVar.a = charSequence;
        mdtVar.c = alignment;
        mdtVar.c(f, 0);
        mdtVar.e = i;
        mdtVar.f = f2;
        mdtVar.g = i2;
        mdtVar.h = -3.4028235E38f;
        if (z) {
            mdtVar.e(i3);
        }
        this.b = mdtVar.a();
        this.c = i4;
    }
}
