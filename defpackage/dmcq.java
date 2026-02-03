package defpackage;

import android.media.ToneGenerator;
import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dmcq implements fdpm {
    final /* synthetic */ dmdo a;

    public dmcq(dmdo dmdoVar) {
        this.a = dmdoVar;
    }

    @Override // defpackage.fdpm
    public final /* bridge */ /* synthetic */ Object fO(Object obj, fcxy fcxyVar) {
        this.a.j(50L, 125);
        new ToneGenerator(1, 100).startTone(24, BasePaymentResult.ERROR_REQUEST_FAILED);
        return fctx.a;
    }
}
