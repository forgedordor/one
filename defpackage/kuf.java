package defpackage;

import android.view.View;
import java.util.Comparator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kuf implements Comparator {
    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        int[] iArr = ley.a;
        float fB = len.b((View) obj);
        float fB2 = len.b((View) obj2);
        if (fB > fB2) {
            return -1;
        }
        return fB < fB2 ? 1 : 0;
    }
}
