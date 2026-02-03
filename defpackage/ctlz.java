package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ctlz {
    public final fdae a;
    public final fdae b;
    private final cueh c;

    public ctlz() {
        this(null, 7);
    }

    public final boolean a() {
        return this.c.d();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ctlz)) {
            return false;
        }
        ctlz ctlzVar = (ctlz) obj;
        return this.c == ctlzVar.c && fdbq.f(this.a, ctlzVar.a) && fdbq.f(this.b, ctlzVar.b);
    }

    public final int hashCode() {
        return (((this.c.hashCode() * 31) + this.a.hashCode()) * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "CreateGroupUiData(selectionMode=" + this.c + ", onRenderCreateGroupButton=" + this.a + ", onCreateGroupButton=" + this.b + ")";
    }

    public ctlz(cueh cuehVar, fdae fdaeVar, fdae fdaeVar2) {
        cuehVar.getClass();
        this.c = cuehVar;
        this.a = fdaeVar;
        this.b = fdaeVar2;
    }

    public /* synthetic */ ctlz(cueh cuehVar, int i) {
        this((i & 1) != 0 ? cueh.c : cuehVar, new fdae() { // from class: ctlx
            @Override // defpackage.fdae
            public final Object invoke() {
                return fctx.a;
            }
        }, new fdae() { // from class: ctly
            @Override // defpackage.fdae
            public final Object invoke() {
                return fctx.a;
            }
        });
    }
}
