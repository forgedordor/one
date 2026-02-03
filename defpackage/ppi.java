package defpackage;

import android.view.View;
import java.util.Comparator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ppi implements Comparator {
    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        ppb ppbVar = (ppb) ((View) obj).getLayoutParams();
        ppb ppbVar2 = (ppb) ((View) obj2).getLayoutParams();
        boolean z = ppbVar.a;
        return z != ppbVar2.a ? !z ? -1 : 1 : ppbVar.e - ppbVar2.e;
    }
}
