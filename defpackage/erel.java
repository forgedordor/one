package defpackage;

import java.security.GeneralSecurityException;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class erel implements eqsh {
    final String a;
    final Class b;
    final int c;

    public erel(String str, Class cls, int i) {
        this.a = str;
        this.b = cls;
        this.c = i;
    }

    @Override // defpackage.eqsh
    public final erme a(evqs evqsVar) throws GeneralSecurityException {
        ermg ermgVar = (ermg) ermh.a.createBuilder();
        ermgVar.copyOnWrite();
        ((ermh) ermgVar.instance).b = this.a;
        ermgVar.copyOnWrite();
        ermh ermhVar = (ermh) ermgVar.instance;
        evqsVar.getClass();
        ermhVar.c = evqsVar;
        ermy ermyVar = ermy.RAW;
        ermgVar.copyOnWrite();
        ((ermh) ermgVar.instance).d = ermyVar.a();
        erfw erfwVarA = erfw.a((ermh) ermgVar.build());
        erfb erfbVar = erfb.a;
        erga ergaVarC = erfbVar.c(eres.a.a(erfbVar.b(erfwVarA), null), erfv.class, eqsy.a);
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

    @Override // defpackage.eqsh
    public final Class b() {
        return this.b;
    }

    @Override // defpackage.eqsh
    public final Object c(evqs evqsVar) throws GeneralSecurityException {
        return erey.a.a(erfb.a.a(erfv.a(this.a, evqsVar, this.c, ermy.RAW, null), eqsy.a), this.b);
    }

    @Override // defpackage.eqsh
    public final String d() {
        return this.a;
    }
}
