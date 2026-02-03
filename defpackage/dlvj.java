package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dlvj implements fdap {
    final /* synthetic */ dlvl a;
    final /* synthetic */ Uri b;

    public dlvj(dlvl dlvlVar, Uri uri) {
        this.a = dlvlVar;
        this.b = uri;
    }

    @Override // defpackage.fdap
    public final /* synthetic */ Object invoke(Object obj) {
        return this.a.a.getContentResolver().query(this.b, ((dlvn) obj).a, null, null, null);
    }
}
