package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cpin {
    public final boolean a;
    public final String b;
    public final boolean c;
    public final boolean d;
    public final cryl e;
    public final boolean f;
    public final bvdk g;
    public final int h;
    public final int i;
    public final int j;
    private final csoc k = null;

    public /* synthetic */ cpin(boolean z, String str, boolean z2, boolean z3, cryl crylVar, int i, int i2, int i3, boolean z4, bvdk bvdkVar) {
        this.a = z;
        this.b = str;
        this.c = z2;
        this.d = z3;
        this.e = crylVar;
        this.h = i;
        this.i = i2;
        this.j = i3;
        this.f = z4;
        this.g = bvdkVar;
        if (str.length() <= 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (z3 && z4) {
            throw new IllegalArgumentException("We should not have any flows that result in an externally triggered update to be undone, \nas we don't currently have any semantic meaning attached to external updates (ex: we \nreceive updates to the system block list by receiving the whole list, not by receiving an\nintent to block/unblock/undo). As such, it's unclear what it would mean to undo one of\nthese changes, so calling undo in that case would be a bug");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cpin)) {
            return false;
        }
        cpin cpinVar = (cpin) obj;
        if (this.a != cpinVar.a || !fdbq.f(this.b, cpinVar.b)) {
            return false;
        }
        csoc csocVar = cpinVar.k;
        return fdbq.f(null, null) && this.c == cpinVar.c && this.d == cpinVar.d && fdbq.f(this.e, cpinVar.e) && this.h == cpinVar.h && this.i == cpinVar.i && this.j == cpinVar.j && this.f == cpinVar.f && this.g == cpinVar.g;
    }

    public final int hashCode() {
        int iA = (cpil.a(this.a) * 31) + this.b.hashCode();
        cryl crylVar = this.e;
        int iA2 = ((((((((((iA * 961) + cpil.a(this.c)) * 31) + cpil.a(this.d)) * 31) + (crylVar == null ? 0 : crylVar.hashCode())) * 31) + this.h) * 31) + this.i) * 31;
        int i = this.j;
        eofo.b(i);
        int iA3 = (((iA2 + i) * 31) + cpil.a(this.f)) * 31;
        bvdk bvdkVar = this.g;
        return iA3 + (bvdkVar != null ? bvdkVar.hashCode() : 0);
    }

    public final String toString() {
        return "BlockRequest(blockStatus=" + this.a + ", normalizedDestination=" + this.b + ", participant=null, allowConversationArchiving=" + this.c + ", updateTriggeredExternally=" + this.d + ", metadata=" + this.e + ", scope=" + ((Object) eofq.c(this.h)) + ", entryPoint=" + ((Object) eofp.a(this.i)) + ", dialog=" + ((Object) eofo.a(this.j)) + ", isUndo=" + this.f + ", archiveStatusForUndo=" + this.g + ")";
    }
}
