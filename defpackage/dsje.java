package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dsje extends dshi {
    static final ejvj a = new dsja();
    static final ejvj b = new dsiw();
    static final ejvr c = new dsjd();
    static final ejvj d = new dsip();
    static final ejvj e = new dsjk();
    static final ejvj f = new dsiq();
    static final ejvr g = new dsjc();
    static final ejvj h = new dsio();

    @Override // defpackage.dshi
    public final void a(evmf evmfVar, etlp etlpVar) {
        ejvj ejvjVar = d;
        evly evlyVar = evmfVar.k;
        if (evlyVar == null) {
            evlyVar = evly.a;
        }
        evlw evlwVarB = evlw.b(evlyVar.e);
        if (evlwVarB == null) {
            evlwVarB = evlw.ALIGNMENT_UNSPECIFIED;
        }
        etlm etlmVar = (etlm) ejvjVar.fM(evlwVarB);
        etlpVar.copyOnWrite();
        etly etlyVar = (etly) etlpVar.instance;
        etly etlyVar2 = etly.a;
        etlyVar.j = etlmVar.d;
        etlyVar.b |= 16;
    }

    @Override // defpackage.dshi
    public final void b(evmf evmfVar, etlp etlpVar) {
        ejvj ejvjVar = b;
        evly evlyVar = evmfVar.k;
        if (evlyVar == null) {
            evlyVar = evly.a;
        }
        evlu evluVar = evlyVar.d;
        if (evluVar == null) {
            evluVar = evlu.a;
        }
        evlr evlrVarB = evlr.b(evluVar.g);
        if (evlrVarB == null) {
            evlrVarB = evlr.BUTTONS_LAYOUT_UNSPECIFIED;
        }
        etlo etloVar = (etlo) ejvjVar.fM(evlrVarB);
        etlpVar.copyOnWrite();
        etly etlyVar = (etly) etlpVar.instance;
        etly etlyVar2 = etly.a;
        etlyVar.i = etloVar.d;
        etlyVar.b |= 8;
    }

    @Override // defpackage.dshi
    public final void c(evmf evmfVar, etlp etlpVar) {
        eybi eybiVar = evmfVar.g;
        if (eybiVar == null) {
            eybiVar = eybi.a;
        }
        String str = eybiVar.b;
        etlpVar.copyOnWrite();
        etly etlyVar = (etly) etlpVar.instance;
        etly etlyVar2 = etly.a;
        str.getClass();
        etlyVar.b |= 2;
        etlyVar.f = str;
    }

    @Override // defpackage.dshi
    public final void d(evmf evmfVar, etlp etlpVar) {
        ejvr ejvrVar = c;
        evly evlyVar = evmfVar.k;
        if (evlyVar == null) {
            evlyVar = evly.a;
        }
        evlu evluVar = evlyVar.d;
        if (evluVar == null) {
            evluVar = evlu.a;
        }
        evlt evltVarB = evlt.b(evluVar.k);
        if (evltVarB == null) {
            evltVarB = evlt.BUTTONS_ORDER_UNSPECIFIED;
        }
        Object objApply = ejvrVar.apply(evltVarB);
        etlpVar.copyOnWrite();
        etly etlyVar = (etly) etlpVar.instance;
        etly etlyVar2 = etly.a;
        etlyVar.n = ((etlr) objApply).d;
        etlyVar.b |= 512;
    }

    @Override // defpackage.dshi
    public final void e(evmf evmfVar, etlp etlpVar) {
        eybi eybiVar = evmfVar.f;
        if (eybiVar == null) {
            eybiVar = eybi.a;
        }
        String str = eybiVar.b;
        etlpVar.copyOnWrite();
        etly etlyVar = (etly) etlpVar.instance;
        etly etlyVar2 = etly.a;
        str.getClass();
        etlyVar.b |= 1;
        etlyVar.e = str;
    }

    @Override // defpackage.dshi
    public final void f(evmf evmfVar, etlp etlpVar) {
        int i = evmfVar.c;
        if (i == 8) {
            etlpVar.copyOnWrite();
            etly etlyVar = (etly) etlpVar.instance;
            etly etlyVar2 = etly.a;
            etlyVar.l = 1;
            etlyVar.b |= 128;
            return;
        }
        if (i == 9) {
            etlpVar.copyOnWrite();
            etly etlyVar3 = (etly) etlpVar.instance;
            etly etlyVar4 = etly.a;
            etlyVar3.l = 2;
            etlyVar3.b |= 128;
            return;
        }
        etlpVar.copyOnWrite();
        etly etlyVar5 = (etly) etlpVar.instance;
        etly etlyVar6 = etly.a;
        etlyVar5.l = 0;
        etlyVar5.b |= 128;
    }

    @Override // defpackage.dshi
    public final void g(evmf evmfVar, etlp etlpVar) {
        int iA = evme.a(evmfVar.e);
        if (iA == 0) {
            iA = 1;
        }
        int i = iA - 1;
        if (i == 1) {
            etlpVar.copyOnWrite();
            etly etlyVar = (etly) etlpVar.instance;
            etly etlyVar2 = etly.a;
            etlyVar.m = 6;
            etlyVar.b |= 256;
            return;
        }
        if (i != 2) {
            etlpVar.copyOnWrite();
            etly etlyVar3 = (etly) etlpVar.instance;
            etly etlyVar4 = etly.a;
            etlyVar3.m = 0;
            etlyVar3.b |= 256;
            return;
        }
        etlpVar.copyOnWrite();
        etly etlyVar5 = (etly) etlpVar.instance;
        etly etlyVar6 = etly.a;
        etlyVar5.m = 4;
        etlyVar5.b |= 256;
    }

    @Override // defpackage.dshi
    public final void h(evmf evmfVar, etlp etlpVar) {
        if ((evmfVar.b & 16) != 0) {
            etnq etnqVar = (etnq) etnt.a.createBuilder();
            ejvj ejvjVar = a;
            evll evllVar = evmfVar.i;
            if (evllVar == null) {
                evllVar = evll.a;
            }
            etkx etkxVar = (etkx) ejvjVar.fM(evllVar);
            etnqVar.copyOnWrite();
            etnt etntVar = (etnt) etnqVar.instance;
            etkxVar.getClass();
            etntVar.d = etkxVar;
            etntVar.b |= 2;
            etns etnsVar = etns.LIGHT;
            etnqVar.copyOnWrite();
            etnt etntVar2 = (etnt) etnqVar.instance;
            etntVar2.c = etnsVar.d;
            etntVar2.b |= 1;
            if (evmfVar.c == 9) {
                etmb etmbVar = (etmb) etmc.a.createBuilder();
                String str = (evmfVar.c == 9 ? (evmc) evmfVar.d : evmc.a).b;
                etmbVar.copyOnWrite();
                etmc etmcVar = (etmc) etmbVar.instance;
                str.getClass();
                etmcVar.b = 1;
                etmcVar.c = str;
                etnqVar.copyOnWrite();
                etnt etntVar3 = (etnt) etnqVar.instance;
                etmc etmcVar2 = (etmc) etmbVar.build();
                etmcVar2.getClass();
                etntVar3.e = etmcVar2;
                etntVar3.b |= 4;
            }
            if (evmfVar.c == 8) {
                etmb etmbVar2 = (etmb) etmc.a.createBuilder();
                String str2 = (evmfVar.c == 8 ? (evmc) evmfVar.d : evmc.a).b;
                etmbVar2.copyOnWrite();
                etmc etmcVar3 = (etmc) etmbVar2.instance;
                str2.getClass();
                etmcVar3.b = 1;
                etmcVar3.c = str2;
                etnqVar.copyOnWrite();
                etnt etntVar4 = (etnt) etnqVar.instance;
                etmc etmcVar4 = (etmc) etmbVar2.build();
                etmcVar4.getClass();
                etntVar4.e = etmcVar4;
                etntVar4.b |= 4;
            }
            etlpVar.a(etnqVar);
        }
        if ((evmfVar.b & 32) != 0) {
            etnq etnqVar2 = (etnq) etnt.a.createBuilder();
            ejvj ejvjVar2 = a;
            evll evllVar2 = evmfVar.j;
            if (evllVar2 == null) {
                evllVar2 = evll.a;
            }
            etkx etkxVar2 = (etkx) ejvjVar2.fM(evllVar2);
            etnqVar2.copyOnWrite();
            etnt etntVar5 = (etnt) etnqVar2.instance;
            etkxVar2.getClass();
            etntVar5.d = etkxVar2;
            etntVar5.b |= 2;
            etns etnsVar2 = etns.DARK;
            etnqVar2.copyOnWrite();
            etnt etntVar6 = (etnt) etnqVar2.instance;
            etntVar6.c = etnsVar2.d;
            etntVar6.b |= 1;
            if (evmfVar.c == 9) {
                etmb etmbVar3 = (etmb) etmc.a.createBuilder();
                String str3 = (evmfVar.c == 9 ? (evmc) evmfVar.d : evmc.a).c;
                etmbVar3.copyOnWrite();
                etmc etmcVar5 = (etmc) etmbVar3.instance;
                str3.getClass();
                etmcVar5.b = 1;
                etmcVar5.c = str3;
                etnqVar2.copyOnWrite();
                etnt etntVar7 = (etnt) etnqVar2.instance;
                etmc etmcVar6 = (etmc) etmbVar3.build();
                etmcVar6.getClass();
                etntVar7.e = etmcVar6;
                etntVar7.b |= 4;
            }
            if (evmfVar.c == 8) {
                etmb etmbVar4 = (etmb) etmc.a.createBuilder();
                String str4 = (evmfVar.c == 8 ? (evmc) evmfVar.d : evmc.a).c;
                etmbVar4.copyOnWrite();
                etmc etmcVar7 = (etmc) etmbVar4.instance;
                str4.getClass();
                etmcVar7.b = 1;
                etmcVar7.c = str4;
                etnqVar2.copyOnWrite();
                etnt etntVar8 = (etnt) etnqVar2.instance;
                etmc etmcVar8 = (etmc) etmbVar4.build();
                etmcVar8.getClass();
                etntVar8.e = etmcVar8;
                etntVar8.b |= 4;
            }
            etlpVar.a(etnqVar2);
        }
    }

    @Override // defpackage.dshi
    public final void i(evmf evmfVar, etlp etlpVar) {
        evly evlyVar = evmfVar.k;
        if (evlyVar == null) {
            evlyVar = evly.a;
        }
        evlo evloVar = evlyVar.c;
        if (evloVar == null) {
            evloVar = evlo.a;
        }
        etlk etlkVar = etlk.a;
        etlj etljVar = (etlj) etlkVar.createBuilder();
        ejvj ejvjVar = h;
        evlj evljVarB = evlj.b(evloVar.g);
        if (evljVarB == null) {
            evljVarB = evlj.USER_ACTION_UNSPECIFIED;
        }
        etli etliVar = (etli) ejvjVar.fM(evljVarB);
        etljVar.copyOnWrite();
        etlk etlkVar2 = (etlk) etljVar.instance;
        etlkVar2.e = etliVar.f;
        etlkVar2.b |= 1;
        eybi eybiVar = evloVar.c;
        if (eybiVar == null) {
            eybiVar = eybi.a;
        }
        String str = eybiVar.b;
        etljVar.copyOnWrite();
        etlk etlkVar3 = (etlk) etljVar.instance;
        str.getClass();
        etlkVar3.b |= 2;
        etlkVar3.f = str;
        int i = true != evloVar.d ? 1 : 2;
        etljVar.copyOnWrite();
        etlk etlkVar4 = (etlk) etljVar.instance;
        etlkVar4.j = i - 1;
        etlkVar4.b |= 16;
        if ((evloVar.b & 4) != 0) {
            etnq etnqVar = (etnq) etnt.a.createBuilder();
            etns etnsVar = etns.LIGHT;
            etnqVar.copyOnWrite();
            etnt etntVar = (etnt) etnqVar.instance;
            etntVar.c = etnsVar.d;
            etntVar.b |= 1;
            ejvj ejvjVar2 = a;
            evll evllVar = evloVar.e;
            if (evllVar == null) {
                evllVar = evll.a;
            }
            etkx etkxVar = (etkx) ejvjVar2.fM(evllVar);
            etnqVar.copyOnWrite();
            etnt etntVar2 = (etnt) etnqVar.instance;
            etkxVar.getClass();
            etntVar2.d = etkxVar;
            etntVar2.b |= 2;
            etljVar.a(etnqVar);
        }
        if ((evloVar.b & 8) != 0) {
            etnq etnqVar2 = (etnq) etnt.a.createBuilder();
            etns etnsVar2 = etns.DARK;
            etnqVar2.copyOnWrite();
            etnt etntVar3 = (etnt) etnqVar2.instance;
            etntVar3.c = etnsVar2.d;
            etntVar3.b |= 1;
            ejvj ejvjVar3 = a;
            evll evllVar2 = evloVar.f;
            if (evllVar2 == null) {
                evllVar2 = evll.a;
            }
            etkx etkxVar2 = (etkx) ejvjVar3.fM(evllVar2);
            etnqVar2.copyOnWrite();
            etnt etntVar4 = (etnt) etnqVar2.instance;
            etkxVar2.getClass();
            etntVar4.d = etkxVar2;
            etntVar4.b |= 2;
            etljVar.a(etnqVar2);
        }
        etlpVar.b((etlk) etljVar.build());
        evly evlyVar2 = evmfVar.k;
        if (((evlyVar2 == null ? evly.a : evlyVar2).b & 2) != 0) {
            if (evlyVar2 == null) {
                evlyVar2 = evly.a;
            }
            evlu evluVar = evlyVar2.d;
            if (evluVar == null) {
                evluVar = evlu.a;
            }
            etlj etljVar2 = (etlj) etlkVar.createBuilder();
            evlj evljVarB2 = evlj.b(evluVar.j);
            if (evljVarB2 == null) {
                evljVarB2 = evlj.USER_ACTION_UNSPECIFIED;
            }
            etli etliVar2 = (etli) ejvjVar.fM(evljVarB2);
            etljVar2.copyOnWrite();
            etlk etlkVar5 = (etlk) etljVar2.instance;
            etlkVar5.e = etliVar2.f;
            etlkVar5.b |= 1;
            eybi eybiVar2 = evluVar.e;
            if (eybiVar2 == null) {
                eybiVar2 = eybi.a;
            }
            String str2 = eybiVar2.b;
            etljVar2.copyOnWrite();
            etlk etlkVar6 = (etlk) etljVar2.instance;
            str2.getClass();
            etlkVar6.b |= 2;
            etlkVar6.f = str2;
            int i2 = true != evluVar.f ? 1 : 2;
            etljVar2.copyOnWrite();
            etlk etlkVar7 = (etlk) etljVar2.instance;
            etlkVar7.j = i2 - 1;
            etlkVar7.b |= 16;
            if ((evluVar.b & 8) != 0) {
                etnq etnqVar3 = (etnq) etnt.a.createBuilder();
                etns etnsVar3 = etns.LIGHT;
                etnqVar3.copyOnWrite();
                etnt etntVar5 = (etnt) etnqVar3.instance;
                etntVar5.c = etnsVar3.d;
                etntVar5.b |= 1;
                ejvj ejvjVar4 = a;
                evll evllVar3 = evluVar.h;
                if (evllVar3 == null) {
                    evllVar3 = evll.a;
                }
                etkx etkxVar3 = (etkx) ejvjVar4.fM(evllVar3);
                etnqVar3.copyOnWrite();
                etnt etntVar6 = (etnt) etnqVar3.instance;
                etkxVar3.getClass();
                etntVar6.d = etkxVar3;
                etntVar6.b |= 2;
                etljVar2.a(etnqVar3);
            }
            if ((evluVar.b & 16) != 0) {
                etnq etnqVar4 = (etnq) etnt.a.createBuilder();
                etns etnsVar4 = etns.DARK;
                etnqVar4.copyOnWrite();
                etnt etntVar7 = (etnt) etnqVar4.instance;
                etntVar7.c = etnsVar4.d;
                etntVar7.b |= 1;
                ejvj ejvjVar5 = a;
                evll evllVar4 = evluVar.i;
                if (evllVar4 == null) {
                    evllVar4 = evll.a;
                }
                etkx etkxVar4 = (etkx) ejvjVar5.fM(evllVar4);
                etnqVar4.copyOnWrite();
                etnt etntVar8 = (etnt) etnqVar4.instance;
                etkxVar4.getClass();
                etntVar8.d = etkxVar4;
                etntVar8.b |= 2;
                etljVar2.a(etnqVar4);
            }
            if (evluVar.c == 3) {
                etjz etjzVar = (etjz) f.fM((evno) evluVar.d);
                etljVar2.copyOnWrite();
                etlk etlkVar8 = (etlk) etljVar2.instance;
                etjzVar.getClass();
                etlkVar8.d = etjzVar;
                etlkVar8.c = 8;
            }
            if (evluVar.c == 14) {
                Object objApply = g.apply((evnw) evluVar.d);
                etljVar2.copyOnWrite();
                etlk etlkVar9 = (etlk) etljVar2.instance;
                objApply.getClass();
                etlkVar9.d = objApply;
                etlkVar9.c = 14;
            }
            etlk etlkVar10 = (etlk) etljVar2.build();
            int i3 = evluVar.k;
            evlt evltVarB = evlt.b(i3);
            if (evltVarB == null) {
                evltVarB = evlt.BUTTONS_ORDER_UNSPECIFIED;
            }
            if (evltVarB != evlt.ACTION_BUTTON_PRIMARY) {
                evlt evltVarB2 = evlt.b(i3);
                if (evltVarB2 == null) {
                    evltVarB2 = evlt.BUTTONS_ORDER_UNSPECIFIED;
                }
                if (evltVarB2 != evlt.BUTTONS_ORDER_UNSPECIFIED) {
                    etlpVar.b(etlkVar10);
                    return;
                }
            }
            etlpVar.copyOnWrite();
            etly etlyVar = (etly) etlpVar.instance;
            etly etlyVar2 = etly.a;
            etlkVar10.getClass();
            etlyVar.a();
            etlyVar.h.add(0, etlkVar10);
        }
    }
}
