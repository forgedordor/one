package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class pch {
    public final int a;
    public int b = -1;
    private final pcg c;

    public pch(int i, pcg pcgVar) {
        this.a = i;
        this.c = pcgVar;
    }

    public final void a(int i, int i2, boolean z) {
        boolean z2;
        lcg.a(i2 >= i);
        while (true) {
            pbj pbjVar = ((pbi) this.c).a;
            if (i > i2) {
                pbjVar.e();
                return;
            }
            String strB = ((acqk) pbjVar.b).b(i);
            if (strB != null) {
                if (z) {
                    pcm pcmVar = pbjVar.a;
                    if (!pcmVar.a.contains(strB)) {
                        pcmVar.b.add(strB);
                        z2 = true;
                    }
                } else {
                    pbjVar.a.b.remove(strB);
                    z2 = false;
                }
                pbjVar.d(strB, z2);
            }
            i++;
        }
    }

    public final String toString() {
        return "Range{begin=" + this.a + ", end=" + this.b + "}";
    }
}
