package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dldf implements dlfg {
    public final String a;
    public final Uri b;
    public final fdae c;
    private final boolean d = false;
    private final fdae e;

    public dldf(String str, Uri uri, fdae fdaeVar, fdae fdaeVar2) {
        this.a = str;
        this.b = uri;
        this.c = fdaeVar;
        this.e = fdaeVar2;
    }

    public static /* synthetic */ dldf b(dldf dldfVar, fdae fdaeVar) {
        return new dldf(dldfVar.a, dldfVar.b, fdaeVar, dldfVar.e);
    }

    @Override // defpackage.dlfg
    public final fdae a() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dldf)) {
            return false;
        }
        dldf dldfVar = (dldf) obj;
        if (!fdbq.f(this.a, dldfVar.a) || !fdbq.f(this.b, dldfVar.b) || !fdbq.f(this.c, dldfVar.c)) {
            return false;
        }
        boolean z = dldfVar.d;
        return fdbq.f(this.e, dldfVar.e);
    }

    public final int hashCode() {
        return (((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + 1237) * 31) + this.e.hashCode();
    }

    public final String toString() {
        return "StickerSuggestionUiData(contentDescription=" + this.a + ", uri=" + this.b + ", onClick=" + this.c + ", closeable=false, onClose=" + this.e + ")";
    }
}
