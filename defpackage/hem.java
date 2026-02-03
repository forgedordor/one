package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hem {
    public static final int a(heq heqVar, int i, int i2) {
        if (!heqVar.g) {
            return 0;
        }
        heg hegVar = heqVar.b;
        int i3 = hegVar.f - hegVar.e;
        List list = heqVar.c;
        int size = list.size() + i3;
        List list2 = heqVar.d;
        int size2 = list2.size() + i3;
        int iB = fdcu.b(hegVar.c().c - (heqVar.a() / 2.0f));
        if (i < size) {
            iB = fdcu.b(((heg) list.get(Math.min(list.size() - 1, Math.max(0, (size - 1) - i)))).c().c - (heqVar.a() / 2.0f));
        }
        if (i2 <= i3 + 1 || i < i2 - size2) {
            return iB;
        }
        return fdcu.b(((heg) list2.get(Math.min(list2.size() - 1, Math.max(0, (i - i2) + size2)))).c().c - (heqVar.a() / 2.0f));
    }
}
