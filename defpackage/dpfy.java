package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dpfy {
    static final /* synthetic */ fdeh[] a;
    public final List b;
    public final dpfv c;
    public final dnhm d;
    public final dpfe e;
    public final dnih f;
    public final fdcz g;

    static {
        fdbv fdbvVar = new fdbv(dpfy.class, "textControl", "getTextControl()Lcom/google/android/libraries/compose/ui/composable/text/HugoDraftTextUiData$TextControl;", 0);
        int i = fdcj.a;
        a = new fdeh[]{fdbvVar};
    }

    public dpfy() {
        this(null);
    }

    public final void a(dpfw dpfwVar) {
        this.g.d(a[0], dpfwVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dpfy)) {
            return false;
        }
        dpfy dpfyVar = (dpfy) obj;
        return fdbq.f(this.b, dpfyVar.b) && fdbq.f(this.c, dpfyVar.c) && fdbq.f(this.d, dpfyVar.d);
    }

    public final int hashCode() {
        int iHashCode = this.b.hashCode() * 31;
        dpfv dpfvVar = this.c;
        int iHashCode2 = (iHashCode + (dpfvVar == null ? 0 : dpfvVar.hashCode())) * 31;
        dnhm dnhmVar = this.d;
        return iHashCode2 + (dnhmVar != null ? dnhmVar.hashCode() : 0);
    }

    public final String toString() {
        return "HugoDraftTextUiData(textChangeListeners=" + this.b + ", contentInsertionListener=" + this.c + ", emojiUsageListener=" + this.d + ")";
    }

    public dpfy(dnjl dnjlVar, dpfv dpfvVar, dnhm dnhmVar) {
        this(dnjlVar != null ? fcva.b(dnjlVar) : fcvo.a, dpfvVar, dnhmVar);
    }

    public /* synthetic */ dpfy(dnjl dnjlVar, dnhm dnhmVar, int i) {
        this(dnjlVar, (dpfv) null, (i & 4) != 0 ? null : dnhmVar);
    }

    public dpfy(List list, dpfv dpfvVar, dnhm dnhmVar) {
        this.b = list;
        this.c = dpfvVar;
        this.d = dnhmVar;
        dpfe dpfeVar = new dpfe();
        this.e = dpfeVar;
        this.f = dpfeVar;
        this.g = new dpfx(this);
    }

    public /* synthetic */ dpfy(byte[] bArr) {
        this(fcvo.a, (dpfv) null, (dnhm) null);
    }
}
