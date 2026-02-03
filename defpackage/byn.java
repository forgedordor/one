package defpackage;

import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
final class byn implements bpu {
    final /* synthetic */ bzf a;

    public byn(bzf bzfVar) {
        this.a = bzfVar;
    }

    @Override // defpackage.bpu
    public final void a(Throwable th) {
        bzf bzfVar = this.a;
        lcg.d(bzfVar.q != null, "In-progress recording shouldn't be null");
        Objects.toString(th);
        bbs.a("Recorder", "Encodings end with error: ".concat(th.toString()));
        bzfVar.i(bzfVar.A == null ? 8 : 6, th);
    }

    @Override // defpackage.bpu
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        bbs.a("Recorder", "Encodings end successfully.");
        bzf bzfVar = this.a;
        bzfVar.i(bzfVar.O, bzfVar.P);
    }
}
