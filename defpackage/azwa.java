package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class azwa {
    public final dqpo a;
    public final dqpo b;
    public final azwc c;
    public final boolean d;

    public azwa(dqpo dqpoVar, dqpo dqpoVar2, azwc azwcVar, boolean z) {
        azwcVar.getClass();
        this.a = dqpoVar;
        this.b = dqpoVar2;
        this.c = azwcVar;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof azwa)) {
            return false;
        }
        azwa azwaVar = (azwa) obj;
        return fdbq.f(this.a, azwaVar.a) && fdbq.f(this.b, azwaVar.b) && fdbq.f(this.c, azwaVar.c) && this.d == azwaVar.d;
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + (true != this.d ? 1237 : 1231);
    }

    public final String toString() {
        return "ForeignKeySpec(backupFkColumn=" + this.a + ", bugleFkColumn=" + this.b + ", referencedTable=" + this.c + ", nullable=" + this.d + ")";
    }

    public /* synthetic */ azwa(dqpo dqpoVar, dqpo dqpoVar2, azwc azwcVar) {
        this(dqpoVar, dqpoVar2, azwcVar, false);
    }
}
