package defpackage;

import com.google.android.gms.auth.folsom.SecurityDomainMember;
import com.google.android.gms.auth.folsom.internal.ISecurityDomainMembersCallback;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.Status;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dbuh extends ISecurityDomainMembersCallback.Stub {
    final /* synthetic */ defr a;

    public dbuh(defr defrVar) {
        this.a = defrVar;
    }

    @Override // com.google.android.gms.auth.folsom.internal.ISecurityDomainMembersCallback
    public final void onResult(Status status, List<SecurityDomainMember> list, ApiMetadata apiMetadata) {
        if (status.d()) {
            this.a.b(list);
        } else {
            this.a.a(dcjq.a(status));
        }
    }
}
