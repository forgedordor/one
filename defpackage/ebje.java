package defpackage;

import android.content.Context;
import java.io.IOException;
import java.util.HashSet;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ebje implements ebjc {
    private final Context a;
    private final deyw b;

    public ebje(Context context, deyw deywVar) {
        this.a = context;
        this.b = deywVar;
    }

    private static eweq a(ebjr ebjrVar) {
        eweq eweqVar = (eweq) ewev.a.createBuilder();
        eweqVar.copyOnWrite();
        ewev ewevVar = (ewev) eweqVar.instance;
        ebjv ebjvVar = (ebjv) ebjrVar;
        String str = ebjvVar.a;
        str.getClass();
        ewevVar.b |= 32;
        ewevVar.h = str;
        ewfe ewfeVar = ebjvVar.e;
        if (ewfeVar != null) {
            eweqVar.copyOnWrite();
            ewev ewevVar2 = (ewev) eweqVar.instance;
            ewevVar2.g = ewfeVar;
            ewevVar2.b |= 16;
        }
        return eweqVar;
    }

    private static void b(eweq eweqVar, ebjj ebjjVar) {
        String strG;
        if (ebjjVar != null) {
            if ("message/cpim".equals(ebjjVar.h)) {
                try {
                    strG = ebcp.b(ebjjVar.b.I()).g("urn:ietf:params:imdn", "Message-ID");
                } catch (IOException unused) {
                }
            } else {
                strG = null;
            }
            String str = ebjjVar.h;
            if (strG != null) {
                eweqVar.copyOnWrite();
                ewev ewevVar = (ewev) eweqVar.instance;
                ewev ewevVar2 = ewev.a;
                ewevVar.b |= 64;
                ewevVar.i = strG;
            }
            if (str != null) {
                eweqVar.copyOnWrite();
                ewev ewevVar3 = (ewev) eweqVar.instance;
                ewev ewevVar4 = ewev.a;
                ewevVar3.b |= 128;
                ewevVar3.j = str;
            }
            int size = ebjjVar.s == 2 ? ebjjVar.l.a : ebjjVar.d.size();
            eweqVar.copyOnWrite();
            ewev ewevVar5 = (ewev) eweqVar.instance;
            ewev ewevVar6 = ewev.a;
            ewevVar5.b |= 256;
            ewevVar5.k = size;
            int i = ebjjVar.r;
            eweqVar.copyOnWrite();
            ewev ewevVar7 = (ewev) eweqVar.instance;
            int i2 = i - 1;
            if (i == 0) {
                throw null;
            }
            ewevVar7.e = i2;
            ewevVar7.b |= 4;
            ebit ebitVar = ebjjVar.g;
            HashSet hashSet = new HashSet();
            for (Map.Entry entry : ebitVar.a.entrySet()) {
                eweo eweoVar = (eweo) ewep.a.createBuilder();
                String str2 = (String) entry.getKey();
                eweoVar.copyOnWrite();
                ewep ewepVar = (ewep) eweoVar.instance;
                str2.getClass();
                ewepVar.b |= 1;
                ewepVar.c = str2;
                String str3 = (String) entry.getValue();
                eweoVar.copyOnWrite();
                ewep ewepVar2 = (ewep) eweoVar.instance;
                str3.getClass();
                ewepVar2.b |= 2;
                ewepVar2.d = str3;
                hashSet.add((ewep) eweoVar.build());
            }
            eweqVar.copyOnWrite();
            ewev ewevVar8 = (ewev) eweqVar.instance;
            evtg evtgVar = ewevVar8.m;
            if (!evtgVar.c()) {
                ewevVar8.m = evsn.mutableCopy(evtgVar);
            }
            evpz.addAll(hashSet, ewevVar8.m);
        }
    }

    private static void c(eweq eweqVar, ebjn ebjnVar) {
        eweqVar.copyOnWrite();
        ewev ewevVar = (ewev) eweqVar.instance;
        ewev ewevVar2 = ewev.a;
        ewevVar.d = 2;
        ewevVar.b = 2 | ewevVar.b;
        eweqVar.copyOnWrite();
        ewev ewevVar3 = (ewev) eweqVar.instance;
        ewevVar3.b |= 8;
        ewevVar3.f = ebjnVar.a;
    }

    private static ewev d(ebjr ebjrVar, ebjj ebjjVar, int i) {
        return e(ebjrVar, ebjjVar, i, 0);
    }

    private static ewev e(ebjr ebjrVar, ebjj ebjjVar, int i, int i2) {
        eweq eweqVarA = a(ebjrVar);
        b(eweqVarA, ebjjVar);
        int i3 = ebjjVar.s;
        eweqVarA.copyOnWrite();
        ewev ewevVar = (ewev) eweqVarA.instance;
        ewev ewevVar2 = ewev.a;
        int i4 = i3 - 1;
        if (i3 == 0) {
            throw null;
        }
        ewevVar.c = i4;
        ewevVar.b |= 1;
        eweqVarA.copyOnWrite();
        ewev ewevVar3 = (ewev) eweqVarA.instance;
        ewevVar3.d = 1;
        ewevVar3.b |= 2;
        eweqVarA.copyOnWrite();
        ewev ewevVar4 = (ewev) eweqVarA.instance;
        ewevVar4.n = i - 1;
        ewevVar4.b |= 1024;
        eweqVarA.copyOnWrite();
        ewev ewevVar5 = (ewev) eweqVarA.instance;
        String str = ((ebjv) ebjrVar).c;
        str.getClass();
        ewevVar5.b |= 2048;
        ewevVar5.o = str;
        if (ebjjVar.r == 3) {
            int i5 = ebjjVar.p;
            eweqVarA.copyOnWrite();
            ewev ewevVar6 = (ewev) eweqVarA.instance;
            ewevVar6.b |= 8;
            ewevVar6.f = i5;
        }
        if (i2 != 0) {
            eweqVarA.copyOnWrite();
            ewev ewevVar7 = (ewev) eweqVarA.instance;
            ewevVar7.p = i2 - 1;
            ewevVar7.b |= 4096;
        }
        return (ewev) eweqVarA.build();
    }

    private static int f(int i) {
        int i2 = i - 1;
        if (i2 == 1) {
            return 3;
        }
        if (i2 != 2) {
            return i2 != 3 ? 1 : 4;
        }
        return 2;
    }

    @Override // defpackage.ebjc
    public final void aM(ebjr ebjrVar, ebjj ebjjVar) {
        this.b.f(this.a, d(ebjrVar, ebjjVar, 2));
    }

    @Override // defpackage.ebjc
    public final void aN(ebjr ebjrVar, ebjj ebjjVar) {
        this.b.f(this.a, d(ebjrVar, ebjjVar, 2));
    }

    @Override // defpackage.ebjc
    public final void aO(ebjr ebjrVar, ebjj ebjjVar) {
        this.b.f(this.a, d(ebjrVar, ebjjVar, 3));
    }

    @Override // defpackage.ebjc
    public final /* synthetic */ void aP(ebjr ebjrVar, ebjj ebjjVar, ebjn ebjnVar) {
        bi(ebjrVar, ebjjVar, 3);
    }

    @Override // defpackage.ebjc
    public final void aQ(ebjr ebjrVar, ebjn ebjnVar, ebjj ebjjVar) {
        eweq eweqVarA = a(ebjrVar);
        b(eweqVarA, ebjjVar);
        c(eweqVarA, ebjnVar);
        eweqVarA.copyOnWrite();
        ewev ewevVar = (ewev) eweqVarA.instance;
        ewev ewevVar2 = ewev.a;
        ewevVar.c = 1;
        ewevVar.b |= 1;
        eweqVarA.copyOnWrite();
        ewev ewevVar3 = (ewev) eweqVarA.instance;
        ewevVar3.n = 1;
        ewevVar3.b |= 1024;
        if (ebjjVar != null) {
            long jLongValue = dhkl.a().longValue() - ebjjVar.q;
            eweqVarA.copyOnWrite();
            ewev ewevVar4 = (ewev) eweqVarA.instance;
            ewevVar4.b |= 512;
            ewevVar4.l = (int) jLongValue;
        }
        this.b.f(this.a, (ewev) eweqVarA.build());
    }

    @Override // defpackage.ebjc
    public final void aR(ebjr ebjrVar, ebjn ebjnVar, ebjm ebjmVar) {
        eweq eweqVarA = a(ebjrVar);
        c(eweqVarA, ebjnVar);
        eweqVarA.copyOnWrite();
        ewev ewevVar = (ewev) eweqVarA.instance;
        ewev ewevVar2 = ewev.a;
        ewevVar.c = 0;
        ewevVar.b |= 1;
        eweqVarA.copyOnWrite();
        ewev ewevVar3 = (ewev) eweqVarA.instance;
        ewevVar3.e = ebjmVar.b - 1;
        ewevVar3.b |= 4;
        eweqVarA.copyOnWrite();
        ewev ewevVar4 = (ewev) eweqVarA.instance;
        ewevVar4.n = 1;
        ewevVar4.b |= 1024;
        String strE = ebjmVar.e(ffho.a);
        eweqVarA.copyOnWrite();
        ewev ewevVar5 = (ewev) eweqVarA.instance;
        String str = ebjmVar.d;
        str.getClass();
        ewevVar5.b |= 64;
        ewevVar5.i = str;
        if (strE != null) {
            eweqVarA.copyOnWrite();
            ewev ewevVar6 = (ewev) eweqVarA.instance;
            ewevVar6.b |= 128;
            ewevVar6.j = strE;
        }
        this.b.f(this.a, (ewev) eweqVarA.build());
    }

    @Override // defpackage.ebjc
    public final void bi(ebjr ebjrVar, ebjj ebjjVar, int i) {
        if (ebjjVar != null) {
            this.b.f(this.a, e(ebjrVar, ebjjVar, 4, f(i)));
            return;
        }
        eweq eweqVarA = a(ebjrVar);
        deyw deywVar = this.b;
        Context context = this.a;
        eweqVarA.copyOnWrite();
        ewev ewevVar = (ewev) eweqVarA.instance;
        ewev ewevVar2 = ewev.a;
        ewevVar.n = 3;
        ewevVar.b |= 1024;
        int iF = f(i);
        eweqVarA.copyOnWrite();
        ewev ewevVar3 = (ewev) eweqVarA.instance;
        ewevVar3.p = iF - 1;
        ewevVar3.b |= 4096;
        deywVar.f(context, (ewev) eweqVarA.build());
    }

    @Override // defpackage.ebjc
    public final /* synthetic */ void aS() {
    }

    @Override // defpackage.ebjc
    public final /* synthetic */ void aL(ebjj ebjjVar) {
    }

    @Override // defpackage.ebjc
    public final /* synthetic */ void bk(ebjm ebjmVar) {
    }
}
