package defpackage;

import android.content.Context;
import android.net.Uri;
import com.google.android.gms.wearable.Asset;
import com.google.android.gms.wearable.PutDataRequest;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class derc extends dens {
    public derc(Context context, dcfl dcflVar) {
        super(context, dcflVar);
    }

    @Override // defpackage.dens
    public final defn a(Uri uri) {
        return dclg.a(deqw.a(this.k, uri, 0), new deqz());
    }

    @Override // defpackage.dens
    public final defn b() {
        dcfq dcfqVar = this.k;
        deqp deqpVar = new deqp(dcfqVar);
        dcfqVar.b(deqpVar);
        return dclg.a(deqpVar, new deqx());
    }

    @Override // defpackage.dens
    public final defn c(Uri uri) {
        dcjr.a(uri, "uri must not be null");
        dclh.b(true, "invalid filter type");
        dcfq dcfqVar = this.k;
        deqq deqqVar = new deqq(dcfqVar, uri);
        dcfqVar.b(deqqVar);
        return dclg.a(deqqVar, new deqx());
    }

    @Override // defpackage.dens
    public final defn d(Asset asset) {
        if (asset.b == null) {
            throw new IllegalArgumentException("invalid asset");
        }
        if (asset.a != null) {
            throw new IllegalArgumentException("invalid asset");
        }
        dcfq dcfqVar = this.k;
        deqs deqsVar = new deqs(dcfqVar, asset);
        dcfqVar.b(deqsVar);
        return dclg.a(deqsVar, new dclf() { // from class: deqy
            @Override // defpackage.dclf
            public final Object a(dcfx dcfxVar) {
                return new derb((deqv) dcfxVar);
            }
        });
    }

    @Override // defpackage.dens
    public final defn e(PutDataRequest putDataRequest) {
        dcfq dcfqVar = this.k;
        deqo deqoVar = new deqo(dcfqVar, putDataRequest);
        dcfqVar.b(deqoVar);
        return dclg.a(deqoVar, new dclf() { // from class: dera
            @Override // defpackage.dclf
            public final Object a(dcfx dcfxVar) {
                return ((deqt) dcfxVar).a;
            }
        });
    }

    @Override // defpackage.dens
    public final defn f(Uri uri) {
        return dclg.a(deqw.a(this.k, uri, 1), new deqz());
    }
}
