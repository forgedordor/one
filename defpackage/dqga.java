package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dqga {
    public final fdvc a;
    public final List b;
    public final boolean c;
    public final fdvc d;

    public dqga() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dqga)) {
            return false;
        }
        dqga dqgaVar = (dqga) obj;
        return fdbq.f(this.a, dqgaVar.a) && fdbq.f(this.b, dqgaVar.b) && this.c == dqgaVar.c && fdbq.f(this.d, dqgaVar.d);
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + (true != this.c ? 1237 : 1231)) * 31) + this.d.hashCode();
    }

    public final String toString() {
        return "VoiceMoodConfiguration(enabled=" + this.a + ", voiceMoods=" + this.b + ", animateVoiceMoodOptions=" + this.c + ", isAnimationsSettingEnabled=" + this.d + ")";
    }

    public dqga(fdvc fdvcVar, List list, boolean z, fdvc fdvcVar2) {
        fdvcVar.getClass();
        this.a = fdvcVar;
        this.b = list;
        this.c = z;
        this.d = fdvcVar2;
    }

    public /* synthetic */ dqga(byte[] bArr) {
        this(fdvf.a(false), fcvo.a, false, fdvf.a(true));
    }
}
