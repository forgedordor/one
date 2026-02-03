package defpackage;

import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class djcn implements fdat {
    final /* synthetic */ djdi a;
    final /* synthetic */ djdm b;
    final /* synthetic */ boolean c;
    final /* synthetic */ float d;
    final /* synthetic */ boolean e;
    final /* synthetic */ int f;

    public djcn(djdi djdiVar, djdm djdmVar, boolean z, int i, float f, boolean z2) {
        this.a = djdiVar;
        this.b = djdmVar;
        this.c = z;
        this.f = i;
        this.d = f;
        this.e = z2;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hmlVar.I()) {
            hmlVar.s();
        } else {
            djdi djdiVar = this.a;
            int iOrdinal = djdiVar.ordinal();
            djuo.a((iOrdinal == 0 || iOrdinal == 1) ? Integer.valueOf(R.id.compose_input_magic_compose_growthkit_view) : iOrdinal != 2 ? iOrdinal != 5 ? null : Integer.valueOf(R.id.compose_input_voice_growthkit_view) : Integer.valueOf(R.id.compose_input_gallery_growthkit_view), hxe.d(-600982555, new djcm(djdiVar, this.b, this.c, this.f, this.d, this.e), hmlVar), hmlVar, 48);
        }
        return fctx.a;
    }
}
