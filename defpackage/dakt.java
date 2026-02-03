package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.apps.messaging.ui.vcard.VCardDetailFragment;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dakt extends cqdj {
    final /* synthetic */ Uri a;
    final /* synthetic */ VCardDetailFragment b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dakt(VCardDetailFragment vCardDetailFragment, Uri uri) {
        super("Bugle.Async.VCardDetailFragment.onOptionsItemSelected.Duration");
        this.a = uri;
        this.b = vCardDetailFragment;
    }

    @Override // defpackage.cqdj
    protected final /* bridge */ /* synthetic */ Object a(Object[] objArr) {
        VCardDetailFragment vCardDetailFragment = this.b;
        Uri uri = vCardDetailFragment.d;
        return uri != null ? uri : bxlf.f(this.a, vCardDetailFragment.G());
    }

    @Override // defpackage.cqdj
    protected final /* bridge */ /* synthetic */ void d(Object obj) {
        Uri uri = (Uri) obj;
        if (uri != null) {
            VCardDetailFragment vCardDetailFragment = this.b;
            Uri uriE = bxlf.e(vCardDetailFragment.z(), uri);
            vCardDetailFragment.d = uriE;
            if (vCardDetailFragment.G() != null) {
                String strM = ((baiy) vCardDetailFragment.a.a()).m();
                if (!TextUtils.isEmpty(strM)) {
                    cvw cvwVar = bxlf.a;
                    synchronized (cvwVar) {
                        cvwVar.put(uriE, strM);
                    }
                }
                VCardDetailFragment vCardDetailFragment2 = this.b;
                vCardDetailFragment2.ag.a(vCardDetailFragment2.G(), uriE);
            }
        }
    }
}
