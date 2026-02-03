package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ebzp extends ebzt {
    final /* synthetic */ Exception a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ebzp(Exception exc) {
        super("error");
        this.a = exc;
    }

    @Override // defpackage.ebzu
    public final String c(Context context, String[] strArr) {
        return String.valueOf(this.a.toString()).concat("\n");
    }
}
