package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dxkx implements dxku {
    public final dxgy a;
    public final dxlf b;
    public final dxqt c;
    public final dxui d;
    public dxhe e;
    public String f;
    public String g;
    public String h;
    public evdg i;
    public long k;
    public String l;
    public String m;
    public Long n;
    public String o;
    public final int q;
    public final int r;
    public final int s;
    public int t;
    public int u;
    public final List j = new ArrayList();
    public Set p = fcvq.a;

    public dxkx(diep diepVar, int i, int i2, int i3, dxgy dxgyVar, dxlf dxlfVar, dxqt dxqtVar, dxui dxuiVar) {
        this.q = i;
        this.r = i2;
        this.s = i3;
        this.a = dxgyVar;
        this.b = dxlfVar;
        this.c = dxqtVar;
        this.d = dxuiVar;
        this.k = TimeUnit.MILLISECONDS.toMicros(diepVar.f().toEpochMilli());
    }

    @Override // defpackage.dxku
    public final /* bridge */ /* synthetic */ void a(evdg evdgVar) {
        evdgVar.getClass();
        this.i = evdgVar;
    }

    @Override // defpackage.dxku
    public final /* bridge */ /* synthetic */ void b(dxhe dxheVar) {
        if (dxheVar != null) {
            this.e = dxheVar;
            dxvi dxviVarS = dxheVar.s();
            if (dxviVarS instanceof dxvp) {
                this.f = dxheVar.n();
                this.o = ((dxvp) dxviVarS).a;
            } else if (dxviVarS instanceof dxvl) {
                this.o = dxheVar.k();
                this.g = ((dxvl) dxviVarS).a;
                this.h = dxheVar.l();
            } else if (dxviVarS instanceof dxvn) {
                this.n = Long.valueOf(dxheVar.d());
            }
        }
    }

    @Override // defpackage.dxku
    public final /* bridge */ /* synthetic */ void c(evjg evjgVar) {
        String str = evjgVar.e;
        str.getClass();
        if (str.length() > 0) {
            List list = this.j;
            evci evciVar = (evci) evcj.a.createBuilder();
            evciVar.getClass();
            String str2 = evjgVar.e;
            str2.getClass();
            evciVar.copyOnWrite();
            evcj evcjVar = (evcj) evciVar.instance;
            evcjVar.b |= 1;
            evcjVar.c = str2;
            long j = evjgVar.g;
            evciVar.copyOnWrite();
            evcj evcjVar2 = (evcj) evciVar.instance;
            evcjVar2.b |= 2;
            evcjVar2.d = j;
            long j2 = evjgVar.f;
            evciVar.copyOnWrite();
            evcj evcjVar3 = (evcj) evciVar.instance;
            evcjVar3.b |= 4;
            evcjVar3.e = j2;
            String str3 = (evjgVar.c == 12 ? (evin) evjgVar.d : evin.a).b;
            str3.getClass();
            evciVar.copyOnWrite();
            evcj evcjVar4 = (evcj) evciVar.instance;
            evcjVar4.b |= 8;
            evcjVar4.f = str3;
            evim evimVar = (evjgVar.c == 12 ? (evin) evjgVar.d : evin.a).c;
            if (evimVar == null) {
                evimVar = evim.a;
            }
            String str4 = evimVar.b;
            str4.getClass();
            evciVar.copyOnWrite();
            evcj evcjVar5 = (evcj) evciVar.instance;
            evcjVar5.b |= 16;
            evcjVar5.g = str4;
            evqs evqsVar = evjgVar.j;
            evqsVar.getClass();
            evciVar.copyOnWrite();
            evcj evcjVar6 = (evcj) evciVar.instance;
            evcjVar6.b |= 128;
            evcjVar6.h = evqsVar;
            evsn evsnVarBuild = evciVar.build();
            evsnVarBuild.getClass();
            list.add((evcj) evsnVarBuild);
        }
        Set set = this.p;
        evsx evsxVar = evjgVar.k;
        evsxVar.getClass();
        this.p = fcwm.g(set, fcva.av(evsxVar));
    }
}
