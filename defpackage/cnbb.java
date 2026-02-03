package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cnbb extends cnaa {
    @Override // defpackage.cnaa
    public final void c(ezol ezolVar, aubn aubnVar) {
        felm felmVarB = felm.b(ezolVar.b);
        if (felmVarB == null) {
            felmVarB = felm.UNRECOGNIZED;
        }
        int iOrdinal = felmVarB.ordinal();
        if (iOrdinal == 1) {
            aubp aubpVar = aubp.PHONE;
            aubnVar.copyOnWrite();
            aubq aubqVar = (aubq) aubnVar.instance;
            aubq aubqVar2 = aubq.a;
            aubqVar.c = aubpVar.f;
            aubqVar.b |= 1;
            return;
        }
        if (iOrdinal == 10) {
            aubp aubpVar2 = aubp.BOT;
            aubnVar.copyOnWrite();
            aubq aubqVar3 = (aubq) aubnVar.instance;
            aubq aubqVar4 = aubq.a;
            aubqVar3.c = aubpVar2.f;
            aubqVar3.b |= 1;
            return;
        }
        if (iOrdinal == 41) {
            aubp aubpVar3 = aubp.EMERGENCY;
            aubnVar.copyOnWrite();
            aubq aubqVar5 = (aubq) aubnVar.instance;
            aubq aubqVar6 = aubq.a;
            aubqVar5.c = aubpVar3.f;
            aubqVar5.b |= 1;
            return;
        }
        if (iOrdinal != 42) {
            felm felmVarB2 = felm.b(ezolVar.b);
            if (felmVarB2 == null) {
                felmVarB2 = felm.UNRECOGNIZED;
            }
            throw new IllegalArgumentException("Unknown enum value: " + felmVarB2.a());
        }
        aubp aubpVar4 = aubp.UNKNOWN_TYPE;
        aubnVar.copyOnWrite();
        aubq aubqVar7 = (aubq) aubnVar.instance;
        aubq aubqVar8 = aubq.a;
        aubqVar7.c = aubpVar4.f;
        aubqVar7.b |= 1;
    }

    @Override // defpackage.cnaa
    public final void d(aubq aubqVar, ezok ezokVar) {
        aubp aubpVarB = aubp.b(aubqVar.c);
        if (aubpVarB == null) {
            aubpVarB = aubp.UNKNOWN_TYPE;
        }
        int iOrdinal = aubpVarB.ordinal();
        if (iOrdinal == 0) {
            felm felmVar = felm.UNSET;
            ezokVar.copyOnWrite();
            ezol ezolVar = (ezol) ezokVar.instance;
            ezol ezolVar2 = ezol.a;
            ezolVar.b = felmVar.a();
            return;
        }
        if (iOrdinal == 1) {
            felm felmVar2 = felm.PHONE_NUMBER;
            ezokVar.copyOnWrite();
            ezol ezolVar3 = (ezol) ezokVar.instance;
            ezol ezolVar4 = ezol.a;
            ezolVar3.b = felmVar2.a();
            return;
        }
        if (iOrdinal == 3) {
            felm felmVar3 = felm.RCS_BOT;
            ezokVar.copyOnWrite();
            ezol ezolVar5 = (ezol) ezokVar.instance;
            ezol ezolVar6 = ezol.a;
            ezolVar5.b = felmVar3.a();
            return;
        }
        if (iOrdinal != 4) {
            aubp aubpVarB2 = aubp.b(aubqVar.c);
            if (aubpVarB2 == null) {
                aubpVarB2 = aubp.UNKNOWN_TYPE;
            }
            throw new IllegalArgumentException("Unknown enum value: " + aubpVarB2.f);
        }
        felm felmVar4 = felm.EMERGENCY;
        ezokVar.copyOnWrite();
        ezol ezolVar7 = (ezol) ezokVar.instance;
        ezol ezolVar8 = ezol.a;
        ezolVar7.b = felmVar4.a();
    }

    @Override // defpackage.cnaa
    public final ezok e() {
        return cnln.a();
    }
}
