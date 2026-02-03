package defpackage;

import android.content.LocusId;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class vdf implements fdap {
    final /* synthetic */ vdr a;

    public vdf(vdr vdrVar) {
        this.a = vdrVar;
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        String str = (String) obj;
        str.getClass();
        eg egVarG = this.a.b.G();
        if (egVarG != null) {
            egVarG.setLocusContext(new LocusId(str), null);
        }
        return fctx.a;
    }
}
