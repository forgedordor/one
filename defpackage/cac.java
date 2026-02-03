package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cac implements bll {
    private bin a;
    private boolean b = false;

    public cac(bin binVar) {
        this.a = binVar;
    }

    private final void d(boolean z) {
        if (this.b == z) {
            return;
        }
        this.b = z;
        bin binVar = this.a;
        if (binVar == null) {
            bbs.a("VideoCapture", "SourceStreamRequirementObserver#isSourceStreamRequired: Received new data despite being closed already");
        } else if (z) {
            binVar.x();
        } else {
            binVar.u();
        }
    }

    @Override // defpackage.bll
    public final void a(Throwable th) {
        bbs.g("VideoCapture", "SourceStreamRequirementObserver#onError", th);
    }

    @Override // defpackage.bll
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        lcg.d(box.d(), "SourceStreamRequirementObserver can be updated from main thread only");
        d(Boolean.TRUE.equals((Boolean) obj));
    }

    public final void c() {
        lcg.d(box.d(), "SourceStreamRequirementObserver can be closed from main thread only");
        bbs.a("VideoCapture", "SourceStreamRequirementObserver#close: mIsSourceStreamRequired = " + this.b);
        if (this.a == null) {
            bbs.a("VideoCapture", "SourceStreamRequirementObserver#close: Already closed!");
        } else {
            d(false);
            this.a = null;
        }
    }
}
