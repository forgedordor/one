package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eph {
    public final int a;
    public final List b = new ArrayList();
    final /* synthetic */ epj c;

    public eph(epj epjVar, int i) {
        this.c = epjVar;
        this.a = i;
    }

    public final void a(int i) {
        epj epjVar = this.c;
        eqw eqwVar = epjVar.c;
        if (eqwVar == null) {
            return;
        }
        List list = this.b;
        eqx eqxVar = epjVar.b;
        eqz eqzVar = eqwVar.c;
        list.add(new eqv(eqwVar, i, eqxVar, eqzVar instanceof erc ? (erc) eqzVar : null, null));
    }
}
