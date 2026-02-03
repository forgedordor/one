package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class erbq {
    public static final ermh a;
    private static final byte[] b;

    static {
        byte[] bArr = new byte[0];
        b = bArr;
        a = a(erlh.NIST_P256, erlk.SHA256, erkf.UNCOMPRESSED, eqte.a, ermy.TINK, bArr);
        a(erlh.NIST_P256, erlk.SHA256, erkf.COMPRESSED, eqte.a, ermy.RAW, bArr);
        a(erlh.NIST_P256, erlk.SHA256, erkf.UNCOMPRESSED, eqte.b, ermy.TINK, bArr);
    }

    @Deprecated
    static ermh a(erlh erlhVar, erlk erlkVar, erkf erkfVar, ermh ermhVar, ermy ermyVar, byte[] bArr) {
        erkr erkrVar = (erkr) erks.a.createBuilder();
        erkz erkzVar = (erkz) erla.a.createBuilder();
        erkzVar.copyOnWrite();
        ((erla) erkzVar.instance).b = erlhVar.a();
        erkzVar.copyOnWrite();
        ((erla) erkzVar.instance).c = erlkVar.a();
        evqs evqsVarX = evqs.x(bArr);
        erkzVar.copyOnWrite();
        ((erla) erkzVar.instance).d = evqsVarX;
        erla erlaVar = (erla) erkzVar.build();
        erkp erkpVar = (erkp) erkq.a.createBuilder();
        erkpVar.copyOnWrite();
        erkq erkqVar = (erkq) erkpVar.instance;
        ermhVar.getClass();
        erkqVar.c = ermhVar;
        erkqVar.b |= 1;
        erkq erkqVar2 = (erkq) erkpVar.build();
        erkt erktVar = (erkt) erku.a.createBuilder();
        erktVar.copyOnWrite();
        erku erkuVar = (erku) erktVar.instance;
        erlaVar.getClass();
        erkuVar.c = erlaVar;
        erkuVar.b |= 1;
        erktVar.copyOnWrite();
        erku erkuVar2 = (erku) erktVar.instance;
        erkqVar2.getClass();
        erkuVar2.d = erkqVar2;
        erkuVar2.b |= 2;
        erktVar.copyOnWrite();
        ((erku) erktVar.instance).e = erkfVar.a();
        erku erkuVar3 = (erku) erktVar.build();
        erkrVar.copyOnWrite();
        erks erksVar = (erks) erkrVar.instance;
        erkuVar3.getClass();
        erksVar.c = erkuVar3;
        erksVar.b |= 1;
        erks erksVar2 = (erks) erkrVar.build();
        ermg ermgVar = (ermg) ermh.a.createBuilder();
        erfp erfpVar = erad.a;
        ermgVar.copyOnWrite();
        ((ermh) ermgVar.instance).b = "type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey";
        ermgVar.copyOnWrite();
        ((ermh) ermgVar.instance).d = ermyVar.a();
        evqs byteString = erksVar2.toByteString();
        ermgVar.copyOnWrite();
        ((ermh) ermgVar.instance).c = byteString;
        return (ermh) ermgVar.build();
    }
}
