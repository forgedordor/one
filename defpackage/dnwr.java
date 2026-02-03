package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dnwr implements dlwd, dlvz {
    public static final dnwn h(dnvg dnvgVar) {
        dnvgVar.getClass();
        dnwm dnwmVar = (dnwm) dnwn.a.createBuilder();
        dnwmVar.getClass();
        dnwmVar.copyOnWrite();
        dnwn dnwnVar = (dnwn) dnwmVar.instance;
        dnwnVar.b |= 1;
        dnwnVar.c = dnvgVar.a;
        String str = dnvgVar.c;
        if (str != null) {
            dnwmVar.copyOnWrite();
            dnwn dnwnVar2 = (dnwn) dnwmVar.instance;
            dnwnVar2.b |= 4;
            dnwnVar2.e = str;
        }
        dnwo.b(dolw.b(dnvgVar), dnwmVar);
        boolean z = dnvgVar.d;
        dnwmVar.copyOnWrite();
        dnwn dnwnVar3 = (dnwn) dnwmVar.instance;
        dnwnVar3.b |= 8;
        dnwnVar3.f = z;
        return dnwo.a(dnwmVar);
    }

    public static final dnvg i(dnwn dnwnVar) {
        dnwp dnwpVar = new dnwp();
        j(dnwpVar, dnwnVar);
        return dnwpVar.b();
    }

    private static final void j(dnwp dnwpVar, dnwn dnwnVar) {
        if ((dnwnVar.b & 2) != 0) {
            String str = dnwnVar.c;
            str.getClass();
            dnwpVar.m(str);
            if ((dnwnVar.b & 4) != 0) {
                String str2 = dnwnVar.e;
                str2.getClass();
                dnwpVar.n(str2);
            }
            String str3 = dnwnVar.d;
            str3.getClass();
            dnwpVar.t(str3);
            return;
        }
        String str4 = dnwnVar.c;
        str4.getClass();
        dnwpVar.m(str4);
        if ((dnwnVar.b & 4) != 0) {
            String str5 = dnwnVar.e;
            str5.getClass();
            dnwpVar.n(str5);
        }
        dokx dokxVar = dnwnVar.g;
        if (dokxVar == null) {
            dokxVar = dokx.a;
        }
        donb donbVar = dokxVar.g;
        if (donbVar == null) {
            donbVar = donb.a;
        }
        donbVar.getClass();
        donc.c(dnwpVar, donbVar, new fdat() { // from class: dnwq
            @Override // defpackage.fdat
            public final Object a(Object obj, Object obj2) {
                dnwp dnwpVar2 = (dnwp) obj;
                dona donaVar = (dona) obj2;
                dnwpVar2.getClass();
                donaVar.getClass();
                donc.d(dnwpVar2, donaVar);
                return dnwpVar2;
            }
        });
        dokx dokxVar2 = dnwnVar.g;
        if (dokxVar2 == null) {
            dokxVar2 = dokx.a;
        }
        dltt dlttVar = dokxVar2.f;
        if (dlttVar == null) {
            dlttVar = dltt.a;
        }
        dlttVar.getClass();
        dltz.d(dnwpVar, dlttVar);
        dnwpVar.p(dnwnVar.f);
    }

    @Override // defpackage.dlvz
    public final /* synthetic */ dltc a(evuh evuhVar) {
        dnwn dnwnVar = (dnwn) evuhVar;
        dnwnVar.getClass();
        if ((dnwnVar.b & 2) == 0) {
            dokx dokxVar = dnwnVar.g;
            if (dokxVar == null) {
                dokxVar = dokx.a;
            }
            dokxVar.getClass();
            return dolw.a(dokxVar);
        }
        dokg dokgVar = (dokg) dokj.a.createBuilder();
        dokgVar.getClass();
        doke dokeVar = (doke) dokf.a.createBuilder();
        dokeVar.getClass();
        dokz.b(doky.a(dokeVar), dokgVar);
        return new dnvr(dokz.a(dokgVar));
    }

    @Override // defpackage.dlvz
    public final /* bridge */ /* synthetic */ dlvw b() {
        return new dnwp();
    }

    @Override // defpackage.dlvz
    public final /* bridge */ /* synthetic */ evuh c(evqs evqsVar) {
        dnwn dnwnVar = (dnwn) evsn.parseFrom(dnwn.a, evqsVar);
        dnwnVar.getClass();
        return dnwnVar;
    }

    @Override // defpackage.dlwd
    public final /* bridge */ /* synthetic */ evuh d(dltd dltdVar) {
        return h((dnvg) dltdVar);
    }

    @Override // defpackage.dlvz
    public final /* synthetic */ Object e(evqs evqsVar, fcxy fcxyVar) {
        return f(c(evqsVar), fcxyVar);
    }

    @Override // defpackage.dlvz
    public final /* synthetic */ Object f(evuh evuhVar, fcxy fcxyVar) {
        return dlvx.b(this, evuhVar, fcxyVar);
    }

    @Override // defpackage.dlvz
    public final /* bridge */ /* synthetic */ Object g(dlvw dlvwVar, evuh evuhVar) {
        j((dnwp) dlvwVar, (dnwn) evuhVar);
        return fctx.a;
    }
}
