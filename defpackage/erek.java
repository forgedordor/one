package defpackage;

import java.security.GeneralSecurityException;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class erek extends erel implements eqsh {
    public erek(String str, Class cls) {
        super(str, cls, 4);
    }

    public final erme e(evqs evqsVar) {
        erfv erfvVarA = erfv.a(this.a, evqsVar, this.c, ermy.RAW, null);
        erfb erfbVar = erfb.a;
        eqsy eqsyVar = eqsy.a;
        Object objA = erfbVar.a(erfvVarA, eqsyVar);
        if (!(objA instanceof eqsu)) {
            throw new GeneralSecurityException("Key not private key");
        }
        erga ergaVarC = erfbVar.c(((eqsu) objA).c(), erfv.class, eqsyVar);
        ermc ermcVar = (ermc) erme.a.createBuilder();
        erfv erfvVar = (erfv) ergaVarC;
        String str = erfvVar.a;
        ermcVar.copyOnWrite();
        erme ermeVar = (erme) ermcVar.instance;
        str.getClass();
        ermeVar.b = str;
        evqs evqsVar2 = erfvVar.c;
        ermcVar.copyOnWrite();
        erme ermeVar2 = (erme) ermcVar.instance;
        evqsVar2.getClass();
        ermeVar2.c = evqsVar2;
        int i = erfvVar.f;
        ermcVar.copyOnWrite();
        ((erme) ermcVar.instance).d = ermd.a(i);
        return (erme) ermcVar.build();
    }
}
