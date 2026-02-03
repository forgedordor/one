package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class euzf {
    public abstract euzg a();

    public abstract void b(List list);

    public abstract void c(List list);

    public abstract void d(String str);

    public abstract void e();

    public final euzg f() {
        euzg euzgVarA = a();
        euyv euyvVar = (euyv) euzgVarA;
        if (euyvVar.a.isEmpty() || euyvVar.c.isEmpty() || euyvVar.d.isEmpty()) {
            throw new IllegalArgumentException("Task graph's name, input streams, and output streams should be non-empty.");
        }
        return euzgVarA;
    }
}
