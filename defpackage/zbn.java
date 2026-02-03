package defpackage;

import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.api.messaging.MessageId;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class zbn extends fcyz implements fdau {
    /* synthetic */ boolean a;
    /* synthetic */ Object b;
    final /* synthetic */ zbu c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zbn(zbu zbuVar, fcxy fcxyVar) {
        super(3, fcxyVar);
        this.c = zbuVar;
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        zbn zbnVar = new zbn(this.c, (fcxy) obj3);
        zbnVar.a = zBooleanValue;
        zbnVar.b = (MessageId) obj2;
        return zbnVar.b(fctx.a);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.apps.messaging.shared.api.messaging.MessageId, java.lang.Object] */
    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        boolean z = this.a;
        final ?? r0 = this.b;
        if (!z) {
            return fcvo.a;
        }
        final zbu zbuVar = this.c;
        fcww fcwwVar = new fcww((byte[]) null);
        if (!((aprc) zbuVar.f.b()).a()) {
            fcwwVar.add(new dkkw(null));
        }
        String string = zbuVar.b.getResources().getString(R.string.double_tap_to_react_promo, zbuVar.c());
        string.getClass();
        fcwwVar.add(new dklv(string, null, new fdae() { // from class: zbm
            @Override // defpackage.fdae
            public final Object invoke() {
                zbuVar.h.d(zbu.a[0], r0);
                return fctx.a;
            }
        }, false, null, null, false, false, 250));
        return fcva.a(fcwwVar);
    }
}
