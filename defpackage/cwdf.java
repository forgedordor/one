package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cwdf {
    public final int a;
    private final kjb b = null;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cwdf)) {
            return false;
        }
        cwdf cwdfVar = (cwdf) obj;
        if (this.a != cwdfVar.a) {
            return false;
        }
        kjb kjbVar = cwdfVar.b;
        return fdbq.f(null, null);
    }

    public final int hashCode() {
        return this.a * 31;
    }

    public final String toString() {
        return "MiniConversationDetailsArgs(callerSource=" + ((Object) cwcz.a(this.a)) + ", avatarPosition=null)";
    }
}
