package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dipu {
    public final List a;
    public final dipk b;

    public dipu(List list, dipk dipkVar) {
        list.getClass();
        this.a = list;
        this.b = dipkVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dipu)) {
            return false;
        }
        dipu dipuVar = (dipu) obj;
        return fdbq.f(this.a, dipuVar.a) && fdbq.f(this.b, dipuVar.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        dipk dipkVar = this.b;
        return iHashCode + (dipkVar == null ? 0 : dipkVar.hashCode());
    }

    public final String toString() {
        return "WaveformUiData(amplitudeList=" + this.a + ", playbackUiData=" + this.b + ")";
    }
}
