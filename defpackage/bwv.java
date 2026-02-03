package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bwv extends byz {
    public final bxk a;
    public final boolean b;
    public final long c;
    private final Executor j;
    private final lbz k;

    public bwv(bxk bxkVar, Executor executor, lbz lbzVar, boolean z, long j) {
        this.a = bxkVar;
        this.j = executor;
        this.k = lbzVar;
        this.b = z;
        this.c = j;
    }

    @Override // defpackage.byz
    public final long a() {
        return this.c;
    }

    @Override // defpackage.byz
    public final bxk b() {
        return this.a;
    }

    @Override // defpackage.byz
    public final lbz c() {
        return this.k;
    }

    @Override // defpackage.byz
    public final Executor d() {
        return this.j;
    }

    @Override // defpackage.byz
    public final boolean e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        Executor executor;
        lbz lbzVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof byz) {
            byz byzVar = (byz) obj;
            if (this.a.equals(byzVar.b()) && ((executor = this.j) != null ? executor.equals(byzVar.d()) : byzVar.d() == null) && ((lbzVar = this.k) != null ? lbzVar.equals(byzVar.c()) : byzVar.c() == null) && this.b == byzVar.e()) {
                byzVar.f();
                if (this.c == byzVar.a()) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        Executor executor = this.j;
        int iHashCode2 = ((iHashCode * 1000003) ^ (executor == null ? 0 : executor.hashCode())) * 1000003;
        lbz lbzVar = this.k;
        int iHashCode3 = (iHashCode2 ^ (lbzVar != null ? lbzVar.hashCode() : 0)) * 1000003;
        int i = true != this.b ? 1237 : 1231;
        long j = this.c;
        return ((((iHashCode3 ^ i) * 1000003) ^ 1237) * 1000003) ^ ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        return "RecordingRecord{getOutputOptions=" + this.a + ", getCallbackExecutor=" + this.j + ", getEventListener=" + this.k + ", hasAudioEnabled=" + this.b + ", isPersistent=false, getRecordingId=" + this.c + "}";
    }

    @Override // defpackage.byz
    public final void f() {
    }
}
