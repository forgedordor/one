package defpackage;

import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final /* synthetic */ class bzhy {
    public static bzhn a(int i, String str, int i2, int i3) {
        byiu byiuVar = (byiu) byiv.a.createBuilder();
        byiuVar.copyOnWrite();
        byiv byivVar = (byiv) byiuVar.instance;
        byivVar.b |= 1;
        byivVar.c = i3;
        byiuVar.copyOnWrite();
        byiv byivVar2 = (byiv) byiuVar.instance;
        byivVar2.b |= 16;
        byivVar2.g = true;
        byiuVar.copyOnWrite();
        byiv byivVar3 = (byiv) byiuVar.instance;
        byivVar3.b |= 2;
        byivVar3.d = i;
        byiuVar.copyOnWrite();
        byiv byivVar4 = (byiv) byiuVar.instance;
        str.getClass();
        byivVar4.b |= 4;
        byivVar4.e = str;
        byiuVar.copyOnWrite();
        byiv byivVar5 = (byiv) byiuVar.instance;
        byivVar5.b |= 8;
        byivVar5.f = i2;
        byiv byivVar6 = (byiv) byiuVar.build();
        bzhi bzhiVar = new bzhi();
        bzhiVar.b(byivVar6);
        bzhiVar.a = bzio.a(byivVar6, Duration.ZERO);
        return bzhiVar.a();
    }
}
