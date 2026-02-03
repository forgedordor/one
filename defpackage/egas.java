package defpackage;

import android.os.Bundle;
import com.google.protobuf.contrib.android.ProtoParsers;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class egas extends lxd {
    public int a;
    public egbs b;
    public int c;
    public boolean d;
    public final boolean e;

    public egas(lwn lwnVar) {
        lwnVar.getClass();
        this.a = -1;
        egbs egbsVar = egbs.a;
        egbsVar.getClass();
        this.b = egbsVar;
        Bundle bundle = (Bundle) lwnVar.b("tiktok_activity_account_state_saved_instance_state");
        if (bundle != null) {
            this.e = true;
            this.a = bundle.getInt("state_account_id", -1);
            try {
                evuh evuhVarD = ProtoParsers.d(bundle, "state_account_info", egbsVar, evrr.a());
                evuhVarD.getClass();
                this.b = (egbs) evuhVarD;
                this.c = bundle.getInt("state_account_state", 0);
                this.d = bundle.getBoolean("tiktok_accounts_disabled");
            } catch (evtj e) {
                throw new RuntimeException("Failed to get AccountInfo from Bundle.", e);
            }
        } else {
            this.e = false;
        }
        lwnVar.e("tiktok_activity_account_state_saved_instance_state", new piw() { // from class: egar
            @Override // defpackage.piw
            public final Bundle a() {
                Bundle bundle2 = new Bundle();
                egas egasVar = this.a;
                bundle2.putInt("state_account_id", egasVar.a);
                ProtoParsers.j(bundle2, "state_account_info", egasVar.b);
                bundle2.putInt("state_account_state", egasVar.c);
                bundle2.putBoolean("tiktok_accounts_disabled", egasVar.d);
                return bundle2;
            }
        });
    }
}
