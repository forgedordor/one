package defpackage;

import com.google.android.apps.messaging.multishare.viewmodel.MultiShareViewModel;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class afmc implements fdat {
    final /* synthetic */ afmk a;

    public afmc(afmk afmkVar) {
        this.a = afmkVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hmlVar.I()) {
            hmlVar.s();
        } else {
            afuf afufVar = (afuf) ((MultiShareViewModel) this.a.h.a()).a.b();
            afun.b(new afuh(afufVar.a.a(), afufVar.b.a(), afufVar.c.a(), afufVar.d.a(), afufVar.e.a(), new afug(afufVar.f.a())), hmlVar, 0);
        }
        return fctx.a;
    }
}
