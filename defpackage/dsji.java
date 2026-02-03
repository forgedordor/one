package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dsji extends dshl {
    static final ejvj a = new dsja();
    static final ejvj b = new dsio();

    @Override // defpackage.dshl
    public final void a(evmo evmoVar, etod etodVar) {
        if ((evmoVar.b & 16) != 0) {
            etlj etljVar = (etlj) etlk.a.createBuilder();
            ejvj ejvjVar = b;
            evmj evmjVar = evmoVar.i;
            if (evmjVar == null) {
                evmjVar = evmj.a;
            }
            evlj evljVarB = evlj.b(evmjVar.d);
            if (evljVarB == null) {
                evljVarB = evlj.USER_ACTION_UNSPECIFIED;
            }
            etli etliVar = (etli) ejvjVar.fM(evljVarB);
            etljVar.copyOnWrite();
            etlk etlkVar = (etlk) etljVar.instance;
            etlkVar.e = etliVar.f;
            etlkVar.b |= 1;
            evmj evmjVar2 = evmoVar.i;
            if (evmjVar2 == null) {
                evmjVar2 = evmj.a;
            }
            eybi eybiVar = evmjVar2.c;
            if (eybiVar == null) {
                eybiVar = eybi.a;
            }
            String str = eybiVar.b;
            etljVar.copyOnWrite();
            etlk etlkVar2 = (etlk) etljVar.instance;
            str.getClass();
            etlkVar2.b |= 2;
            etlkVar2.f = str;
            evmj evmjVar3 = evmoVar.i;
            if (evmjVar3 == null) {
                evmjVar3 = evmj.a;
            }
            if ((evmjVar3.b & 4) != 0) {
                etnq etnqVar = (etnq) etnt.a.createBuilder();
                ejvj ejvjVar2 = a;
                evmj evmjVar4 = evmoVar.i;
                if (evmjVar4 == null) {
                    evmjVar4 = evmj.a;
                }
                evll evllVar = evmjVar4.e;
                if (evllVar == null) {
                    evllVar = evll.a;
                }
                etkx etkxVar = (etkx) ejvjVar2.fM(evllVar);
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
                etljVar.a(etnqVar);
            }
            evmj evmjVar5 = evmoVar.i;
            if (evmjVar5 == null) {
                evmjVar5 = evmj.a;
            }
            if ((evmjVar5.b & 8) != 0) {
                etnq etnqVar2 = (etnq) etnt.a.createBuilder();
                ejvj ejvjVar3 = a;
                evmj evmjVar6 = evmoVar.i;
                if (evmjVar6 == null) {
                    evmjVar6 = evmj.a;
                }
                evll evllVar2 = evmjVar6.f;
                if (evllVar2 == null) {
                    evllVar2 = evll.a;
                }
                etkx etkxVar2 = (etkx) ejvjVar3.fM(evllVar2);
                etnqVar2.copyOnWrite();
                etnt etntVar3 = (etnt) etnqVar2.instance;
                etkxVar2.getClass();
                etntVar3.d = etkxVar2;
                etntVar3.b |= 2;
                etns etnsVar2 = etns.DARK;
                etnqVar2.copyOnWrite();
                etnt etntVar4 = (etnt) etnqVar2.instance;
                etntVar4.c = etnsVar2.d;
                etntVar4.b |= 1;
                etljVar.a(etnqVar2);
            }
            etodVar.copyOnWrite();
            etoh etohVar = (etoh) etodVar.instance;
            etlk etlkVar3 = (etlk) etljVar.build();
            etoh etohVar2 = etoh.a;
            etlkVar3.getClass();
            etohVar.j = etlkVar3;
            etohVar.b |= 16;
        }
    }

    @Override // defpackage.dshl
    public final void b(evmo evmoVar, etod etodVar) {
        int i = evmoVar.b;
        if ((i & 4) != 0) {
            evll evllVar = evmoVar.g;
            if (evllVar == null) {
                evllVar = evll.a;
            }
            eyax eyaxVar = evllVar.e;
            if (eyaxVar == null) {
                eyaxVar = eyax.a;
            }
            etodVar.copyOnWrite();
            etoh etohVar = (etoh) etodVar.instance;
            etoh etohVar2 = etoh.a;
            eyaxVar.getClass();
            etohVar.e = eyaxVar;
            etohVar.b |= 1;
            return;
        }
        if ((i & 8) == 0) {
            etodVar.copyOnWrite();
            etoh etohVar3 = (etoh) etodVar.instance;
            etoh etohVar4 = etoh.a;
            etohVar3.e = null;
            etohVar3.b &= -2;
            return;
        }
        evll evllVar2 = evmoVar.h;
        if (evllVar2 == null) {
            evllVar2 = evll.a;
        }
        eyax eyaxVar2 = evllVar2.e;
        if (eyaxVar2 == null) {
            eyaxVar2 = eyax.a;
        }
        etodVar.copyOnWrite();
        etoh etohVar5 = (etoh) etodVar.instance;
        etoh etohVar6 = etoh.a;
        eyaxVar2.getClass();
        etohVar5.e = eyaxVar2;
        etohVar5.b |= 1;
    }

    @Override // defpackage.dshl
    public final void c(evmo evmoVar, etod etodVar) {
        if ((evmoVar.b & 2) != 0) {
            eybi eybiVar = evmoVar.f;
            if (eybiVar == null) {
                eybiVar = eybi.a;
            }
            String str = eybiVar.b;
            etodVar.copyOnWrite();
            etoh etohVar = (etoh) etodVar.instance;
            etoh etohVar2 = etoh.a;
            str.getClass();
            etohVar.b |= 8;
            etohVar.h = str;
        }
    }

    @Override // defpackage.dshl
    public final void d(evmo evmoVar, etod etodVar) {
        if ((evmoVar.b & 1) != 0) {
            eybi eybiVar = evmoVar.e;
            if (eybiVar == null) {
                eybiVar = eybi.a;
            }
            String str = eybiVar.b;
            etodVar.copyOnWrite();
            etoh etohVar = (etoh) etodVar.instance;
            etoh etohVar2 = etoh.a;
            str.getClass();
            etohVar.b |= 4;
            etohVar.g = str;
        }
    }

    @Override // defpackage.dshl
    public final void e(evmo evmoVar, etod etodVar) {
        if ((evmoVar.b & 4) != 0) {
            etnq etnqVar = (etnq) etnt.a.createBuilder();
            ejvj ejvjVar = a;
            evll evllVar = evmoVar.g;
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
            etodVar.a(etnqVar);
        }
        if ((evmoVar.b & 8) != 0) {
            etnq etnqVar2 = (etnq) etnt.a.createBuilder();
            ejvj ejvjVar2 = a;
            evll evllVar2 = evmoVar.h;
            if (evllVar2 == null) {
                evllVar2 = evll.a;
            }
            etkx etkxVar2 = (etkx) ejvjVar2.fM(evllVar2);
            etnqVar2.copyOnWrite();
            etnt etntVar3 = (etnt) etnqVar2.instance;
            etkxVar2.getClass();
            etntVar3.d = etkxVar2;
            etntVar3.b |= 2;
            etns etnsVar2 = etns.DARK;
            etnqVar2.copyOnWrite();
            etnt etntVar4 = (etnt) etnqVar2.instance;
            etntVar4.c = etnsVar2.d;
            etntVar4.b |= 1;
            etodVar.a(etnqVar2);
        }
    }

    @Override // defpackage.dshl
    public final void f(evmo evmoVar, etod etodVar) {
        if ((evmoVar.b & 32) != 0) {
            int iA = evmn.a(evmoVar.j);
            if (iA == 0) {
                iA = 1;
            }
            int i = iA - 1;
            int i2 = i != 0 ? i != 1 ? 3 : 2 : 1;
            etodVar.copyOnWrite();
            etoh etohVar = (etoh) etodVar.instance;
            etoh etohVar2 = etoh.a;
            etohVar.l = i2 - 1;
            etohVar.b |= 64;
        }
    }

    @Override // defpackage.dshl
    public final void g(evmo evmoVar, etod etodVar) {
        int i = evmoVar.b;
        if ((i & 4) != 0) {
            evll evllVar = evmoVar.g;
            if (evllVar == null) {
                evllVar = evll.a;
            }
            eyax eyaxVar = evllVar.c;
            if (eyaxVar == null) {
                eyaxVar = eyax.a;
            }
            etodVar.copyOnWrite();
            etoh etohVar = (etoh) etodVar.instance;
            etoh etohVar2 = etoh.a;
            eyaxVar.getClass();
            etohVar.f = eyaxVar;
            etohVar.b |= 2;
            return;
        }
        if ((i & 8) == 0) {
            etodVar.copyOnWrite();
            etoh etohVar3 = (etoh) etodVar.instance;
            etoh etohVar4 = etoh.a;
            etohVar3.f = null;
            etohVar3.b &= -3;
            return;
        }
        evll evllVar2 = evmoVar.h;
        if (evllVar2 == null) {
            evllVar2 = evll.a;
        }
        eyax eyaxVar2 = evllVar2.c;
        if (eyaxVar2 == null) {
            eyaxVar2 = eyax.a;
        }
        etodVar.copyOnWrite();
        etoh etohVar5 = (etoh) etodVar.instance;
        etoh etohVar6 = etoh.a;
        eyaxVar2.getClass();
        etohVar5.f = eyaxVar2;
        etohVar5.b |= 2;
    }
}
