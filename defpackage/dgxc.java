package defpackage;

import android.content.Context;
import android.text.TextUtils;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dgxc implements dgxm {
    private static final dfny a = dfod.a(202254264);
    private final Context b;
    private final dgiq c;
    private final dgxf d;

    public dgxc(Context context, dgiq dgiqVar, dgxf dgxfVar) {
        this.b = context;
        this.c = dgiqVar;
        this.d = dgxfVar;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:63:0x010b. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0184 A[EXC_TOP_SPLITTER, PHI: r4
      0x0184: PHI (r4v10 android.content.Context) = 
      (r4v19 android.content.Context)
      (r4v20 android.content.Context)
      (r4v21 android.content.Context)
      (r4v22 android.content.Context)
      (r4v23 android.content.Context)
      (r4v24 android.content.Context)
     binds: [B:87:0x017f, B:70:0x012c, B:72:0x0132, B:74:0x0138, B:81:0x0161, B:82:0x0163] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x012e A[Catch: dhkf -> 0x017e, TryCatch #1 {dhkf -> 0x017e, blocks: (B:69:0x0124, B:71:0x012e, B:73:0x0134, B:75:0x013a, B:78:0x0148, B:80:0x0154, B:83:0x0165, B:84:0x0172), top: B:126:0x0124 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:108:0x01d2 -> B:125:0x01e8). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:97:0x01a7 -> B:125:0x01e8). Please report as a decompilation issue!!! */
    @Override // defpackage.dgxm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.dgwx a() {
        /*
            Method dump skipped, instructions count: 582
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dgxc.a():dgwx");
    }

    @Override // defpackage.dgxm
    public final dgwx b() {
        dgwx dgwxVar = new dgwx(this.d.a);
        dgiq dgiqVar = this.c;
        boolean z = dgiqVar.r().mChatAuth;
        dgwxVar.e(z);
        dgwxVar.q(z);
        dgwxVar.n(true);
        dgwxVar.f(dgiqVar.o().mFtThumbnailSupported);
        dgwxVar.k(dgiqVar.r().mGeoLocPushAuth);
        dgwxVar.j(dgiqVar.r().mGeoLocPullAuth != 0);
        dgwxVar.i(!TextUtils.isEmpty(r3.mFtHttpContentServerUri));
        dgwxVar.g(dfpq.o());
        dgwxVar.l(dfpq.p());
        dgwxVar.n(false);
        return dgwxVar;
    }
}
