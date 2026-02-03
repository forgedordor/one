package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class eve implements ikp {
    public final evf a;
    public final evf b;
    public final evf c;
    public final evf d;

    public eve(evf evfVar, evf evfVar2, evf evfVar3, evf evfVar4) {
        this.a = evfVar;
        this.b = evfVar2;
        this.c = evfVar3;
        this.d = evfVar4;
    }

    public static /* synthetic */ eve d(eve eveVar, evf evfVar, evf evfVar2, evf evfVar3, evf evfVar4, int i) {
        if ((i & 1) != 0) {
            evfVar = eveVar.a;
        }
        if ((i & 2) != 0) {
            evfVar2 = eveVar.b;
        }
        if ((i & 4) != 0) {
            evfVar3 = eveVar.c;
        }
        if ((i & 8) != 0) {
            evfVar4 = eveVar.d;
        }
        return eveVar.b(evfVar, evfVar2, evfVar3, evfVar4);
    }

    @Override // defpackage.ikp
    public final ijz a(long j, kji kjiVar, kio kioVar) {
        evf evfVar = this.d;
        evf evfVar2 = this.c;
        evf evfVar3 = this.b;
        float fA = this.a.a(j, kioVar);
        float fA2 = evfVar3.a(j, kioVar);
        float fA3 = evfVar2.a(j, kioVar);
        float fA4 = evfVar.a(j, kioVar);
        float f = fA + fA4;
        float fB = ihz.b(j);
        if (f > fB) {
            float f2 = fB / f;
            fA *= f2;
            fA4 *= f2;
        }
        float f3 = fA2 + fA3;
        if (f3 > fB) {
            float f4 = fB / f3;
            fA2 *= f4;
            fA3 *= f4;
        }
        float f5 = fA2;
        if (fA < 0.0f || f5 < 0.0f || fA3 < 0.0f || fA4 < 0.0f) {
            ebs.c("Corner size in Px can't be negative(topStart = " + fA + ", topEnd = " + f5 + ", bottomEnd = " + fA3 + ", bottomStart = " + fA4 + ")!");
        }
        return c(j, fA, f5, fA3, fA4, kjiVar);
    }

    public abstract eve b(evf evfVar, evf evfVar2, evf evfVar3, evf evfVar4);

    public abstract ijz c(long j, float f, float f2, float f3, float f4, kji kjiVar);
}
