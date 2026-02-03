package defpackage;

import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ahuq implements fdap {
    final /* synthetic */ ahwd a;

    public ahuq(ahwd ahwdVar) {
        this.a = ahwdVar;
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        btqv btqvVar = (btqv) obj;
        btqvVar.getClass();
        Instant instantF = this.a.d.f();
        if (instantF == null) {
            btqvVar.a.putNull("finish_time");
            return btqvVar;
        }
        btqvVar.a.put("finish_time", Long.valueOf(bart.a(instantF)));
        return btqvVar;
    }
}
