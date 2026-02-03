package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djdl {
    public final djit a;
    public final boolean b;

    public djdl() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof djdl)) {
            return false;
        }
        djdl djdlVar = (djdl) obj;
        return this.a == djdlVar.a && this.b == djdlVar.b;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + (true != this.b ? 1237 : 1231);
    }

    public final String toString() {
        return "Flags(voiceButtonBackground=" + this.a + ", enableOnDisabledClickBehavior=" + this.b + ")";
    }

    public djdl(djit djitVar, boolean z) {
        djitVar.getClass();
        this.a = djitVar;
        this.b = z;
    }

    public /* synthetic */ djdl(byte[] bArr) {
        this(djit.VOICE_BUTTON_BACKGROUND_DEFAULT, false);
    }
}
