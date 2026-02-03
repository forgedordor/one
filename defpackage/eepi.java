package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class eepi {
    protected eepj j;
    protected final List k = new ArrayList();

    protected eepi(int i) {
        for (int i2 = 0; i2 < i; i2++) {
            this.k.add(new eepf());
        }
    }

    protected static final float f(int i, int i2, int i3) {
        return kzz.a((i - i2) / i3, 0.0f, 1.0f);
    }

    public abstract void a();

    public abstract void b(pnz pnzVar);

    public abstract void c();

    public abstract void d();

    public abstract void e();
}
