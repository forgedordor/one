package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cnln {
    public static ezok a() {
        ezok ezokVar = (ezok) ezol.a.createBuilder();
        ezokVar.copyOnWrite();
        ((ezol) ezokVar.instance).d = "RCS";
        return ezokVar;
    }

    public static ezol b(aubq aubqVar) {
        aubp aubpVarB = aubp.b(aubqVar.c);
        if (aubpVarB == null) {
            aubpVarB = aubp.UNKNOWN_TYPE;
        }
        int iOrdinal = aubpVarB.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                ezok ezokVarA = a();
                String str = aubqVar.d;
                ezokVarA.copyOnWrite();
                ezol ezolVar = (ezol) ezokVarA.instance;
                ezol ezolVar2 = ezol.a;
                str.getClass();
                ezolVar.c = str;
                felm felmVar = felm.PHONE_NUMBER;
                ezokVarA.copyOnWrite();
                ((ezol) ezokVarA.instance).b = felmVar.a();
                return (ezol) ezokVarA.build();
            }
            if (iOrdinal != 2) {
                if (iOrdinal == 3) {
                    ezok ezokVarA2 = a();
                    String str2 = aubqVar.d;
                    ezokVarA2.copyOnWrite();
                    ezol ezolVar3 = (ezol) ezokVarA2.instance;
                    ezol ezolVar4 = ezol.a;
                    str2.getClass();
                    ezolVar3.c = str2;
                    felm felmVar2 = felm.RCS_BOT;
                    ezokVarA2.copyOnWrite();
                    ((ezol) ezokVarA2.instance).b = felmVar2.a();
                    return (ezol) ezokVarA2.build();
                }
                if (iOrdinal != 4) {
                    throw new IllegalArgumentException("Invalid ChatEndpoint Type.");
                }
                ezok ezokVarA3 = a();
                String str3 = aubqVar.d;
                ezokVarA3.copyOnWrite();
                ezol ezolVar5 = (ezol) ezokVarA3.instance;
                ezol ezolVar6 = ezol.a;
                str3.getClass();
                ezolVar5.c = str3;
                felm felmVar3 = felm.EMERGENCY;
                ezokVarA3.copyOnWrite();
                ((ezol) ezokVarA3.instance).b = felmVar3.a();
                return (ezol) ezokVarA3.build();
            }
        }
        throw new IllegalArgumentException("Endpoint type is not supported.");
    }
}
