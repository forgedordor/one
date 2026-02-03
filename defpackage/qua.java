package defpackage;

import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qua implements qto {
    public final String a;
    public final List b;
    public final boolean c;

    public qua(String str, List list, boolean z) {
        this.a = str;
        this.b = list;
        this.c = z;
    }

    @Override // defpackage.qto
    public final qoy a(qof qofVar, qnm qnmVar, quh quhVar) {
        return new qoz(qofVar, quhVar, this, qnmVar);
    }

    public final String toString() {
        return "ShapeGroup{name='" + this.a + "' Shapes: " + Arrays.toString(this.b.toArray()) + "}";
    }
}
