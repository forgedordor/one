package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class nwa extends nvg implements Comparable {
    public long i;

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        nwa nwaVar = (nwa) obj;
        if (eS() != nwaVar.eS()) {
            return !eS() ? -1 : 1;
        }
        long j = this.f - nwaVar.f;
        if (j == 0) {
            j = this.i - nwaVar.i;
            if (j == 0) {
                return 0;
            }
        }
        return j <= 0 ? -1 : 1;
    }
}
