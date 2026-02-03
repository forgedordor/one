package defpackage;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.people.internal.PeopleClientImpl;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dduu extends dceu {
    @Override // defpackage.dceu
    public final /* bridge */ /* synthetic */ dcfc b(Context context, Looper looper, dcke dckeVar, Object obj, dcfo dcfoVar, dcfp dcfpVar) {
        ddux dduxVar = (ddux) obj;
        dclh.n(dduxVar, "Must provide valid PeopleOptions!");
        return new PeopleClientImpl(context, looper, dcfoVar, dcfpVar, String.valueOf(dduxVar.a), dckeVar);
    }
}
