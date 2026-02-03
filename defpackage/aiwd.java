package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class aiwd {
    public static emza a(int i, int i2) {
        emyx emyxVar = (emyx) emza.a.createBuilder();
        emyxVar.copyOnWrite();
        emza emzaVar = (emza) emyxVar.instance;
        if (i == 0) {
            throw null;
        }
        emzaVar.c = i - 1;
        emzaVar.b |= 1;
        emyxVar.copyOnWrite();
        emza emzaVar2 = (emza) emyxVar.instance;
        emzaVar2.b |= 2;
        emzaVar2.d = i2;
        return (emza) emyxVar.build();
    }
}
