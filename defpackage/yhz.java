package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class yhz {
    public final fdvc a;
    public final fdvc b;
    public final fdvc c;
    public final Optional d;
    public final int e;
    public final yhy f;

    public yhz(fdvc fdvcVar, fdvc fdvcVar2, fdvc fdvcVar3, Optional optional, int i, yhy yhyVar) {
        fdvcVar.getClass();
        fdvcVar2.getClass();
        fdvcVar3.getClass();
        this.a = fdvcVar;
        this.b = fdvcVar2;
        this.c = fdvcVar3;
        this.d = optional;
        this.e = i;
        this.f = yhyVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yhz)) {
            return false;
        }
        yhz yhzVar = (yhz) obj;
        return fdbq.f(this.a, yhzVar.a) && fdbq.f(this.b, yhzVar.b) && fdbq.f(this.c, yhzVar.c) && fdbq.f(this.d, yhzVar.d) && this.e == yhzVar.e && fdbq.f(this.f, yhzVar.f);
    }

    public final int hashCode() {
        return (((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e) * 31) + this.f.hashCode();
    }

    public final String toString() {
        return "MessageListFooterUiData(typingIndicatorUiDataFlow=" + this.a + ", suggestionListUiDataFlow=" + this.b + ", sendingAsUiDataFlow=" + this.c + ", delegatedUiHandler=" + this.d + ", maximumSuggestionRows=" + this.e + ", flags=" + this.f + ")";
    }
}
