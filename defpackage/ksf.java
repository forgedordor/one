package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ksf {
    static final boolean[] a = new boolean[3];

    static void a(ksa ksaVar, kqe kqeVar, krz krzVar) {
        krzVar.z = -1;
        krzVar.A = -1;
        int[] iArr = ksaVar.aA;
        if (iArr[0] != 2 && krzVar.aA[0] == 4) {
            kry kryVar = krzVar.T;
            int i = kryVar.f;
            int iJ = ksaVar.j();
            kry kryVar2 = krzVar.V;
            int i2 = iJ - kryVar2.f;
            kryVar.h = kqeVar.b(kryVar);
            kryVar2.h = kqeVar.b(kryVar2);
            kqeVar.f(kryVar.h, i);
            kqeVar.f(kryVar2.h, i2);
            krzVar.z = 2;
            krzVar.aj = i;
            int i3 = i2 - i;
            krzVar.af = i3;
            int i4 = krzVar.am;
            if (i3 < i4) {
                krzVar.af = i4;
            }
        }
        if (iArr[1] == 2 || krzVar.aA[1] != 4) {
            return;
        }
        kry kryVar3 = krzVar.U;
        int i5 = kryVar3.f;
        int iH = ksaVar.h();
        kry kryVar4 = krzVar.W;
        int i6 = iH - kryVar4.f;
        kryVar3.h = kqeVar.b(kryVar3);
        kryVar4.h = kqeVar.b(kryVar4);
        kqeVar.f(kryVar3.h, i5);
        kqeVar.f(kryVar4.h, i6);
        if (krzVar.al > 0 || krzVar.ar == 8) {
            kry kryVar5 = krzVar.X;
            kryVar5.h = kqeVar.b(kryVar5);
            kqeVar.f(kryVar5.h, krzVar.al + i5);
        }
        krzVar.A = 2;
        krzVar.ak = i5;
        int i7 = i6 - i5;
        krzVar.ag = i7;
        int i8 = krzVar.an;
        if (i7 < i8) {
            krzVar.ag = i8;
        }
    }

    public static final boolean b(int i, int i2) {
        return (i & i2) == i2;
    }
}
