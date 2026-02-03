package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ekny extends eknw implements Serializable {
    static final eknw a = new ekny();
    private static final long serialVersionUID = 0;

    private ekny() {
    }

    @Override // defpackage.eknw, java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        eknz eknzVar = (eknz) obj;
        eknz eknzVar2 = (eknz) obj2;
        return ekdr.b.c(eknzVar.b, eknzVar2.b).c(eknzVar.c, eknzVar2.c).a();
    }
}
