package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ksl {
    public final ksa b;
    public final ArrayList a = new ArrayList();
    private final ksj c = new ksj();

    public ksl(ksa ksaVar) {
        this.b = ksaVar;
    }

    public final void a(ksa ksaVar) {
        ArrayList arrayList = this.a;
        arrayList.clear();
        int size = ksaVar.aL.size();
        for (int i = 0; i < size; i++) {
            krz krzVar = (krz) ksaVar.aL.get(i);
            if (krzVar.X() == 3 || krzVar.Y() == 3) {
                arrayList.add(krzVar);
            }
        }
        ksaVar.c();
    }

    public final boolean b(ksk kskVar, krz krzVar, int i) {
        ksj ksjVar = this.c;
        ksjVar.i = krzVar.X();
        ksjVar.j = krzVar.Y();
        ksjVar.a = krzVar.j();
        ksjVar.b = krzVar.h();
        ksjVar.g = false;
        ksjVar.h = i;
        int i2 = ksjVar.i;
        int i3 = ksjVar.j;
        boolean z = i2 == 3 && krzVar.ah > 0.0f;
        boolean z2 = i3 == 3 && krzVar.ah > 0.0f;
        if (z && krzVar.E[0] == 4) {
            ksjVar.i = 1;
        }
        if (z2 && krzVar.E[1] == 4) {
            ksjVar.j = 1;
        }
        kskVar.b(krzVar, ksjVar);
        krzVar.N(ksjVar.c);
        krzVar.C(ksjVar.d);
        krzVar.P = ksjVar.f;
        krzVar.y(ksjVar.e);
        ksjVar.h = 0;
        return ksjVar.g;
    }

    public final void c(ksa ksaVar, int i, int i2, int i3) {
        int i4 = ksaVar.am;
        int i5 = ksaVar.an;
        ksaVar.K(0);
        ksaVar.J(0);
        ksaVar.N(i2);
        ksaVar.C(i3);
        ksaVar.K(i4);
        ksaVar.J(i5);
        ksa ksaVar2 = this.b;
        ksaVar2.c = i;
        ksaVar2.ae();
    }
}
