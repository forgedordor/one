package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dybv extends mo {
    final /* synthetic */ List a;
    final /* synthetic */ List b;
    final /* synthetic */ dybw c;

    public dybv(dybw dybwVar, List list, List list2) {
        this.a = list;
        this.b = list2;
        this.c = dybwVar;
    }

    @Override // defpackage.mo
    public final int a() {
        return this.b.size();
    }

    @Override // defpackage.mo
    public final int b() {
        return this.a.size();
    }

    @Override // defpackage.mo
    public final boolean d(int i, int i2) {
        Object obj = this.a.get(i);
        Object obj2 = this.b.get(i2);
        dxxk dxxkVar = this.c.a;
        return dxxu.b(obj, dxxkVar).equals(dxxu.b(obj2, dxxkVar));
    }

    @Override // defpackage.mo
    public final boolean e(int i, int i2) {
        dxxk dxxkVar = this.c.a;
        return dxxkVar.b(this.a.get(i)).equals(dxxkVar.b(this.b.get(i2)));
    }
}
