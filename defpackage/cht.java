package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cht implements bpu {
    public final lvy b;
    public boolean a = false;
    public final Object c = new Object();

    public cht(lvy lvyVar) {
        this.b = lvyVar;
    }

    @Override // defpackage.bpu
    public final void a(Throwable th) {
        synchronized (this.c) {
            if (this.a) {
                return;
            }
            if (!(th instanceof ayw)) {
                bbs.b("CameraController", "Tap-to-focus failed.", th);
                this.b.j(new cjh(4));
            } else {
                bbs.b("CameraController", "Tap-to-focus canceled", th);
                this.b.j(new cjh(0));
                c();
            }
        }
    }

    @Override // defpackage.bpu
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        azz azzVar = (azz) obj;
        synchronized (this.c) {
            if (this.a) {
                return;
            }
            if (azzVar == null) {
                return;
            }
            StringBuilder sb = new StringBuilder("Tap-to-focus onSuccess: ");
            boolean z = azzVar.a;
            sb.append(z);
            bbs.a("CameraController", sb.toString());
            this.b.j(new cjh(true != z ? 3 : 2));
        }
    }

    public final void c() {
        synchronized (this.c) {
            this.a = true;
        }
    }
}
