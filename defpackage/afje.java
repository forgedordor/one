package defpackage;

import android.content.LocusId;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class afje implements fdap {
    final /* synthetic */ afjl a;

    public afje(afjl afjlVar) {
        this.a = afjlVar;
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        String str = (String) obj;
        str.getClass();
        this.a.b.setLocusContext(new LocusId(str), null);
        return fctx.a;
    }
}
