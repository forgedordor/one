package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ehqv extends rbv {
    public ehqv(raw rawVar, rrw rrwVar, rsf rsfVar, Context context) {
        super(rawVar, rrwVar, rsfVar, context);
    }

    @Override // defpackage.rbv
    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public final ehqu e(Drawable drawable) {
        return (ehqu) super.e(drawable);
    }

    @Override // defpackage.rbv
    /* renamed from: B, reason: merged with bridge method [inline-methods] */
    public final ehqu i(String str) {
        return (ehqu) super.i(str);
    }

    @Override // defpackage.rbv
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public final synchronized void w(rtj rtjVar) {
        super.w(rtjVar);
    }

    @Override // defpackage.rbv
    public final /* bridge */ /* synthetic */ rbr a(Class cls) {
        return new ehqu(this.a, this, cls, this.b);
    }

    @Override // defpackage.rbv
    public final /* bridge */ /* synthetic */ rbr f(Uri uri) {
        return (ehqu) super.f(uri);
    }

    @Override // defpackage.rbv
    public final /* bridge */ /* synthetic */ rbr g(Integer num) {
        return (ehqu) super.g(num);
    }

    @Override // defpackage.rbv
    public final /* bridge */ /* synthetic */ rbr h(Object obj) {
        return (ehqu) super.h(obj);
    }

    @Override // defpackage.rbv
    protected final void s(rtj rtjVar) {
        if (rtjVar instanceof ehqt) {
            super.s(rtjVar);
        } else {
            super.s(new ehqt().q(rtjVar));
        }
    }

    @Override // defpackage.rbv
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public final ehqu b() {
        return (ehqu) super.b();
    }

    @Override // defpackage.rbv
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public final ehqu c() {
        return (ehqu) super.c();
    }

    @Override // defpackage.rbv
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public final ehqu d() {
        return (ehqu) super.d();
    }
}
