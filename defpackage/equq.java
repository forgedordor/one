package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class equq {
    public static final erfp a = new erfn(equm.class, eqrz.class, new erfo() { // from class: equn
        @Override // defpackage.erfo
        public final Object a(eqsg eqsgVar) {
            equm equmVar = (equm) eqsgVar;
            int i = eqyx.a;
            int i2 = eqxm.a;
            if (eqxm.c(eqyx.c())) {
                return new eqxm(equmVar.b.d(), equmVar.c.c());
            }
            throw new IllegalStateException("Cipher does not implement AES GCM SIV.");
        }
    });
    public static final erer b = new erer() { // from class: equo
        @Override // defpackage.erer
        public final eqsg a(eqst eqstVar, Integer num) {
            equt equtVar = (equt) eqstVar;
            int i = equtVar.a;
            erfp erfpVar = equq.a;
            return equl.a(equtVar, erwp.b(i), num);
        }
    };
    public static final eret c = new eret() { // from class: equp
    };
    public static final eqsh d;

    static {
        erju.a.getParserForType();
        d = new erel("type.googleapis.com/google.crypto.tink.AesGcmSivKey", eqrz.class, 3);
    }
}
