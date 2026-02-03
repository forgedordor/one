package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.Feature;
import com.google.android.gms.feedback.internal.IFeedbackService;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dcws extends dcko {
    public final Context a;

    public dcws(Context context, Looper looper, dcfo dcfoVar, dcfp dcfpVar, dcke dckeVar) {
        super(context, looper, 29, dckeVar, dcfoVar, dcfpVar);
        this.a = context;
        devq.b(context);
    }

    @Override // defpackage.dcko, com.google.android.gms.common.internal.BaseGmsClient, defpackage.dcfc
    public final int a() {
        return 11925000;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final /* synthetic */ IInterface b(IBinder iBinder) {
        return IFeedbackService.Stub.asInterface(iBinder);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final String c() {
        return "com.google.android.gms.feedback.internal.IFeedbackService";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    protected final String d() {
        return "com.google.android.gms.feedback.internal.IFeedbackService";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final boolean gq() {
        return true;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final Feature[] gr() {
        return dcwc.b;
    }
}
