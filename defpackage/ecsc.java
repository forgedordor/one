package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ecsc {
    private final long a = System.nanoTime();

    public final evrj a() {
        long jNanoTime = System.nanoTime() - this.a;
        evri evriVar = (evri) evrj.a.createBuilder();
        evriVar.copyOnWrite();
        ((evrj) evriVar.instance).b = jNanoTime / 1000000000;
        evriVar.copyOnWrite();
        ((evrj) evriVar.instance).c = (int) (jNanoTime % 1000000000);
        return (evrj) evriVar.build();
    }

    public final evvp b() {
        evvo evvoVar = (evvo) evvp.a.createBuilder();
        evvoVar.copyOnWrite();
        evvp evvpVar = (evvp) evvoVar.instance;
        long j = this.a;
        evvpVar.b = j / 1000000000;
        evvoVar.copyOnWrite();
        ((evvp) evvoVar.instance).c = (int) (j % 1000000000);
        return (evvp) evvoVar.build();
    }
}
