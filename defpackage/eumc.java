package defpackage;

import com.google.android.apps.messaging.R;
import java.util.Comparator;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eumc implements Comparator {
    private static final int a(eunc euncVar, eunc euncVar2) {
        return euncVar.c() - euncVar2.c();
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        eunc euncVar = (eunc) obj;
        eunc euncVar2 = (eunc) obj2;
        if (euncVar.b() == R.id.smartAction) {
            return euncVar2.b() != R.id.smartAction ? -1 : 0;
        }
        if (euncVar2.b() == R.id.smartAction) {
            return 1;
        }
        if (euncVar.k()) {
            if (euncVar2.k()) {
                return a(euncVar, euncVar2);
            }
            return -1;
        }
        if (euncVar2.k()) {
            return 1;
        }
        if (euncVar.l()) {
            if (euncVar2.l()) {
                return a(euncVar, euncVar2);
            }
            return 1;
        }
        if (euncVar2.l()) {
            return -1;
        }
        return a(euncVar, euncVar2);
    }
}
