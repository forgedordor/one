package defpackage;

import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dksa implements fdat {
    final /* synthetic */ ddp a;
    final /* synthetic */ hox b;

    public dksa(ddp ddpVar, hox hoxVar) {
        this.a = ddpVar;
        this.b = hoxVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hmlVar.I()) {
            hmlVar.s();
        } else {
            dtfn.a(djrs.b(djrr.bY, hmlVar), jqu.b(true != dksh.e(this.b) ? R.string.zippy_expand_description : R.string.zippy_collapse_description, hmlVar), ifi.a(egq.k(ics.e, 24.0f), ((Number) this.a.d()).floatValue()), 0L, hmlVar, 0, 8);
        }
        return fctx.a;
    }
}
