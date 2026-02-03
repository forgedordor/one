package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jof implements jfi {
    public final int a;
    public Float b = null;
    public Float c = null;
    public jry d = null;
    public jry e = null;
    private final List f;

    public jof(int i, List list) {
        this.a = i;
        this.f = list;
    }

    @Override // defpackage.jfi
    public final boolean B() {
        return this.f.contains(this);
    }
}
