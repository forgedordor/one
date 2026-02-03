package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djcq {
    public final List a;
    public final fdap b;
    public final fdap c;
    public final fdap d;

    public djcq(List list, fdap fdapVar, fdap fdapVar2, fdap fdapVar3) {
        this.a = list;
        this.b = fdapVar;
        this.c = fdapVar2;
        this.d = fdapVar3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof djcq)) {
            return false;
        }
        djcq djcqVar = (djcq) obj;
        return fdbq.f(this.a, djcqVar.a) && fdbq.f(this.b, djcqVar.b) && fdbq.f(this.c, djcqVar.c) && fdbq.f(this.d, djcqVar.d);
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
    }

    public final String toString() {
        return "ComposeRowDraftAttachmentUiData(attachments=" + this.a + ", onClick=" + this.b + ", onRemove=" + this.c + ", onMagicEdit=" + this.d + ")";
    }

    public /* synthetic */ djcq(List list, fdap fdapVar, fdap fdapVar2) {
        this(list, fdapVar, fdapVar2, new fdap() { // from class: djcp
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                ((Integer) obj).intValue();
                return fctx.a;
            }
        });
    }
}
