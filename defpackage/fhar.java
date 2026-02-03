package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fhar {
    public List a;
    public List b;

    public final void a(fgzh fgzhVar) {
        List list;
        List list2 = this.b;
        if (list2 != null) {
            fhas fhasVar = (fhas) list2.get(list2.size() - 1);
            list = fhasVar.b;
            if (list.size() <= 0) {
                list = fhasVar.c;
            }
        } else {
            list = this.a;
        }
        list.add(fgzhVar);
    }
}
