package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class byk implements ceh {
    final /* synthetic */ kog a;
    final /* synthetic */ byz b;
    final /* synthetic */ bzf c;

    public byk(bzf bzfVar, kog kogVar, byz byzVar) {
        this.c = bzfVar;
        this.a = kogVar;
        this.b = byzVar;
    }

    @Override // defpackage.ceh
    public final void a(cdy cdyVar) {
        this.a.c(cdyVar);
    }

    @Override // defpackage.ceh
    public final void b() {
        this.a.b(null);
    }

    @Override // defpackage.ceh
    public final void c(cdz cdzVar) {
        boolean z;
        bzf bzfVar = this.c;
        if (bzfVar.A != null) {
            try {
                bzfVar.x(cdzVar, this.b);
                cdzVar.close();
                return;
            } catch (Throwable th) {
                try {
                    cdzVar.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        bzf bzfVar2 = this.c;
        if (bzfVar2.r) {
            bbs.a("Recorder", "Drop video data since recording is stopping.");
            cdzVar.close();
            return;
        }
        cdz cdzVar2 = bzfVar2.Q;
        if (cdzVar2 != null) {
            cdzVar2.close();
            bzfVar2.Q = null;
            z = true;
        } else {
            z = false;
        }
        if (!cdzVar.e()) {
            if (z) {
                bbs.a("Recorder", "Dropped cached keyframe since we have new video data and have not yet received audio data.");
            }
            bbs.a("Recorder", "Dropped video data since muxer has not yet started and data is not a keyframe.");
            final cgh cghVar = (cgh) bzfVar2.D;
            cghVar.h.execute(new Runnable() { // from class: cey
                @Override // java.lang.Runnable
                public final void run() {
                    cgh cghVar2 = cghVar;
                    int i = cghVar2.C;
                    int i2 = i - 1;
                    if (i == 0) {
                        throw null;
                    }
                    if (i2 == 1) {
                        cghVar2.o();
                    } else if (i2 == 6 || i2 == 8) {
                        throw new IllegalStateException("Encoder is released");
                    }
                }
            });
            cdzVar.close();
            return;
        }
        bzfVar2.Q = cdzVar;
        if (!bzfVar2.y() || !bzfVar2.ah.c()) {
            bbs.a("Recorder", "Received video keyframe. Starting muxer...");
            bzfVar2.r(this.b);
        } else if (z) {
            bbs.a("Recorder", "Replaced cached video keyframe with newer keyframe.");
        } else {
            bbs.a("Recorder", "Cached video keyframe while we wait for first audio sample before starting muxer.");
        }
    }

    @Override // defpackage.ceh
    public final void d(cfz cfzVar) {
        this.c.af = cfzVar;
    }
}
