package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djdm {
    public final djdk a;
    public final djjn b;
    public final djaj c;
    public final djic d;
    public final djgy e;
    public final boolean f;
    public final fdap g;
    public final djdl h;
    public final fdap i;

    public /* synthetic */ djdm(djdk djdkVar, djjn djjnVar, djaj djajVar, djic djicVar, boolean z, fdap fdapVar, djdl djdlVar, fdap fdapVar2, int i) {
        djgy djgyVar = (i & 16) != 0 ? new djgy(null) : null;
        boolean z2 = z & ((i & 32) == 0);
        fdapVar = (i & 64) != 0 ? null : fdapVar;
        djdlVar = (i & 128) != 0 ? new djdl(null) : djdlVar;
        int i2 = i & 8;
        int i3 = i & 4;
        int i4 = i & 2;
        int i5 = i & 1;
        djicVar = i2 != 0 ? null : djicVar;
        djajVar = i3 != 0 ? null : djajVar;
        djjnVar = i4 != 0 ? null : djjnVar;
        djdkVar = 1 == i5 ? null : djdkVar;
        djdlVar.getClass();
        this.a = djdkVar;
        this.b = djjnVar;
        this.c = djajVar;
        this.d = djicVar;
        this.e = djgyVar;
        this.f = z2;
        this.g = fdapVar;
        this.h = djdlVar;
        this.i = fdapVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof djdm)) {
            return false;
        }
        djdm djdmVar = (djdm) obj;
        return fdbq.f(this.a, djdmVar.a) && fdbq.f(this.b, djdmVar.b) && fdbq.f(this.c, djdmVar.c) && fdbq.f(this.d, djdmVar.d) && fdbq.f(this.e, djdmVar.e) && this.f == djdmVar.f && fdbq.f(this.g, djdmVar.g) && fdbq.f(this.h, djdmVar.h) && fdbq.f(this.i, djdmVar.i);
    }

    public final int hashCode() {
        djdk djdkVar = this.a;
        int iHashCode = djdkVar == null ? 0 : djdkVar.hashCode();
        djjn djjnVar = this.b;
        int iHashCode2 = ((iHashCode * 31) + (djjnVar == null ? 0 : djjnVar.hashCode())) * 31;
        djaj djajVar = this.c;
        int iHashCode3 = (iHashCode2 + (djajVar == null ? 0 : djajVar.hashCode())) * 31;
        djic djicVar = this.d;
        int iHashCode4 = (((((iHashCode3 + (djicVar == null ? 0 : djicVar.hashCode())) * 31) + (this.e == null ? 0 : 1231)) * 31) + (true != this.f ? 1237 : 1231)) * 31;
        fdap fdapVar = this.g;
        return ((((iHashCode4 + (fdapVar != null ? fdapVar.hashCode() : 0)) * 31) + this.h.hashCode()) * 31) + this.i.hashCode();
    }

    public final String toString() {
        return "ComposeRowInputsUiData(currentInput=" + this.a + ", voiceInputUiData=" + this.b + ", cameraGalleryInputUiData=" + this.c + ", shortcutsInputUiData=" + this.d + ", emotiveInputUiData=" + this.e + ", isAiConversation=" + this.f + ", onDisabledClick=" + this.g + ", flags=" + this.h + ", onClick=" + this.i + ")";
    }
}
