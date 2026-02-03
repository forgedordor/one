package defpackage;

import android.util.Range;
import java.util.Set;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes.dex */
final class arw implements bni {
    private final bjq a;

    public arw() {
        bli bliVarA = bli.a();
        bliVarA.c(bni.r, new apq());
        bliVarA.c(D, 34);
        bliVarA.c(n, arx.class);
        bliVarA.c(m, arx.class.getCanonicalName() + "-" + UUID.randomUUID());
        this.a = bliVarA;
    }

    @Override // defpackage.bni
    public final /* synthetic */ boolean A() {
        return bnf.l(this);
    }

    @Override // defpackage.bkr
    public final /* synthetic */ int a() {
        return bkq.a(this);
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
        return this.a;
    }

    @Override // defpackage.bni
    public final /* synthetic */ bml k() {
        return bnf.f(this);
    }

    @Override // defpackage.bni
    public final bnk l() {
        return bnk.METERING_REPEATING;
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
