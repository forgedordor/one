package defpackage;

import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ehnr extends lvn {
    private eibp d;

    public ehnr(eg egVar) {
        super(egVar);
    }

    @Override // defpackage.lvn
    public final void e(lva lvaVar) {
        lvn.g("getObserverCount");
        if (this.b.e <= 0) {
            super.e(lvaVar);
            return;
        }
        eibp eibpVar = this.d;
        int iOrdinal = lvaVar.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                eiez eiezVar = eiey.a;
                eiezVar.getClass();
                eibpVar.p("Lifecycle.Started", eiezVar);
            } else if (iOrdinal == 2) {
                eiez eiezVar2 = eiey.a;
                eiezVar2.getClass();
                eibpVar.p("Lifecycle.Resumed", eiezVar2);
            } else if (iOrdinal == 3) {
                eiez eiezVar3 = eiey.a;
                eiezVar3.getClass();
                eibpVar.p("Lifecycle.Paused", eiezVar3);
            } else if (iOrdinal == 4) {
                eiez eiezVar4 = eiey.a;
                eiezVar4.getClass();
                eibpVar.p("Lifecycle.Stopped", eiezVar4);
            } else {
                if (iOrdinal != 5) {
                    Objects.toString(lvaVar);
                    throw new UnsupportedOperationException("Unknown lifecycle: ".concat(lvaVar.toString()));
                }
                eiez eiezVar5 = eiey.a;
                eiezVar5.getClass();
                eibpVar.p("Lifecycle.Destroyed", eiezVar5);
            }
        } else if (eibpVar.e == null) {
            eiez eiezVar6 = eiey.a;
            eiezVar6.getClass();
            eibpVar.p("Lifecycle.Created", eiezVar6);
            eibpVar.d = true;
        }
        try {
            super.e(lvaVar);
        } finally {
            this.d.n(lvaVar);
        }
    }

    public final void h(eibp eibpVar) {
        ejwl.m(this.d == null, "Activity was already created");
        this.d = eibpVar;
    }
}
