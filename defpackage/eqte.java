package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eqte {
    public static final ermh a = a(16);
    public static final ermh b;

    static {
        a(32);
        c(16);
        c(32);
        b = b(16, 16, erlk.SHA256);
        b(32, 32, erlk.SHA256);
        ermg ermgVar = (ermg) ermh.a.createBuilder();
        erfp erfpVar = equx.a;
        ermgVar.copyOnWrite();
        ((ermh) ermgVar.instance).b = "type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key";
        ermy ermyVar = ermy.TINK;
        ermgVar.copyOnWrite();
        ((ermh) ermgVar.instance).d = ermyVar.a();
        ermg ermgVar2 = (ermg) ermh.a.createBuilder();
        erfp erfpVar2 = eqws.a;
        ermgVar2.copyOnWrite();
        ((ermh) ermgVar2.instance).b = "type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key";
        ermy ermyVar2 = ermy.TINK;
        ermgVar2.copyOnWrite();
        ((ermh) ermgVar2.instance).d = ermyVar2.a();
    }

    public static ermh a(int i) {
        erjr erjrVar = (erjr) erjs.a.createBuilder();
        erjrVar.copyOnWrite();
        ((erjs) erjrVar.instance).b = i;
        erjs erjsVar = (erjs) erjrVar.build();
        ermg ermgVar = (ermg) ermh.a.createBuilder();
        evqs byteString = erjsVar.toByteString();
        ermgVar.copyOnWrite();
        ((ermh) ermgVar.instance).c = byteString;
        erfp erfpVar = equh.a;
        ermgVar.copyOnWrite();
        ((ermh) ermgVar.instance).b = "type.googleapis.com/google.crypto.tink.AesGcmKey";
        ermy ermyVar = ermy.TINK;
        ermgVar.copyOnWrite();
        ((ermh) ermgVar.instance).d = ermyVar.a();
        return (ermh) ermgVar.build();
    }

    public static ermh b(int i, int i2, erlk erlkVar) {
        eriz erizVar = (eriz) erja.a.createBuilder();
        erjb erjbVar = (erjb) erjc.a.createBuilder();
        erjbVar.copyOnWrite();
        ((erjc) erjbVar.instance).b = 16;
        erjc erjcVar = (erjc) erjbVar.build();
        erizVar.copyOnWrite();
        erja erjaVar = (erja) erizVar.instance;
        erjcVar.getClass();
        erjaVar.c = erjcVar;
        erjaVar.b |= 1;
        erizVar.copyOnWrite();
        ((erja) erizVar.instance).d = i;
        erja erjaVar2 = (erja) erizVar.build();
        erln erlnVar = (erln) erlo.a.createBuilder();
        erlp erlpVar = (erlp) erlq.a.createBuilder();
        erlpVar.copyOnWrite();
        ((erlq) erlpVar.instance).b = erlkVar.a();
        erlpVar.copyOnWrite();
        ((erlq) erlpVar.instance).c = i2;
        erlq erlqVar = (erlq) erlpVar.build();
        erlnVar.copyOnWrite();
        erlo erloVar = (erlo) erlnVar.instance;
        erlqVar.getClass();
        erloVar.c = erlqVar;
        erloVar.b |= 1;
        erlnVar.copyOnWrite();
        ((erlo) erlnVar.instance).d = 32;
        erlo erloVar2 = (erlo) erlnVar.build();
        erip eripVar = (erip) eriq.a.createBuilder();
        eripVar.copyOnWrite();
        eriq eriqVar = (eriq) eripVar.instance;
        erjaVar2.getClass();
        eriqVar.c = erjaVar2;
        eriqVar.b |= 1;
        eripVar.copyOnWrite();
        eriq eriqVar2 = (eriq) eripVar.instance;
        erloVar2.getClass();
        eriqVar2.d = erloVar2;
        eriqVar2.b |= 2;
        eriq eriqVar3 = (eriq) eripVar.build();
        ermg ermgVar = (ermg) ermh.a.createBuilder();
        evqs byteString = eriqVar3.toByteString();
        ermgVar.copyOnWrite();
        ((ermh) ermgVar.instance).c = byteString;
        erfp erfpVar = eqtp.a;
        ermgVar.copyOnWrite();
        ((ermh) ermgVar.instance).b = "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey";
        ermy ermyVar = ermy.TINK;
        ermgVar.copyOnWrite();
        ((ermh) ermgVar.instance).d = ermyVar.a();
        return (ermh) ermgVar.build();
    }

    public static void c(int i) {
        erjf erjfVar = (erjf) erjg.a.createBuilder();
        erjfVar.copyOnWrite();
        ((erjg) erjfVar.instance).d = i;
        erjh erjhVar = (erjh) erji.a.createBuilder();
        erjhVar.copyOnWrite();
        ((erji) erjhVar.instance).b = 16;
        erji erjiVar = (erji) erjhVar.build();
        erjfVar.copyOnWrite();
        erjg erjgVar = (erjg) erjfVar.instance;
        erjiVar.getClass();
        erjgVar.c = erjiVar;
        erjgVar.b |= 1;
        erjg erjgVar2 = (erjg) erjfVar.build();
        ermg ermgVar = (ermg) ermh.a.createBuilder();
        evqs byteString = erjgVar2.toByteString();
        ermgVar.copyOnWrite();
        ((ermh) ermgVar.instance).c = byteString;
        erfp erfpVar = eqty.a;
        ermgVar.copyOnWrite();
        ((ermh) ermgVar.instance).b = "type.googleapis.com/google.crypto.tink.AesEaxKey";
        ermy ermyVar = ermy.TINK;
        ermgVar.copyOnWrite();
        ((ermh) ermgVar.instance).d = ermyVar.a();
    }
}
