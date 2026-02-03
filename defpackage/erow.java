package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class erow {
    public static final erfp a = new erfn(eror.class, eqsv.class, new erfo() { // from class: eros
        @Override // defpackage.erfo
        public final Object a(eqsg eqsgVar) {
            return eruv.b((eror) eqsgVar);
        }
    });
    public static final erfp b = new erfn(erox.class, eqsw.class, new erfo() { // from class: erot
        @Override // defpackage.erfo
        public final Object a(eqsg eqsgVar) {
            return eruw.b((erox) eqsgVar);
        }
    });
    public static final eqsh c;
    public static final eret d;
    public static final erer e;
    public static final erek f;

    static {
        erle.a.getParserForType();
        f = new erek("type.googleapis.com/google.crypto.tink.Ed25519PrivateKey", eqsv.class);
        erlg.a.getParserForType();
        c = new erel("type.googleapis.com/google.crypto.tink.Ed25519PublicKey", eqsw.class, 5);
        d = new eret() { // from class: erou
        };
        e = new erer() { // from class: erov
            @Override // defpackage.erer
            public final eqsg a(eqst eqstVar, Integer num) {
                eroq eroqVar = (eroq) eqstVar;
                erfp erfpVar = erow.a;
                byte[] bArrB = erfy.b(32);
                if (bArrB.length == 32) {
                    return eror.f(erox.d(eroqVar.a, erwn.b(Arrays.copyOf(erds.j(erds.i(bArrB)), 32)), num), erwp.c(Arrays.copyOf(bArrB, 32)));
                }
                throw new IllegalArgumentException(String.format("Given secret seed length is not %s", 32));
            }
        };
    }
}
