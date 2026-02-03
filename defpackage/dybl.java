package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dybl {
    public final dyau a;
    public final dywc b;
    public final exbg c;
    public final exbg d;
    public final dyyb e;
    public final dybk f;
    public final lbz g;

    public dybl(dyau dyauVar, dywc dywcVar, exbg exbgVar, dyyb dyybVar, dybk dybkVar, lbz lbzVar) {
        this.a = dyauVar;
        this.b = dywcVar;
        exbf exbfVar = (exbf) exbgVar.toBuilder();
        exbfVar.copyOnWrite();
        exbg exbgVar2 = (exbg) exbfVar.instance;
        exbgVar2.c = 3;
        exbgVar2.b |= 1;
        this.c = (exbg) exbfVar.build();
        exbf exbfVar2 = (exbf) exbgVar.toBuilder();
        exbfVar2.copyOnWrite();
        exbg exbgVar3 = (exbg) exbfVar2.instance;
        exbgVar3.c = 4;
        exbgVar3.b |= 1;
        this.d = (exbg) exbfVar2.build();
        this.e = dyybVar;
        this.f = dybkVar;
        this.g = lbzVar;
    }
}
