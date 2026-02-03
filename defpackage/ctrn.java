package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ctrn {
    public final fdae a;

    public ctrn(fdae fdaeVar) {
        this.a = fdaeVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ctrn) && fdbq.f(this.a, ((ctrn) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "DuplicateGroupNoticeUiData(onDuplicateGroupLinkClick=" + this.a + ")";
    }

    public ctrn() {
        this(new fdae() { // from class: ctrm
            @Override // defpackage.fdae
            public final Object invoke() {
                return fctx.a;
            }
        });
    }
}
