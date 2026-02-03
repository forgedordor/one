package defpackage;

import android.util.Range;
import android.util.Size;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bkp implements bni, bku, bre {
    public static final bjo a = new bhd("camerax.core.imageCapture.captureMode", Integer.TYPE, null);
    public static final bjo b = new bhd("camerax.core.imageCapture.flashMode", Integer.TYPE, null);
    public static final bjo c = new bhd("camerax.core.imageCapture.captureBundle", bji.class, null);
    public static final bjo d = new bhd("camerax.core.imageCapture.bufferFormat", Integer.class, null);
    public static final bjo e = new bhd("camerax.core.imageCapture.outputFormat", Integer.class, null);
    public static final bjo f;
    public static final bjo g;
    public static final bjo h;
    public static final bjo i;
    public static final bjo j;
    public static final bjo k;
    public static final bjo l;
    private final blo C;

    static {
        new bhd("camerax.core.imageCapture.maxCaptureStages", Integer.class, null);
        f = new bhd("camerax.core.imageCapture.imageReaderProxyProvider", bbn.class, null);
        g = new bhd("camerax.core.imageCapture.useSoftwareJpegEncoder", Boolean.TYPE, null);
        h = new bhd("camerax.core.imageCapture.flashType", Integer.TYPE, null);
        i = new bhd("camerax.core.imageCapture.jpegCompressionQuality", Integer.TYPE, null);
        j = new bhd("camerax.core.imageCapture.screenFlash", bbd.class, null);
        k = new bhd("camerax.core.useCase.postviewResolutionSelector", bvc.class, null);
        l = new bhd("camerax.core.useCase.isPostviewEnabled", Boolean.class, null);
    }

    public bkp(blo bloVar) {
        this.C = bloVar;
    }

    @Override // defpackage.bni
    public final /* synthetic */ boolean A() {
        return bnf.l(this);
    }

    @Override // defpackage.bku
    public final /* synthetic */ int B() {
        return bks.a(this);
    }

    @Override // defpackage.bku
    public final /* synthetic */ int C(int i2) {
        return bks.b(this, i2);
    }

    public final int D() {
        return ((Integer) blz.b(this, a)).intValue();
    }

    @Override // defpackage.bku
    public final /* synthetic */ bvc E() {
        return bks.c(this);
    }

    @Override // defpackage.bku
    public final /* synthetic */ boolean F() {
        return bks.e(this);
    }

    @Override // defpackage.bku
    public final /* synthetic */ int G() {
        return bks.f(this);
    }

    @Override // defpackage.bku
    public final /* synthetic */ List I() {
        return bks.g(this);
    }

    @Override // defpackage.bku
    public final /* synthetic */ Size J() {
        return bks.h(this);
    }

    @Override // defpackage.bku
    public final /* synthetic */ Size K() {
        return bks.i(this);
    }

    @Override // defpackage.bku
    public final /* synthetic */ int L() {
        return bks.j(this);
    }

    @Override // defpackage.bku
    public final /* synthetic */ bvc M() {
        return bks.k(this);
    }

    @Override // defpackage.bku
    public final /* synthetic */ List N() {
        return bks.l(this);
    }

    @Override // defpackage.bku
    public final /* synthetic */ Size O() {
        return bks.m(this);
    }

    @Override // defpackage.bkr
    public final int a() {
        return ((Integer) blz.b(this, D)).intValue();
    }

    @Override // defpackage.bni
    public final /* synthetic */ int b() {
        return bnf.a(this);
    }

    @Override // defpackage.bkr
    public final /* synthetic */ int c() {
        return bkq.b(this);
    }

    @Override // defpackage.bni
    public final /* synthetic */ int d() {
        return bnf.b(this);
    }

    @Override // defpackage.bni
    public final /* synthetic */ Range e(Range range) {
        return bnf.c(this, range);
    }

    @Override // defpackage.bni
    public final /* synthetic */ Range f(Range range) {
        return bnf.d(this, range);
    }

    @Override // defpackage.bkr
    public final /* synthetic */ azv g() {
        return bkq.c(this);
    }

    @Override // defpackage.bni
    public final /* synthetic */ bgj h() {
        return bnf.e(this);
    }

    @Override // defpackage.bjq
    public final /* synthetic */ bjp i(bjo bjoVar) {
        return blz.a(this, bjoVar);
    }

    @Override // defpackage.bma
    public final bjq j() {
        return this.C;
    }

    @Override // defpackage.bni
    public final /* synthetic */ bml k() {
        return bnf.f(this);
    }

    @Override // defpackage.bni
    public final /* synthetic */ bnk l() {
        return bnf.g(this);
    }

    @Override // defpackage.bma, defpackage.bjq
    public final /* synthetic */ Object m(bjo bjoVar) {
        return blz.b(this, bjoVar);
    }

    @Override // defpackage.bma, defpackage.bjq
    public final /* synthetic */ Object n(bjo bjoVar, Object obj) {
        return blz.c(this, bjoVar, obj);
    }

    @Override // defpackage.bjq
    public final /* synthetic */ Object o(bjo bjoVar, bjp bjpVar) {
        return blz.d(this, bjoVar, bjpVar);
    }

    @Override // defpackage.brm
    public final /* synthetic */ String p() {
        return brl.a(this);
    }

    @Override // defpackage.brm
    public final /* synthetic */ String q(String str) {
        return brl.b(this, str);
    }

    @Override // defpackage.bjq
    public final /* synthetic */ Set r(bjo bjoVar) {
        return blz.e(this, bjoVar);
    }

    @Override // defpackage.bma, defpackage.bjq
    public final /* synthetic */ Set s() {
        return blz.f(this);
    }

    @Override // defpackage.bma, defpackage.bjq
    public final /* synthetic */ boolean t(bjo bjoVar) {
        return blz.g(this, bjoVar);
    }

    @Override // defpackage.bkr
    public final /* synthetic */ boolean u() {
        return bkq.d(this);
    }

    @Override // defpackage.bjq
    public final /* synthetic */ void v(ayf ayfVar) {
        blz.h(this, ayfVar);
    }

    @Override // defpackage.bni
    public final /* synthetic */ bml w() {
        return bnf.h(this);
    }

    @Override // defpackage.bni
    public final /* synthetic */ bmg x() {
        return bnf.i(this);
    }

    @Override // defpackage.bni
    public final /* synthetic */ int y() {
        return bnf.j(this);
    }

    @Override // defpackage.bni
    public final /* synthetic */ boolean z() {
        return bnf.k(this);
    }
}
