package defpackage;

import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dmll implements fdau {
    final /* synthetic */ ics a;
    final /* synthetic */ ddp b;
    final /* synthetic */ float c;
    final /* synthetic */ int d;

    public dmll(ics icsVar, ddp ddpVar, float f, int i) {
        this.a = icsVar;
        this.b = ddpVar;
        this.c = f;
        this.d = i;
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        hml hmlVar = (hml) obj2;
        int iIntValue = ((Number) obj3).intValue();
        ((ego) obj).getClass();
        if ((iIntValue & 17) == 16 && hmlVar.I()) {
            hmlVar.s();
        } else {
            gkd.a(jqq.a(R.drawable.ic_camera_switch_24px, hmlVar, 0), jqu.b(this.d, hmlVar), egq.k(ifi.a(this.a, ((Number) this.b.d()).floatValue() + this.c), 42.0f), ije.d, hmlVar, 3072, 0);
        }
        return fctx.a;
    }
}
