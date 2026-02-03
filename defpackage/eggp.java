package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eggp {
    public final eggg a;
    public final eosc b;

    public eggp(eggg egggVar, eosc eoscVar) {
        this.a = egggVar;
        this.b = eoscVar;
    }

    public static egbe a(eghw eghwVar) {
        efwo efwoVarB = efwo.b(eghwVar.c);
        egbs egbsVar = eghwVar.d;
        if (egbsVar == null) {
            egbsVar = egbs.a;
        }
        int iA = egcv.a(eghwVar.e);
        if (iA == 0) {
            iA = 1;
        }
        return new egdb(efwoVarB, egbsVar, iA);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static eghw b(eghr eghrVar, efwo efwoVar) {
        try {
            int iA = efwoVar.a();
            evub evubVar = eghrVar.d;
            Integer numValueOf = Integer.valueOf(iA);
            if (evubVar.containsKey(numValueOf)) {
                return (eghw) evubVar.get(numValueOf);
            }
            throw new IllegalArgumentException();
        } catch (IllegalArgumentException e) {
            throw new egdj(e);
        }
    }
}
