package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dztk {
    public static feft a(feft feftVar, long j) {
        fefs fefsVar = (fefs) feftVar.toBuilder();
        feft feftVar2 = (feft) fefsVar.instance;
        if ((feftVar2.b & 2) != 0) {
            long j2 = feftVar2.d - j;
            fefsVar.copyOnWrite();
            feft feftVar3 = (feft) fefsVar.instance;
            feftVar3.b |= 2;
            feftVar3.d = j2;
        }
        feft feftVar4 = (feft) fefsVar.instance;
        if ((feftVar4.b & 4) != 0) {
            long j3 = feftVar4.e - j;
            fefsVar.copyOnWrite();
            feft feftVar5 = (feft) fefsVar.instance;
            feftVar5.b |= 4;
            feftVar5.e = j3;
        }
        feft feftVar6 = (feft) fefsVar.instance;
        if ((feftVar6.b & 8) != 0) {
            long j4 = feftVar6.f - j;
            fefsVar.copyOnWrite();
            feft feftVar7 = (feft) fefsVar.instance;
            feftVar7.b |= 8;
            feftVar7.f = j4;
        }
        return (feft) fefsVar.build();
    }
}
