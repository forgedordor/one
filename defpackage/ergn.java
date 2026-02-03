package defpackage;

import java.security.GeneralSecurityException;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ergn {
    public static final erer a = new erer() { // from class: ergk
        @Override // defpackage.erer
        public final eqsg a(eqst eqstVar, Integer num) throws GeneralSecurityException {
            ergq ergqVar = (ergq) eqstVar;
            ergn.a(ergqVar);
            return ergi.a(ergqVar, erwp.b(ergqVar.a), num);
        }
    };
    public static final erfp b = new erfn(ergj.class, ergr.class, new erfo() { // from class: ergl
        @Override // defpackage.erfo
        public final Object a(eqsg eqsgVar) throws GeneralSecurityException {
            ergn.a(((ergj) eqsgVar).a);
            return new erhy();
        }
    });
    public static final erfp c = new erfn(ergj.class, eqss.class, new erfo() { // from class: ergm
        @Override // defpackage.erfo
        public final Object a(eqsg eqsgVar) throws GeneralSecurityException {
            ergj ergjVar = (ergj) eqsgVar;
            ergn.a(ergjVar.a);
            return new ervy(ergjVar);
        }
    });
    public static final eqsh d;

    static {
        erii.a.getParserForType();
        d = new erel("type.googleapis.com/google.crypto.tink.AesCmacKey", eqss.class, 3);
    }

    public static void a(ergq ergqVar) throws GeneralSecurityException {
        if (ergqVar.a != 32) {
            throw new GeneralSecurityException("AesCmacKey size wrong, must be 32 bytes");
        }
    }
}
