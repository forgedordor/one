package defpackage;

import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ztk extends fcyz implements fdap {
    final /* synthetic */ ztv a;
    final /* synthetic */ alff b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ztk(ztv ztvVar, alff alffVar, fcxy fcxyVar) {
        super(1, fcxyVar);
        this.a = ztvVar;
        this.b = alffVar;
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        ztv ztvVar = this.a;
        cssw csswVar = (cssw) ztvVar.H.b();
        alff alffVar = this.b;
        csswVar.a(((alfb) alffVar).d(), ztvVar.g.getString(R.string.otp_copied_to_clipboard));
        auvw.m(ztvVar.f, null, new ztj(ztvVar, alffVar, null), 3);
        return true;
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new ztk(this.a, this.b, (fcxy) obj).b(fctx.a);
    }
}
