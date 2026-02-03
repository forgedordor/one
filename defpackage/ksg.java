package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ksg extends kse {
    public int aN = 0;
    public int aO = 0;
    public int aP = 0;
    public int aQ = 0;
    public int aR = 0;
    public int aS = 0;
    public boolean aT = false;
    public int aU = 0;
    public int aV = 0;
    protected final ksj aW = new ksj();
    ksk aX = null;

    @Override // defpackage.kse
    public final void ah() {
        for (int i = 0; i < this.aM; i++) {
            krz krzVar = this.aL[i];
            if (krzVar != null) {
                krzVar.Q = true;
            }
        }
    }

    public final void ai(int i, int i2) {
        this.aU = i;
        this.aV = i2;
    }

    public final void aj(int i) {
        this.aP = i;
        this.aR = i;
        this.aS = i;
    }

    protected final void ak(krz krzVar, int i, int i2, int i3, int i4) {
        ksk kskVar;
        krz krzVar2;
        while (true) {
            kskVar = this.aX;
            if (kskVar != null || (krzVar2 = this.ae) == null) {
                break;
            } else {
                this.aX = ((ksa) krzVar2).d;
            }
        }
        ksj ksjVar = this.aW;
        ksjVar.i = i;
        ksjVar.j = i3;
        ksjVar.a = i2;
        ksjVar.b = i4;
        kskVar.b(krzVar, ksjVar);
        krzVar.N(ksjVar.c);
        krzVar.C(ksjVar.d);
        krzVar.P = ksjVar.f;
        krzVar.y(ksjVar.e);
    }

    public void b(int i, int i2, int i3, int i4) {
    }
}
