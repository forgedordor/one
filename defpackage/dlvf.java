package defpackage;

import android.net.Uri;
import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dlvf implements fdap {
    final /* synthetic */ dlvl a;
    final /* synthetic */ Uri b;
    final /* synthetic */ Bundle c;

    public dlvf(dlvl dlvlVar, Uri uri, Bundle bundle) {
        this.a = dlvlVar;
        this.b = uri;
        this.c = bundle;
    }

    @Override // defpackage.fdap
    public final /* synthetic */ Object invoke(Object obj) {
        String[] strArr = ((dlvn) obj).a;
        return this.a.a.getContentResolver().query(this.b, strArr, this.c, null);
    }
}
