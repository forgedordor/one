package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kph extends kpa {
    private kpg b;
    private int c;
    private final ArrayList d;

    public kph() {
        super(null);
        this.c = 0;
        this.d = new ArrayList();
    }

    public static final ics d(ics icsVar, kow kowVar, fdap fdapVar) {
        return icsVar.a(new kpf(kowVar, fdapVar));
    }

    public final kow a() {
        int i = this.c;
        this.c = i + 1;
        ArrayList arrayList = this.d;
        kow kowVar = (kow) fcva.Q(arrayList, i);
        if (kowVar != null) {
            return kowVar;
        }
        kow kowVar2 = new kow(Integer.valueOf(this.c));
        arrayList.add(kowVar2);
        return kowVar2;
    }

    public final kpg b() {
        kpg kpgVar = this.b;
        if (kpgVar != null) {
            return kpgVar;
        }
        kpg kpgVar2 = new kpg(this);
        this.b = kpgVar2;
        return kpgVar2;
    }

    public final void c() {
        ((kqo) this.a).a.clear();
        this.c = 0;
    }
}
