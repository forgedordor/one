package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.search.corpora.internal.ISearchCorporaService;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class debu extends debh {
    public debu(Context context, dcke dckeVar, dcgy dcgyVar, dcii dciiVar, deaq deaqVar) {
        super(context, context.getMainLooper(), 36, dckeVar, dcgyVar, dciiVar, deaqVar);
    }

    @Override // defpackage.dcko, com.google.android.gms.common.internal.BaseGmsClient, defpackage.dcfc
    public final int a() {
        return 12600000;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final /* synthetic */ IInterface b(IBinder iBinder) {
        return ISearchCorporaService.Stub.asInterface(iBinder);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final String c() {
        return "com.google.android.gms.search.corpora.internal.ISearchCorporaService";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final boolean gq() {
        return true;
    }
}
