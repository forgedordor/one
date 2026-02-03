package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dxut {
    static void a(evjl evjlVar, int i, boolean z) {
        if (((evjm) evjlVar.instance).b.size() <= 0) {
            if (!z) {
                return;
            }
            while (((evjm) evjlVar.instance).b.size() <= 0) {
                evjlVar.copyOnWrite();
                evjm evjmVar = (evjm) evjlVar.instance;
                evjmVar.a();
                evjmVar.b.g(0L);
            }
        }
        long jA = ((evjm) evjlVar.instance).b.a(0);
        long j = 1 << i;
        long j2 = z ? jA | j : (~j) & jA;
        evjlVar.copyOnWrite();
        evjm evjmVar2 = (evjm) evjlVar.instance;
        evjmVar2.a();
        evjmVar2.b.d(0, j2);
    }
}
