package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bym implements ceh {
    final /* synthetic */ kog a;
    final /* synthetic */ lbz b;
    final /* synthetic */ byz c;
    final /* synthetic */ bzf d;

    public bym(bzf bzfVar, kog kogVar, lbz lbzVar, byz byzVar) {
        this.d = bzfVar;
        this.a = kogVar;
        this.b = lbzVar;
        this.c = byzVar;
    }

    @Override // defpackage.ceh
    public final void a(cdy cdyVar) {
        if (this.d.R == null) {
            this.b.accept(cdyVar);
        }
    }

    @Override // defpackage.ceh
    public final void b() {
        this.a.b(null);
    }

    @Override // defpackage.ceh
    public final void c(cdz cdzVar) {
        bzf bzfVar = this.d;
        if (bzfVar.ac == 3) {
            cdzVar.close();
            throw new AssertionError("Audio is not enabled but audio encoded data is being produced.");
        }
        if (bzfVar.A != null) {
            try {
                bzfVar.w(cdzVar, this.c);
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
        bzf bzfVar2 = this.d;
        if (bzfVar2.r) {
            bbs.a("Recorder", "Drop audio data since recording is stopping.");
        } else {
            bzfVar2.ah.b(new cdx(cdzVar));
            if (bzfVar2.Q != null) {
                bbs.a("Recorder", "Received audio data. Starting muxer...");
                bzfVar2.r(this.c);
            } else {
                bbs.a("Recorder", "Cached audio data while we wait for video keyframe before starting muxer.");
            }
        }
        cdzVar.close();
    }

    @Override // defpackage.ceh
    public final void d(cfz cfzVar) {
        this.d.ag = cfzVar;
    }
}
