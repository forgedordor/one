package defpackage;

import android.net.Uri;
import android.util.Pair;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class echc implements ecer {
    @Override // defpackage.ecer
    public final /* bridge */ /* synthetic */ Object a(eceq eceqVar) {
        Pair pairB = eceqVar.b.b(eceqVar.f);
        return new echb(((Uri) pairB.first).buildUpon().encodedFragment(eceqVar.e.getEncodedFragment()).build(), pairB);
    }
}
