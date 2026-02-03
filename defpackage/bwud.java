package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
@fcsv
/* loaded from: classes7.dex */
public final class bwud implements bydd {
    public final Context a;

    public bwud(Context context, fcsu fcsuVar, aptw aptwVar) {
        context.getClass();
        fcsuVar.getClass();
        aptwVar.getClass();
        this.a = context;
        fctd.a(new fdae() { // from class: bwub
            @Override // defpackage.fdae
            public final Object invoke() {
                String string = this.a.a.getString(R.string.tombstone_details_text);
                string.getClass();
                return string;
            }
        });
        fctd.a(new fdae() { // from class: bwuc
            @Override // defpackage.fdae
            public final Object invoke() {
                return cpef.a(this.a.a);
            }
        });
    }

    @Override // defpackage.bydd
    public final boolean a(baea baeaVar) {
        baeaVar.getClass();
        int iE = baeaVar.e();
        if (iE == 213) {
            return bwbt.b();
        }
        if (iE == 226 || iE == 229) {
            return true;
        }
        switch (iE) {
            case 233:
            case 234:
            case 235:
            case 236:
            case 237:
            case 238:
                return true;
            default:
                return false;
        }
    }

    @Override // defpackage.bydd
    public final boolean b(boolean z) {
        return false;
    }
}
