package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dluu {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    private final boolean e;

    public dluu() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dluu)) {
            return false;
        }
        dluu dluuVar = (dluu) obj;
        boolean z = dluuVar.e;
        return this.a == dluuVar.a && this.b == dluuVar.b && this.c == dluuVar.c && this.d == dluuVar.d;
    }

    public final int hashCode() {
        int iA = dlut.a(true);
        boolean z = this.d;
        boolean z2 = this.c;
        return (((((((iA * 31) + dlut.a(this.a)) * 31) + dlut.a(this.b)) * 31) + dlut.a(z2)) * 31) + dlut.a(z);
    }

    public final String toString() {
        return "AttachmentResolverConfiguration(parseMediaMetadataWhenNoCursor=true, useUriStreamOpener=" + this.a + ", consumeInputStreamForSize=" + this.b + ", resolveAudioMetadata=" + this.c + ", useFullRangeAsFormatFallback=" + this.d + ")";
    }

    public dluu(boolean z, boolean z2, boolean z3, boolean z4) {
        this.e = true;
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
    }

    public /* synthetic */ dluu(byte[] bArr) {
        this(false, false, false, true);
    }
}
