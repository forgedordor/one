package defpackage;

import com.google.android.ims.message.rbm.RbmSuggestionResponse;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class alak implements amvq {
    final /* synthetic */ String a;
    final /* synthetic */ String b;

    public alak(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    @Override // defpackage.amwf
    public final /* synthetic */ ekgb a() {
        int i = ekgb.d;
        return ekoe.a;
    }

    @Override // defpackage.amwf, defpackage.amvr
    public final String b() {
        return RbmSuggestionResponse.CONTENT_TYPE;
    }

    @Override // defpackage.amwf
    public final String c() {
        return this.b;
    }

    @Override // defpackage.amvq
    public final String d() {
        return this.a;
    }
}
