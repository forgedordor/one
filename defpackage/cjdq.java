package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cjdq extends cjcm {
    @Override // defpackage.cjcm
    public final void b(cjgt cjgtVar, aucg aucgVar) {
        cjjb cjjbVar = cjgtVar.d;
        if (cjjbVar == null) {
            cjjbVar = cjjb.a;
        }
        aubl aublVarA = cjdi.a(cjjbVar);
        aucgVar.copyOnWrite();
        auch auchVar = (auch) aucgVar.instance;
        auch auchVar2 = auch.a;
        aublVarA.getClass();
        auchVar.c = aublVarA;
        auchVar.b |= 1;
    }

    @Override // defpackage.cjcm
    public final void c(cjgt cjgtVar, aucg aucgVar) {
        cjgr cjgrVar = cjgtVar.e;
        if (cjgrVar == null) {
            cjgrVar = cjgr.a;
        }
        cjgr cjgrVar2 = cjgtVar.e;
        if (cjgrVar2 == null) {
            cjgrVar2 = cjgr.a;
        }
        cjju cjjuVar = cjgrVar2.d;
        if (cjjuVar == null) {
            cjjuVar = cjju.a;
        }
        aubq aubqVarA = cjel.a(cjgrVar, cjjuVar);
        aucgVar.copyOnWrite();
        auch auchVar = (auch) aucgVar.instance;
        auch auchVar2 = auch.a;
        aubqVarA.getClass();
        auchVar.d = aubqVarA;
        auchVar.b |= 2;
    }

    @Override // defpackage.cjcm
    public final void d(cjgt cjgtVar, aucg aucgVar) {
        if ((cjgtVar.b & 1) != 0) {
            evqe evqeVar = cjgtVar.c;
            if (evqeVar == null) {
                evqeVar = evqe.a;
            }
            evqs evqsVar = evqeVar.c;
            aucgVar.copyOnWrite();
            auch auchVar = (auch) aucgVar.instance;
            auch auchVar2 = auch.a;
            evqsVar.getClass();
            auchVar.b |= 4;
            auchVar.e = evqsVar;
        }
    }

    @Override // defpackage.cjcm
    public final void e(aucg aucgVar) {
        enyw enywVar = enyw.RCS_SMAPI;
        aucgVar.copyOnWrite();
        auch auchVar = (auch) aucgVar.instance;
        auch auchVar2 = auch.a;
        auchVar.f = enywVar.h;
        auchVar.b |= 8;
    }
}
