package defpackage;

import java.util.Random;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dzwc {
    static final dzwd a = new dzwa(fehf.a, true);
    private final Random b;
    private final eony c;
    private final dzvm d;

    public dzwc(Random random, dzvm dzvmVar, eony eonyVar) {
        this.b = random;
        this.c = eonyVar;
        this.d = dzvmVar;
    }

    public final dzwd a(fehf fehfVar) {
        int iA = fehe.a(fehfVar.d);
        if (iA == 0) {
            iA = 1;
        }
        int i = iA - 1;
        if (i == 1) {
            return new dzwa(fehfVar, fehfVar.c == 1000);
        }
        if (i == 3) {
            return new dzwa(fehfVar, this.b.nextDouble() * 1000.0d < ((double) fehfVar.c));
        }
        if (i != 4) {
            if (i == 5) {
                fehfVar = fehf.a;
            }
            return new dzwa(fehfVar, true);
        }
        Random random = this.b;
        dzvm dzvmVar = this.d;
        dzvmVar.getClass();
        return new dzwb(fehfVar, random, dzvmVar, this.c);
    }
}
