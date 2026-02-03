package defpackage;

import android.text.TextUtils;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class eapn {
    public abstract eapo a();

    public abstract void b(List list);

    public final eapo c() {
        eanz eanzVar = (eanz) a();
        ejwl.b(!eanzVar.a.isEmpty(), "Name must not be empty.");
        List list = eanzVar.c;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ejwl.b(!TextUtils.isEmpty((String) it.next()), "Types must not contain null or empty values.");
        }
        b(ekgb.n(list));
        return a();
    }
}
