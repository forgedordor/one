package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hyl {
    final /* synthetic */ cuz a;
    final /* synthetic */ String b;
    final /* synthetic */ fdae c;

    public hyl(cuz cuzVar, String str, fdae fdaeVar) {
        this.a = cuzVar;
        this.b = str;
        this.c = fdaeVar;
    }

    public final void a() {
        cuz cuzVar = this.a;
        String str = this.b;
        List list = (List) cuzVar.b(str);
        if (list != null) {
            list.remove(this.c);
        }
        if (list == null || list.isEmpty()) {
            return;
        }
        cuzVar.e(str, list);
    }
}
