package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eiaa extends eiag {
    private final eiah a;
    private final ListenableFuture b;

    public eiaa(eiah eiahVar, ListenableFuture listenableFuture) {
        this.a = eiahVar;
        this.b = listenableFuture;
    }

    @Override // defpackage.eiag
    public final eiah a() {
        return this.a;
    }

    @Override // defpackage.eiag
    public final ListenableFuture b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof eiag) {
            eiag eiagVar = (eiag) obj;
            if (this.a.equals(eiagVar.a()) && this.b.equals(eiagVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        ListenableFuture listenableFuture = this.b;
        return "MonitorReport{monitor=" + this.a.toString() + ", startReport=" + listenableFuture.toString() + "}";
    }
}
