package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ont extends ouk {
    final /* synthetic */ onv a;

    public ont(onv onvVar) {
        this.a = onvVar;
    }

    @Override // defpackage.ouk
    public final void a(orr orrVar, orp orpVar) {
        Iterator it = this.a.j.iterator();
        while (it.hasNext()) {
            ((fdat) it.next()).a(orrVar, orpVar);
        }
    }
}
