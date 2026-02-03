package defpackage;

import android.util.Range;
import android.util.Size;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cay implements bni, bku, bro {
    public static final bjo a = new bhd("camerax.video.VideoCapture.videoOutput", cap.class, null);
    public static final bjo b = new bhd("camerax.video.VideoCapture.videoEncoderInfoFinder", cgs.class, null);
    public static final bjo c = new bhd("camerax.video.VideoCapture.forceEnableSurfaceProcessing", Boolean.class, null);
    private final blo d;

    public cay(blo bloVar) {
        lcg.a(bloVar.t(a));
        this.d = bloVar;
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
    public final /* synthetic */ int C(int i) {
        return bks.b(this, i);
    }

    public final cap D() {
        cap capVar = (cap) blz.b(this, a);
        capVar.getClass();
        return capVar;
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

    public final cgs H() {
        cgs cgsVar = (cgs) blz.b(this, b);
        cgsVar.getClass();
        return cgsVar;
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
        return 34;
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
        return this.d;
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
