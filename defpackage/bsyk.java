package defpackage;

import com.google.android.ims.rcsservice.businessinfo.BusinessInfoDatabaseConstants;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bsyk extends dqye {
    public bsyk() {
        super("rbm_business_info");
    }

    @Override // defpackage.dqye
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final bsyj b() {
        ah();
        return new bsyj(this.c, this.a, this.b, this.d.g(), this.e.g());
    }

    public final void c(long j) {
        this.a.put(BusinessInfoDatabaseConstants.BusinessInfoMetadataTableConstants.Columns.EXPIRY_MILLISECONDS, Long.valueOf(j));
    }

    public final void d(String str) {
        dqru.v(this.a, BusinessInfoDatabaseConstants.BusinessInfoMetadataTableConstants.Columns.VERSION, str);
    }
}
