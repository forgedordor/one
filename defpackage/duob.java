package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class duob {
    public static dtsd a(dtqs dtqsVar, int i) {
        dtsc dtscVar = (dtsc) dtsd.a.createBuilder();
        String str = dtqsVar.d;
        dtscVar.copyOnWrite();
        dtsd dtsdVar = (dtsd) dtscVar.instance;
        str.getClass();
        dtsdVar.b |= 1;
        dtsdVar.c = str;
        long j = dtqsVar.e;
        dtscVar.copyOnWrite();
        dtsd dtsdVar2 = (dtsd) dtscVar.instance;
        dtsdVar2.b |= 2;
        dtsdVar2.d = j;
        String strE = dutx.e(dtqsVar);
        dtscVar.copyOnWrite();
        dtsd dtsdVar3 = (dtsd) dtscVar.instance;
        strE.getClass();
        dtsdVar3.b |= 4;
        dtsdVar3.e = strE;
        dtscVar.copyOnWrite();
        dtsd dtsdVar4 = (dtsd) dtscVar.instance;
        dtsdVar4.f = i - 1;
        dtsdVar4.b |= 8;
        if ((dtqsVar.b & 32) != 0) {
            exyx exyxVar = dtqsVar.h;
            if (exyxVar == null) {
                exyxVar = exyx.a;
            }
            dtscVar.copyOnWrite();
            dtsd dtsdVar5 = (dtsd) dtscVar.instance;
            exyxVar.getClass();
            dtsdVar5.g = exyxVar;
            dtsdVar5.b |= 16;
        }
        return (dtsd) dtscVar.build();
    }
}
