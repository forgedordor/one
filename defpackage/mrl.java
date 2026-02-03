package defpackage;

import android.media.MediaFormat;

/* compiled from: PG */
/* loaded from: classes.dex */
final class mrl implements nkz, nly, mtd {
    private nkz a;
    private nly b;
    private nkz c;
    private nly d;

    @Override // defpackage.nly
    public final void a(long j, float[] fArr) {
        nly nlyVar = this.d;
        if (nlyVar != null) {
            nlyVar.a(j, fArr);
        }
        nly nlyVar2 = this.b;
        if (nlyVar2 != null) {
            nlyVar2.a(j, fArr);
        }
    }

    @Override // defpackage.nly
    public final void b() {
        nly nlyVar = this.d;
        if (nlyVar != null) {
            nlyVar.b();
        }
        nly nlyVar2 = this.b;
        if (nlyVar2 != null) {
            nlyVar2.b();
        }
    }

    @Override // defpackage.nkz
    public final void c(long j, long j2, mau mauVar, MediaFormat mediaFormat) {
        long j3;
        long j4;
        mau mauVar2;
        MediaFormat mediaFormat2;
        nkz nkzVar = this.c;
        if (nkzVar != null) {
            nkzVar.c(j, j2, mauVar, mediaFormat);
            mediaFormat2 = mediaFormat;
            mauVar2 = mauVar;
            j4 = j2;
            j3 = j;
        } else {
            j3 = j;
            j4 = j2;
            mauVar2 = mauVar;
            mediaFormat2 = mediaFormat;
        }
        nkz nkzVar2 = this.a;
        if (nkzVar2 != null) {
            nkzVar2.c(j3, j4, mauVar2, mediaFormat2);
        }
    }

    @Override // defpackage.mtd
    public final void r(int i, Object obj) {
        if (i == 7) {
            this.a = (nkz) obj;
            return;
        }
        if (i == 8) {
            this.b = (nly) obj;
            return;
        }
        if (i != 10000) {
            return;
        }
        nmo nmoVar = (nmo) obj;
        if (nmoVar == null) {
            this.c = null;
            this.d = null;
        } else {
            nmk nmkVar = nmoVar.c;
            this.c = nmkVar;
            this.d = nmkVar;
        }
    }
}
