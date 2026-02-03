package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eulk {
    public static final eult a(CharSequence charSequence, ArrayList arrayList, Bundle bundle) {
        return new eult(charSequence, arrayList, bundle == null ? Bundle.EMPTY : bundle.deepCopy());
    }

    public static final void b(int i, int i2, Map map, ArrayList arrayList) {
        map.getClass();
        arrayList.add(new eulq(i, i2, map));
    }
}
