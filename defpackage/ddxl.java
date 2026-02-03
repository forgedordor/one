package defpackage;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.internal.ICancelToken;
import com.google.android.gms.people.internal.IPeopleService;
import com.google.android.gms.people.internal.PeopleClientImpl;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ddxl extends ddxn {
    final /* synthetic */ String a;
    final /* synthetic */ int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ddxl(dcfq dcfqVar, String str, int i) {
        super(dcfqVar);
        this.a = str;
        this.h = i;
    }

    @Override // defpackage.dcgp
    protected final /* bridge */ /* synthetic */ void b(dcev dcevVar) {
        ICancelToken iCancelTokenLoadOwnerAvatar;
        PeopleClientImpl peopleClientImpl = (PeopleClientImpl) dcevVar;
        ddxe ddxeVar = new ddxe(this);
        int i = this.h;
        String str = this.a;
        try {
            IPeopleService iPeopleServiceM = peopleClientImpl.M();
            Context context = peopleClientImpl.w;
            iCancelTokenLoadOwnerAvatar = iPeopleServiceM.loadOwnerAvatar(ddxeVar, str, null, i, 1, ddlh.a());
        } catch (RemoteException unused) {
            ddxeVar.onParcelFileDescriptorLoaded(8, null, null, null);
            iCancelTokenLoadOwnerAvatar = null;
        }
        synchronized (this.c) {
            this.f = iCancelTokenLoadOwnerAvatar;
        }
    }
}
