package defpackage;

import android.text.TextUtils;
import com.google.android.gms.common.data.DataHolder;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ddxa extends dcjj implements dcjo {
    public ddxa(DataHolder dataHolder, int i) {
        super(dataHolder, i);
    }

    public final String c() {
        return gt("gaia_id");
    }

    @Override // defpackage.dcjo
    public final /* bridge */ /* synthetic */ Object d() {
        throw null;
    }

    public final String e() {
        return gt("account_name");
    }

    public final String f() {
        return ddyc.a.a(gt("avatar"));
    }

    public final String g() {
        return !TextUtils.isEmpty(gt("display_name")) ? gt("display_name") : e();
    }

    public final String h() {
        return j() ? gt("family_name") : "null";
    }

    public final String i() {
        return k() ? gt("given_name") : "null";
    }

    public final boolean j() {
        return !TextUtils.isEmpty(gt("family_name"));
    }

    public final boolean k() {
        return !TextUtils.isEmpty(gt("given_name"));
    }
}
