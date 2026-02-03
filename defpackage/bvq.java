package defpackage;

import android.hardware.camera2.CaptureResult;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bvq implements bib {
    private final bib a;
    private final bmx b;
    private final long c;

    public bvq(bib bibVar, bmx bmxVar, long j) {
        this.a = bibVar;
        this.b = bmxVar;
        this.c = j;
    }

    @Override // defpackage.bib
    public final long a() {
        bib bibVar = this.a;
        if (bibVar != null) {
            return bibVar.a();
        }
        long j = this.c;
        if (j != -1) {
            return j;
        }
        throw new IllegalStateException("No timestamp is available.");
    }

    @Override // defpackage.bib
    public final /* synthetic */ CaptureResult b() {
        return null;
    }

    @Override // defpackage.bib
    public final bhw c() {
        bib bibVar = this.a;
        return bibVar != null ? bibVar.c() : bhw.UNKNOWN;
    }

    @Override // defpackage.bib
    public final bhx d() {
        bib bibVar = this.a;
        return bibVar != null ? bibVar.d() : bhx.UNKNOWN;
    }

    @Override // defpackage.bib
    public final bhy e() {
        bib bibVar = this.a;
        return bibVar != null ? bibVar.e() : bhy.UNKNOWN;
    }

    @Override // defpackage.bib
    public final bmx f() {
        return this.b;
    }

    @Override // defpackage.bib
    public final /* synthetic */ void g(bog bogVar) {
        bhz.a(this, bogVar);
    }

    @Override // defpackage.bib
    public final int h() {
        throw null;
    }

    @Override // defpackage.bib
    public final int i() {
        bib bibVar = this.a;
        if (bibVar != null) {
            return bibVar.i();
        }
        return 1;
    }
}
