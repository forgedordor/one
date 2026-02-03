package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dcsz {
    private static dcsz b;
    public final String a;
    private final dcud c;

    private dcsz(Context context) {
        this.c = new dcud(context);
        this.a = context.getPackageName();
    }

    public static synchronized dcsz a(Context context) {
        if (b == null) {
            b = new dcsz(context);
        }
        return b;
    }

    public final void b(eyap eyapVar) {
        eyaq eyaqVar = (eyaq) eyar.a.createBuilder();
        eyaqVar.copyOnWrite();
        ((eyar) eyaqVar.instance).c = 484;
        eyaqVar.copyOnWrite();
        eyar eyarVar = (eyar) eyaqVar.instance;
        eyapVar.getClass();
        eyarVar.d = eyapVar;
        eyarVar.b |= 16777216;
        eyar eyarVar2 = (eyar) eyaqVar.build();
        felz felzVar = (felz) fema.a.createBuilder();
        felzVar.copyOnWrite();
        fema femaVar = (fema) felzVar.instance;
        eyarVar2.getClass();
        femaVar.c = eyarVar2;
        femaVar.b |= 1;
        this.c.a.j((fema) felzVar.build()).c();
    }

    public final void c(boolean z) {
        exzy exzyVar = (exzy) eyap.a.createBuilder();
        exzyVar.copyOnWrite();
        ((eyap) exzyVar.instance).d = felj.a(true != z ? 15 : 16);
        exzyVar.copyOnWrite();
        eyap eyapVar = (eyap) exzyVar.instance;
        String str = this.a;
        str.getClass();
        eyapVar.e = str;
        exzyVar.copyOnWrite();
        ((eyap) exzyVar.instance).f = feli.a(4);
        b((eyap) exzyVar.build());
    }

    public final void d(eyak eyakVar) {
        exzy exzyVar = (exzy) eyap.a.createBuilder();
        exzyVar.copyOnWrite();
        ((eyap) exzyVar.instance).d = felj.a(14);
        exzyVar.copyOnWrite();
        eyap eyapVar = (eyap) exzyVar.instance;
        String str = this.a;
        str.getClass();
        eyapVar.e = str;
        exzyVar.copyOnWrite();
        ((eyap) exzyVar.instance).f = feli.a(4);
        exzyVar.copyOnWrite();
        eyap eyapVar2 = (eyap) exzyVar.instance;
        eyakVar.getClass();
        eyapVar2.c = eyakVar;
        eyapVar2.b = 15;
        b((eyap) exzyVar.build());
    }

    public final void e(int i, int i2) {
        exzy exzyVar = (exzy) eyap.a.createBuilder();
        exzyVar.copyOnWrite();
        ((eyap) exzyVar.instance).d = felj.a(i);
        exzyVar.copyOnWrite();
        eyap eyapVar = (eyap) exzyVar.instance;
        String str = this.a;
        str.getClass();
        eyapVar.e = str;
        exzyVar.copyOnWrite();
        ((eyap) exzyVar.instance).f = feli.a(i2);
        b((eyap) exzyVar.build());
    }

    public final void f(int i) {
        e(i, 5);
    }

    public final void g(int i, ejwi ejwiVar) {
        exzy exzyVar = (exzy) eyap.a.createBuilder();
        exzyVar.copyOnWrite();
        ((eyap) exzyVar.instance).d = felj.a(i);
        exzyVar.copyOnWrite();
        eyap eyapVar = (eyap) exzyVar.instance;
        String str = this.a;
        str.getClass();
        eyapVar.e = str;
        exzyVar.copyOnWrite();
        ((eyap) exzyVar.instance).f = feli.a(3);
        if (ejwiVar.g()) {
            String str2 = (String) ejwiVar.c();
            exzyVar.copyOnWrite();
            ((eyap) exzyVar.instance).g = str2;
        }
        b((eyap) exzyVar.build());
    }

    public final void h(int i) {
        exzy exzyVar = (exzy) eyap.a.createBuilder();
        exzyVar.copyOnWrite();
        ((eyap) exzyVar.instance).d = felj.a(8);
        exzyVar.copyOnWrite();
        eyap eyapVar = (eyap) exzyVar.instance;
        String str = this.a;
        str.getClass();
        eyapVar.e = str;
        exzyVar.copyOnWrite();
        ((eyap) exzyVar.instance).f = feli.a(4);
        exzw exzwVar = (exzw) exzx.a.createBuilder();
        exzwVar.copyOnWrite();
        ((exzx) exzwVar.instance).b = i - 2;
        exzyVar.copyOnWrite();
        eyap eyapVar2 = (eyap) exzyVar.instance;
        exzx exzxVar = (exzx) exzwVar.build();
        exzxVar.getClass();
        eyapVar2.c = exzxVar;
        eyapVar2.b = 7;
        b((eyap) exzyVar.build());
    }

    public final void i(int i) {
        exzy exzyVar = (exzy) eyap.a.createBuilder();
        exzyVar.copyOnWrite();
        ((eyap) exzyVar.instance).d = felj.a(7);
        exzyVar.copyOnWrite();
        eyap eyapVar = (eyap) exzyVar.instance;
        String str = this.a;
        str.getClass();
        eyapVar.e = str;
        exzyVar.copyOnWrite();
        ((eyap) exzyVar.instance).f = feli.a(4);
        eyan eyanVar = (eyan) eyao.a.createBuilder();
        eyanVar.copyOnWrite();
        ((eyao) eyanVar.instance).b = i - 2;
        exzyVar.copyOnWrite();
        eyap eyapVar2 = (eyap) exzyVar.instance;
        eyao eyaoVar = (eyao) eyanVar.build();
        eyaoVar.getClass();
        eyapVar2.c = eyaoVar;
        eyapVar2.b = 6;
        b((eyap) exzyVar.build());
    }
}
