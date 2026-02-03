package defpackage;

import j$.util.DesugarCollections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nrv extends nrs {
    public final long a;
    public final long b;

    public nrv(long j, long j2, List list) {
        this.a = j;
        this.b = j2;
        DesugarCollections.unmodifiableList(list);
    }

    @Override // defpackage.nrs
    public final String toString() {
        return "SCTE-35 SpliceInsertCommand { programSplicePts=" + this.a + ", programSplicePlaybackPositionUs= " + this.b + " }";
    }
}
