package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vbw {
    private final String a;
    private final hox b;
    private final String c;

    public vbw() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vbw)) {
            return false;
        }
        vbw vbwVar = (vbw) obj;
        String str = vbwVar.a;
        if (!fdbq.f(null, null) || !fdbq.f(this.b, vbwVar.b)) {
            return false;
        }
        String str2 = vbwVar.c;
        return fdbq.f(null, null);
    }

    public final int hashCode() {
        return this.b.hashCode() * 31;
    }

    public final String toString() {
        return "MagicRewriteUiState(savedUserDraft=null, savedSelectedRewriteSuggestion=" + this.b + ", savedRewrittenDraft=null)";
    }

    public /* synthetic */ vbw(byte[] bArr) {
        hpl hplVar = new hpl(null, hsi.a);
        this.a = null;
        this.b = hplVar;
        this.c = null;
    }
}
