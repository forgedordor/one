package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class ckwv {
    private final aimw a;
    private final cmum b;

    public ckwv(aimw aimwVar, cmum cmumVar) {
        this.a = aimwVar;
        this.b = cmumVar;
    }

    public final embx a(int i) {
        embv embvVar = (embv) embx.a.createBuilder();
        elpy elpyVarA = this.a.a(i);
        embvVar.copyOnWrite();
        embx embxVar = (embx) embvVar.instance;
        embxVar.c = elpyVarA;
        embxVar.b |= 1;
        int iB = this.b.a(i).b();
        embvVar.copyOnWrite();
        embx embxVar2 = (embx) embvVar.instance;
        embxVar2.b |= 2;
        embxVar2.d = iB;
        int iIntValue = ((Integer) ckwu.c.e()).intValue();
        embvVar.copyOnWrite();
        embx embxVar3 = (embx) embvVar.instance;
        embxVar3.b |= 4;
        embxVar3.e = iIntValue;
        embvVar.copyOnWrite();
        embx embxVar4 = (embx) embvVar.instance;
        embxVar4.f = 1;
        embxVar4.b |= 8;
        return (embx) embvVar.build();
    }
}
