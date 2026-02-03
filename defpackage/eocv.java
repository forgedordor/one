package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eocv {
    public static final /* synthetic */ eocu a(eoct eoctVar) {
        evsn evsnVarBuild = eoctVar.build();
        evsnVarBuild.getClass();
        return (eocu) evsnVarBuild;
    }

    public static final void b(int i, eoct eoctVar) {
        eoctVar.copyOnWrite();
        eocu eocuVar = (eocu) eoctVar.instance;
        eocu eocuVar2 = eocu.a;
        eocuVar.b |= 1;
        eocuVar.c = i;
    }

    public static final void c(String str, eoct eoctVar) {
        eoctVar.copyOnWrite();
        eocu eocuVar = (eocu) eoctVar.instance;
        eocu eocuVar2 = eocu.a;
        eocuVar.b |= 8;
        eocuVar.f = str;
    }

    public static final void d(int i, eoct eoctVar) {
        eoctVar.copyOnWrite();
        eocu eocuVar = (eocu) eoctVar.instance;
        eocu eocuVar2 = eocu.a;
        eocuVar.b |= 2;
        eocuVar.d = i;
    }

    public static final void e(int i, eoct eoctVar) {
        eoctVar.copyOnWrite();
        eocu eocuVar = (eocu) eoctVar.instance;
        eocu eocuVar2 = eocu.a;
        eocuVar.e = i - 1;
        eocuVar.b |= 4;
    }
}
