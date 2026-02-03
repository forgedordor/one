package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.constellation.GetIidTokenResponse;
import com.google.android.gms.constellation.GetPnvCapabilitiesResponse;
import com.google.android.gms.constellation.PhoneNumberInfo;
import com.google.android.gms.constellation.VerifyPhoneNumberResponse;
import com.google.android.gms.constellation.internal.IConstellationCallbacks;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
class dcob extends IConstellationCallbacks.Stub {
    @Override // com.google.android.gms.constellation.internal.IConstellationCallbacks
    public final void onGetPnvCapabilitiesCompleted(Status status, GetPnvCapabilitiesResponse getPnvCapabilitiesResponse) {
        throw new UnsupportedOperationException();
    }

    public void onIidTokenGenerated(Status status, GetIidTokenResponse getIidTokenResponse) {
        throw new UnsupportedOperationException();
    }

    public void onPhoneNumberVerificationsCompleted(Status status, VerifyPhoneNumberResponse verifyPhoneNumberResponse) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.constellation.internal.IConstellationCallbacks
    public final void onPhoneNumberVerified(Status status, List<PhoneNumberInfo> list) {
        throw new UnsupportedOperationException();
    }
}
