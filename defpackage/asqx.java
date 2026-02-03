package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class asqx {
    private static final cqce a = cqce.g("BugleDataModel", "ChatEndpointFactory");
    private final crmx b;
    private final ccvz c;

    public asqx(crmx crmxVar, ccvz ccvzVar) {
        this.b = crmxVar;
        this.c = ccvzVar;
    }

    private final String h(String str) {
        return this.b.y(str, true);
    }

    public final aubq a(String str, boolean z) {
        if (z) {
            return e(str);
        }
        cqce cqceVar = cmvy.a;
        if (alwh.i(str)) {
            return b(str);
        }
        if (this.c.b(str)) {
            return d(str);
        }
        try {
            String strH = h(str);
            aubn aubnVar = (aubn) aubq.a.createBuilder();
            aubp aubpVar = aubp.PHONE;
            aubnVar.copyOnWrite();
            aubq aubqVar = (aubq) aubnVar.instance;
            aubqVar.c = aubpVar.f;
            aubqVar.b |= 1;
            aubnVar.copyOnWrite();
            aubq aubqVar2 = (aubq) aubnVar.instance;
            strH.getClass();
            aubqVar2.b |= 2;
            aubqVar2.d = strH;
            return (aubq) aubnVar.build();
        } catch (IllegalArgumentException e) {
            throw asrb.a(str, e);
        }
    }

    public final aubq b(String str) {
        cqce cqceVar = cmvy.a;
        if (!alwh.i(str)) {
            throw new asrb(String.format("%s is not a valid bot id.", str));
        }
        aubn aubnVar = (aubn) aubq.a.createBuilder();
        aubp aubpVar = aubp.BOT;
        aubnVar.copyOnWrite();
        aubq aubqVar = (aubq) aubnVar.instance;
        aubqVar.c = aubpVar.f;
        aubqVar.b = 1 | aubqVar.b;
        aubnVar.copyOnWrite();
        aubq aubqVar2 = (aubq) aubnVar.instance;
        str.getClass();
        aubqVar2.b |= 2;
        aubqVar2.d = str;
        return (aubq) aubnVar.build();
    }

    public final aubq c(String str) {
        if (!this.b.I(str)) {
            throw asrb.a(str, new IllegalArgumentException("Provided endpoint is not a valid E164 number"));
        }
        aubn aubnVar = (aubn) aubq.a.createBuilder();
        aubp aubpVar = aubp.PHONE;
        aubnVar.copyOnWrite();
        aubq aubqVar = (aubq) aubnVar.instance;
        aubqVar.c = aubpVar.f;
        aubqVar.b |= 1;
        aubnVar.copyOnWrite();
        aubq aubqVar2 = (aubq) aubnVar.instance;
        str.getClass();
        aubqVar2.b |= 2;
        aubqVar2.d = str;
        return (aubq) aubnVar.build();
    }

    public final aubq d(String str) {
        aubn aubnVar = (aubn) aubq.a.createBuilder();
        aubp aubpVar = aubp.EMERGENCY;
        aubnVar.copyOnWrite();
        aubq aubqVar = (aubq) aubnVar.instance;
        aubqVar.c = aubpVar.f;
        aubqVar.b |= 1;
        aubnVar.copyOnWrite();
        aubq aubqVar2 = (aubq) aubnVar.instance;
        str.getClass();
        aubqVar2.b |= 2;
        aubqVar2.d = str;
        return (aubq) aubnVar.build();
    }

    public final aubq e(String str) {
        if (str.isEmpty()) {
            throw new asrb("Group endpoint must have a conference URI");
        }
        aubn aubnVar = (aubn) aubq.a.createBuilder();
        aubp aubpVar = aubp.GROUP;
        aubnVar.copyOnWrite();
        aubq aubqVar = (aubq) aubnVar.instance;
        aubqVar.c = aubpVar.f;
        aubqVar.b |= 1;
        aubnVar.copyOnWrite();
        aubq aubqVar2 = (aubq) aubnVar.instance;
        str.getClass();
        aubqVar2.b |= 2;
        aubqVar2.d = str;
        return (aubq) aubnVar.build();
    }

    public final aubq f(alqm alqmVar, String str) {
        if (alqmVar.e().isPresent()) {
            aubq aubqVar = (aubq) alqmVar.e().get();
            aubp aubpVar = aubp.PHONE;
            aubp aubpVarB = aubp.b(aubqVar.c);
            if (aubpVarB == null) {
                aubpVarB = aubp.UNKNOWN_TYPE;
            }
            if (aubpVar.equals(aubpVarB)) {
                return aubqVar;
            }
        }
        try {
            h(str);
        } catch (IllegalArgumentException unused) {
            cqbd cqbdVarE = a.e();
            cqbdVarE.I("Creating ChatEndpoint with non E164 format");
            cqbdVarE.k(str);
            cqbdVarE.r();
        }
        aubn aubnVar = (aubn) aubq.a.createBuilder();
        aubp aubpVar2 = aubp.PHONE;
        aubnVar.copyOnWrite();
        aubq aubqVar2 = (aubq) aubnVar.instance;
        aubqVar2.c = aubpVar2.f;
        aubqVar2.b |= 1;
        aubnVar.copyOnWrite();
        aubq aubqVar3 = (aubq) aubnVar.instance;
        str.getClass();
        aubqVar3.b |= 2;
        aubqVar3.d = str;
        return (aubq) aubnVar.build();
    }

    public final aubq g(ephf ephfVar) {
        if (this.c.b(ephfVar.c())) {
            return d(ephfVar.c());
        }
        String strM = this.b.m(ephfVar, ephg.E164);
        aubn aubnVar = (aubn) aubq.a.createBuilder();
        aubp aubpVar = aubp.PHONE;
        aubnVar.copyOnWrite();
        aubq aubqVar = (aubq) aubnVar.instance;
        aubqVar.c = aubpVar.f;
        aubqVar.b |= 1;
        aubnVar.copyOnWrite();
        aubq aubqVar2 = (aubq) aubnVar.instance;
        strM.getClass();
        aubqVar2.b |= 2;
        aubqVar2.d = strM;
        return (aubq) aubnVar.build();
    }
}
