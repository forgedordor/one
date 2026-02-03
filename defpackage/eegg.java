package defpackage;

import j$.util.DesugarCollections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eegg {
    public final float a;
    public int b;
    public final List c;
    public final int d;
    public final int e;
    public final int f;

    public eegg(float f, List list, int i, int i2, int i3) {
        this.a = f;
        this.c = DesugarCollections.unmodifiableList(list);
        this.d = i;
        this.e = i2;
        while (i <= i2) {
            if (((eegf) list.get(i)).f == 0.0f) {
                this.b++;
            }
            i++;
        }
        this.f = i3;
    }

    public final eegf a() {
        return (eegf) this.c.get(this.d);
    }

    public final eegf b() {
        return (eegf) this.c.get(0);
    }

    public final eegf c() {
        return (eegf) this.c.get(this.e);
    }

    public final eegf d() {
        return (eegf) this.c.get(r0.size() - 1);
    }
}
