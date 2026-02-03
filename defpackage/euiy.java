package defpackage;

import java.util.Comparator;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class euiy implements Comparator {
    final /* synthetic */ euiz a;

    public euiy(euiz euizVar) {
        this.a = euizVar;
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        csq csqVar = this.a.a;
        return Float.compare(((Float) csqVar.get((String) obj2)).floatValue(), ((Float) csqVar.get((String) obj)).floatValue());
    }
}
