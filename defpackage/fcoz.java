package defpackage;

import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fcoz implements fbzc {
    final /* synthetic */ fcpb a;

    public fcoz(fcpb fcpbVar) {
        this.a = fcpbVar;
    }

    @Override // defpackage.fbzc
    public final void a(Status status) {
        int i = fcsr.a;
        fcpa fcpaVar = this.a.f;
        int i2 = fcpa.z;
        synchronized (fcpaVar.a) {
            fcpaVar.r(status, true, null);
        }
    }

    @Override // defpackage.fbzc
    public final void b(fcmv fcmvVar, boolean z, boolean z2, int i) {
        ffez ffezVar;
        int i2 = fcsr.a;
        if (fcmvVar == null) {
            ffezVar = fcpb.a;
        } else {
            ffezVar = ((fcpr) fcmvVar).a;
            int i3 = (int) ffezVar.b;
            if (i3 > 0) {
                this.a.w(i3);
            }
        }
        fcpb fcpbVar = this.a;
        fcpa fcpaVar = fcpbVar.f;
        int i4 = fcpa.z;
        synchronized (fcpaVar.a) {
            if (!fcpaVar.f) {
                if (fcpaVar.u) {
                    fcpaVar.c.hO(ffezVar, (int) ffezVar.b);
                    fcpaVar.d |= z;
                    fcpaVar.e |= z2;
                } else {
                    ejwl.m(fcpaVar.x != -1, "streamId should be set");
                    fcpaVar.h.a(z, fcpaVar.w, ffezVar, z2);
                }
            }
            fcmu fcmuVar = fcpbVar.r;
            if (i != 0) {
                fcmuVar.g += i;
                fcmuVar.b.a();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0152 A[Catch: all -> 0x016a, TryCatch #0 {, blocks: (B:4:0x0015, B:6:0x0043, B:8:0x004e, B:9:0x0081, B:11:0x0084, B:13:0x0090, B:15:0x0098, B:16:0x00a8, B:17:0x00ab, B:19:0x00b2, B:50:0x0168, B:20:0x00c0, B:22:0x00c6, B:24:0x00ce, B:26:0x00d6, B:41:0x013b, B:43:0x0141, B:45:0x0145, B:27:0x00dd, B:29:0x00ed, B:31:0x0100, B:33:0x0106, B:35:0x010a, B:36:0x011f, B:38:0x0125, B:40:0x0137, B:30:0x00f0, B:46:0x0152, B:48:0x015c, B:49:0x0165, B:7:0x0049), top: B:55:0x0015 }] */
    @Override // defpackage.fbzc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(defpackage.fbrg r13) {
        /*
            Method dump skipped, instructions count: 365
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fcoz.c(fbrg):void");
    }
}
