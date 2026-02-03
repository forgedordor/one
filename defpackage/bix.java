package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bix implements bmb {
    private final bcl b = new biy();

    @Override // defpackage.bcl
    public final bck a(biv bivVar) {
        if (this.b.a(bivVar).e) {
            return bck.b;
        }
        Throwable th = bivVar.c;
        if (th instanceof bjg) {
            bbs.c("CameraX", "The device might underreport the amount of the cameras. Finish the initialize task since we are already reaching the maximum number of retries.");
            if (((bjg) th).a > 0) {
                return bck.c;
            }
        }
        return bck.a;
    }

    @Override // defpackage.bmb
    public final bcl b() {
        return new bix();
    }
}
