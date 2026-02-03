package defpackage;

import j$.util.Objects;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kqq extends kqo {
    private static final ArrayList e;

    static {
        ArrayList arrayList = new ArrayList();
        e = arrayList;
        arrayList.add("ConstraintSets");
        arrayList.add("Variables");
        arrayList.add("Generate");
        arrayList.add("Transitions");
        arrayList.add("KeyFrames");
        arrayList.add("KeyAttributes");
        arrayList.add("KeyPositions");
        arrayList.add("KeyCycles");
    }

    public kqq(char[] cArr) {
        super(cArr);
    }

    public final kqp A() {
        if (this.a.size() > 0) {
            return (kqp) this.a.get(0);
        }
        return null;
    }

    public final void B(kqp kqpVar) {
        if (this.a.size() > 0) {
            this.a.set(0, kqpVar);
        } else {
            this.a.add(kqpVar);
        }
    }

    @Override // defpackage.kqo, defpackage.kqp
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kqq) || Objects.equals(v(), ((kqq) obj).v())) {
            return super.equals(obj);
        }
        return false;
    }
}
