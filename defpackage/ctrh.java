package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ctrh {
    public final djqn a;
    public final boolean b;

    public ctrh() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ctrh)) {
            return false;
        }
        ctrh ctrhVar = (ctrh) obj;
        return fdbq.f(this.a, ctrhVar.a) && this.b == ctrhVar.b;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + (true != this.b ? 1237 : 1231);
    }

    public final String toString() {
        return "FavoriteContactsUiData(rowUiData=" + this.a + ", loaded=" + this.b + ")";
    }

    public ctrh(djqn djqnVar, boolean z) {
        this.a = djqnVar;
        this.b = z;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ ctrh(byte[] bArr) {
        int i = ekgb.d;
        ekgb ekgbVar = ekoe.a;
        ekgbVar.getClass();
        this(new djqn("", ekgbVar), false);
    }
}
