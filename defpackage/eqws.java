package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eqws {
    public static final erfp a = new erfn(eqwo.class, eqrz.class, new erfo() { // from class: eqwp
        @Override // defpackage.erfo
        public final Object a(eqsg eqsgVar) {
            eqwo eqwoVar = (eqwo) eqsgVar;
            erfp erfpVar = eqws.a;
            return eqyq.c() ? new eqyq(eqwoVar.b.d(), eqwoVar.c.c()) : new erwm(eqwoVar.b.d(), eqwoVar.c.c());
        }
    });
    public static final eqsh b;
    public static final eret c;
    public static final erer d;

    static {
        erny.a.getParserForType();
        b = new erel("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key", eqrz.class, 3);
        c = new eret() { // from class: eqwq
        };
        d = new erer() { // from class: eqwr
            @Override // defpackage.erer
            public final eqsg a(eqst eqstVar, Integer num) {
                eqwt eqwtVar = ((eqwu) eqstVar).a;
                erfp erfpVar = eqws.a;
                return eqwo.d(eqwtVar, erwp.b(32), num);
            }
        };
    }
}
