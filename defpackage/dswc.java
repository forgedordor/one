package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dswc {
    public static dsvb a(String str) {
        evsl evslVar = dswi.a;
        dswe dsweVar = (dswe) dswh.a.createBuilder();
        dsweVar.copyOnWrite();
        dswh dswhVar = (dswh) dsweVar.instance;
        dswhVar.d = 1;
        dswhVar.b |= 2;
        dsweVar.copyOnWrite();
        dswh dswhVar2 = (dswh) dsweVar.instance;
        str.getClass();
        dswhVar2.b = 1 | dswhVar2.b;
        dswhVar2.c = str;
        return new dsvb(evslVar, (dswh) dsweVar.build());
    }

    public static dsvb b() {
        evsl evslVar = dswi.a;
        dswe dsweVar = (dswe) dswh.a.createBuilder();
        dsweVar.copyOnWrite();
        dswh dswhVar = (dswh) dsweVar.instance;
        dswhVar.d = 3;
        dswhVar.b |= 2;
        return new dsvb(evslVar, (dswh) dsweVar.build());
    }
}
