package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class amub implements amuz {
    private final amuy a;

    public amub(amuy amuyVar) {
        this.a = amuyVar;
    }

    @Override // defpackage.amuz
    public final amuy a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof amub) && fdbq.f(this.a, ((amub) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "BugleHorizontalRichCardAttachment(cardAttachmentContent=" + this.a + ")";
    }
}
