package defpackage;

import java.security.InvalidAlgorithmParameterException;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eqzh {
    public static final erfp a = new erfn(eqzd.class, eqsd.class, new erfo() { // from class: eqze
        @Override // defpackage.erfo
        public final Object a(eqsg eqsgVar) throws InvalidAlgorithmParameterException {
            eqzd eqzdVar = (eqzd) eqsgVar;
            eqzh.a(eqzdVar.a);
            return eruo.a(eqzdVar);
        }
    });
    public static final eqsh b;
    public static final eret c;
    public static final erer d;

    static {
        erjy.a.getParserForType();
        b = new erel("type.googleapis.com/google.crypto.tink.AesSivKey", eqsd.class, 3);
        c = new eret() { // from class: eqzf
        };
        d = new erer() { // from class: eqzg
            @Override // defpackage.erer
            public final eqsg a(eqst eqstVar, Integer num) throws InvalidAlgorithmParameterException {
                eqzk eqzkVar = (eqzk) eqstVar;
                eqzh.a(eqzkVar);
                return eqzc.a(eqzkVar, erwp.b(eqzkVar.a), num);
            }
        };
    }

    public static void a(eqzk eqzkVar) throws InvalidAlgorithmParameterException {
        int i = eqzkVar.a;
        if (i != 64) {
            throw new InvalidAlgorithmParameterException(a.e(i, "invalid key size: ", ". Valid keys must have 64 bytes."));
        }
    }
}
