package defpackage;

import android.text.TextUtils;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class easm {
    public abstract easp a();

    public abstract void b(List list);

    public abstract void c(List list);

    public abstract void d(List list);

    public final easp e() {
        eaoo eaooVar = (eaoo) a();
        List list = eaooVar.d;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ejwl.b(!TextUtils.isEmpty((String) it.next()), "WeekdayText must not contain null or empty values.");
        }
        b(ekgb.n(eaooVar.b));
        d(ekgb.n(list));
        c(ekgb.n(eaooVar.c));
        return a();
    }
}
