package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class angu {
    public static final angn a(aoer aoerVar, Context context, fhaz fhazVar) {
        String string = context.getString(R.string.you_name);
        string.getClass();
        return new angn(string, aoerVar.c(), false, aoerVar, fhazVar, null, null, 96);
    }

    public static final ango b(anhj anhjVar, List list, boolean z) {
        return new ango(anhjVar, list.size(), z, ekfv.a(list));
    }

    public static final ango c(ango angoVar, aoer aoerVar) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : angoVar.d) {
            aoer aoerVar2 = ((angn) obj).c;
            if (aoerVar2 == null || !aoerVar2.z(aoerVar)) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return b(angoVar.a, arrayList, false);
    }
}
