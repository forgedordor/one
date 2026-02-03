package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dlvh implements fdap {
    final /* synthetic */ dlvl a;
    final /* synthetic */ Uri b;
    final /* synthetic */ String c;
    final /* synthetic */ String d;

    public dlvh(dlvl dlvlVar, Uri uri, String str, String str2) {
        this.a = dlvlVar;
        this.b = uri;
        this.c = str;
        this.d = str2;
    }

    @Override // defpackage.fdap
    public final /* synthetic */ Object invoke(Object obj) {
        String[] strArr = ((dlvn) obj).a;
        return this.a.a.getContentResolver().query(this.b, strArr, this.c, null, this.d);
    }
}
