package defpackage;

import android.webkit.WebView;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abiw extends abjy {
    private final WebView a;
    private final abto b;

    public abiw(WebView webView, abto abtoVar) {
        this.a = webView;
        if (abtoVar == null) {
            throw new NullPointerException("Null weakWrappedDittoWebView");
        }
        this.b = abtoVar;
    }

    @Override // defpackage.abjy
    public final WebView a() {
        return this.a;
    }

    @Override // defpackage.abjy
    public final abto b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof abjy) {
            abjy abjyVar = (abjy) obj;
            if (this.a.equals(abjyVar.a()) && this.b.equals(abjyVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        abto abtoVar = this.b;
        return "FullWrappedDittoWebView{webView=" + this.a.toString() + ", weakWrappedDittoWebView=" + abtoVar.toString() + "}";
    }
}
