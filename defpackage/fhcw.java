package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fhcw extends fhdn {
    final /* synthetic */ fhdn a;

    public fhcw(fhdn fhdnVar) {
        this.a = fhdnVar;
    }

    @Override // defpackage.fhdn
    public final /* bridge */ /* synthetic */ void a(fhds fhdsVar, Object obj) {
        Iterable iterable = (Iterable) obj;
        if (iterable == null) {
            return;
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            this.a.a(fhdsVar, it.next());
        }
    }
}
