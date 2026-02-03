package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
class dshq extends ejvj {
    @Override // defpackage.ejvj
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        ethf ethfVar = (ethf) obj;
        evhu evhuVar = (evhu) evhv.a.createBuilder();
        if ((ethfVar.b & 1) != 0) {
            String str = ethfVar.c;
            evhuVar.copyOnWrite();
            evhv evhvVar = (evhv) evhuVar.instance;
            str.getClass();
            evhvVar.b |= 1;
            evhvVar.c = str;
        }
        if ((ethfVar.b & 2) != 0) {
            long j = ethfVar.d;
            evhuVar.copyOnWrite();
            evhv evhvVar2 = (evhv) evhuVar.instance;
            evhvVar2.b |= 2;
            evhvVar2.d = j;
        }
        if ((ethfVar.b & 4) != 0) {
            long j2 = ethfVar.e;
            evhuVar.copyOnWrite();
            evhv evhvVar3 = (evhv) evhuVar.instance;
            evhvVar3.b |= 4;
            evhvVar3.e = j2;
        }
        if ((ethfVar.b & 8) != 0) {
            evqs evqsVar = ethfVar.f;
            evhuVar.copyOnWrite();
            evhv evhvVar4 = (evhv) evhuVar.instance;
            evqsVar.getClass();
            evhvVar4.b |= 8;
            evhvVar4.f = evqsVar;
        }
        return (evhv) evhuVar.build();
    }

    @Override // defpackage.ejvj
    protected final /* bridge */ /* synthetic */ Object b(Object obj) {
        evhv evhvVar = (evhv) obj;
        ethe etheVar = (ethe) ethf.a.createBuilder();
        if ((evhvVar.b & 1) != 0) {
            String str = evhvVar.c;
            etheVar.copyOnWrite();
            ethf ethfVar = (ethf) etheVar.instance;
            str.getClass();
            ethfVar.b |= 1;
            ethfVar.c = str;
        }
        if ((evhvVar.b & 2) != 0) {
            long j = evhvVar.d;
            etheVar.copyOnWrite();
            ethf ethfVar2 = (ethf) etheVar.instance;
            ethfVar2.b |= 2;
            ethfVar2.d = j;
        }
        if ((evhvVar.b & 4) != 0) {
            long j2 = evhvVar.e;
            etheVar.copyOnWrite();
            ethf ethfVar3 = (ethf) etheVar.instance;
            ethfVar3.b |= 4;
            ethfVar3.e = j2;
        }
        if ((evhvVar.b & 8) != 0) {
            evqs evqsVar = evhvVar.f;
            etheVar.copyOnWrite();
            ethf ethfVar4 = (ethf) etheVar.instance;
            evqsVar.getClass();
            ethfVar4.b |= 8;
            ethfVar4.f = evqsVar;
        }
        return (ethf) etheVar.build();
    }
}
