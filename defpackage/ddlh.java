package defpackage;

import android.os.Parcelable;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.ComplianceOptions;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ddlh {
    public static ApiMetadata a() {
        ddlg ddlgVar = ddlf.a;
        ComplianceOptions complianceOptions = new ComplianceOptions(-1, -1, 0, true);
        Parcelable.Creator<ApiMetadata> creator = ApiMetadata.CREATOR;
        return dcfg.a(complianceOptions, false);
    }
}
