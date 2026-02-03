package defpackage;

import android.content.Intent;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.api.messaging.MessageId;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class yzg implements fdat {
    final /* synthetic */ ahat a;
    final /* synthetic */ zaa b;
    final /* synthetic */ Long c;
    final /* synthetic */ MessageId d;
    final /* synthetic */ fduf e;
    final /* synthetic */ boolean f;

    public yzg(ahat ahatVar, zaa zaaVar, Long l, MessageId messageId, fduf fdufVar, boolean z) {
        this.a = ahatVar;
        this.b = zaaVar;
        this.c = l;
        this.d = messageId;
        this.e = fdufVar;
        this.f = z;
    }

    @Override // defpackage.fdat
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hmlVar.I()) {
            hmlVar.s();
        } else {
            final zaa zaaVar = this.b;
            aaap aaapVar = (aaap) aaar.a.createBuilder();
            aaapVar.getClass();
            aaas.d(4, aaapVar);
            String string = zaaVar.b.getString(R.string.select_image_for_photomoji);
            string.getClass();
            aaas.b(string, aaapVar);
            aaar aaarVarA = aaas.a(aaapVar);
            hmlVar.v(5004770);
            final ahat ahatVar = this.a;
            boolean zF = hmlVar.F(ahatVar);
            Object objF = hmlVar.f();
            if (zF || objF == hmk.a) {
                objF = new fdae() { // from class: yzd
                    @Override // defpackage.fdae
                    public final Object invoke() {
                        ahatVar.a();
                        return fctx.a;
                    }
                };
                hmlVar.y(objF);
            }
            fdae fdaeVar = (fdae) objF;
            hmlVar.o();
            hmlVar.v(-1633490746);
            boolean zF2 = hmlVar.F(zaaVar);
            final Long l = this.c;
            boolean zD = zF2 | hmlVar.D(l);
            Object objF2 = hmlVar.f();
            if (zD || objF2 == hmk.a) {
                objF2 = new fdae() { // from class: yze
                    @Override // defpackage.fdae
                    public final Object invoke() {
                        zaaVar.g.a(l);
                        return fctx.a;
                    }
                };
                hmlVar.y(objF2);
            }
            fdae fdaeVar2 = (fdae) objF2;
            hmlVar.o();
            hmlVar.v(-1224400529);
            boolean zF3 = hmlVar.F(zaaVar);
            final MessageId messageId = this.d;
            boolean zF4 = zF3 | hmlVar.F(messageId);
            final fduf fdufVar = this.e;
            boolean zF5 = zF4 | hmlVar.F(fdufVar) | hmlVar.D(l);
            final boolean z = this.f;
            boolean zE = zF5 | hmlVar.E(z);
            Object objF3 = hmlVar.f();
            if (zE || objF3 == hmk.a) {
                Object obj3 = new fdap() { // from class: yzf
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj4) {
                        String str = (String) obj4;
                        str.getClass();
                        fduf fdufVar2 = fdufVar;
                        fdufVar2.getClass();
                        zaa zaaVar2 = zaaVar;
                        if (zaaVar2.n == null) {
                            throw new IllegalStateException("Create sticker button clicked when sticker store was not present");
                        }
                        Intent intentPutExtra = new Intent("com.google.chat.smartmessaging.penpal.EMOTIFY").putExtra("image_uri", str);
                        intentPutExtra.getClass();
                        cczi ccziVar = crbf.aM;
                        if (((Number) ccziVar.e()).floatValue() > 0.0f) {
                            Object objE = ccziVar.e();
                            objE.getClass();
                            intentPutExtra.putExtra("small_segment_ratio", ((Number) objE).floatValue());
                        }
                        boolean z2 = z;
                        Long l2 = l;
                        MessageId messageId2 = messageId;
                        intentPutExtra.putExtra("enable_edge_to_edge", true);
                        auvw.k(zaaVar2.c, null, null, new yzx(zaaVar2, messageId2, new agau("emotify_result", new aeo(), intentPutExtra), z2, fdufVar2, l2, null), 3);
                        return fctx.a;
                    }
                };
                hmlVar.y(obj3);
                objF3 = obj3;
            }
            hmlVar.o();
            aaal.a(new aaah(aaarVarA, fdaeVar, fdaeVar2, null, null, (fdap) objF3, 24), hmlVar, 0);
        }
        return fctx.a;
    }
}
