package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class czel {
    static final cczv a = cdag.p(188246326);
    static final emps b;
    public static final /* synthetic */ int c = 0;

    static {
        empr emprVar = (empr) emps.a.createBuilder();
        emrl emrlVar = (emrl) emrt.a.createBuilder();
        emrlVar.copyOnWrite();
        emrt emrtVar = (emrt) emrlVar.instance;
        emrtVar.i = 3;
        emrtVar.b |= 64;
        emrt emrtVar2 = (emrt) emrlVar.build();
        emprVar.copyOnWrite();
        emps empsVar = (emps) emprVar.instance;
        emrtVar2.getClass();
        empsVar.c = emrtVar2;
        empsVar.b |= 1;
        b = (emps) emprVar.build();
    }

    public static long a(long j, int i) {
        return i * Math.round(j / i);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void b(android.net.Uri r6, defpackage.empq r7) {
        /*
            Method dump skipped, instructions count: 304
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.czel.b(android.net.Uri, empq):void");
    }

    public static void c(emoo emooVar, long j) {
        emoq emoqVar = (emoq) emor.a.createBuilder();
        emoqVar.copyOnWrite();
        emor emorVar = (emor) emoqVar.instance;
        emorVar.b |= 1;
        emorVar.c = (int) (j / 1000);
        emooVar.copyOnWrite();
        emop emopVar = (emop) emooVar.instance;
        emor emorVar2 = (emor) emoqVar.build();
        emop emopVar2 = emop.a;
        emorVar2.getClass();
        emopVar.f = emorVar2;
        emopVar.e = 207;
    }

    static void d(emoo emooVar, boolean z) {
        empl emplVar;
        if (z) {
            empj empjVar = (empj) empl.a.createBuilder();
            empjVar.copyOnWrite();
            empl emplVar2 = (empl) empjVar.instance;
            emplVar2.c = 1;
            emplVar2.b = 1 | emplVar2.b;
            emplVar = (empl) empjVar.build();
        } else {
            emplVar = empl.a;
        }
        emooVar.copyOnWrite();
        emop emopVar = (emop) emooVar.instance;
        emop emopVar2 = emop.a;
        emplVar.getClass();
        emopVar.d = emplVar;
        emopVar.c = 102;
    }

    public static void e(emoo emooVar) {
        empn empnVar = empn.a;
        emooVar.copyOnWrite();
        emop emopVar = (emop) emooVar.instance;
        emop emopVar2 = emop.a;
        empnVar.getClass();
        emopVar.f = empnVar;
        emopVar.e = 204;
    }

    public static void f(elha elhaVar) {
        throw new IllegalArgumentException("Invalid source, number representation: " + elhaVar.a());
    }
}
