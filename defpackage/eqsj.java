package defpackage;

import java.security.GeneralSecurityException;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eqsj {
    public final eqst a;

    public eqsj(eqst eqstVar) {
        this.a = eqstVar;
    }

    public final ermh a() {
        try {
            eqst eqstVar = this.a;
            return eqstVar instanceof ereo ? ((ereo) eqstVar).a.b : ((erfw) erfb.a.d(eqstVar, erfw.class)).b;
        } catch (GeneralSecurityException e) {
            throw new ergg("Parsing parameters failed in getProto(). You probably want to call some Tink register function for ".concat(String.valueOf(String.valueOf(this.a))), e);
        }
    }
}
