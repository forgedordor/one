package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dqzu {
    public static exca a() {
        exbz exbzVar = (exbz) exca.a.createBuilder();
        exbv exbvVar = (exbv) exbw.a.createBuilder();
        exbvVar.copyOnWrite();
        exbw exbwVar = (exbw) exbvVar.instance;
        exbwVar.b |= 2;
        exbwVar.f = true;
        exbzVar.copyOnWrite();
        exca excaVar = (exca) exbzVar.instance;
        exbw exbwVar2 = (exbw) exbvVar.build();
        exbwVar2.getClass();
        excaVar.c = exbwVar2;
        excaVar.b |= 1;
        return (exca) exbzVar.build();
    }
}
