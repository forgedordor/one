package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eijd implements eija {
    @Override // defpackage.eija
    public final eijb a(eije eijeVar) {
        eijb<?> eijbVar;
        synchronized (eijeVar) {
            eijbVar = eijeVar.currentMetadata;
        }
        return eijbVar;
    }

    @Override // defpackage.eija
    public final boolean b(eije eijeVar, eijb eijbVar, eijb eijbVar2) {
        synchronized (eijeVar) {
            if (eijeVar.currentMetadata != eijbVar) {
                return false;
            }
            eijeVar.currentMetadata = eijbVar2;
            return true;
        }
    }
}
